
package Egyedek;

import DAO.AruRepositoryJDBC;
import Utils.Comparator.AruDbComparator;
import java.sql.SQLException;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Megrendeles implements Egyed {

    private Integer id;
    private Integer rendelesiSzam;
    private LocalDateTime rogzitDatum;
    private LocalDateTime teljesitDatum;
    private String allapot;
    private String tipus;
    private Partner partner;
    private Dolgozo dolgozo;
    private int osszeg;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm");
    public static final String MEGRENDELT = "megrendelt";
    public static final String TELJESITVE = "teljesítve";
    public static final String KIMENO = "kimenő";
    public static final String BEJOVO = "bejövő";
    private List<Aru> lista;

    public Megrendeles(List<Aru> lista, int rendelesiSzam, Dolgozo dolgozo, Partner partner, LocalDateTime rogzitDatum, String allapot, String tipus, int osszeg) {
        this.lista = lista;
        this.rendelesiSzam = rendelesiSzam;
        this.dolgozo = dolgozo;
        this.partner = partner;
        this.rogzitDatum = rogzitDatum;
        this.allapot = allapot;
        this.tipus = tipus;
        this.osszeg = osszeg;

    }

    public Megrendeles(int id, int rendelesiSzam, List<Aru> lista, Dolgozo dolgozo, Partner partner, LocalDateTime rogzitDatum, LocalDateTime teljesitDatum, String allapot, String tipus, int osszeg) {
        this.id = id;
        this.lista = lista;
        this.rendelesiSzam = rendelesiSzam;
        this.dolgozo = dolgozo;
        this.partner = partner;
        this.teljesitDatum = teljesitDatum;
        this.rogzitDatum = rogzitDatum;
        this.tipus = tipus;
        this.allapot = allapot;
        this.osszeg = osszeg;
    }

    @Override
    public Object[] toObjectRow() {

        Object[] object = new Object[11];

        object[0] = this.id;
        object[1] = this.dolgozo.getId();
        object[2] = this.partner.getId();
        object[3] = this.rendelesiSzam;
        object[4] = this.rogzitDatum.format(dtf);
        object[5] = this.teljesitDatum != null ? this.teljesitDatum.format(dtf) : this.teljesitDatum;
        object[6] = this.partner.getNev();
        object[7] = this.tipus;
        object[8] = this.allapot;
        object[9] = this.osszeg;
        object[10] = this.dolgozo.getNev();

        return object;

    }

    public Integer getId() {
        return id;
    }

    public Integer getRendelesiSzam() {
        return rendelesiSzam;
    }

    public LocalDateTime getRogzitDatum() {
        return rogzitDatum;
    }

    public LocalDateTime getTeljesitDatum() {
        return teljesitDatum;
    }

    public String getAllapot() {
        return allapot;
    }

    public String getTipus() {
        return tipus;
    }

    public Partner getPartner() {
        return partner;
    }

    public Dolgozo getDolgozo() {
        return dolgozo;
    }

    public int getOsszeg() {
        return osszeg;
    }

    @Override
    public String toString() {
        return "Megrendeles{" + "id=" + id + ", rendelesiSzam=" + rendelesiSzam + ", rogzitDatum=" + rogzitDatum.format(dtf) + ", teljesitDatum=" + teljesitDatum.format(dtf) + ", allapot=" + allapot + ", tipus=" + tipus + ", partner=" + partner.getNev() + ", dolgozo=" + dolgozo.getNev() + ", osszeg= " + osszeg + '}';
    }

    @Override
    public String toCSV() {
        return rendelesiSzam + ";" + rogzitDatum + ";" + teljesitDatum + ";" + allapot + ";" + tipus + ";" + partner.getNev() + ";" + dolgozo.getNev() + ";" + osszeg;
        
    }

    public List<Aru> getLista() {
        return lista;
    }

    public void setTeljesitDatum(LocalDateTime teljesitDatum) {
        this.teljesitDatum = teljesitDatum;
    }

    public void setAllapot(String allapot) {
        this.allapot = allapot;
    }

    public List<Aru> checkKeszlet() throws SQLException {

        List<Aru> listaKeves = new ArrayList<>();
        AruDbComparator c = new AruDbComparator();
        AruRepositoryJDBC aruJDBC = new AruRepositoryJDBC();
        for (Aru aruMegrendelt : lista) {
            Aru aruKeszlet = aruJDBC.findById(aruMegrendelt.getId());
            if (c.compare(aruKeszlet, aruMegrendelt) < 0) {
                listaKeves.add(aruMegrendelt);
            }
        }

        return listaKeves;
    }

}
