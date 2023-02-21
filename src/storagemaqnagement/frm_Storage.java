/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package storagemaqnagement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frm_Storage extends javax.swing.JFrame {

    public frm_Storage() {
        initComponents();
             Connect();
    }

    //create database connection
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/storsmanagement", "root", "pasi11@PK");
            System.out.println("Database Connected Successfully"); 
        } catch (ClassNotFoundException ex){
            Logger.getLogger(frm_createAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_createAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ItemNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ItemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        txt_quentty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_barcode = new javax.swing.JButton();
        btn_barcode1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        btn_search.setText("Search Item");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Item Number");

        jLabel2.setText("Search from Item Number");

        jLabel3.setText("Item Name");

        jLabel4.setText("Item Entered Date");

        txt_quentty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quenttyActionPerformed(evt);
            }
        });

        jLabel5.setText("Quentty");

        btn_Add.setText("Add to Store");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_delete.setText("Remove Stock");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("Update Stock");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_barcode.setText("Scan Barcode");

        btn_barcode1.setText("< Dashbord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ItemName)
                    .addComponent(jLabel4)
                    .addComponent(txt_date)
                    .addComponent(jLabel5)
                    .addComponent(txt_quentty)
                    .addComponent(txt_ItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete)
                            .addComponent(btn_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_barcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_search)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addComponent(btn_delete)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_barcode)
                        .addGap(18, 18, 18)
                        .addComponent(btn_barcode1)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quentty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_quenttyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quenttyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quenttyActionPerformed

    //add
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
                                               
        String I_number  = txt_ItemNumber.getText();
        String I_name = txt_ItemName.getText();
        String I_dat = txt_date.getText();
        String I_quentty = txt_quentty.getText();
        
          try {
            pst = con.prepareStatement("INSERT INTO tbl_stock (itemNumber, ItemName, ItemDate, Quentty)VALUES(?,?,?,?)");
            pst.setString(1, I_number);
            pst.setString(2, I_name);
            pst.setString(3, I_dat);
            pst.setString(4, I_quentty);
            
            int k=pst.executeUpdate();
            if (k==1) {
                JOptionPane.showMessageDialog(this,"New Stock Added Scussfully");
                txt_ItemNumber.setText("");
                txt_ItemName.setText("");
                txt_date.setText("");
                txt_quentty.setText("");              
            }else{
                JOptionPane.showMessageDialog(this, "Added UnScussfull");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_createAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AddActionPerformed
//search
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String s = JOptionPane.showInputDialog(this, "Enter Stock ID for Search");
        try {
            pst = con.prepareStatement("select * from tbl_stock where itemNumber=?");
            pst.setString(1, s);
            rs = pst.executeQuery();
            if(rs.next()){
                txt_ItemNumber.setText(rs.getString(2));
                txt_ItemName.setText(rs.getString(3));
                txt_date.setText(rs.getString(4));
                txt_quentty.setText(rs.getString(5));             
            }

           } catch (SQLException ex) {
            Logger.getLogger(frm_Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed
 //delete
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            pst = con.prepareStatement("delete from tbl_stock where itemNumber=?");
            pst.setString(1, txt_ItemNumber.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete sucuss");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed
//update
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

       String iNumber = txt_ItemNumber.getText();
       String iName = txt_ItemName.getText();
       String idate = txt_date.getText();
       String iquentty = txt_quentty.getText();
       
       try{
           String sql = "UPDATE `tbl_stock` SET `ItemName`='"+iName+"', `ItemDate`='"+idate+"', `Quentty`='"+iquentty+"' WHERE itemNumber ='"+iNumber+"'";
           pst = con.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(this, "Update sucussfully");
           
       }catch (Exception e){
           JOptionPane.showMessageDialog(rootPane, "Update UNsucussfull");
       }
       
    }//GEN-LAST:event_btn_updateActionPerformed

   
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
            java.util.logging.Logger.getLogger(frm_Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Storage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Storage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_barcode;
    private javax.swing.JButton btn_barcode1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_ItemName;
    private javax.swing.JTextField txt_ItemNumber;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_quentty;
    // End of variables declaration//GEN-END:variables
}
