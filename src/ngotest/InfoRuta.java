/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcu
 */
public class InfoRuta extends javax.swing.JFrame {

    /**
     * Creates new form InfoRuta
     */
    public InfoRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
       
    }
private static InfDB idb;
private String aid;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hallbarhetsKnapp = new javax.swing.JButton();
        VisaPersonal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SeMittKontoKnapp = new javax.swing.JButton();
        SeMinaProjektKnapp = new javax.swing.JButton();
        SeAllaProjektKnapp = new javax.swing.JButton();
        SökHandläggareKnapp = new javax.swing.JButton();
        SökProjektKnapp = new javax.swing.JButton();
        LoggaUtKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hallbarhetsKnapp.setText("Hållbarhetsmål");
        hallbarhetsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallbarhetsKnappActionPerformed(evt);
            }
        });

        VisaPersonal.setText("Personal på min avdelning");
        VisaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaPersonalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Välkommen");

        SeMittKontoKnapp.setText("Konto");
        SeMittKontoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeMittKontoKnappActionPerformed(evt);
            }
        });

        SeMinaProjektKnapp.setText("Mina projekt");
        SeMinaProjektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeMinaProjektKnappActionPerformed(evt);
            }
        });

        SeAllaProjektKnapp.setText("Alla projekt");

        SökHandläggareKnapp.setText("Sök handläggare");

        SökProjektKnapp.setText("Sök projekt");

        LoggaUtKnapp.setText("Logga ut");
        LoggaUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaUtKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SeAllaProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SökProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(SeMittKontoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VisaPersonal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SeMinaProjektKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SökHandläggareKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoggaUtKnapp)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hallbarhetsKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeMittKontoKnapp)
                    .addComponent(SökProjektKnapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VisaPersonal)
                    .addComponent(SeMinaProjektKnapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeAllaProjektKnapp)
                    .addComponent(SökHandläggareKnapp))
                .addGap(33, 33, 33)
                .addComponent(hallbarhetsKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(LoggaUtKnapp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void hallbarhetsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallbarhetsKnappActionPerformed
 
        setVisible(false);
        new VisaAllaHallbarhetsmål(idb, aid).setVisible(true);
    }//GEN-LAST:event_hallbarhetsKnappActionPerformed

    private void VisaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaPersonalActionPerformed
               new SeAllaPersonalAvdelning(idb, aid).setVisible(true);

       // TODO add your handling code here:
    }//GEN-LAST:event_VisaPersonalActionPerformed

    private void SeMittKontoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeMittKontoKnappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeMittKontoKnappActionPerformed

    private void SeMinaProjektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeMinaProjektKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new MinaProjekt(idb, aid).setVisible(true);
        
    }//GEN-LAST:event_SeMinaProjektKnappActionPerformed

    private void LoggaUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaUtKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Inloggningssida(idb, aid).setVisible(true);
    }//GEN-LAST:event_LoggaUtKnappActionPerformed

    
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
            java.util.logging.Logger.getLogger(InfoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InfoRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoggaUtKnapp;
    private javax.swing.JButton SeAllaProjektKnapp;
    private javax.swing.JButton SeMinaProjektKnapp;
    private javax.swing.JButton SeMittKontoKnapp;
    private javax.swing.JButton SökHandläggareKnapp;
    private javax.swing.JButton SökProjektKnapp;
    private javax.swing.JButton VisaPersonal;
    private javax.swing.JButton hallbarhetsKnapp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
