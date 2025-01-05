/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marcu
 */
public class ProjektRuta extends javax.swing.JFrame {
ArrayList<HashMap<String, String>> allaProjektUppgifter = new ArrayList<>();
ArrayList<HashMap<String, String>> datumUppgifter = new ArrayList<>();
ArrayList<HashMap<String, String>> egnaProjektUppgifter = new ArrayList<>();
ArrayList<HashMap<String, String>> avdelningsProjektUppgifter = new ArrayList<>();
String status = "is not null";


    public ProjektRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        
    }
    
    private static InfDB idb;
    private static String aid;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TillbakaKnapp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MinaProjektTabel = new javax.swing.JTable();
        MinaProjektKnapp = new javax.swing.JButton();
        AllaProjektKnapp = new javax.swing.JButton();
        AvdelningsProjektKnapp = new javax.swing.JButton();
        StatusDropDown = new javax.swing.JComboBox<>();
        jStartdatumRuta = new javax.swing.JTextField();
        jSlutdatumRuta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSökKnapp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Projekt");

        TillbakaKnapp.setText("Tillbaka");
        TillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaKnappActionPerformed(evt);
            }
        });

        MinaProjektTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProjektNamn", "ProjektChef", "Beskrivning", "Prioritet", "StartDatum", "SlutDatum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MinaProjektTabel);

        MinaProjektKnapp.setText("Mina projekt");
        MinaProjektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinaProjektKnappActionPerformed(evt);
            }
        });

        AllaProjektKnapp.setText("Alla projekt");
        AllaProjektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllaProjektKnappActionPerformed(evt);
            }
        });

        AvdelningsProjektKnapp.setText("Avdelningens projekt");
        AvdelningsProjektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvdelningsProjektKnappActionPerformed(evt);
            }
        });

        StatusDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerat", "Avslutat" }));
        StatusDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusDropDownActionPerformed(evt);
            }
        });

        jStartdatumRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartdatumRutaActionPerformed(evt);
            }
        });

        jSlutdatumRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSlutdatumRutaActionPerformed(evt);
            }
        });

        jLabel2.setText("Startdatum");

        jLabel3.setText("Slutdatum");

        jSökKnapp.setText("Sök");
        jSökKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSökKnappActionPerformed(evt);
            }
        });

        jLabel4.setText("Sök efter aktiva projekt på din avdelning inom viss datumram");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TillbakaKnapp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(AllaProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AvdelningsProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MinaProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(StatusDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jStartdatumRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlutdatumRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jSökKnapp))
                            .addComponent(jLabel3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllaProjektKnapp)
                    .addComponent(AvdelningsProjektKnapp)
                    .addComponent(MinaProjektKnapp)
                    .addComponent(StatusDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TillbakaKnapp)
                    .addComponent(jStartdatumRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlutdatumRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSökKnapp))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new InfoRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_TillbakaKnappActionPerformed

    private void AllaProjektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllaProjektKnappActionPerformed
        // TODO add your handling code here:
        hamtaAllaData();
        fyllAllaTabel();
    }//GEN-LAST:event_AllaProjektKnappActionPerformed

    private void MinaProjektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinaProjektKnappActionPerformed
        // TODO add your handling code here:
        hamtaEgenData();
        fyllEgenTabel();
    }//GEN-LAST:event_MinaProjektKnappActionPerformed

    private void AvdelningsProjektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvdelningsProjektKnappActionPerformed
        // TODO add your handling code here:
        hamtaAvdelningsData();
        fyllAvdelningsTabel();
    }//GEN-LAST:event_AvdelningsProjektKnappActionPerformed

    private void StatusDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusDropDownActionPerformed
        // Kontrollerar vilken status som tabellen ska visa, beroende på valt alternativ
        // Används vid sql-frågorna för att endast hämta projekt med vald status
        String Alternativ = StatusDropDown.getSelectedItem().toString();
        if (Alternativ.equals("Alla")){
            Alternativ = "is not null";
            status = Alternativ;
        }
        else {
            status = "= " + "'"+ Alternativ + "'";
        }
        
        
    }//GEN-LAST:event_StatusDropDownActionPerformed

    private void jStartdatumRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartdatumRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStartdatumRutaActionPerformed

    private void jSökKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSökKnappActionPerformed
        
        hamtaDatumData();
        fyllDatumTabel();
        
    }//GEN-LAST:event_jSökKnappActionPerformed

    private void jSlutdatumRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSlutdatumRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlutdatumRutaActionPerformed
     
    // Denna metod hämtar data från databasen där den anställda är delaktig
    public void hamtaEgenData (){
        try{
        String fraga = ("SELECT projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum FROM ngo_2024.projekt where pid = (select pid from ans_proj where aid = " + aid + ") and status " + status);
        egnaProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    // Denna metod hämtar data från databasen om den anställdas avdelnings projekt
    public void hamtaAvdelningsData(){
        try{
            String avdelningsFraga = ("Select avdelning from anstalld where aid = " + aid);
            String avdelning = idb.fetchSingle(avdelningsFraga);
            String fraga = ("select projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum from projekt join ans_proj on projekt.pid = ans_proj.pid join anstalld on ans_proj.aid = anstalld.aid where avdelning = " + avdelning + " and status " + status + " group by projekt.pid");
            avdelningsProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // Denna metod hämtar data från databasen om alla projekt som finns
    public void hamtaAllaData(){
        try{
            String fraga = ("SELECT projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum, status FROM ngo_2024.projekt where status " + status);
            allaProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // Denna metod fyller Tabellen med avdelningens projekt, tillkallas vid knapptryck
     public void fyllAvdelningsTabel(){
        
        DefaultTableModel model1 = (DefaultTableModel) MinaProjektTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : avdelningsProjektUppgifter){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("projektnamn");
            data[1] = projekt.get("projektchef");
            data[2] = projekt.get("beskrivning");
            data[3] = projekt.get("prioritet");
            data[4] = projekt.get("startdatum");
            data[5] = projekt.get("slutdatum");
            model1.addRow(data);
        }
     }
     // Denna metod fyller tabellen med alla projekt, tillkallas vid knapptryck
      public void fyllAllaTabel(){
        
        DefaultTableModel model1 = (DefaultTableModel) MinaProjektTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : allaProjektUppgifter){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("projektnamn");
            data[1] = projekt.get("projektchef");
            data[2] = projekt.get("beskrivning");
            data[3] = projekt.get("prioritet");
            data[4] = projekt.get("startdatum");
            data[5] = projekt.get("slutdatum");
            model1.addRow(data);
        }
        
    }
    // Denna metod fyller tabellen med den anställdas projekt, tillkallas med knapptryck
    public void fyllEgenTabel(){
        
        DefaultTableModel model1 = (DefaultTableModel) MinaProjektTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : egnaProjektUppgifter){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("projektnamn");
            data[1] = projekt.get("projektchef");
            data[2] = projekt.get("beskrivning");
            data[3] = projekt.get("prioritet");
            data[4] = projekt.get("startdatum");
            data[5] = projekt.get("slutdatum");
            model1.addRow(data);
        }
        
    }
    
    public void hamtaDatumData(){
        
        if(ValideringsKlass.textFaltHarVarde(jStartdatumRuta)){
            if(ValideringsKlass.datumKontroll(jStartdatumRuta)){
                if(ValideringsKlass.textFaltHarVarde(jSlutdatumRuta)){
                   if(ValideringsKlass.datumKontroll(jSlutdatumRuta)){
                        String startdatum = jStartdatumRuta.getText();
                        String slutdatum = jSlutdatumRuta.getText();
                            try{
                                    String avdelningsFraga = ("Select avdelning from anstalld where aid = " + aid);
                                    String avdelning = idb.fetchSingle(avdelningsFraga);
                                    String fraga = ("SELECT projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum from projekt join ans_proj on projekt.pid = ans_proj.pid join anstalld on ans_proj.aid = anstalld.aid WHERE startdatum >= '" + startdatum + "' AND slutdatum <= '" + slutdatum + "' and status = 'Pågående' and avdelning = '" + avdelning + "' group by projekt.pid");
                                    datumUppgifter = idb.fetchRows(fraga);
                                }
                            catch (InfException ex) {
                                System.out.println(ex.getMessage());
                                }
                    }
                }
            }
        }
    }
    public void fyllDatumTabel(){
        
        DefaultTableModel model1 = (DefaultTableModel) MinaProjektTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : datumUppgifter){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("projektnamn");
            data[1] = projekt.get("projektchef");
            data[2] = projekt.get("beskrivning");
            data[3] = projekt.get("prioritet");
            data[4] = projekt.get("startdatum");
            data[5] = projekt.get("slutdatum");
            model1.addRow(data);
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
            java.util.logging.Logger.getLogger(ProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllaProjektKnapp;
    private javax.swing.JButton AvdelningsProjektKnapp;
    private javax.swing.JButton MinaProjektKnapp;
    private javax.swing.JTable MinaProjektTabel;
    private javax.swing.JComboBox<String> StatusDropDown;
    private javax.swing.JButton TillbakaKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSlutdatumRuta;
    private javax.swing.JTextField jStartdatumRuta;
    private javax.swing.JButton jSökKnapp;
    // End of variables declaration//GEN-END:variables
}

