
package Egyedek;

import java.time.LocalDate;

public class Dolgozo implements Egyed{

    private String nev;
    private Integer id;
    private String szemelyiSzam;
    private String szuletesiHely;
    private LocalDate szuletesiDatum;
    private String lakhely;
    private String beosztas;
    private String email;
    

    public Dolgozo(Integer id, String nev, String szemelyiSzam, String szuletesiHely, LocalDate szuletesiDatum, String lakhely, String beosztas, String email) {
       
        this.id= id;
        this.nev =nev;     
        this.szemelyiSzam = szemelyiSzam;
        this.szuletesiHely = szuletesiHely;
        this.szuletesiDatum = szuletesiDatum;
        this.lakhely = lakhely;
        this.beosztas = beosztas;
        this.email = email;
        
      
    }
//    
//     public Dolgozo(String nev, String szemelyiSzam, String szuletesiHely, LocalDate szuletesiDatum, String lakhely, String beosztas, String email) {
//         
//         this.nev = nev;
//         this.szemelyiSzam = szemelyiSzam;
//         this.szuletesiHely = szuletesiHely;
//         this.szuletesiDatum = szuletesiDatum;
//         this.lakhely = lakhely;
//         this.beosztas = beosztas;
//         this.email = email;
//        
//      
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

    public String getSzemelyiSzam() {
        return szemelyiSzam;
    }

    public void setSzemelyiSzam(String szemelyiSzam) {
        this.szemelyiSzam = szemelyiSzam;
    }

    
    public String getSzuletesiHely() {
        return szuletesiHely;
    }

    public void setSzuletesiHely(String szuletesiHely) {
        this.szuletesiHely = szuletesiHely;
    }

    public LocalDate getSzuletesiDatum() {
        return szuletesiDatum;
    }

    public void setSzuletesiDatum(LocalDate szuletesiDatum) {
        this.szuletesiDatum = szuletesiDatum;
    }

    public String getLakhely() {
        return lakhely;
    }

    public void setLakhely(String lakhely) {
        this.lakhely = lakhely;
    }

    public String getBeosztas() {
        return beosztas;
    }

    public void setBeosztas(String beosztas) {
        this.beosztas = beosztas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public Object[] toObjectRow(){
        Object[] object = new Object[8];
        
        object[0] = this.id;
        object[1] = this.nev;
        object[2] = this.szemelyiSzam;
        object[3] = this.szuletesiHely;
        object[4] = this.szuletesiDatum;
        object[5] = this.lakhely;
        object[6] = this.beosztas;
        object[7] = this.email;

        return object;

    }

    @Override
    public String toString() {
        return "Dolgozo{" + "nev=" + nev + ", id=" + id + ", szemelyiSzam=" + szemelyiSzam + ", szuletesiHely=" + szuletesiHely + ", szuletesiDatum=" + szuletesiDatum + ", lakhely=" + lakhely + ", beosztas=" + beosztas + ", email=" + email + '}';
    }

    @Override
    public String toCSV() {
        return nev + ";" + szemelyiSzam + ";" + szuletesiHely + ";" + szuletesiDatum + ";" + lakhely + ";" + beosztas + ";" + email;
    }
    
    

}
