/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import javax.swing.JOptionPane;
import ngotest.ValideringsKlass;
import oru.inf.InfDB;
import oru.inf.InfException;

// * @author Thomas

public class LaggTillProjektRuta extends javax.swing.JFrame {
private static InfDB idb;
private static String aid;

    public LaggTillProjektRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPIDFalt = new javax.swing.JTextField();
        jProjektnamnFalt = new javax.swing.JTextField();
        jBeskrivningFalt = new javax.swing.JTextField();
        jStartdatumFalt = new javax.swing.JTextField();
        jSlutdatumFalt = new javax.swing.JTextField();
        jKostnadFalt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jKnapp = new javax.swing.JButton();
        jTillbakaKnapp = new javax.swing.JButton();
        jStatusBox = new javax.swing.JComboBox<>();
        jPrioritetBox = new javax.swing.JComboBox<>();
        jProjektchefFalt = new javax.swing.JTextField();
        jLandFalt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPIDFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPIDFaltActionPerformed(evt);
            }
        });

        jProjektnamnFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProjektnamnFaltActionPerformed(evt);
            }
        });

        jLabel1.setText("PID");

        jLabel2.setText("Projektnamn");

        jLabel3.setText("Beskrivning");

        jLabel4.setText("Startdatum");

        jLabel5.setText("Slutdatum");

        jLabel6.setText("Kostnad");

        jLabel7.setText("Status");

        jKnapp.setText("Kör");
        jKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKnappActionPerformed(evt);
            }
        });

        jTillbakaKnapp.setText("Tillbaka");
        jTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTillbakaKnappActionPerformed(evt);
            }
        });

        jStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Avslutad", "Planerat" }));

        jPrioritetBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));

        jLabel8.setText("Prioritet");

        jLabel9.setText("Projektchef");

        jLabel10.setText("Land");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTillbakaKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jKnapp)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLandFalt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProjektchefFalt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProjektnamnFalt, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(jBeskrivningFalt)
                    .addComponent(jStartdatumFalt)
                    .addComponent(jPIDFalt)
                    .addComponent(jSlutdatumFalt)
                    .addComponent(jKostnadFalt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPrioritetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPIDFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProjektnamnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeskrivningFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStartdatumFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlutdatumFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKostnadFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrioritetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProjektchefFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLandFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTillbakaKnapp)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jKnapp)
                        .addGap(22, 22, 22))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jProjektnamnFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProjektnamnFaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProjektnamnFaltActionPerformed

    private void jKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKnappActionPerformed

        if(ValideringsKlass.textFaltHarVarde(jPIDFalt)){
            if(ValideringsKlass.idKontroll(jPIDFalt)){
                String pid = jPIDFalt.getText();
                if(ValideringsKlass.textFaltHarVarde(jProjektnamnFalt)){
                    if(ValideringsKlass.ProjektNamnKontroll(jProjektnamnFalt)){
                        String projektNamn = jProjektnamnFalt.getText();
                        if(ValideringsKlass.textFaltHarVarde(jBeskrivningFalt)){
                                String beskrivning = jBeskrivningFalt.getText();
                                if(ValideringsKlass.textFaltHarVarde(jStartdatumFalt)){
                                    if(ValideringsKlass.datumKontroll(jStartdatumFalt)){
                                        String startdatum = jStartdatumFalt.getText();
                                        if(ValideringsKlass.textFaltHarVarde(jSlutdatumFalt)){
                                            if(ValideringsKlass.datumKontroll(jSlutdatumFalt)){
                                                String slutdatum = jSlutdatumFalt.getText();
                                                if(ValideringsKlass.textFaltHarVarde(jKostnadFalt)){
                                                    if(ValideringsKlass.kostnadKontroll(jKostnadFalt)){
                                                        String kostnad = jKostnadFalt.getText();
                                                        if(ValideringsKlass.textFaltHarVarde(jProjektchefFalt)){
                                                            if(ValideringsKlass.idKontroll(jProjektchefFalt)){
                                                                String projektchef = jProjektchefFalt.getText();
                                                                if(ValideringsKlass.textFaltHarVarde(jLandFalt)){
                                                                    if(ValideringsKlass.idKontroll(jLandFalt)){
                                                                        String land = jLandFalt.getText();
                                                                        String status = jStatusBox.getSelectedItem().toString();
                                                                        String prioritet = jPrioritetBox.getSelectedItem().toString();
                                                                        try{
                                                                            String fraga = "INSERT INTO projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land)"
                                                                                    + " VALUES (" + pid + ", '" + projektNamn +"', '" + beskrivning + "', '" + startdatum + "', '"+slutdatum+"', "+kostnad+", '"+status+"', '"+prioritet+"', "+projektchef+", "+land+");";
                                                                            idb.insert(fraga);
                                                                            JOptionPane.showMessageDialog(null, "Nytt Land tillagd!");
                                                                            }
                                                                            catch (InfException ex){
                                                                            System.out.println(ex.getMessage());
                                                                            }
                                                                    }
                                                                }                                                                   
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            
                        }
                    }
                }
            }
        }       
    }//GEN-LAST:event_jKnappActionPerformed

    private void jPIDFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPIDFaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPIDFaltActionPerformed

    private void jTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaKnappActionPerformed

        setVisible(false);
        new ProjektRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_jTillbakaKnappActionPerformed

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
            java.util.logging.Logger.getLogger(LaggTillProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillProjektRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillLandRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBeskrivningFalt;
    private javax.swing.JButton jKnapp;
    private javax.swing.JTextField jKostnadFalt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLandFalt;
    private javax.swing.JTextField jPIDFalt;
    private javax.swing.JComboBox<String> jPrioritetBox;
    private javax.swing.JTextField jProjektchefFalt;
    private javax.swing.JTextField jProjektnamnFalt;
    private javax.swing.JTextField jSlutdatumFalt;
    private javax.swing.JTextField jStartdatumFalt;
    private javax.swing.JComboBox<String> jStatusBox;
    private javax.swing.JButton jTillbakaKnapp;
    // End of variables declaration//GEN-END:variables
}
