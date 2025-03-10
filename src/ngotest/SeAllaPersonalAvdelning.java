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
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eriks
 */
public class SeAllaPersonalAvdelning extends javax.swing.JFrame {
        private static InfDB idb;
        private String aid;
        ArrayList<HashMap<String, String>> personalLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> handlaggareInfo = new ArrayList<>();
        String avdelning;

    public SeAllaPersonalAvdelning(InfDB idb, String aid) {
       initComponents();
        this.idb = idb;
        this.aid = aid;
       hamtaAvdelningsData();
       hamtaPersonalData();
       fyllPersonalTabel();
       synlighetAdmin();
    }
        public void hamtaAvdelningsData(){
        try{
            String avdelningsFraga = ("Select avdelning from anstalld where aid = '" + aid + "'");
            avdelning = idb.fetchSingle(avdelningsFraga);
        }
        catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

        public void hamtaPersonalData(){
            try{
                String fraga = ("select aid, fornamn, efternamn, adress, epost, telefon from anstalld where avdelning = '" + avdelning + "'");
                personalLista = idb.fetchRows(fraga);
            }
            catch (InfException ex) {
                System.out.println(ex.getMessage());
            }
    }
              public void fyllPersonalTabel(){
        jInfoTillbakaKnapp.setVisible(false);
        DefaultTableModel model1 = (DefaultTableModel) jPersonalTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : personalLista){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("aid");
            data[1] = projekt.get("fornamn");
            data[2] = projekt.get("efternamn");
            data[3] = projekt.get("adress");
            data[4] = projekt.get("epost");
            data[5] = projekt.get("telefon");
            model1.addRow(data);
        }
        
    }
    public void hamtaHandlaggareDataNamn(){
        
                String namn = jInmatningsRuta.getText();
                try{
                    String fraga = ("select anstalld.aid, fornamn, efternamn, anstalld.adress, anstalld.epost, anstalld.telefon from anstalld join avdelning on avdelning.avdid = anstalld.avdelning where anstalld.avdelning = '"+avdelning+"' and fornamn = '"+namn+"'");
                    handlaggareInfo = idb.fetchRows(fraga);
                }
                catch (InfException ex) {
                System.out.println(ex.getMessage());
            }                
    }
    public void hamtaHandlaggareDataEpost(){
                
                String epost = jInmatningsRuta.getText();
                try{
                    String fraga = ("select anstalld.aid, fornamn, efternamn, anstalld.adress, anstalld.epost, anstalld.telefon from anstalld join avdelning on avdelning.avdid = anstalld.avdelning where anstalld.avdelning = '"+avdelning+"' and anstalld.epost = '"+epost+"'");
                    handlaggareInfo = idb.fetchRows(fraga);
                }
                catch (InfException ex) {
                System.out.println(ex.getMessage());
            }                
    }
    public void fyllTabelHandlaggare(){
        
        DefaultTableModel model1 = (DefaultTableModel) jPersonalTabel.getModel();
        model1.setRowCount(0);
        for(HashMap<String, String> projekt : handlaggareInfo){
            String[] data = new String [model1.getColumnCount()];
            data[0] = projekt.get("aid");
            data[1] = projekt.get("fornamn");
            data[2] = projekt.get("efternamn");
            data[3] = projekt.get("adress");
            data[4] = projekt.get("epost");
            data[5] = projekt.get("telefon");
            model1.addRow(data);
        
    }
    }
    
