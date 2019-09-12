    
package DAO;

import Egyedek.Kategoria;
import Utils.SQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KategoriaRepositoryJDBC implements RepositoryJDBC<Kategoria> {

    private List<Kategoria> kategoriaList;
    private PreparedStatement findAll;
    private PreparedStatement findByName;
    private PreparedStatement findById;
    private PreparedStatement add;
    private PreparedStatement delete;
    private PreparedStatement update;
    private Integer generatedKey;

    public KategoriaRepositoryJDBC() throws SQLException {
        this.add = SQL.getConnection().prepareStatement("INSERT INTO kategoria(nev) VALUES(?);", Statement.RETURN_GENERATED_KEYS);
        this.update = SQL.getConnection().prepareStatement("UPDATE kategoria SET nev=? WHERE id = ?");
        this.findAll = SQL.getConnection().prepareStatement("SELECT * FROM kategoria;");
        this.findById = SQL.getConnection().prepareStatement("SELECT * FROM kategoria WHERE id=?;");
        this.findByName = SQL.getConnection().prepareStatement("SELECT * FROM kategoria WHERE nev=?;");
        this.delete = SQL.getConnection().prepareStatement("DELETE FROM kategoria WHERE id=?;");
    }

    @Override
    public List<Kategoria> findAll() throws SQLException {
        return makeList(findAll.executeQuery());
    }

    @Override
    public List<Kategoria> findByName(String nev) throws SQLException {
        findByName.setString(1, nev);
        return makeList(findByName.executeQuery());
    }

    @Override
    public Kategoria findById(int id) throws SQLException {
        findById.setInt(1, id);
        ResultSet rs = findById.executeQuery();

        while (rs.next()) {
            return makeOne(rs);
        }
     
        return null;
    }

    @Override
    public Integer add(Kategoria kat) throws SQLException {

        Integer keyValue = null;

        add.setString(1, kat.getNev());
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
    public void update(Kategoria kat) throws SQLException {
        update.setString(1, kat.getNev());
        update.setInt(2, kat.getId());
        update.executeUpdate();
    }

    private List<Kategoria> makeList(ResultSet rs) throws SQLException {

        List<Kategoria> list = new ArrayList<>();
        while (rs.next()) {

            list.add(makeOne(rs));

        }

        return list;

    }

    private Kategoria makeOne(ResultSet rs) throws SQLException {

        return new Kategoria(rs.getInt("id"), rs.getString("nev"));

    }

}
