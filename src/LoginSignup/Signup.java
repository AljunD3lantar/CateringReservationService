/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSignup;

import Admin.adminWindow;
import config.dbConnector;
import javax.swing.JOptionPane;
import Mainframe.*;
import User.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SCC
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Signup() {
        initComponents();
    }
    
    static String email, username, fullname;
    
    public boolean UserEmailExist(){
        
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_username = '" + us.getText() + "'OR user_email = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("user_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email already used!");
                    em.setText("");
                }
                
                username = resultSet.getString("user_username");
                if(username.equals(us.getText())){
                    JOptionPane.showMessageDialog(null, "Username already used!");
                    us.setText("");
                }
                
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        signup1 = new javax.swing.JButton();
        ut = new javax.swing.JComboBox<>();
        fn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGNUP FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, -1));

        jLabel2.setText("Email:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setText("Password:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 169, 30));

        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel2.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 171, 30));

        jLabel5.setText("UserType");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setText("Username:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel2.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 169, 30));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 70, 30));

        signup1.setText("SIGNUP");
        signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup1ActionPerformed(evt);
            }
        });
        jPanel2.add(signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 80, 30));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel2.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 170, 30));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 169, 30));

        jLabel6.setText("Full Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel8.setText("Phone Number:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel2.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, 30));

        jPanel4.setLayout(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean isPhoneNumberValid(String phoneNumber) {
    for (char c : phoneNumber.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false; 
        }
    }
    return true;
}
    
    private void signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup1ActionPerformed
        if(fn.getText().isEmpty() || us.getText().isEmpty() || em.getText().isEmpty() ||
                ps.getText().isEmpty() || pn.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required.");
        }else if(ps.getText().length() < 8){ 
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
            ps.setText("");
        }else if(!isPhoneNumberValid(pn.getText())){
            JOptionPane.showMessageDialog(null, "Phone number should only be contained numbers.");
            pn.setText("");
        }else if(UserEmailExist()){
            System.out.println("Duplicate Exist");
        }else{
        dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user (user_fulname, user_username, user_email, user_password, user_phonenumber, user_type, user_status) VALUES ('"+fn.getText()+"', '"+us.getText()+"', '"+em.getText()+"', '"+ps.getText()+"', '"+pn.getText()+"', '"+ut.getSelectedItem().toString()+"', 'Active')")){                                        
                JOptionPane.showMessageDialog(null, "Registered Successfully!");
                
            String userType = ut.getSelectedItem().toString();
            if("Admin".equals(userType)){
                adminWindow ads = new adminWindow();
                ads.fullN.setText(""+fullname);
                ads.setVisible(true);
                ads.setLocationRelativeTo(null);
                this.dispose();
             
            }else{
                user ads = new user();
                ads.fulln.setText(""+fullname);
                ads.setVisible(true);
                ads.setLocationRelativeTo(null);
                this.dispose();
              }
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_signup1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Login ads = new Login();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField pn;
    private javax.swing.JPasswordField ps;
    private javax.swing.JButton signup1;
    private javax.swing.JTextField us;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
