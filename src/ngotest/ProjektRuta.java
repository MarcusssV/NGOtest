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
ArrayList<HashMap<String, String>> egnaProjektUppgifter = new ArrayList<>();
ArrayList<HashMap<String, String>> avdelningsProjektUppgifter = new ArrayList<>();


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

        StatusDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerade", "Avslutat" }));
        StatusDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusDropDownActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(TillbakaKnapp)
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
        
        String valtAlternativ = StatusDropDown.getSelectedItem().toString();
        
    }//GEN-LAST:event_StatusDropDownActionPerformed

    public void hamtaAvdelning(){
        try {
            String fraga = ("Select avdelning from anstalld where aid = " + aid);
            String avdelning = idb.fetchSingle(fraga);
            
        }
        catch (InfException ex){
            System.out.println(ex.getMessage());
        }
    
        
    }

    public void hamtaEgenData (){
        try{
        String fraga = ("SELECT projektnamn, projektchef,beskrivning, prioritet, startdatum, slutdatum FROM ngo_2024.projekt where pid = (select pid from ans_proj where aid = " + aid + ")");
        egnaProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void hamtaAvdelningsData(){
        try{
            String avdelningsFraga = ("Select avdelning from anstalld where aid = " + aid);
            String avdelning = idb.fetchSingle(avdelningsFraga);
            String fraga = ("select projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum from projekt join ans_proj on projekt.pid = ans_proj.pid join anstalld on ans_proj.aid = anstalld.aid where avdelning = " + avdelning + " group by projekt.pid");
            avdelningsProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void hamtaAllaData(){
        try{
            String fraga = ("SELECT projektnamn, projektchef, beskrivning, prioritet, startdatum, slutdatum FROM ngo_2024.projekt");
            allaProjektUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

