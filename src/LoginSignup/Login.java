
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
    
     public static boolean loginAcc(String user, String pass){
        dbConnector connector = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_username = '" + user + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){
                String hashedPass = resultSet.getString("user_password");  
                String rehashedPass = passHasher.hashPassword(pass);
                
                if(hashedPass.equals(rehashedPass)){
                    usertype = resultSet.getString("user_type");
                    status = resultSet.getString("user_status");
                    Session sess = Session.getInstance();
                    sess.setUserID(resultSet.getInt("user_id"));
                    sess.setFullname(resultSet.getString("user_fullname"));
                    sess.setUsername(resultSet.getString("user_username"));
                    sess.setEmail(resultSet.getString("user_email"));
                    sess.setPhonenumber(resultSet.getString("user_phonenumber"));
                    sess.setUsertype(resultSet.getString("user_type"));
                    sess.setStatus(resultSet.getString("user_status"));
             return true;
              }else{
                    return false;
                }
            }else{
             return false;
            }
        }catch (SQLException | NoSuchAlgorithmException ex) {
            return false;
        }

    }
    
    //Get account from the database
    public static String getAccount(String user, String pass){
        dbConnector connector = new dbConnector();
        try{
            String sql = "SELECT * FROM tbl_user WHERE user_username = '"+user+"'";
            ResultSet resultSet = connector.getData(sql);
            if(resultSet.next()){
                return resultSet.getString("user_type");
            }else{
                return null;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 260, 35));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 260, 35));

        jLabel4.setText("Don't have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        Signup.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Signup.setText("Signup");
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 50, -1));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 70, 40));

        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 70, 40));

        Check.setText("Show pass");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        if(loginAcc(user.getText(),pass.getText())){
        String user_type = getAccount(user.getText(),pass.getText()); 

        if(!status.equals("Pending")){

            if (user_type.equals("Admin")) {
                JOptionPane.showMessageDialog(null,"Admin Login Success!");
                adminWindow ads = new adminWindow();
                ads.setVisible(true);
                this.dispose();
            } else if (user_type.equals("User")) {
                JOptionPane.showMessageDialog(null,"User Login Success!");
                HomePage ads = new HomePage();
                ads.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Unknown Account! Please enter your correct account."); 
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null,"Sorry, your account is pending. Please contact the administrator to change your status."); // Message for pending status
            return;
        }
    } else {
        JOptionPane.showMessageDialog(null,"Login Failed!");
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
