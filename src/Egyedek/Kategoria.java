
package Egyedek;


public class Kategoria {
    
    private Integer id;
    private String nev;

    public Kategoria(String nev) {
        this.nev = nev;
    }

    public Kategoria(Integer id, String nev) {
        this.id = id;
        this.nev = nev;
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
    
    
    
}
