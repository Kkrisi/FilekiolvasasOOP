
package modell;



public class Ember {
    private String nev;
    private String cim;

    public Ember(String sor){
        String[] s = sor.split(";");
        this.nev = s[0];
        this.cim = s[1];
    }
    
    public Ember(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    
    
    
    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    
    
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + '}';
    }
}
