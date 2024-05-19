
package Admin;

import config.dbConnector;
import config.passHasher;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class makeAccount extends javax.swing.JFrame {

    
    
    public makeAccount() {
        initComponents();
    }
    
    static String email, username;
    
    public boolean UserEmailExist(){
        
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_username = '" + un.getText() + "'OR user_email = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("user_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email already used!");
                    em.setText("");
                }
                
                username = resultSet.getString("user_username");
                if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username already used!");
                    un.setText("");
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
    
     public boolean UserEmailUpdateCheck(){
        
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE (user_username = '" + un.getText() + "'OR user_email = '" + em.getText()+"') AND user_id != '"+id.getText()+"'";
                    
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("user_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email already used!");
                    em.setText("");
                }
                
                username = resultSet.getString("user_username");
                if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username already used!");
                    un.setText("");
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
     
     private void clearFields(){
         
         fn.setText("");
         un.setText("");
         em.setText("");
         pw.setText("");
         pn.setText("");
         ut.setSelectedIndex(0);
         us.setSelectedIndex(0);
         
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        us = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registration");

        jLabel3.setText("Fullname:");

        fn.setAutoscrolls(false);

        jLabel4.setText("Username:");

        jLabel5.setText("Pasword:");

        jLabel6.setText("Email:");

        jLabel7.setText("Contact:");

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        jLabel9.setText("User Type:");

        Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));

        jLabel10.setText("User Status:");

        jLabel8.setText("UserID:");

        id.setAutoscrolls(false);
        id.setEnabled(false);

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(em, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(un, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(pw))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (fn.getText().isEmpty() || un.getText().isEmpty() || em.getText().isEmpty() ||
            pw.getText().isEmpty() || pn.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required.");
            } else if (pw.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
                pw.setText("");
            } else if (!isPhoneNumberValid(pn.getText())) {
                JOptionPane.showMessageDialog(null, "Phone number should only contain numbers.");
                pn.setText("");
            } else if (UserEmailExist()) {
                JOptionPane.showMessageDialog(null, "Duplicate Email Exists.");
            } else {
                dbConnector dbc = new dbConnector();
                try {
                    String pass = passHasher.hashPassword(pw.getText());
                    String userType = ut.getSelectedItem().toString();
                    String sql;

                    if ("Admin".equals(userType)) {
                        sql = "INSERT INTO tbl_admin (admin_name, admin_username, admin_email, admin_password, admin_phonenumber, type, admin_status) " +
                              "VALUES ('" + fn.getText() + "', '" + un.getText() + "', '" + em.getText() + "', '" + pass + "', '" + pn.getText() + "', '" + userType + "', '" + us.getSelectedItem() + "')";
                    } else {
                        sql = "INSERT INTO tbl_user (user_fullname, user_username, user_email, user_password, user_phonenumber, user_type, user_status) " +
                              "VALUES ('" + fn.getText() + "', '" + un.getText() + "', '" + em.getText() + "', '" + pass + "', '" + pn.getText() + "', '" + userType + "', '" + us.getSelectedItem() + "')";
                    }

                    if (dbc.insertData(sql)) {
                        JOptionPane.showMessageDialog(null, "Registered Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Connection Error!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while registering. Please try again later.");
                    e.printStackTrace();
                }
            }
    }//GEN-LAST:event_AddActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fn.getText().isEmpty() || un.getText().isEmpty() || em.getText().isEmpty() ||
                pw.getText().isEmpty() || pn.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required.");
        } else if(pw.getText().length() < 8){ 
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
            pw.setText("");
        } else if(!isPhoneNumberValid(pn.getText())){
            JOptionPane.showMessageDialog(null, "Phone number should only be contained numbers.");
            pn.setText("");
        } else if(UserEmailUpdateCheck()){
            System.out.println("Duplicate Exist");
        } else {
            dbConnector dbc = new dbConnector();
            try {
                String pass = passHasher.hashPassword(pw.getText());
                dbc.updateData("UPDATE tbl_user SET user_fullname = '"+fn.getText()+"', user_username = '"+un.getText()+"', user_email = '"
                        +em.getText()+"', user_password = '"+pass+"', user_phonenumber = '"+pn.getText()+"', user_type = '"+ut.getSelectedItem()
                        +"',user_status = '"+us.getSelectedItem()+"'WHERE user_id = '"+id.getText()+"'");
                userWindows uw = new userWindows();
                uw.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred while updating user information. Please try again later.");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?","Confirmation",JOptionPane.YES_OPTION);
        if(confirmation == JOptionPane.YES_OPTION){
            if(id.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please select an account to delete.");
            }else{
                try{
                    int userID = Integer.parseInt(id.getText());
                    dbConnector dbc = new dbConnector();
                    dbc.deleteAccount(userID);
                    clearFields();
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid user ID");
                }
            }
            userWindows ads = new userWindows();
            ads.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        userWindows uw = new userWindows();
        uw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(makeAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(makeAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(makeAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(makeAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new makeAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField pn;
    public javax.swing.JPasswordField pw;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
