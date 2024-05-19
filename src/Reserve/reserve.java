package Reserve;

import MainframeContent.caterpackcontent;
import config.Session;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;


public class reserve extends javax.swing.JFrame {

   
    public reserve() {
        initComponents();
    }

    private int getUserID() {
    return 1;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        customeremail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phonenum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dates = new com.toedter.calendar.JDateChooser();
        typeofevent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numofattendees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addmessage = new javax.swing.JTextArea();
        Submit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fullname:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        customername.setEditable(false);
        jPanel2.add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 30));

        customeremail.setEditable(false);
        jPanel2.add(customeremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 230, 30));

        jLabel2.setText("Email:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 20));

        jLabel3.setText("Phonenumber:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        phonenum.setEditable(false);
        jPanel2.add(phonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, 30));

        jLabel4.setText("Date:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 20));

        dates.setDateFormatString("MM/dd/yyyy");
        jPanel2.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 230, 30));

        typeofevent.setEditable(false);
        typeofevent.setText("BIRTHDAY");
        jPanel2.add(typeofevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 230, 30));

        jLabel5.setText("Additional Message:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 20));
        jPanel2.add(numofattendees, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 230, 30));

        jLabel6.setText("Number of Attendees:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 20));

        jLabel7.setText("Type of Event:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        addmessage.setColumns(20);
        addmessage.setRows(5);
        jScrollPane1.setViewportView(addmessage);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 540, -1));

        Submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 90, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Get Reservation Now!!");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
            try {
        // Get user inputs
        String fullName = customername.getText();
        String email = customeremail.getText();
        String phoneNumber = phonenum.getText();
        Date selectedDate = dates.getDate();
        String eventType = typeofevent.getText();
        int attendees = Integer.parseInt(numofattendees.getText());
        String message = addmessage.getText();

        // Validate inputs
        if (fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || selectedDate == null || eventType.isEmpty() || attendees <= 0) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields correctly.");
            return;
        }

        // Fetch user information based on user_id
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT user_id FROM tbl_user WHERE user_fullname = '" + fullName + "' AND user_email = '" + email + "' AND user_phonenumber = '" + phoneNumber + "'");

        if (rs.next()) {
            int userId = rs.getInt("user_id");

            // Insert reservation data with retrieved user_id
            String insertQuery = "INSERT INTO tbl_reservation (user_id, res_date, type_of_event, num_of_attendees, add_message) VALUES "
                               + "(" + userId + ", '" + new java.sql.Date(selectedDate.getTime()) + "', '" + eventType + "', " + attendees + ", '" + message + "')";

            if (dbc.insertData(insertQuery)) {
                JOptionPane.showMessageDialog(null, "Your booking has been reserved. Wait for the confirmation of the admin.");
                caterpackcontent cpc = new caterpackcontent();
                cpc.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to reserve booking. Please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "User not found. Please check the provided information.");
        }
    } catch (SQLException | NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }  
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
         customername.setText(""+sess.getFullname());
         customeremail.setText(""+sess.getEmail());
         phonenum.setText(""+sess.getPhonenumber());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    public javax.swing.JTextArea addmessage;
    public javax.swing.JTextField customeremail;
    public javax.swing.JTextField customername;
    public com.toedter.calendar.JDateChooser dates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField numofattendees;
    public javax.swing.JTextField phonenum;
    public javax.swing.JTextField typeofevent;
    // End of variables declaration//GEN-END:variables
}
