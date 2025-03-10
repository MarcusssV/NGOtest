/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Marcu
 */
public class KontoRuta extends javax.swing.JFrame {

    /**
     * Creates new form KontoRuta
     */
    public KontoRuta(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        hamtaKontoData();
        fylltabell();
    }
    ArrayList<HashMap<String, String>> kontoUppgifter = new ArrayList<>();
    private static InfDB idb;
    private String aid;
    
     public void hamtaKontoData(){
        try{
            String fraga = ("Select * from  anstalld where aid = " + aid);
            kontoUppgifter = idb.fetchRows(fraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
     public void fylltabell(){
          DefaultTableModel model1 = (DefaultTableModel) Kontotabell.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : kontoUppgifter){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("aid");
            data[1] = projekt.get("fornamn");
            data[2] = projekt.get("efternamn");
            data[3] = projekt.get("adress");
            data[4] = projekt.get("epost");
            data[5] = projekt.get("telefon");
            data[6] = projekt.get("anstallningsdatum");
            data[7] = projekt.get("losenord");
            data[8] = projekt.get("avdelning");
            model1.addRow(data);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Kontotabell = new javax.swing.JTable();
        TillbakaKnapp = new javax.swing.JButton();
        andraUppgifterKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Dina uppgifter");

        Kontotabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Aid", "Förnamn", "Efternamn", "Adress", "Epost", "Telefon", "Anställningsdatum", "Lösenord", "AvdelningsID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Kontotabell);
        if (Kontotabell.getColumnModel().getColumnCount() > 0) {
            Kontotabell.getColumnModel().getColumn(0).setResizable(false);
            Kontotabell.getColumnModel().getColumn(1).setResizable(false);
            Kontotabell.getColumnModel().getColumn(2).setResizable(false);
            Kontotabell.getColumnModel().getColumn(3).setResizable(false);
            Kontotabell.getColumnModel().getColumn(4).setResizable(false);
            Kontotabell.getColumnModel().getColumn(5).setResizable(false);
            Kontotabell.getColumnModel().getColumn(6).setResizable(false);
            Kontotabell.getColumnModel().getColumn(7).setResizable(false);
            Kontotabell.getColumnModel().getColumn(8).setResizable(false);
        }

        TillbakaKnapp.setText("Tillbaka");
        TillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaKnappActionPerformed(evt);
            }
        });

        andraUppgifterKnapp.setText("Ändra uppgifter");
        andraUppgifterKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraUppgifterKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TillbakaKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(andraUppgifterKnapp))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TillbakaKnapp)
                    .addComponent(andraUppgifterKnapp))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new InfoRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_TillbakaKnappActionPerformed

    private void andraUppgifterKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraUppgifterKnappActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AndraUppgifterRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_andraUppgifterKnappActionPerformed

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
            java.util.logging.Logger.getLogger(KontoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KontoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KontoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KontoRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new KontoRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Kontotabell;
    private javax.swing.JButton TillbakaKnapp;
    private javax.swing.JButton andraUppgifterKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
