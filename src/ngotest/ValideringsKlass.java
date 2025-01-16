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
            //If-satsen kontrollerar så att inmatningen som görs matchar med regex vi bestämde innan. Om det gör det kommer resultatet få värdet true och fortsätta.
            }
            else{
            JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Är ej godkänd Email!"
                                                + "\nTesta följande format:\nexample.email@domain.com\n" +
                                                "user_name-123@sub.domain.co.uk\n" +
                                                "username@domain.org"); 
            resultat = false;
            //om den inte matchar kommer else i If-satsen fånga det och ge ett meddelande som hjälper användaren med exemple på ett, i det här fallet, korrekt skriven email.
            }
            return resultat;
            //I slutet så retunerar metoden resultat som antingen kommer vara true eller false.
    }
    //Nästan alla andra valideringar fungerar på exakt samma sätt bara med olika regex och felmeddelanden.   
        public static boolean namnKontroll(JTextField rutaAttKolla){
            
            boolean resultat;
            String regexPattern = "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$";
            String namn = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(namn).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' är ett ej godkänt namn!\nTesta följande format:\nJohn\n" +
                                                    "Alice Smith\n" +
                                                    "Mary Ann Johnson\nOBS! Namnet måste börja med stor bokstav!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' är ej godkänt efternamn!\nTesta följande format:\nMcDonald\n" +
                                                    "Van Helsing\n" +
                                                    "De La Cruz\n" +
                                                    "O'Connor\nOBS! Efternamnet måste börja med stor bokstav!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänd adress!\nTesta följande format:\n123 John Smith, Doe\n" +
                                                    "123 John\n" +
                                                    "John 123\n" +
                                                    "John Smith 123");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänt telefonnummer!\nTesta följande format:\n123-456-7890\n" +
                                                    "987-654-3210\n" +
                                                    "000-123-4567");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänt datum!\nTesta följande format:\2023-01-16\n" +
                                                    "1999-12-31\n" +
                                                    "2025-07-04");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänt id!\nTesta följande format:\n12345\n" +
                                                    "9876543210\n" +
                                                    "0");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänt språk!\nTesta följande format:\nEngelska\nSvenska\nJapanska\nOBS! Måste börja på stor bokstav!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänd valuta!\nTesta följande format:\n123\n12345.1\n1.12\n123456.123\n123.1234");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänd tidzon!\nTesta följande format:\nTidzon 123\n" +
                                                    "Tidzon 9999\n" +
                                                    "Tidzon 0\n" +
                                                    "Tidzon 42\nOBS! Inmatningen måste innehålla 'Tidzon' i början!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänd Politisk Struktur!\nTesta följande format:\nPolitisk Struktur 123\n" +
                                                    "Politisk Struktur 9999\n" +
                                                    "Politisk Struktur 0\n" +
                                                    "Politisk Struktur 42\nOBS! Inmatningen måste innehålla 'Politisk Struktur' i början!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänd Ekonomi!\nTesta följande format:\nEkonomi 123\n" +
                                                    "Ekonomi 9999\n" +
                                                    "Ekonomi 0\n" +
                                                    "Ekonomi 42\nOBS! Inmatningen måste innehålla 'Ekonomi' i början!");
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
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "' Ej godkänt Projektnamn!\nTesta följande format:\nprojektnamn Test Project\n" +
                                                    "projektnamn 12345\n" +
                                                    "projektnamn New Project 2025\n" +
                                                    "projektnamn Example123");
                resultat = false;
            }
            return resultat;
        }
        
        //Metoden nedan skiljer sig från de tidigare metoderna.
        public static boolean behorighet(InfDB idb, String aid){
            
            boolean resultat = false;
            try{
                String fraga = "Select behorighetsniva FROM admin where aid = " + aid;
                String behorighetsniva = idb.fetchSingle(fraga);
                //Denna metod kontrollerar om behörighet med hjälp av en sql-fråga där den kontrollerar om en viss aid finns med i admin listan.
                    if(behorighetsniva == null){
                        //JOptionPane.showMessageDialog(null, "Du har inte behörighet!");
                        resultat = false;
                        //retunerar sql-frågan null, alltså att användaren inte är med i admin listan, kommer resultatet bli false.
                    }
                    else {

                        resultat = true;
                        //om användaren finns med kommer resultat och bli true.
                    }
                }
                catch (InfException ex){
                    System.out.println(ex.getMessage());
                }
            //try and catch används för att fånga eventuella problem som kan krascha eller göra annat vid fel inmatning.
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
            String regexPattern = "^\\d{1,12}(\\.\\d{1,2})?$";
            String inmatning = rutaAttKolla.getText();
            if(Pattern.compile(regexPattern).matcher(inmatning).matches()){
                resultat = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "'" + rutaAttKolla.getText() + "'Ej godkänd kostnad!\nTesta följande format:\n123\n123456789123.12\n123456.1\nOBS! Måste ha 2 decimaler och får inte överstiga 12 siffriga tal.");
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

 public static boolean harBehorighet(int aid, InfDB idb) {
        try {
            String fraga = "SELECT behorighetsniva FROM admin WHERE aid = " + aid;
            String behorighetsniva = idb.fetchSingle(fraga);

            return behorighetsniva != null;
        } catch (InfException ex) {
            System.out.println("Fel vid kontroll av behörighet: " + ex.getMessage());
            return false; 
        }
    }
 
 public static boolean valideraAvdelning(String avdid, String namn, String beskrivning, String adress, String epost, String telefon, String stad, String chef) {
    boolean resultat = true;

    if (avdid == null || avdid.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Avdelnings-ID får inte vara tomt!");
        resultat = false;
    }
    if (namn == null || namn.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Namn får inte vara tomt!");
        resultat = false;
    }
    if (beskrivning == null || beskrivning.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Beskrivning får inte vara tomt!");
        resultat = false;
    }
    if (adress == null || adress.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Adress får inte vara tomt!");
        resultat = false;
    }
    if (epost == null || epost.isEmpty()) {
        JOptionPane.showMessageDialog(null, "E-post får inte vara tomt!");
        resultat = false;
    }
    if (telefon == null || telefon.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Telefonnummer får inte vara tomt!");
        resultat = false;
    }
    if (stad == null || stad.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Stad får inte vara tomt!");
        resultat = false;
    }
    if (chef == null || chef.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Chefens ID får inte vara tomt!");
        resultat = false;
    }

    return resultat;
}
 public static boolean chefExisterar(String chef, InfDB idb) {
     boolean chefresultat = false;
    try {
        String chefsql = "SELECT * FROM anstalld WHERE aid = '" + chef + "'";
        String resultat = idb.fetchSingle(chefsql);
        if(resultat != null)
            chefresultat = true;
        else{
            JOptionPane.showMessageDialog(null, "Det ID:t fanns inte i databasen. Försök igen.");
        }
    } catch (InfException O){
                    JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                    System.out.println(O.getMessage());
        }
        return chefresultat;
    }
 public static boolean stadExisterar(String stad, InfDB idb) {
    boolean stadresultat = false;
    try {
        String stadsql = "SELECT * FROM stad WHERE sid = '" + stad + "'";
        String resultat = idb.fetchSingle(stadsql);
        if (resultat != null)
            stadresultat = true;
        else {
            JOptionPane.showMessageDialog(null, "Stadens ID fanns inte i databasen. Försök igen.");
        }
    } catch (InfException O) {
        JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
        System.out.println(O.getMessage());
        }
        return stadresultat;
       }
 
 public static boolean finnsAVDID(InfDB idb, String avdid){
    try {
        String sql = "select avdid from avdelning where avdid = '" + avdid + "'";
        String resultat = idb.fetchSingle(sql);
        
        if(resultat == null){
            JOptionPane.showMessageDialog(null, "Det angivna avdid finns inte. Välj ett annat ID.");
            return false;
        } else if (resultat.equals(avdid)) {
            return true;
        }
    }catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Ett fel inträffade vid kontrollen: " + e.getMessage());
        }
            return false;

    }
            //Denna koden används för att kontrollera om en projektchef är projekchef för ett visst projekt.
            //Detta validering används när vi ska ändra uppgifter, ta bort eller lägga till gällande projekt för att kontrollera att det är rätt projektchef som gör det.
            public static boolean behorighetProjektChefForProjekt(InfDB idb, String aid, JTextField RutaAttKolla){
            String pid = RutaAttKolla.getText();
            boolean resultat = false;
            try{
                String fraga = "SELECT projektchef from projekt where pid = '" + pid + "'";
                String ProjektChefID = idb.fetchSingle(fraga);
                
    
                    if(ProjektChefID == null || !ProjektChefID.equals(aid)){
                        JOptionPane.showMessageDialog(null, "Du är inte projektchef för detta projekt ELLER projektet finns ej!");
                        resultat = false;
                        //Denna If-satsen kontrollerar så att om projektchefid är null eller om projektchefid inte är detsamma som aid så kommer resultat bli false.
                    }
                    else {

                        resultat = true;
                        //JOptionPane.showMessageDialog(null, "Du är inte projektchef för detta projekt!");
                        //Else gör så att allt annat kommer göra resultat blir true. Men i det här fallet kan else bara vara om projektchefid = aid.
                    }
                }
                catch (InfException ex){
                    System.out.println(ex.getMessage());
                }
            return resultat;
        }
              //RutaAttKolla2 är för att den tar in 2 olika textrutors värden vid validering
            public static boolean KontrolleraPartner_ProjektFinns(InfDB idb, String aid, JTextField RutaAttKolla, JTextField RutaAttKolla2){
                boolean resultat = false;
                
                try {
                    String Fraga = ("select partner_pid from projekt_partner where pid = '" + RutaAttKolla.getText() +"' and partner_pid = '" + RutaAttKolla2.getText() + "'");
                    String PPid = idb.fetchSingle(Fraga);
                    if (PPid == null){
                        resultat = false;
                        JOptionPane.showMessageDialog(null, "Detta projekt har ingen partner med detta ID!");
                        
                    }
                    
                    else{
                        resultat = true;
                        
                    }
                }
                    catch (InfException ex){
                    System.out.println(ex.getMessage());
                    }
                return resultat;
            }
            
            public static boolean KontrolleraPartnerFinns(InfDB idb, String aid, JTextField RutaAttKolla){
                boolean resultat = false;
                
                try {
                    String Fraga = ("Select pid from partner where pid = '" + RutaAttKolla.getText() + "'");
                    String PartnerID = idb.fetchSingle(Fraga);
                    if (PartnerID == null){
                        resultat = false;
                        JOptionPane.showMessageDialog(null, "Finns ingen partner med detta ID!");
                        
                    }
                    
                    else{
                        resultat = true;
                        
                    }
                }
                    catch (InfException ex){
                    System.out.println(ex.getMessage());
                    }
                return resultat;
            }
            
             public static boolean KontrolleraHandlaggareFinns(InfDB idb, String aid, JTextField RutaAttKolla){
                boolean resultat = false;
                
                try {
                    String Fraga = ("Select aid from anstalld where aid = '" + RutaAttKolla.getText() + "'");
                    String AID = idb.fetchSingle(Fraga);
                    if (AID == null){
                        resultat = false;
                        JOptionPane.showMessageDialog(null, "Finns ingen handläggare med detta ID!");
                        
                    }
                    
                    else{
                        resultat = true;
                        
                    }
                }
                    catch (InfException ex){
                    System.out.println(ex.getMessage());
                    }
                return resultat;
            }
             
             public static boolean KontrolleraAns_ProjektFinns(InfDB idb, String aid, JTextField RutaAttKolla, JTextField RutaAttKolla2){
                boolean resultat = false;
                
                try {
                    String Fraga = ("select aid from ans_proj where pid = '" + RutaAttKolla.getText() +"' and aid = '" + RutaAttKolla2.getText() + "'");
                    String AID = idb.fetchSingle(Fraga);
                    if (AID == null){
                        resultat = false;
                        JOptionPane.showMessageDialog(null, "Detta projekt har ingen handläggare med detta ID!");
                        
                    }
                    
                    else{
                        resultat = true;
                        
                    }
                }
                    catch (InfException ex){
                    System.out.println(ex.getMessage());
                    }
                return resultat;
            }
}


