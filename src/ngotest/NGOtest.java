/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngotest;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Marcusss
 */
public class NGOtest {
    
    private static InfDB idb;
    private static String aid;
    
    public static void main(String[] args) {
        try{
            idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
            new Inloggningssida(idb, aid).setVisible(true);
           // new VisaForNamnFonster(idb).setVisible(false);
            System.out.println("funkar!");}
        
     catch (InfException ex){
         System.out.println(ex.getMessage());
        }
        
    }
    
}
