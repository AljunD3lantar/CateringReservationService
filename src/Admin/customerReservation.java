package Admin;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class customerReservation extends javax.swing.JFrame {

    
    public customerReservation() {
        initComponents();
        displayData();
        customerconfirmation.setDefaultEditor(Object.class, null);
    }
    
    public void displayData(){
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT r.res_id, u.user_fullname, u.user_email, u.user_phonenumber, r.res_date, r.type_of_event, r.num_of_attendees, r.add_message, r.status " +
                                       "FROM tbl_reservation r " +
                                       "JOIN tbl_user u ON r.user_id = u.user_id");
            customerconfirmation.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerconfirmation = new javax.swing.JTable();
        showinfo = new javax.swing.JButton();
        archive = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 70));

        customerconfirmation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(customerconfirmation);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 710, 290));

        showinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showinfo.setText("Show Info");
        showinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinfoActionPerformed(evt);
            }
        });
        jPanel1.add(showinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, 40));

        archive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        archive.setText("Archive");
        archive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archiveActionPerformed(evt);
            }
        });
        jPanel1.add(archive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 90, 40));

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 90, 40));

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

    private void showinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinfoActionPerformed
         int rowIndex = customerconfirmation.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Select an account to show information.");
} else {
    try {
        dbConnector dbc = new dbConnector();
        TableModel tbl = customerconfirmation.getModel();

        ResultSet rs = dbc.getData("SELECT r.res_id, u.user_fullname, u.user_email, u.user_phonenumber, r.res_date, r.type_of_event, r.num_of_attendees, r.add_message, r.status " +
                       "FROM tbl_reservation r " +
                       "JOIN tbl_user u ON r.user_id = u.user_id " +
                       "WHERE r.res_id = '" + tbl.getValueAt(rowIndex, 0).toString() + "'");

        if (rs != null && rs.next()) {
            UpdateReservation ur = new UpdateReservation();

            ur.resID.setText(rs.getString("res_id"));
            ur.customfulname.setText(rs.getString("user_fullname"));
            ur.emailss.setText(rs.getString("user_email"));
            ur.phonenumber.setText(rs.getString("user_phonenumber"));
            ur.dates.setDate(rs.getDate("res_date"));
            ur.typesofevent.setText(rs.getString("type_of_event"));
            ur.numofattends.setText(String.valueOf(rs.getInt("num_of_attendees")));
            ur.addmessage.setText(rs.getString("add_message"));
            ur.stats.setSelectedItem(rs.getString("status"));

            ur.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No data found for the selected reservation.");
        }

        if (rs != null) {
            rs.close();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}
TableModel tbl = customerconfirmation.getModel();
    }//GEN-LAST:event_showinfoActionPerformed

    private void archiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archiveActionPerformed
        
    }//GEN-LAST:event_archiveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        adminWindow aw = new adminWindow();
        aw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(customerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archive;
    private javax.swing.JButton back;
    private javax.swing.JTable customerconfirmation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showinfo;
    // End of variables declaration//GEN-END:variables
}
