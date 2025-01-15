/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eriks
 */
public class visaOchAndraPartner extends javax.swing.JFrame {
    private static InfDB idb;
    private static String aid;
    private ArrayList<HashMap<String, String>> partnerUppgifter = new ArrayList<>();

    /**
     * Creates new form visaOchAndraPartner
     */
    public visaOchAndraPartner(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        hamtaPartners();
        fyllTabell();
        synlighetAdmin();
}

    public void hamtaPartners() {
        try {
            String fraga = "SELECT * from partner";
            partnerUppgifter = idb.fetchRows(fraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void fyllTabell() {
        DefaultTableModel model = (DefaultTableModel) partnerTabell.getModel();
        model.setRowCount(0);

        for (HashMap<String, String> partner : partnerUppgifter) {
            String[] rad = {
                partner.get("pid"),
                partner.get("namn"),
                partner.get("kontaktperson"),
                partner.get("kontaktepost"),
                partner.get("telefon"),
                partner.get("adress"),
                partner.get("branch"),
                partner.get("stad")
            };
            model.addRow(rad);
        }
    }
    
    public void Behorighet(){
    try{
    String fraga = "Select behorighetsniva FROM admin where aid = " + aid;
    String behorighetsniva = idb.fetchSingle(fraga);
    
    if(behorighetsniva == null){
        JOptionPane.showMessageDialog(this, "Du har inte behörighet att redigera partners.");
    }
    else {
         JOptionPane.showMessageDialog(this, "Du har behörighet att redigera partners.");
    }
   }
    catch (InfException ex){
            System.out.println(ex.getMessage());
    }
}
    
    public void läggTillPartner() {
    Behorighet();

    try {
        String pid = JOptionPane.showInputDialog(this, "Ange partnerns id:");
        String namn = JOptionPane.showInputDialog(this, "Ange partnerns namn:");
        String kontaktperson = JOptionPane.showInputDialog(this, "Ange partnerns kontaktperson:");
        String kontaktepost = JOptionPane.showInputDialog(this, "Ange partnerns kontaktepost:");
        String telefon = JOptionPane.showInputDialog(this, "Ange partnerns telefonnummer:");
        String adress = JOptionPane.showInputDialog(this, "Ange partnerns adress:");
        String branch = JOptionPane.showInputDialog(this, "Ange partnerns branch:");
        String stad = JOptionPane.showInputDialog(this, "Ange partnerns stad:");

        if (ValideringsKlass.valideraPartner(pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad)) {
            String sql = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) VALUES ('"
                + pid + "', '" + namn + "', '" + kontaktperson + "', '" + kontaktepost + "', '"
                + telefon + "', '" + adress + "', '" + branch + "', '" + stad + "')";
            idb.insert(sql);
            JOptionPane.showMessageDialog(this, "Partnern har lagts till i databasen!");
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
    }
}
   public void taBortPartner() {
    Behorighet();

    try {
        String pid = JOptionPane.showInputDialog(this, "Ange partnerns id som du vill ta bort:");
        if (ValideringsKlass.valideraTaBortPartner(pid)) {
            String sql = "DELETE FROM partner WHERE pid = '" + pid + "'";
            idb.delete(sql);
            JOptionPane.showMessageDialog(this, "Partnern har tagits bort!");
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
    }
}

   public void redigerPartner (){
       Behorighet();
       try {
       String pid = JOptionPane.showInputDialog(this, "Ange PID för den partner som du vill redigera");
       if(!ValideringsKlass.finnsPID(idb, pid)){
           JOptionPane.showMessageDialog(this, "PID: " + pid + " finns inte i databasen");
           return;
       }
       
       int val = JOptionPane.showOptionDialog(
            this,
            "Vilken information vill du redigera?",
            "Redigera Partner",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new String[]{"Namn", "Kontaktperson", "Kontaktepost", "Telefon", "Adress", "Branch", "Stad"},
            "Namn"
        );
       
       String[] kolumner = {"namn", "kontaktperson", "kontaktpost", "telefon", "adress", "branch", "stad"};
        String nyttVarde = JOptionPane.showInputDialog(this, "Ange nytt värde för " + kolumner[val] + ":");
            if(nyttVarde.isEmpty()){
                JOptionPane.showMessageDialog(this, "Inget värde angavs. GÖr om.");
                return;
            }
            
            // Stad är foreign key måste ändra i stad tabellen  
            if (kolumner.equals("stad")) { 
            String stadSQL = "update stad set sid  = '" + nyttVarde + "'";
            idb.update(stadSQL);
            String sql = "update partner set " + kolumner[val] + " = '" + nyttVarde + "' where pid = '" + pid + "'";
            idb.update(sql);
        }
        
            String sql = "update partner set " + kolumner[val] + " = '" + nyttVarde + "' where pid = '" + pid + "'";
            idb.update(sql);
            JOptionPane.showMessageDialog(this, "Uppdateringen lyckades");
   }catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        partnerTabell = new javax.swing.JTable();
        redigeraPartner = new javax.swing.JButton();
        laggTillPartner = new javax.swing.JButton();
        taBortPartner = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        partnerTabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PID", "Namn", "Kontaktperson", "Kontaktepost", "Telefonnummer", "Adress", "Branch", "Stad"
            }
        ));
        jScrollPane1.setViewportView(partnerTabell);

        redigeraPartner.setText("Redigera partner");
        redigeraPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraPartnerActionPerformed(evt);
            }
        });

        laggTillPartner.setText("Lägg till partner");
        laggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillPartnerActionPerformed(evt);
            }
        });

        taBortPartner.setText("Ta bort partner");
        taBortPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortPartnerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Våra Partner");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTillbakaKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167)
                        .addComponent(redigeraPartner)
                        .addGap(58, 58, 58)
                        .addComponent(laggTillPartner)
                        .addGap(57, 57, 57)
                        .addComponent(taBortPartner)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redigeraPartner)
                    .addComponent(laggTillPartner)
                    .addComponent(taBortPartner)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTillbakaKnapp)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redigeraPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraPartnerActionPerformed
      // TODO add your handling code here:
      redigerPartner();
    }//GEN-LAST:event_redigeraPartnerActionPerformed

    private void laggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillPartnerActionPerformed
        // TODO add your handling code here:
        läggTillPartner();
    }//GEN-LAST:event_laggTillPartnerActionPerformed

    private void taBortPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortPartnerActionPerformed
        // TODO add your handling code here:
        taBortPartner();
    }//GEN-LAST:event_taBortPartnerActionPerformed

    private void jTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaKnappActionPerformed

        setVisible(false);
        new InfoRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_jTillbakaKnappActionPerformed

    private void synlighetAdmin(){
        taBortPartner.setVisible(false);
        laggTillPartner.setVisible(false);
        redigeraPartner.setVisible(false);
        if(ValideringsKlass.behorighet(idb, aid)){
            taBortPartner.setVisible(true);
            laggTillPartner.setVisible(true);
            redigeraPartner.setVisible(true);
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
            java.util.logging.Logger.getLogger(visaOchAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new visaOchAndraPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jTillbakaKnapp;
    private javax.swing.JButton laggTillPartner;
    private javax.swing.JTable partnerTabell;
    private javax.swing.JButton redigeraPartner;
    private javax.swing.JButton taBortPartner;
    // End of variables declaration//GEN-END:variables
}
