/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngotest;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

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
            JOptionPane.showMessageDialog(null, "Ej godkänd Email!"); 
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
                JOptionPane.showMessageDialog(null, "Ej godkänt namn!");
                resultat = false;
            }
            return resultat;
        }
        
                public static boolean efternamnKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$";
            String namn = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(namn).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt efternamn!");
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
                JOptionPane.showMessageDialog(null, "Ej godkänd adress!");
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
                JOptionPane.showMessageDialog(null, "Ej godkänt telefonnummer!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean datumKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^\\d{4}-\\d{2}-\\d{2}$";
            String datum = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(datum).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt datum!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean idKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^\\d*$";
            String id = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(id).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt id!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean sprakKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^[A-Z][a-zA-Z]+$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt språk!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean valutaKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^\\d+(\\.\\d{1,4})?$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänd valuta!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean tidzonKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^Tidzon \\d+$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänd tidzon!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean politiskStrukturKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^Politisk Struktur \\d+$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänd politisk struktur!");
                resultat = false;
            }
            return resultat;
            }
            
        public static boolean ekonomiKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^Ekonomi \\d+$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänd ekonomi!");
                resultat = false;
            }
            return resultat;
        }
        
        public static boolean ProjektNamnKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^[a-zA-Z0-9 ]+$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänt Projektnamn!");
                resultat = false;
            }
            return resultat;
        }
            
        public static boolean behorighet(InfDB idb, String aid){
            
            boolean resultat = false;
            try{
                String fraga = "Select behorighetsniva FROM admin where aid = " + aid;
                String behorighetsniva = idb.fetchSingle(fraga);
    
                    if(behorighetsniva == null){
                        //JOptionPane.showMessageDialog(null, "Du har inte behörighet!");
                        resultat = false;
                    }
                    else {

                        resultat = true;
                    }
                }
                catch (InfException ex){
                    System.out.println(ex.getMessage());
                }
            return resultat;
        }
        public static boolean behorighetProjektChef(InfDB idb, String aid){
            
            boolean resultat = false;
            try{
                String fraga = "SELECT projekt.projektchef FROM projekt JOIN anstalld ON projekt.projektchef = anstalld.aid where aid = '" + aid + "'";
                String behorighetsniva = idb.fetchSingle(fraga);
    
                    if(behorighetsniva == null){
                        //JOptionPane.showMessageDialog(null, "Du är inte projektchef!");
                        resultat = false;
                    }
                    else {

                        resultat = true;
                    }
                }
                catch (InfException ex){
                    System.out.println(ex.getMessage());
                }
            return resultat;
        }
        
        public static boolean kostnadKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^\\d+(\\.\\d{1,2})?$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ej godkänd valuta!");
                resultat = false;
            }
            return resultat;
        }
       
        public static boolean valideraTaBortLand(String lid){
            boolean resultat = true;
            
            if(lid == null || lid.isEmpty()){
                JOptionPane.showMessageDialog(null, "lid får inte vara tomt");
                resultat = false;
            }
            return resultat;

        }
        
       
        
        public static boolean valideraTaBortAnstalld(String aid){
            boolean resultat = true;
            
            if(aid == null || aid.isEmpty()){
                JOptionPane.showMessageDialog(null, "aid får inte vara tomt");
                resultat = false;
            }
            return resultat;

        }
        
        public static boolean valideraPartner(String pid, String namn, String kontaktperson, String kontaktepost, String telefon, String adress, String branch, String stad) {
    boolean resultat = true;
    
if (pid == null || pid.isEmpty()) {
        JOptionPane.showMessageDialog(null, "pid får inte vara tomt!");
        resultat = false;
}
    if (namn == null || namn.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Namn får inte vara tomt!");
        resultat = false;
    }
    if (kontaktperson == null || kontaktperson.isEmpty()) {
        JOptionPane.showMessageDialog(null, "kontaktperson får inte vara tomt!");
        resultat = false;
    }
    if (kontaktepost == null || kontaktepost.isEmpty()) {
        JOptionPane.showMessageDialog(null, "kontaktepost får inte vara tomt!");
        resultat = false;
    }
    if (telefon == null || telefon.isEmpty()) {
        JOptionPane.showMessageDialog(null, "telefon får inte vara tomt!");
        resultat = false;
    }
    if (adress == null || adress.isEmpty()) {
        JOptionPane.showMessageDialog(null, "adress får inte vara tomt!");
        resultat = false;
    }
    if (branch == null || branch.isEmpty()) {
        JOptionPane.showMessageDialog(null, "branch får inte vara tomt!");
        resultat = false;
    }
    if (stad == null || stad.isEmpty()) {
        JOptionPane.showMessageDialog(null, "stad får inte vara tomt!");
        resultat = false;
    }
    return resultat;
}
        

public static boolean valideraTaBortPartner(String pid) {
    if (pid.isEmpty()) {
        JOptionPane.showMessageDialog(null, "pid får inte vara tomt");
        return false;
    }
    return true;
}

public static boolean valideraUniktAid(InfDB idb, String aid) {
    try {
        String sql = "SELECT aid FROM anstalld WHERE aid = '" + aid + "'";
        String resultat = idb.fetchSingle(sql);

        if (resultat == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Det angivna AID:et finns redan. Välj ett annat ID.");
            return false;
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Ett fel inträffade vid kontrollen: " + e.getMessage());
        return false;
    }
}

public static boolean finnsPID(InfDB idb, String pid){
    try {
        String sql = "select pid from partner where pid = '" + pid + "'";
        String resultat = idb.fetchSingle(sql);
        
        if(resultat == null){
            JOptionPane.showMessageDialog(null, "Det angivna pid finns inte. Välj ett annat ID.");
            return false;
        } else if (resultat.equals(pid)) {
            return true;
        }
    }catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Ett fel inträffade vid kontrollen: " + e.getMessage());
        }
            return false;

    }
}

