
package DAO;


import java.sql.SQLException;
import java.util.List;

public interface RepositoryJDBC<T> {

    public List<T> findAll() throws SQLException;

    public List<T> findByName(String nev) throws SQLException;

    public T findById(int id) throws SQLException;

    public Integer add(T t) throws SQLException;

    public void delete(Integer id) throws SQLException;

    public void update(T t) throws SQLException;

}
