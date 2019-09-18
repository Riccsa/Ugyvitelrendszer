
package Egyedek;


public class Partner implements Egyed{
    
    private Integer id;
    private String nev;
    private Integer adoszam;
    private int iranyitoszam;
    private String varos;
    private String cim;
    private String tipus;
    private String kapcsolattarto_nev;
    private String kapcsolattarto_email;
    private String kapcsolatto_telszam;
    
    public static final String BESZALLITO="beszállító";
    public static final String VEVO="vevő";
    

    public Partner(Integer id, String nev, Integer adoszam, int iranyitoszam, String varos, String cim, String tipus, String kapcsolattarto_nev, String kapcsolatto_telszam, String kapcsolattarto_email) {
        this.id = id;
        this.nev = nev;
        this.adoszam = adoszam;
        this.iranyitoszam = iranyitoszam;
        this.varos = varos;
        this.cim = cim;
        this.tipus = tipus;
        this.kapcsolattarto_nev = kapcsolattarto_nev;
        this.kapcsolattarto_email = kapcsolattarto_email;
        this.kapcsolatto_telszam = kapcsolatto_telszam;
    }

    public Partner(String nev, Integer adoszam, int iranyitoszam, String varos, String cim, String tipus,  String kapcsolattarto_nev, String kapcsolatto_telszam, String kapcsolattarto_email) {
        this.nev = nev;
        this.adoszam = adoszam;
        this.iranyitoszam = iranyitoszam;
        this.varos = varos;
        this.cim = cim;
        this.tipus = tipus;
        this.kapcsolattarto_nev = kapcsolattarto_nev;
        this.kapcsolattarto_email = kapcsolattarto_email;
        this.kapcsolatto_telszam = kapcsolatto_telszam;
    }
    
    

    public Integer getId() {
        return id;
    }


    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getAdoszam() {
        return adoszam;
    }

    public void setAdoszam(Integer adoszam) {
        this.adoszam = adoszam;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }


    public String getKapcsolattarto_nev() {
        return kapcsolattarto_nev;
    }

    public void setKapcsolattarto_nev(String kapcsolattarto_nev) {
        this.kapcsolattarto_nev = kapcsolattarto_nev;
    }

    public String getKapcsolattarto_email() {
        return kapcsolattarto_email;
    }

    public void setKapcsolattarto_email(String kapcsolattarto_email) {
        this.kapcsolattarto_email = kapcsolattarto_email;
    }

    public String getKapcsolatto_telszam() {
        return kapcsolatto_telszam;
    }

    public void setKapcsolatto_telszam(String kapcsolatto_telszam) {
        this.kapcsolatto_telszam = kapcsolatto_telszam;
    }

    @Override
    public Object[] toObjectRow() {
       Object[] object = new Object[10];
        
        object[0] = this.id;
        object[1] = this.adoszam;
        object[2] = this.nev;
        object[3] = this.iranyitoszam;
        object[4] = this.varos;
        object[5] = this.cim;
        object[6] = this.tipus;
        object[7] = this.kapcsolattarto_nev;
        object[8] = this.kapcsolattarto_email;
        object[9] = this.kapcsolatto_telszam;
        
        return object;
    }
    
    

    @Override
    public String toString() {
        return "Partner{" + "id=" + id + ", nev=" + nev + ", adoszam=" + adoszam + ", iranyitoszam=" + iranyitoszam + ", varos=" + varos + ", cim=" + cim + ", tipus=" + tipus + ", kapcsolattarto_nev=" + kapcsolattarto_nev + ", kapcsolattarto_email=" + kapcsolattarto_email + ", kapcsolatto_telszam=" + kapcsolatto_telszam + '}';
    }
 
    
 @Override
    public String toCSV() {
        return nev + ";" + adoszam + ";" + iranyitoszam + ";" + varos + ";" + cim + ";" + tipus + ";" + kapcsolattarto_nev + ";" + kapcsolattarto_email + ";" + kapcsolatto_telszam;
    }

 

    
}
