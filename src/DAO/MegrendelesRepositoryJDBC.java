
package DAO;

import Egyedek.Aru;
import Egyedek.Megrendeles;
import Utils.SQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class MegrendelesRepositoryJDBC  implements RepositoryJDBC<Megrendeles>{

    private List<Megrendeles> megrendelesek;
    private PreparedStatement findAll;
    private PreparedStatement findByName;
    private PreparedStatement findAruList;
    private PreparedStatement findById;
    private PreparedStatement findByDolgozoId;
    private PreparedStatement orderByTeljesitDatum;
    private PreparedStatement orderByTeljesitDatumDesc;
    private PreparedStatement orderByRogzitDatum;
    private PreparedStatement orderByRogzitDatumDesc;
    private PreparedStatement add;
    private PreparedStatement addKapcsMegrendelesAru;
    private PreparedStatement delete;
    private PreparedStatement update;
    private Integer key;  

   
    public MegrendelesRepositoryJDBC() throws SQLException {
             
        this.add = SQL.getConnection().prepareStatement("INSERT INTO megrendeles(dolgozo_id,partner_id,rendelesi_szam,rogzites_datuma,teljesites_datuma,allapot,tipus, osszeg,dolgozo) VALUES( ?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);   
        this.addKapcsMegrendelesAru=SQL.getConnection().prepareStatement("INSERT INTO kapcsolat_aru_megrendeles(megrendeles_id,aru_id,mennyiseg) VALUES(?,?,?)");
        this.update = SQL.getConnection().prepareStatement("UPDATE megrendeles SET teljesites_datuma=?,allapot=? WHERE id = ?");
        this.delete = SQL.getConnection().prepareStatement("DELETE FROM megrendeles WHERE id=?");
        this.findAll = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles"); 
        this.orderByRogzitDatum = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles ORDER BY rogzites_datuma"); 
        this.orderByRogzitDatumDesc = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles ORDER BY rogzites_datuma DESC"); 
        this.orderByTeljesitDatum = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles ORDER BY teljesites_datuma"); 
        this.orderByTeljesitDatumDesc = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles ORDER BY teljesites_datuma DESC");
        this.findById = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles WHERE id=?");
        this.findByDolgozoId = SQL.getConnection().prepareStatement("SELECT * FROM megrendeles WHERE dolgozo_id=?");
        this.findAruList = SQL.getConnection().prepareStatement("SELECT * FROM kapcsolat_aru_megrendeles WHERE megrendeles_id=?;");
        this.findByName =SQL.getConnection().prepareStatement("SELECT * FROM megrendeles WHERE rendelesi_szam=?" );           
    }   

    @Override
    public List<Megrendeles> findAll() throws SQLException {
        
        return makeList(findAll.executeQuery());
     
    }

    @Override
    public List<Megrendeles> findByName(String nev) throws SQLException {
      return makeList(findByName.executeQuery());
    }

    @Override
    public Megrendeles findById(int id) throws SQLException {
         findById.setInt(1, id);
        ResultSet rs = findById.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }

        return null;
    }
    
    public List<Megrendeles> findByDolgozId(int id) throws SQLException {
        findByDolgozoId.setInt(1, id);
        return makeList(findByDolgozoId.executeQuery());
    }
    

    @Override
    public Integer add(Megrendeles m) throws SQLException{ 
            
        
       Integer keyValue = null;;
       
        add.setInt(1, m.getDolgozo().getId());
        add.setInt(2, m.getPartner().getId());
        add.setInt(3, m.getRendelesiSzam());
        add.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));      
        add.setTimestamp(5, null);      
        add.setString(6, m.getAllapot());
        add.setString(7, m.getTipus());
        add.setInt(8, m.getOsszeg());
        add.setString(9, m.getDolgozo().getNev());
        add.executeUpdate();
        
        ResultSet key= add.getGeneratedKeys();
        while(key.next()){
            this.key=key.getInt(1);
        }
        
       addKapcsMegrendelesAru(m);
        
        return this.key;
    }

    @Override
    public void delete(Integer id) throws SQLException {
//              delete.setInt(1, id);
//           delete.executeUpdate();
    }


    @Override
    public void update(Megrendeles m) throws SQLException {
         update.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
         update.setString(2, Megrendeles.TELJESITVE);
         update.setInt(3, m.getId());
         update.executeUpdate();
    }
    
    private List<Aru> getAruList(Integer id) throws SQLException {
        
        List<Aru> lista = new ArrayList<>();
        findAruList.setInt(1, id);
        ResultSet rs = findAruList.executeQuery();
        
        while (rs.next()) {
            Aru aru = new AruRepositoryJDBC().findById(rs.getInt("aru_id"));
            aru.setKeszlet(rs.getInt("mennyiseg"));
            lista.add(aru);
        }

        return lista;

    }
    
    
    public List<Megrendeles> orderByRogzitDatum(List<Megrendeles> list) throws SQLException{
        return makeList(orderByRogzitDatum.executeQuery());
        
    }
    
    public List<Megrendeles> orderByRogzitDatumDesc(List<Megrendeles> list) throws SQLException{
        return makeList(orderByRogzitDatumDesc.executeQuery());
        
    }
    
    public List<Megrendeles> orderByTeljesitDatum(List<Megrendeles> list) throws SQLException{
        return makeList(orderByTeljesitDatum.executeQuery());
        
    }
    
    public List<Megrendeles> orderByTeljesitDatumDesc(List<Megrendeles> list) throws SQLException{
        return makeList(orderByTeljesitDatumDesc.executeQuery());
        
    }

    
    private void addKapcsMegrendelesAru(Megrendeles m) throws SQLException {

        for (Aru aru : m.getLista()) {

            addKapcsMegrendelesAru.setInt(1, key);
            addKapcsMegrendelesAru.setInt(2, aru.getId());
            addKapcsMegrendelesAru.setInt(3, aru.getKeszlet());
            addKapcsMegrendelesAru.executeUpdate();

        }

    }
    
    
     private List<Megrendeles> makeList(ResultSet rs) throws SQLException {

        List<Megrendeles> list = new ArrayList<>();
        while (rs.next()) {

            list.add(makeOne(rs));

        }

        return list;

    }


    private Megrendeles makeOne(ResultSet rs) throws SQLException{

       List<Aru> lista=getAruList(rs.getInt("id"));
       LocalDateTime dateTime = null;

        try {
            
             dateTime=dateTime.parse(rs.getString("teljesites_datuma"),  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            
        } catch (DateTimeParseException ex) {
        }     
          catch (NullPointerException ex) {
        }     

       
       return new Megrendeles(rs.getInt("id"),rs.getInt("rendelesi_szam"),lista, new DolgozoRepositoryJDBC().findById(rs.getInt("dolgozo_id")), new PartnerRepositoryJDBC().findById(rs.getInt("partner_id")), LocalDateTime.parse(rs.getString("rogzites_datuma"),  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),dateTime,rs.getString("allapot"),rs.getString("tipus"), rs.getInt("osszeg"));
      
    }
    

}
