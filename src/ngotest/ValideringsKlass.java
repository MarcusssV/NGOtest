/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngotest;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Marcu
 */
public class ValideringsKlass {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla){
        
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
        }
        
        return resultat;
    }
    public static boolean losenordFaltHarVarde(JPasswordField rutaAttKolla){
        
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Lösenordsrutan är tom!");
            resultat = false;
        }
        
        return resultat;
    }
    
    //Kontroll för email där enligt regex kontrollerar om emailen är korrekt skriven.
        public static boolean emailKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            // Över har vi en string av regular expressions som jämnförs med JTextField.
            String email = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(email).matches()){
            resultat = true;
            }
            else{
            JOptionPane.showMessageDialog(null, "Ej godkänt!"); 
            resultat = false;
            }
            return resultat;
    }
        
        public static boolean namnKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$";
            String namn = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(namn).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean adressKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^(\\d{3}\\s[A-Z][a-z]+\\s[A-Z][a-z]+,\\s[A-Z][a-z]+|\\d{3}\\s[A-Z][a-z]+|[A-Z][a-z]+\\s\\d{3}|[A-Z][a-z]+\\s[A-Z][a-z]+\\s\\d{3})$";
            String adress = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(adress).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt!");
                resultat = false;
            }
            return resultat;
        }
                
        public static boolean telefonnummerKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^\\d{3}-\\d{3}-\\d{4}$";
            String telefonnummer = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(telefonnummer).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt!");
                resultat = false;
            }
            return resultat;
        }
}

