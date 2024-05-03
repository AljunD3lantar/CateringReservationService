
package SettingsContent;

import LoginSignup.Login;
import Settings.Settings;
import config.Session;
import config.dbConnector;
import config.passHasher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class changepass extends javax.swing.JFrame {

    
    public changepass() {
        initComponents();
    }

    public String passHash(String password){
        try{
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            byte[] hashbyte = messagedigest.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            
            for (byte bytes : hashbyte){
                sb.append(String.format("%02x",bytes));
            }
            return sb.toString();
        }catch(Exception ex){
            System.out.println("Password hash error" + ex.getMessage());
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newPass = new javax.swing.JPasswordField();
        Save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        conNewPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SETTINGS");

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("BACK");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Change Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel5.setText("New Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 30));
        jPanel1.add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 30));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 30));

        jLabel6.setText("Old Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 30));
        jPanel1.add(oldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        jLabel7.setText("Confirm New Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 30));
        jPanel1.add(conNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
     try {
    dbConnector dbc = new dbConnector();
    Session sess = Session.getInstance();
    
    String query = "SELECT * FROM tbl_user WHERE user_id = '"+ sess.getUserID()+"'";
    ResultSet rs = dbc.getData(query);
    if(rs.next()){
        String oldpassword = rs.getString("user_password");
        String oldhash = passHasher.hashPassword(oldPass.getText());
        
        if(oldpassword.equals(oldhash)){
            String newpass = passHasher.hashPassword(newPass.getText());
            
            // Check if new password matches confirm password
            if(newpass.equals(passHasher.hashPassword(conNewPass.getText()))) {
                // If matched, update the password
                dbc.insertData("UPDATE tbl_user SET user_password = '"+newpass+"'");
                JOptionPane.showMessageDialog(null, "Password Changed Successfully!");
                Login ads = new Login();
                ads.setVisible(true);
                this.dispose();
            } else {
                // If not matched, show error message
                JOptionPane.showMessageDialog(null, "New Password and Confirm Password do not match!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Old Password is incorrect!");
        }
    }
} catch(SQLException | NoSuchAlgorithmException ex){
    System.out.println(""+ex);
}

    }//GEN-LAST:event_SaveActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       Settings set = new Settings();
       set.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton Save;
    private javax.swing.JPasswordField conNewPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField oldPass;
    // End of variables declaration//GEN-END:variables
}
