package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;

public class FileKezelesOOP {

    
    
    public static void main(String[] args) throws IOException {
        
        /* Berolvasás: */
        InputStream is = FileKezelesOOP.class.getClassLoader().getResourceAsStream("res/emberek.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
        ArrayList<Ember> emberek = new ArrayList<>();
        
        String sor;
        System.out.println("beolvasott fájl tartalma:");
        while((sor = br.readLine()) != null){
            System.out.println(sor);
            Ember ember = new Ember(sor);
            emberek.add(ember);
        }
        
        
        
        System.out.print("Ki lakik Bp-en: ");
        
        
        int i = 0;
        while(!(emberek.get(i).getCim().equals("Bp"))){
            i++;
        }
        
        
        System.out.println(emberek.get(i).getNev());
    } 
}
