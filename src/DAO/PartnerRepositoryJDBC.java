
package DAO;

import Egyedek.Partner;
import Utils.SQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PartnerRepositoryJDBC implements RepositoryJDBC<Partner> {

    private List<Partner> partnerek;
    private PreparedStatement findAll;
    private PreparedStatement findByName;
    private PreparedStatement findById;
    private PreparedStatement findByTipus;
    private PreparedStatement add;
    private PreparedStatement delete;
    private PreparedStatement update;

    public PartnerRepositoryJDBC() throws SQLException {

        this.add = SQL.getConnection().prepareStatement("INSERT INTO partner(adoszam,cegnev,iranyitoszam,varos,cim,tipus, kapcsolattarto_nev, kapcsolattarto_telszam, kapcsolattarto_email) VALUES( ?,?,?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
        this.update = SQL.getConnection().prepareStatement("UPDATE partner SET adoszam=?,cegnev=?,iranyitoszam=?,varos=?,cim=?,tipus=?, kapcsolattarto_nev=?, kapcsolattarto_telszam=?, kapcsolattarto_email=? WHERE id = ?");
        this.findAll = SQL.getConnection().prepareStatement("SELECT * FROM partner;");
        this.findById = SQL.getConnection().prepareStatement("SELECT * FROM partner WHERE id=?;");
        this.findByName = SQL.getConnection().prepareStatement("SELECT * FROM partner WHERE cegnev=?;");
        this.findByTipus = SQL.getConnection().prepareStatement("SELECT * FROM partner WHERE tipus=?;");
        this.delete = SQL.getConnection().prepareStatement("DELETE FROM partner WHERE id=?;");

    }

    @Override
    public List<Partner> findAll() throws SQLException {
        return makeList(findAll.executeQuery());

    }

    @Override
    public List<Partner> findByName(String nev) throws SQLException {
            findByName.setString(1, nev);
            return makeList(findByName.executeQuery());
    }
    
    public List<Partner> findByTipus(String tipus) throws SQLException {
        findByTipus.setString(1, tipus);
        return makeList(findByTipus.executeQuery());
    }

    @Override
    public Partner findById(int id) throws SQLException {
        
        findById.setInt(1, id);
        ResultSet rs = findById.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }

        return null;

    }

    @Override
    public Integer add(Partner p) throws SQLException {
        
        Integer keyValue = null;

        add.setInt(1, p.getAdoszam());
        add.setString(2, p.getNev());
        add.setInt(3, p.getIranyitoszam());
        add.setString(4, p.getVaros());
        add.setString(5, p.getCim());
        add.setString(6, p.getTipus());
        add.setString(7, p.getKapcsolattarto_nev());
        add.setString(8, p.getKapcsolattarto_telszam());
        add.setString(9, p.getKapcsolattarto_email());
        
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
    public void update(Partner p) throws SQLException {
        
        update.setInt(1, p.getAdoszam());
        update.setString(2, p.getNev());
        update.setInt(3, p.getIranyitoszam());
        update.setString(4, p.getVaros());
        update.setString(5, p.getCim());
        update.setString(6, p.getTipus());
        update.setString(7, p.getKapcsolattarto_nev());
        update.setString(8, p.getKapcsolattarto_telszam());
        update.setString(9, p.getKapcsolattarto_email());
        update.setInt(10, p.getId());
        update.executeUpdate();

    }

    private List<Partner> makeList(ResultSet rs) throws SQLException {

        List<Partner> list = new ArrayList<>();
        while (rs.next()) {

            list.add(makeOne(rs));

        }

        return list;

    }

    private Partner makeOne(ResultSet rs) throws SQLException {

        return new Partner(rs.getInt("id"), rs.getString("cegnev"), rs.getInt("adoszam"), rs.getInt("iranyitoszam"), rs.getString("varos"), rs.getString("cim"), rs.getString("tipus"), rs.getString("kapcsolattarto_nev"), rs.getString("kapcsolattarto_telszam"), rs.getString("kapcsolattarto_email"));

    }

}
