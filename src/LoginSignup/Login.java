
package LoginSignup;

import Admin.*;
import Mainframe.HomePage;
import User.*;
import config.dbConnector;
import config.Session;
import config.passHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }
        
    static String usertype;
    static String status;
    
     public static boolean loginAcc(String username, String password) {
    dbConnector connector = new dbConnector();
    
    try {
        
        String adminQuery = "SELECT * FROM admin WHERE admin_username = '" + username + "'";
        ResultSet adminResultSet = connector.getData(adminQuery);
        
        if (adminResultSet.next()) {
            String hashedPass = adminResultSet.getString("admin_password");  
            String rehashedPass = passHasher.hashPassword(password);
            
            if (hashedPass.equals(rehashedPass)) {
                usertype = "Admin";
                status = adminResultSet.getString("admin_status");
                Session sess = Session.getInstance();
                sess.setUserID(adminResultSet.getInt("admin_id"));
                sess.setFullname(adminResultSet.getString("admin_name"));
                sess.setUsername(adminResultSet.getString("admin_username"));
                sess.setEmail(adminResultSet.getString("admin_email"));
                sess.setPhonenumber(adminResultSet.getString("admin_phonenumber"));
                sess.setUsertype("Admin");
                sess.setStatus(adminResultSet.getString("admin_status"));
                return true;
            } else {
                return false;
            }
        }
        
        String userQuery = "SELECT * FROM user WHERE user_username = '" + username + "'";
        ResultSet userResultSet = connector.getData(userQuery);
        
        if (userResultSet.next()) {
            String hashedPass = userResultSet.getString("user_password");  
            String rehashedPass = passHasher.hashPassword(password);
            
            if (hashedPass.equals(rehashedPass)) {
                usertype = userResultSet.getString("user_type");
                status = userResultSet.getString("user_status");
                Session sess = Session.getInstance();
                sess.setUserID(userResultSet.getInt("user_id"));
                sess.setFullname(userResultSet.getString("user_fullname"));
                sess.setUsername(userResultSet.getString("user_username"));
                sess.setEmail(userResultSet.getString("user_email"));
                sess.setPhonenumber(userResultSet.getString("user_phonenumber"));
                sess.setUsertype(userResultSet.getString("user_type"));
                sess.setStatus(userResultSet.getString("user_status"));
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    } catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
        return false;
    }
}

    
    //Get account from the database
    public static String getAccount(String username, String password) {
        dbConnector connector = new dbConnector();
            try {
                
                String adminQuery = "SELECT * FROM admin WHERE admin_username = '" + username + "'";
                ResultSet adminResultSet = connector.getData(adminQuery);
                if (adminResultSet.next()) {
                    return "Admin";
                    
                }

                    String userQuery = "SELECT * FROM user WHERE user_username = '" + username + "'";
                    ResultSet userResultSet = connector.getData(userQuery);
                    if (userResultSet.next()) {
                        return userResultSet.getString("user_type");
                    }

                return null;
            } catch (SQLException ex) {
                System.out.println("" + ex);
                return null;
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Signup = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        LOGIN = new javax.swing.JButton();
        Check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 260, 35));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 260, 35));

        jLabel4.setText("Don't have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        Signup.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Signup.setText("Signup");
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 50, -1));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 70, 40));

        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 70, 40));

        Check.setText("Show pass");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        String username = user.getText();
        String password = pass.getText();

            if (loginAcc(username, password)) {
                String accountType = getAccount(username, password);

                if (!"Pending".equals(status)) {
                    if ("Admin".equals(accountType)) {
                        JOptionPane.showMessageDialog(null, "Admin Login Success!");
                        adminWindow ads = new adminWindow();
                        ads.setVisible(true);
                        this.dispose();
                    } else if ("User".equals(accountType)) {
                        JOptionPane.showMessageDialog(null, "User Login Success!");
                        HomePage homePage = new HomePage();
                        homePage.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Unknown Account! Please enter your correct account.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, your account is pending. Please contact the administrator to change your status.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed!");
            }
        
    }//GEN-LAST:event_LOGINActionPerformed

    private void SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseClicked
        Signup ads = new Signup();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignupMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        if(Check.isSelected()){
            pass.setEchoChar((char)0);
        }else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel Signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
