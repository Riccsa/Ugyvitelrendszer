
package DAO;

import Egyedek.Dolgozo;
import Utils.SQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DolgozoRepositoryJDBC implements RepositoryJDBC<Dolgozo> {

    private List<Dolgozo> dolgozok;
    private PreparedStatement findAll;
    private PreparedStatement findByName;
    private PreparedStatement findById;
    private PreparedStatement findPasswordById;
    private PreparedStatement add;
    private PreparedStatement delete;
    private PreparedStatement update;
    private PreparedStatement findAccesLevelById;
    private Integer generatedKey;

    public DolgozoRepositoryJDBC() throws SQLException {

        this.add = SQL.getConnection().prepareStatement("INSERT INTO dolgozo(nev,szemelyi_szam,szuletesi_hely,szuletesi_ido,lakhely,beosztas,email) VALUES( ?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
        this.update = SQL.getConnection().prepareStatement("UPDATE dolgozo SET nev=?,szemelyi_szam=?,szuletesi_hely=?,szuletesi_ido=?,lakhely=?,beosztas=?,email=? WHERE id = ?");
        this.findAll = SQL.getConnection().prepareStatement("SELECT * FROM dolgozo;");
        this.findById = SQL.getConnection().prepareStatement("SELECT * FROM dolgozo WHERE id=?;");
        this.findByName = SQL.getConnection().prepareStatement("SELECT * FROM dolgozo WHERE nev=?;");
        this.findPasswordById = SQL.getConnection().prepareStatement("SELECT jelszo FROM ugyvitel.jelszo WHERE dolgozo_id=?");
        this.findAccesLevelById = SQL.getConnection().prepareStatement("SELECT szint FROM ugyvitel.jelszo WHERE dolgozo_id=?");
        this.delete = SQL.getConnection().prepareStatement("DELETE FROM dolgozo WHERE id=?;");

    }

    @Override
    public List<Dolgozo> findAll() throws SQLException {

        return makeList(findAll.executeQuery());
    }

    @Override
    public List<Dolgozo> findByName(String nev) throws SQLException {
        return makeList(findByName.executeQuery());
    }

    @Override
    public Dolgozo findById(int id) throws SQLException {

        findById.setInt(1, id);
        ResultSet rs = findById.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }

        return null;

    }
    
    public String findAccesLevelById(int id) throws SQLException{
        findAccesLevelById.setInt(1, id);
        ResultSet rs = findAccesLevelById.executeQuery();
        String accessLevel="";
        while (rs.next()) {
           accessLevel = rs.getString("szint");
        }

        return accessLevel;
    }

    @Override
    public Integer add(Dolgozo dolgozo) throws SQLException {

        Integer keyValue = null;

        add.setString(1, dolgozo.getNev());
        add.setString(2, dolgozo.getSzemelyiSzam());
        add.setString(3, dolgozo.getSzuletesiHely());
        add.setDate(4, Date.valueOf(dolgozo.getSzuletesiDatum()));
        add.setString(5, dolgozo.getLakhely());
        add.setString(6, dolgozo.getBeosztas());
        add.setString(7, dolgozo.getEmail());
        add.executeUpdate();

        ResultSet key = add.getGeneratedKeys();
        while (key.next()) {
            keyValue = key.getInt(1);
        }
        return keyValue;

    }

    @Override
    public void delete(Integer id) throws SQLException {

        delete.setInt(1, id);
        delete.executeUpdate();

    }

    @Override
    public void update(Dolgozo dolgozo) throws SQLException {
        update.setString(1, dolgozo.getNev());
        update.setString(2, dolgozo.getSzemelyiSzam());
        update.setString(3, dolgozo.getSzuletesiHely());
        update.setDate(4, Date.valueOf(dolgozo.getSzuletesiDatum()));
        update.setString(5, dolgozo.getLakhely());
        update.setString(6, dolgozo.getBeosztas());
        update.setString(7, dolgozo.getEmail());
        update.setInt(8, dolgozo.getId());
        update.executeUpdate();

    }

    public String findPassWordByDolgozoId(Integer id) throws SQLException {

        findPasswordById.setInt(1, id);
        ResultSet rs = findPasswordById.executeQuery();
        String passWord = "";

        while (rs.next()) {
            passWord = rs.getString("jelszo");
        }

        return passWord;

    }

    private List<Dolgozo> makeList(ResultSet rs) throws SQLException {

        List<Dolgozo> list = new ArrayList<>();
        while (rs.next()) {

            list.add(makeOne(rs));

        }

        return list;

    }

    private Dolgozo makeOne(ResultSet rs) throws SQLException {

        return new Dolgozo(rs.getInt("id"), rs.getString("nev"), rs.getString("szemelyi_szam"), rs.getString("szuletesi_hely"), rs.getDate("szuletesi_ido").toLocalDate(), rs.getString("lakhely"), rs.getString("beosztas"), rs.getString("email"));

    }

    public Integer getGeneratedKey() {
        return generatedKey;
    }

}
