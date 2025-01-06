/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngotest;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eriks
 */
public class visaOchAndraLander extends javax.swing.JFrame {
    private static InfDB idb;
    private static String aid;
    private ArrayList<HashMap<String, String>> landUppgifter = new ArrayList<>();
    
    /**
     * Creates new form visaOchAndraLander
     */
    public visaOchAndraLander(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        hamtaLander();
        fyllTabell();
        
    }

    
private void hamtaLander(){
    try{
        String query = "SELECT * FROM land";
        landUppgifter = idb.fetchRows(query);
} catch (InfException ex){
            System.out.println(ex.getMessage());
    }
}

public void fyllTabell() {
    DefaultTableModel model = (DefaultTableModel) landTabell.getModel();
        model.setRowCount(0);
        for (HashMap<String, String> land : landUppgifter){
            String[] rad = {
                land.get("lid"),
                land.get("namn"),
                land.get("sprak"),
                land.get("valuta"),
                land.get("tidszon"),
                land.get("politisk_struktur"),
                land.get("ekonomi")
            };
            model.addRow(rad);
    }
}

public void Behorighet(){
    try{
    String fraga = "Select behorighetsniva FROM admin where aid = " + aid;
    String behorighetsniva = idb.fetchSingle(fraga);
    
    if(behorighetsniva == null){
        JOptionPane.showMessageDialog(this, "Du har inte behörighet att redigera länder.");
    }
    else {
         JOptionPane.showMessageDialog(this, "Du har behörighet att redigera länder.");
    }
   }
    catch (InfException ex){
            System.out.println(ex.getMessage());
    }
}

public void läggTillLand() {
    Behorighet();

    try {
        String lid = JOptionPane.showInputDialog(this,"Ange landets id:");
        String landNamn = JOptionPane.showInputDialog(this, "Ange landets namn:");
        String språk = JOptionPane.showInputDialog(this, "Ange landets språk:");
        String valuta = JOptionPane.showInputDialog(this, "Ange landets valuta:");
        String tidszon = JOptionPane.showInputDialog(this, "Ange landets tidszon:");
        String politiskStruktur = JOptionPane.showInputDialog(this, "Ange landets politiska struktur:");
        String ekonomi = JOptionPane.showInputDialog(this, "Ange landets ekonomi:");

        
        if(ValideringsKlass.valideraLand(lid, aid, språk, valuta, tidszon, politiskStruktur, ekonomi)){
        String sql = "INSERT INTO land (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) VALUES ('" 
                      + lid +  "', '" + landNamn + "', '" + språk + "', '" + valuta + "', '" 
                      + tidszon + "', '" + politiskStruktur + "', '" + ekonomi + "')";
        
        idb.insert(sql);
        JOptionPane.showMessageDialog(this, "Landet har lagts till i databasen!");
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
    }
}

public void taBortLand(){
    Behorighet();
    
    try{
        String lid =JOptionPane.showInputDialog(this,"Ange landets id som du vill ta bort:");
        
        if(ValideringsKlass.valideraTaBortLand(lid)){
            String sql = "DELETE FROM land WHERE lid = '" + lid + "'";
            idb.delete(sql);
            JOptionPane.showMessageDialog(this, "Landet har tagits bort");
        }
    }catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
}
}

public void redigeraLand(){
    
    
    
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
        landTabell = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TillbakaKnapp = new javax.swing.JButton();
        redigeraLand = new javax.swing.JButton();
        LaggaTillLand = new javax.swing.JButton();
        taBortLandKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        landTabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "lid", "Namn", "Språk", "Valuta", "Tidzon", "Politisk struktur", "Ekonomi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(landTabell);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Våra länder");

        TillbakaKnapp.setText("Tillbaka");
        TillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaKnappActionPerformed(evt);
            }
        });

        redigeraLand.setText("Redigera Land");
        redigeraLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraLandActionPerformed(evt);
            }
        });

        LaggaTillLand.setText("Lägg till land");
        LaggaTillLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaggaTillLandActionPerformed(evt);
            }
        });

        taBortLandKnapp.setText("Ta bort Land");
        taBortLandKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortLandKnappActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TillbakaKnapp)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LaggaTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(redigeraLand, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taBortLandKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(LaggaTillLand))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(redigeraLand)
                        .addComponent(taBortLandKnapp)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TillbakaKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaKnappActionPerformed
        setVisible(false);
        new InfoRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_TillbakaKnappActionPerformed

    private void redigeraLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraLandActionPerformed
        // TODO add your handling code here:
        
        
       
    }//GEN-LAST:event_redigeraLandActionPerformed

    private void LaggaTillLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaggaTillLandActionPerformed
läggTillLand();
        // TODO add your handling code here:
    }//GEN-LAST:event_LaggaTillLandActionPerformed

    private void taBortLandKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortLandKnappActionPerformed
taBortLand();
        // TODO add your handling code here:
    }//GEN-LAST:event_taBortLandKnappActionPerformed

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
            java.util.logging.Logger.getLogger(visaOchAndraLander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraLander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraLander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visaOchAndraLander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new visaOchAndraLander().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LaggaTillLand;
    private javax.swing.JButton TillbakaKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable landTabell;
    private javax.swing.JButton redigeraLand;
    private javax.swing.JButton taBortLandKnapp;
    // End of variables declaration//GEN-END:variables
}