    public void tabortAnstalld(){
    
    if(ValideringsKlass.behorighet(idb, aid)){
    try{
        String aid = JOptionPane.showInputDialog(this,"Ange den anställdes id som du vill ta bort:");
        
        if(ValideringsKlass.valideraTaBortAnstalld(aid)){
            // Om den anställde är mentor måste den bli null annars kommer dess aid ligga kvar och du kan inte ta bort för då referasas fortfarande deras aid någonsatans
            String sqlUppdateraMentor = "UPDATe handlaggare SET mentor = NULL WHERE mentor = '" + aid + "'";
            idb.update(sqlUppdateraMentor);
            
            //Den anställde du försöker radera finns antagligen som en foregin key i admin tabellen o flera andra om du försöker ta bort den innnan du raderar där den refereras får du error du måste ta bort den där den refereras först
            String sqlTaBortAdmin = "DELETE FROM admin WHERE aid = '" + aid + "'";
            idb.delete(sqlTaBortAdmin);
            
            String sqlTaBortAnsProj = "Delete from ans_proj WHERE aid = '" + aid + "'";
            idb.delete(sqlTaBortAnsProj);
            
            String sqlTaBortHandlaggare = "Delete from handlaggare WHERE aid = '" + aid + "'";
            idb.delete(sqlTaBortHandlaggare);
            
            String sql = "DELETE FROM anstalld WHERE aid = '" + aid + "'";
            idb.delete(sql);
            
            hamtaPersonalData();
            fyllPersonalTabel();
            JOptionPane.showMessageDialog(this, "Den anställde har tagits bort");
        }
    }catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + ex.getMessage());
}
}
}
    
