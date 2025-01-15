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
        valkommenTextNamn();
        synligProjektchef();
       
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
        valkommenText = new javax.swing.JLabel();
        SeMittKontoKnapp = new javax.swing.JButton();
        SeProjektKnapp = new javax.swing.JButton();
        LoggaUtKnapp = new javax.swing.JButton();
        varaLander = new javax.swing.JButton();
        varaPartnersKnapp = new javax.swing.JButton();
        jProjektChefKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hallbarhetsKnapp.setText("Hållbarhetsmål");
        hallbarhetsKnapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        valkommenText.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        valkommenText.setText("Välkommen");

        SeMittKontoKnapp.setText("Konto");
        SeMittKontoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeMittKontoKnappActionPerformed(evt);
            }
        });

        SeProjektKnapp.setText("Projekt");
        SeProjektKnapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SeProjektKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeProjektKnappActionPerformed(evt);
            }
        });

        LoggaUtKnapp.setText("Logga ut");
        LoggaUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaUtKnappActionPerformed(evt);
            }
        });

        varaLander.setText("Våra Länder");
        varaLander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varaLanderActionPerformed(evt);
            }
        });

        varaPartnersKnapp.setText("Våra Partners");
        varaPartnersKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varaPartnersKnappActionPerformed(evt);
            }
        });

        jProjektChefKnapp.setText("Projektchef Meny");
        jProjektChefKnapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jProjektChefKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProjektChefKnappActionPerformed(evt);
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
                        .addComponent(LoggaUtKnapp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valkommenText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(varaLander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VisaPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(varaPartnersKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeProjektKnapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hallbarhetsKnapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SeMittKontoKnapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProjektChefKnapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(valkommenText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SeMittKontoKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SeProjektKnapp)
                            .addComponent(varaLander)))
                    .addComponent(VisaPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hallbarhetsKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProjektChefKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(LoggaUtKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(varaPartnersKnapp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void hallbarhetsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallbarhetsKnappActionPerformed
 
        setVisible(false);
        new VisaAllaHallbarhetsmål(idb, aid).setVisible(true);
    }//GEN-LAST:event_hallbarhetsKnappActionPerformed

    private void VisaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaPersonalActionPerformed
        
        setVisible(false);
        new SeAllaPersonalAvdelning(idb, aid).setVisible(true);

       // TODO add your handling code here:
    }//GEN-LAST:event_VisaPersonalActionPerformed

    private void SeMittKontoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeMittKontoKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new KontoRuta(idb, aid).setVisible(true);
        
    }//GEN-LAST:event_SeMittKontoKnappActionPerformed

    private void SeProjektKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeProjektKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ProjektRuta(idb, aid).setVisible(true);
        
    }//GEN-LAST:event_SeProjektKnappActionPerformed

    private void LoggaUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaUtKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Inloggningssida(idb, aid).setVisible(true);
    }//GEN-LAST:event_LoggaUtKnappActionPerformed

    private void varaLanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varaLanderActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new visaOchAndraLander (idb, aid).setVisible(true);
    }//GEN-LAST:event_varaLanderActionPerformed

    private void varaPartnersKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varaPartnersKnappActionPerformed
        setVisible(false);
        new visaOchAndraPartner (idb, aid).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_varaPartnersKnappActionPerformed

    private void jProjektChefKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProjektChefKnappActionPerformed
        setVisible(false);
        new ProjektchefMeny(idb, aid).setVisible(true);
    }//GEN-LAST:event_jProjektChefKnappActionPerformed

    private void valkommenTextNamn(){
        try {
        String forFraga = ("Select fornamn from anstalld where aid = " + aid);
        String efterFraga = ("Select efternamn from anstalld where aid = " + aid);
        String fornamn = idb.fetchSingle(forFraga);
        String efternamn = idb.fetchSingle(efterFraga);
        valkommenText.setText("Välkommen " + fornamn + " " + efternamn);
        }
        catch (InfException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    private void synligProjektchef(){
        jProjektChefKnapp.setVisible(false);
        if(ValideringsKlass.behorighetProjektChef(idb, aid)){
            jProjektChefKnapp.setVisible(true);
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
    private javax.swing.JButton SeMittKontoKnapp;
    private javax.swing.JButton SeProjektKnapp;
    private javax.swing.JButton VisaPersonal;
    private javax.swing.JButton hallbarhetsKnapp;
    private javax.swing.JButton jProjektChefKnapp;
    private javax.swing.JLabel valkommenText;
    private javax.swing.JButton varaLander;
    private javax.swing.JButton varaPartnersKnapp;
    // End of variables declaration//GEN-END:variables
}
