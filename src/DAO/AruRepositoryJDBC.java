
package DAO;

import Egyedek.Aru;
import Egyedek.Kategoria;
import Utils.Unit;
import Utils.SQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AruRepositoryJDBC  implements RepositoryJDBC<Aru>{

    private List<Aru> aruk;
    private PreparedStatement findAll;
    private PreparedStatement findByName;
    private PreparedStatement findById;
    private PreparedStatement findByKat;
    private PreparedStatement findByGyarto;
    private PreparedStatement findByCikkSzam;
    private PreparedStatement findKategoriaByAruID;
    private PreparedStatement add;
    private PreparedStatement delete;
    private PreparedStatement update;
    private PreparedStatement updateKeszletIncr;
    private PreparedStatement updateKeszletDecr;
    private Integer generatedKey;
    private String selectAll="SELECT aru.id,kategoria_id,cikkszam,gyarto,tipus,keszlet,minimumkeszlet,egyseg,netto,brutto,afa FROM ugyvitel.aru";
    
    public AruRepositoryJDBC() throws SQLException {

        this.add = SQL.getConnection().prepareStatement("INSERT INTO aru(cikkszam,gyarto,tipus,kategoria_id,keszlet,minimumkeszlet,egyseg,netto,brutto,afa) VALUES( ?,?,?,?,?,?,?,?,?,?);",Statement.RETURN_GENERATED_KEYS);        
        this.update = SQL.getConnection().prepareStatement("UPDATE aru SET cikkszam=?,gyarto=?,tipus=?,kategoria_id=?,keszlet=?,minimumkeszlet=?,egyseg=?,netto=?, brutto=?,afa=? WHERE id = ?");
        this.updateKeszletIncr=SQL.getConnection().prepareStatement("UPDATE aru SET keszlet = keszlet+? WHERE id = ?");
        this.updateKeszletDecr=SQL.getConnection().prepareStatement("UPDATE aru SET keszlet = keszlet-? WHERE id = ?");
        this.delete = SQL.getConnection().prepareStatement("DELETE FROM aru WHERE id=?;");
        this.findAll = SQL.getConnection().prepareStatement(selectAll);
        this.findById = SQL.getConnection().prepareStatement("SELECT aru.id,kategoria_id,cikkszam,gyarto,tipus,keszlet,minimumkeszlet,egyseg,netto,brutto,afa FROM ugyvitel.aru WHERE aru.id=?");
        this.findByName = SQL.getConnection().prepareStatement(selectAll+ "WHERE tipus=?");       
        this.findByKat = SQL.getConnection().prepareStatement(selectAll + "WHERE kategoria_id=?");
        this.findByGyarto = SQL.getConnection().prepareStatement(selectAll + "WHERE gyarto=?"); 
        this.findByCikkSzam=SQL.getConnection().prepareStatement(selectAll+ "WHERE cikkszam=?");
        
    }

    @Override
    public List<Aru> findAll() throws SQLException {
        
        return makeList(findAll.executeQuery());
        
    }

    @Override
    public List<Aru> findByName(String nev) throws SQLException {
        return makeList(findByName.executeQuery());
    }
    

    @Override
    public Aru findById(int id) throws SQLException {
        findById.setInt(1, id);
        ResultSet rs = findById.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }

        return null;
    }

    @Override
    public Integer add(Aru aru) throws SQLException {
        
        Integer keyValue = null;
        
        add.setInt(1, aru.getCikkszam());
        add.setString(2, aru.getGyarto());
        add.setString(3, aru.getNev());
        add.setInt(4, aru.getKategoriaId());
        add.setInt(5, aru.getKeszlet());
        add.setInt(6, aru.getMinKeszlet());
        add.setString(7, Unit.DB);
        add.setInt(8, aru.getNetto());
        add.setInt(9, aru.getBrutto());
        add.setInt(10, aru.getAfa());
        add.executeUpdate();
        
        ResultSet key= add.getGeneratedKeys();
        while(key.next()){
            keyValue=key.getInt(1);
        }     
        
        return keyValue;
        
    }

    @Override
    public void delete(Integer id) throws SQLException {
        
        delete.setInt(1, id);
        delete.executeUpdate();
        
    }

   
 
  
    @Override
    public void update(Aru aru) throws SQLException {
        update.setInt(1, aru.getCikkszam());
        update.setString(2, aru.getGyarto());
        update.setString(3, aru.getNev());
        update.setInt(4, aru.getKategoriaId());
        update.setInt(5, aru.getKeszlet());
        update.setInt(6, aru.getMinKeszlet());
        update.setString(7, Unit.DB);
        update.setInt(8, aru.getNetto());
        update.setInt(9, aru.getBrutto());
        update.setInt(10, aru.getAfa());
        update.setInt(11, aru.getId());
        update.executeUpdate();
     }
    
    
    public void updateKeszletIncr(List<Aru> lista) throws SQLException{        
                       
        for (Aru aru : lista) {
         updateKeszletIncr.setInt(1, aru.getKeszlet());
         updateKeszletIncr.setInt(2, aru.getId());
         updateKeszletIncr.executeUpdate();
 
        }
        
    }
    
    public void updateKeszletDecr(List<Aru> lista) throws SQLException{        
                       
        for (Aru aru : lista) {
         updateKeszletDecr.setInt(1, aru.getKeszlet());
         updateKeszletDecr.setInt(2, aru.getId());
         updateKeszletDecr.executeUpdate();
 
        }
        
    }
    
    public Aru findByCikkszam(int cikkszam) throws SQLException {

        findByCikkSzam.setInt(1, cikkszam);
        ResultSet rs = findByCikkSzam.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }

        return null;

    }

    public Integer getGeneratedKey() {
        return generatedKey;
    }
      
    private Kategoria getKategoriaId(Integer id) throws SQLException{
        
        KategoriaRepositoryJDBC katJDBC=new KategoriaRepositoryJDBC();
        
        return katJDBC.findById(id);
        
        
    }
    
    
    private List<Aru> makeList(ResultSet rs) throws SQLException {

        List<Aru> list = new ArrayList<>();
        while (rs.next()) {

            list.add(makeOne(rs));

        }

        return list;

    }
   


    private Aru makeOne(ResultSet rs) throws SQLException{
      
           Kategoria kat= getKategoriaId(rs.getInt("kategoria_id"));
           return new Aru(rs.getInt("id"),kat.getId(), rs.getInt("cikkszam"), rs.getString("gyarto"), rs.getString("tipus"), kat.getNev(), rs.getInt("keszlet"), rs.getInt("minimumkeszlet"),rs.getString("egyseg"), rs.getInt("netto"),rs.getInt("brutto"),rs.getInt("afa"));

    }

   

    
}