public void laggTillAnstalld(){
    try {
        String aid = JOptionPane.showInputDialog(this, "Ange ett unikt AID");
        if(!ValideringsKlass.valideraUniktAid(idb, aid)){
            return; 
        }
        
        String fornamn = JOptionPane.showInputDialog(this, "Ange förnamn:");
        String efternamn = JOptionPane.showInputDialog(this, "Ange efternamn:");
        String adress = JOptionPane.showInputDialog(this, "Ange adress:");
        String epost = JOptionPane.showInputDialog(this, "Ange epost:");
        String telefon = JOptionPane.showInputDialog(this, "Ange telefon:");
        String anstalldatum = JOptionPane.showInputDialog(this, "Ange anställningsdatum (YYYY-MM-DD):");
        String avdelning = JOptionPane.showInputDialog(this, "Ange avdelning:");
        
            int val = JOptionPane.showOptionDialog(this, "Vill du ange ett eget lösenord eller generera ett?",
    "Lösenord",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    new String[]{"Ange själv", "Generera"},
    "Ange själv"
);
            String losenord;
            if(val == 0){
                losenord = JOptionPane.showInputDialog(this, "Ange lösenord:");
    } else{
                losenord = randomLosenord.genereraLosenord();
                JOptionPane.showMessageDialog(this, "Här är ditt lösenord: " + losenord + "Skriv upp det någonstans säkert");
            }
                    
            
            
        
        
                    
        
        String sqlNyAnstalld = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, avdelning, losenord) " +
                "VALUES ('" + aid + "', '" + fornamn + "', '" + efternamn + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + anstalldatum + "', '" + avdelning + "', '" + losenord + "')";
        idb.insert(sqlNyAnstalld);
        
        JOptionPane.showMessageDialog(this, fornamn + "' '" + efternamn + "Har lagts till!");
        hamtaPersonalData();
        fyllPersonalTabel();
    }catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Ett fel inträffade: " + e.getMessage());
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

        personalRubrik = new javax.swing.JTextField();
        jTillbakaKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPersonalTabel = new javax.swing.JTable();
        jInmatningsRuta = new javax.swing.JTextField();
        jSokKnapp = new javax.swing.JButton();
        jAlternativRuta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jInfoTillbakaKnapp = new javax.swing.JButton();
        laggTillPersonal = new javax.swing.JButton();
        taBortPersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personalRubrik.setText("Här är all personal på avdelningen");
        personalRubrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalRubrikActionPerformed(evt);
            }
        });

        jTillbakaKnapp.setText("Tillbaka");
        jTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTillbakaKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Personal");

        jPersonalTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Aid", "Förnamn", "Efternamn", "Adress", "Epost", "Telefonnummer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jPersonalTabel);

        jInmatningsRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInmatningsRutaActionPerformed(evt);
            }
        });

        jSokKnapp.setText("Sök");
        jSokKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSokKnappActionPerformed(evt);
            }
        });

        jAlternativRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Namn", "Epost" }));
        jAlternativRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlternativRutaActionPerformed(evt);
            }
        });

        jLabel2.setText("Sök Handläggare via Namn eller Epost på din avdelning");

        jInfoTillbakaKnapp.setText("Tillbaka");
        jInfoTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInfoTillbakaKnappActionPerformed(evt);
            }
        });

        laggTillPersonal.setText("Lägg till personal");
        laggTillPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillPersonalActionPerformed(evt);
            }
        });

        taBortPersonal.setText("Ta bort personal");
        taBortPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTillbakaKnapp)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personalRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAlternativRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInmatningsRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSokKnapp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInfoTillbakaKnapp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(laggTillPersonal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBortPersonal)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTillbakaKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personalRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jInmatningsRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSokKnapp)
                                .addComponent(jAlternativRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jInfoTillbakaKnapp)
                                .addComponent(laggTillPersonal)
                                .addComponent(taBortPersonal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void personalRubrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalRubrikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalRubrikActionPerformed

    private void jTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaKnappActionPerformed

        setVisible(false);
        new InfoRuta(idb, aid).setVisible(true);
    }//GEN-LAST:event_jTillbakaKnappActionPerformed

    private void jInmatningsRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInmatningsRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInmatningsRutaActionPerformed

    private void jAlternativRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlternativRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlternativRutaActionPerformed

    private void jSokKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSokKnappActionPerformed

        String alternativ = jAlternativRuta.getSelectedItem().toString();
            if(ValideringsKlass.textFaltHarVarde(jInmatningsRuta)){
                if(alternativ.equals("Namn")){
                    if(ValideringsKlass.namnKontroll(jInmatningsRuta)){
                        hamtaHandlaggareDataNamn();
                        fyllTabelHandlaggare();
                        jInfoTillbakaKnapp.setVisible(true);
                    }
                }
                if(alternativ.equals("Epost")){
                    if(ValideringsKlass.emailKontroll(jInmatningsRuta)){
                        
                        hamtaHandlaggareDataEpost();
                        fyllTabelHandlaggare();
                        jInfoTillbakaKnapp.setVisible(true);
                    }
                }
        }
    }//GEN-LAST:event_jSokKnappActionPerformed

    private void jInfoTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInfoTillbakaKnappActionPerformed
        // TODO add your handling code here:
        fyllPersonalTabel();
        
    }//GEN-LAST:event_jInfoTillbakaKnappActionPerformed

    private void taBortPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortPersonalActionPerformed
        // TODO add your handling code here:
        tabortAnstalld();
    }//GEN-LAST:event_taBortPersonalActionPerformed

    private void laggTillPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillPersonalActionPerformed
        // TODO add your handling code here:
        laggTillAnstalld();
    }//GEN-LAST:event_laggTillPersonalActionPerformed

    private void synlighetAdmin(){
        laggTillPersonal.setVisible(false);
        taBortPersonal.setVisible(false);
        if(ValideringsKlass.behorighet(idb, aid)){
            laggTillPersonal.setVisible(true);
            taBortPersonal.setVisible(true);
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
            java.util.logging.Logger.getLogger(SeAllaPersonalAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeAllaPersonalAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeAllaPersonalAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeAllaPersonalAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SeAllaPersonalAvdelning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jAlternativRuta;
    private javax.swing.JButton jInfoTillbakaKnapp;
    private javax.swing.JTextField jInmatningsRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jPersonalTabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSokKnapp;
    private javax.swing.JButton jTillbakaKnapp;
    private javax.swing.JButton laggTillPersonal;
    private javax.swing.JTextField personalRubrik;
    private javax.swing.JButton taBortPersonal;
    // End of variables declaration//GEN-END:variables

    
}
