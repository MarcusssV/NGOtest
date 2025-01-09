/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

// * @author Thomas

public class LaggTillLandRuta extends javax.swing.JFrame {
private static InfDB idb;
private static String aid;

    public LaggTillLandRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLidRuta = new javax.swing.JTextField();
        jNamnRuta = new javax.swing.JTextField();
        jSprakRuta = new javax.swing.JTextField();
        jValutaRuta = new javax.swing.JTextField();
        jTidzonRuta = new javax.swing.JTextField();
        jPSRuta = new javax.swing.JTextField();
        jEkonomiRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jKnapp = new javax.swing.JButton();
        jTillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLidRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLidRutaActionPerformed(evt);
            }
        });

        jNamnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamnRutaActionPerformed(evt);
            }
        });

        jLabel1.setText("LID");

        jLabel2.setText("Namn");

        jLabel3.setText("Språk");

        jLabel4.setText("Valuta");

        jLabel5.setText("Tidzon");

        jLabel6.setText("PolitiskStruktur");

        jLabel7.setText("Ekonomi");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNamnRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(jSprakRuta)
                    .addComponent(jValutaRuta)
                    .addComponent(jLidRuta)
                    .addComponent(jTidzonRuta)
                    .addComponent(jPSRuta)
                    .addComponent(jEkonomiRuta))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jKnapp)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTillbakaKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLidRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNamnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSprakRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValutaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidzonRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPSRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEkonomiRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addComponent(jKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jTillbakaKnapp)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jNamnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamnRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamnRutaActionPerformed

    private void jKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKnappActionPerformed

        if(ValideringsKlass.textFaltHarVarde(jLidRuta)){
            if(ValideringsKlass.idKontroll(jLidRuta)){
                String lid = jLidRuta.getText();
                if(ValideringsKlass.textFaltHarVarde(jNamnRuta)){
                    if(ValideringsKlass.namnKontroll(jNamnRuta)){
                        String landNamn = jNamnRuta.getText();
                        if(ValideringsKlass.textFaltHarVarde(jSprakRuta)){
                            if(ValideringsKlass.sprakKontroll(jSprakRuta)){
                                String sprak = jSprakRuta.getText();
                                if(ValideringsKlass.textFaltHarVarde(jValutaRuta)){
                                    if(ValideringsKlass.valutaKontroll(jValutaRuta)){
                                        String valuta = jValutaRuta.getText();
                                        if(ValideringsKlass.textFaltHarVarde(jTidzonRuta)){
                                            if(ValideringsKlass.tidzonKontroll(jTidzonRuta)){
                                                String tidzon = jTidzonRuta.getText();
                                                if(ValideringsKlass.textFaltHarVarde(jPSRuta)){
                                                    if(ValideringsKlass.politiskStrukturKontroll(jPSRuta)){
                                                        String PS = jPSRuta.getText();
                                                        if(ValideringsKlass.textFaltHarVarde(jEkonomiRuta)){
                                                            if(ValideringsKlass.ekonomiKontroll(jEkonomiRuta)){
                                                                String ekonomi = jEkonomiRuta.getText();
                                                                try{
                                                                String fraga = "INSERT INTO land (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) VALUES ('" 
                                                                              + lid +  "', '" + landNamn + "', '" + sprak + "', '" + valuta + "', '" + tidzon + "', '" + PS + "', '" + ekonomi + "')";
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
    }//GEN-LAST:event_jKnappActionPerformed

    private void jLidRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLidRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLidRutaActionPerformed

    private void jTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaKnappActionPerformed

        setVisible(false);
        new visaOchAndraLander(idb, aid).setVisible(true);
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
            java.util.logging.Logger.getLogger(LaggTillLandRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillLandRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillLandRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillLandRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JTextField jEkonomiRuta;
    private javax.swing.JButton jKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLidRuta;
    private javax.swing.JTextField jNamnRuta;
    private javax.swing.JTextField jPSRuta;
    private javax.swing.JTextField jSprakRuta;
    private javax.swing.JTextField jTidzonRuta;
    private javax.swing.JButton jTillbakaKnapp;
    private javax.swing.JTextField jValutaRuta;
    // End of variables declaration//GEN-END:variables
}
