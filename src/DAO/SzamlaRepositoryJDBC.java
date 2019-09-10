
package DAO;

import Egyedek.Szamla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class SzamlaRepositoryJDBC  {

    private List<Szamla> szamlak;
    private Connection conn;
    private PreparedStatement findAll;
    private PreparedStatement finByName;
    private PreparedStatement findByID;
    private PreparedStatement add;
    private PreparedStatement delete;
    private PreparedStatement update;

}
