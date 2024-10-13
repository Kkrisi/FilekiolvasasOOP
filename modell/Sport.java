

package modell;



public class Sport {
    private String nev;
    private String helyszin;
    
    public Sport(String sor){
        String[] s = sor.split(";");
        this.nev = s[0];
        this.helyszin = s[1];
    };
    
    public Sport(String nev, String helyszin){
        this.nev = nev;
        this.helyszin = helyszin;
    };
    
    
    
    
    public String getNev(){
        return nev;
    };
    
    public String getHelyszin(){
        return helyszin;
    };
}
