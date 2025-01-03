/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import java.awt.Image;
import javax.swing.ImageIcon;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author eriks
 */
public class Inloggningssida extends javax.swing.JFrame {
    private static InfDB idb;
    private String aid;
    /**
     * Creates new form Inloggningssida
     */
    public Inloggningssida(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
        initComponents();
        Image i = new ImageIcon(ClassLoader.getSystemResource("Image/UNLOGO.png")).getImage();
        setIconImage(i); //Den här koden ändrar Iconen i de övrevänstrahörnet.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LösenordText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        LoggaInKnapp = new javax.swing.JButton();
        ExitKnapp = new javax.swing.JButton();
        skipInloggKnapp = new javax.swing.JButton();
        ickeAdminKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGGA IN");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LösenordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LösenordTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Lösenord");

        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        LoggaInKnapp.setText("Logga in");
        LoggaInKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaInKnappActionPerformed(evt);
            }
        });

        ExitKnapp.setText("Exit");
        ExitKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitKnappActionPerformed(evt);
            }
        });

        skipInloggKnapp.setText("maria.g");
        skipInloggKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipInloggKnappActionPerformed(evt);
            }
        });

        ickeAdminKnapp.setText("ahmed.k");
        ickeAdminKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ickeAdminKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ExitKnapp)
                                        .addGap(153, 153, 153)
                                        .addComponent(LoggaInKnapp))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LösenordText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(EmailText, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(31, 31, 31)
                        .addComponent(ickeAdminKnapp))
                    .addComponent(skipInloggKnapp))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LösenordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoggaInKnapp)
                            .addComponent(ExitKnapp))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ickeAdminKnapp)
                        .addGap(8, 8, 8)))
                .addComponent(skipInloggKnapp)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LösenordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LösenordTextActionPerformed
        // TODO add your handling code here:
        String lösenordInput = LösenordText.getText();
    }//GEN-LAST:event_LösenordTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
        String emailInput = EmailText.getText();
    }//GEN-LAST:event_EmailTextActionPerformed

    private void ExitKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitKnappActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitKnappActionPerformed

    private void LoggaInKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaInKnappActionPerformed
        
        String email = EmailText.getText();
        String losenord = LösenordText.getText();
        
        if(ValideringsKlass.textFaltHarVarde(EmailText)){
            if(ValideringsKlass.losenordFaltHarVarde(LösenordText)){
                if(ValideringsKlass.emailKontroll(EmailText)){
                
                    try {
                    String fraga = ("select aid from anstalld where epost = " + "'" + email + "'" + " and losenord = " + "'" + losenord + "'");
                    String aid = idb.fetchSingle(fraga);
                        if (aid != null){
                            new InfoRuta(idb, aid).setVisible(true);
                            setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Användaren saknas!");
                        }
                    }
                    catch (InfException a){
                        JOptionPane.showMessageDialog(null, "Något blev fel med databasen!");
                        System.out.println(a.getMessage());
    }//GEN-LAST:event_LoggaInKnappActionPerformed
                }
                }
        
        }
    }
    private void skipInloggKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipInloggKnappActionPerformed

        EmailText.setText("maria.g@example.com");
        LösenordText.setText("password123");
        
       
    }//GEN-LAST:event_skipInloggKnappActionPerformed

    private void ickeAdminKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ickeAdminKnappActionPerformed
        // TODO add your handling code here:
        EmailText.setText("ahmed.khan@example.com");
        LösenordText.setText("password789");
    }//GEN-LAST:event_ickeAdminKnappActionPerformed
    
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
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggningssida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new Inloggningssida().setVisible(true);
            }
        });
        
        
        
        
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton ExitKnapp;
    private javax.swing.JButton LoggaInKnapp;
    private javax.swing.JPasswordField LösenordText;
    private javax.swing.JButton ickeAdminKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton skipInloggKnapp;
    // End of variables declaration//GEN-END:variables
}
