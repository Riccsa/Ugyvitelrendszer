
package Egyedek;


public class Aru  implements Egyed{
    
    private Integer id;
    private int cikkszam;
    private String gyarto;
    private String nev;
    private Integer kategoriaId;
    private String kategoriaNev;
    private int keszlet;
    private int minKeszlet;
    private String egyseg;
    private int netto;
    private int brutto;
    private int afa;

    public Aru(Integer id,Integer kategoriaId, int cikkszam, String gyarto, String nev, String kategoriaNev, int keszlet,int minKeszlet,String egyseg, int netto, int brutto, int afa) {
        this.id = id;
        this.cikkszam = cikkszam;
        this.gyarto = gyarto;
        this.nev = nev;
        this.kategoriaNev=kategoriaNev;
        this.kategoriaId = kategoriaId;
        this.keszlet = keszlet;
        this.minKeszlet=minKeszlet;
        this.egyseg=egyseg;
        this.netto = netto;
        this.brutto = brutto;
        this.afa = afa;
    }

//    public Aru(int cikkszam, String gyarto, String nev, Integer kategoriaId, String kategoriaNev, int keszlet, int minKeszlet, String egyseg, int netto, int brutto, int afa) {
//        this.cikkszam = cikkszam;
//        this.gyarto = gyarto;
//        this.nev = nev;
//        this.kategoriaId = kategoriaId;
//        this.kategoriaNev = kategoriaNev;
//        this.keszlet = keszlet;
//        this.minKeszlet = minKeszlet;
//        this.egyseg = egyseg;
//        this.netto = netto;
//        this.brutto = brutto;
//        this.afa = afa;
//    }
      

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCikkszam() {
        return cikkszam;
    }

    public void setCikkszam(int cikkszam) {
        this.cikkszam = cikkszam;
    }


    public int getNetto() {
        return netto;
    }

    public void setNetto(int netto) {
        this.netto = netto;
    }

    public int getBrutto() {
        return brutto;
    }

    public void setBrutto(int brutto) {
        this.brutto = brutto;
    }

    public int getAfa() {
        return afa;
    }

    public void setAfa(int afa) {
        this.afa = afa;
    }

    public Integer getKategoriaId() {
        return kategoriaId;
    }


    public String getGyarto() {
        return gyarto;
    }

    public void setTipus(String tipus) {
        this.gyarto = tipus;
    }

    public int getKeszlet() {
        return keszlet;
    }

    public void setKeszlet(int keszlet) {
        this.keszlet = keszlet;
    }

    public int getMinKeszlet() {
        return minKeszlet;
    }

    public void setMinKeszlet(int minKeszlet) {
        this.minKeszlet = minKeszlet;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public String getKategoriaNev() {
        return kategoriaNev;
    }
    
    

    @Override
    public Object[] toObjectRow() {
       
        Object[] object = new Object[12];
        
        object[0] = this.id;
        object[1] = this.kategoriaId;
        object[2] = this.cikkszam;
        object[3] = this.gyarto;
        object[4] = this.nev;
        object[5] = this.kategoriaNev;
        object[6] = this.keszlet;
        object[7] = this.minKeszlet;
        object[8] = this.egyseg;
        object[9] = this.netto;
        object[10] = this.brutto;
        object[11] = this.afa;

        return object;
        
    }

    @Override
    public String toString() {
        return "Aru{" + "id=" + id + ", cikkszam=" + cikkszam + ", gyarto=" + gyarto + ", nev=" + nev + ", kategoriaId=" + kategoriaId + ", kategoriaNev=" + kategoriaNev + ", keszlet=" + keszlet + ", minKeszlet=" + minKeszlet + ", egyseg=" + egyseg + ", netto=" + netto + ", brutto=" + brutto + ", afa=" + afa + '}';
    }
    
     @Override
    public String toCSV() {
        return cikkszam + ";" + gyarto + ";" + nev + ";" + kategoriaNev + ";" + keszlet + ";" + minKeszlet + ";" + egyseg + ";" + netto + ";" + brutto + ";" + afa;
                
    }
        
}
