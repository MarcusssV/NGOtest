/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Thomas
 */
public class AndraProjektRuta extends javax.swing.JFrame {

    /**
     * Creates new form ÄndraUppgifterRuta
     */
    public AndraProjektRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        jStatusBox.setVisible(false);
    }
    
    public InfDB idb;
    public String aid;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jValAvAndring = new javax.swing.JComboBox<>();
        jTillbakaKnapp = new javax.swing.JButton();
        jInmatningsFalt = new javax.swing.JTextField();
        jAndraKnapp = new javax.swing.JButton();
        jHjalpRuta = new javax.swing.JLabel();
        jIdRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jStatusBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jValAvAndring.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Projektnamn", "Beskrivning", "Startdatum", "Slutdatum", "Kostnad", "Status", "Prioritet", "Projektchef", "Land" }));
        jValAvAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValAvAndringActionPerformed(evt);
            }
        });

        jTillbakaKnapp.setText("Tillbaka");
        jTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTillbakaKnappActionPerformed(evt);
            }
        });

        jAndraKnapp.setText("Ändra");
        jAndraKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAndraKnappActionPerformed(evt);
            }
        });

        jHjalpRuta.setText("Förnamnet måste börja på en stor bokstav och får inte innehålla några specialtecken eller nummer.");

        jLabel1.setText("ID för projekt");

        jStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jStatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatusBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Redigera uppgifter för ett projekt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jHjalpRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTillbakaKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAndraKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jValAvAndring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInmatningsFalt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValAvAndring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInmatningsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jHjalpRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTillbakaKnapp)
                    .addComponent(jAndraKnapp))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jValAvAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValAvAndringActionPerformed

    String alternativ = jValAvAndring.getSelectedItem().toString();  
    if(alternativ.equals("Projektnamn")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false); 
        }
    
        if(alternativ.equals("Beskrivning")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
        
        if(alternativ.equals("Startdatum")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
        
        if(alternativ.equals("Slutdatum")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
        
        if(alternativ.equals("Kostnad")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
                
        if(alternativ.equals("Prioritet")){
        jInmatningsFalt.setVisible(false);
        jStatusBox.setVisible(true);
        jStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg",}));
        }
    if(alternativ.equals("Status")){
        jInmatningsFalt.setVisible(false);
        jStatusBox.setVisible(true);
        jStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Planerat", "Avslutat",}));
        }
    
        if(alternativ.equals("Projektchef")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
        
        if(alternativ.equals("Land")){
        jInmatningsFalt.setVisible(true);
        jStatusBox.setVisible(false);
        }
    }//GEN-LAST:event_jValAvAndringActionPerformed

    private void jTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaKnappActionPerformed
        setVisible(false);
        new visaOchAndraLander(idb, aid).setVisible(true);
    }//GEN-LAST:event_jTillbakaKnappActionPerformed

    private void jAndraKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAndraKnappActionPerformed
        // TODO add your handling code here:
        
        String alternativ = jValAvAndring.getSelectedItem().toString();
        if(alternativ.equals("Namn")){
            andraNamn();
        }
        if(alternativ.equals("Sprak")){
            andraSprak();
        }
        if(alternativ.equals("Valuta")){
            andraValuta();
        }
        if(alternativ.equals("Politisk Struktur")){
            andraPS();
        }
        if(alternativ.equals("Ekonomi")){
            andraEkonomi();
        }
        if(alternativ.equals("Status")){
        }
    }//GEN-LAST:event_jAndraKnappActionPerformed

    private void jStatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStatusBoxActionPerformed

    public void andraNamn(){
        
        String lid = jIdRuta.getText();
        String inmatning = jInmatningsFalt.getText();
        if(ValideringsKlass.textFaltHarVarde(jIdRuta)){
            if(ValideringsKlass.idKontroll(jIdRuta));
                if(ValideringsKlass.textFaltHarVarde(jInmatningsFalt)){
                    if(ValideringsKlass.namnKontroll(jInmatningsFalt)){
                        try{
                            idb.update("Update land set namn = " + "'" + inmatning + "'" + "where lid = '" + lid + "'");
                            JOptionPane.showMessageDialog(null, "Ändringen gick igenom!");
                        }
                        catch (InfException a){
                            JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                            System.out.println(a.getMessage());
                        }
                    }
                }
            }
    }
    public void andraSprak(){
        
        String lid = jIdRuta.getText();
        String inmatning = jInmatningsFalt.getText();
        if(ValideringsKlass.textFaltHarVarde(jIdRuta)){
            if(ValideringsKlass.idKontroll(jIdRuta));
                if(ValideringsKlass.textFaltHarVarde(jInmatningsFalt)){
                    if(ValideringsKlass.sprakKontroll(jInmatningsFalt)){
                        try{
                            idb.update("Update land set sprak = " + "'" + inmatning + "'" + "where lid = '" + lid + "'");
                            JOptionPane.showMessageDialog(null, "Ändringen gick igenom!");
                        }
                        catch (InfException a){
                            JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                            System.out.println(a.getMessage());
                        }
                    }
                }
            }
    }
    public void andraValuta(){
        
        String lid = jIdRuta.getText();
        String inmatning = jInmatningsFalt.getText();
        if(ValideringsKlass.textFaltHarVarde(jIdRuta)){
            if(ValideringsKlass.idKontroll(jIdRuta));
                if(ValideringsKlass.textFaltHarVarde(jInmatningsFalt)){
                    if(ValideringsKlass.valutaKontroll(jInmatningsFalt)){
                        try{
                            idb.update("Update land set valuta = " + "'" + inmatning + "'" + "where lid = '" + lid + "'");
                            JOptionPane.showMessageDialog(null, "Ändringen gick igenom!");
                        }
                        catch (InfException a){
                            JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                            System.out.println(a.getMessage());
                        }
                    }
                }
            }
    }
    
    public void andraPS(){
        
        String lid = jIdRuta.getText();
        String inmatning = jInmatningsFalt.getText();
        if(ValideringsKlass.textFaltHarVarde(jIdRuta)){
            if(ValideringsKlass.idKontroll(jIdRuta));
                if(ValideringsKlass.textFaltHarVarde(jInmatningsFalt)){
                    if(ValideringsKlass.politiskStrukturKontroll(jInmatningsFalt)){
                        try{
                            idb.update("Update land set politisk_struktur = " + "'" + inmatning + "'" + "where lid = '" + lid + "'");
                            JOptionPane.showMessageDialog(null, "Ändringen gick igenom!");
                        }
                        catch (InfException a){
                            JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                            System.out.println(a.getMessage());
                        }
                    }
                }
            }
    }
  
    public void andraEkonomi(){
        
        String lid = jIdRuta.getText();
        String inmatning = jInmatningsFalt.getText();
        if(ValideringsKlass.textFaltHarVarde(jIdRuta)){
            if(ValideringsKlass.idKontroll(jIdRuta));
                if(ValideringsKlass.textFaltHarVarde(jInmatningsFalt)){
                    if(ValideringsKlass.ekonomiKontroll(jInmatningsFalt)){
                        try{
                            idb.update("Update land set ekonomi = " + "'" + inmatning + "'" + "where lid = '" + lid + "'");
                            JOptionPane.showMessageDialog(null, "Ändringen gick igenom!");
                        }
                        catch (InfException a){
                            JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                            System.out.println(a.getMessage());
                        }
                    }
                }
            }
    }


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AndraProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new AndraUppgifterRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAndraKnapp;
    private javax.swing.JLabel jHjalpRuta;
    private javax.swing.JTextField jIdRuta;
    private javax.swing.JTextField jInmatningsFalt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jStatusBox;
    private javax.swing.JButton jTillbakaKnapp;
    private javax.swing.JComboBox<String> jValAvAndring;
    // End of variables declaration//GEN-END:variables
}
