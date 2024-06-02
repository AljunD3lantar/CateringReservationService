package Admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class caterReservation extends javax.swing.JFrame {

    
    public caterReservation() {
        initComponents();
        displayData();
        customerconfirmation.setDefaultEditor(Object.class, null);
    }
    
    Color navicolor = new Color(255, 255, 0);
    Color hovering = new Color(240, 240, 240);
    
    public void displayData(){
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT r.res_id, u.user_fullname, u.user_email, u.user_phonenumber, r.status " +
                                       "FROM caterreservation r " +
                                       "JOIN user u ON r.user_id = u.user_id");
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
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerconfirmation = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        acc_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        showInfos = new javax.swing.JPanel();
        addbutton1 = new javax.swing.JPanel();
        Add1 = new javax.swing.JLabel();
        Add2 = new javax.swing.JLabel();
        Deletes = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CATER RESERVATION FORM");

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 470, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        acc_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100.png"))); // NOI18N

        user_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name.setText("USERS");

        acc_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_user.setText("Current User:");

        showInfos.setBackground(new java.awt.Color(255, 255, 0));
        showInfos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showInfosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showInfosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showInfosMouseExited(evt);
            }
        });
        showInfos.setLayout(null);

        addbutton1.setBackground(new java.awt.Color(255, 255, 0));
        addbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbutton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbutton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbutton1MouseExited(evt);
            }
        });
        addbutton1.setLayout(null);

        Add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add1.setText("ADD RENTALS");
        addbutton1.add(Add1);
        Add1.setBounds(20, 0, 150, 30);

        showInfos.add(addbutton1);
        addbutton1.setBounds(0, 0, 0, 0);

        Add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add2.setText("SHOW INFO");
        showInfos.add(Add2);
        Add2.setBounds(20, 0, 150, 30);

        Deletes.setBackground(new java.awt.Color(255, 255, 0));
        Deletes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeletesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeletesMouseExited(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("DELETE");

        javax.swing.GroupLayout DeletesLayout = new javax.swing.GroupLayout(Deletes);
        Deletes.setLayout(DeletesLayout);
        DeletesLayout.setHorizontalGroup(
            DeletesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeletesLayout.setVerticalGroup(
            DeletesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(acc_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Deletes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acc_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(user_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(showInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deletes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 530));

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

    private void addbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseClicked

    private void addbutton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseEntered

    private void addbutton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseExited

    private void showInfosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showInfosMouseClicked
        int rowIndex = customerconfirmation.getSelectedRow();

            if (rowIndex < 0) {
                JOptionPane.showMessageDialog(null, "Select an account to show information.");
            } else {
                try {
                    dbConnector dbc = new dbConnector();
                    TableModel tbl = customerconfirmation.getModel();

                    ResultSet rs = dbc.getData("SELECT r.res_id, u.user_fullname, u.user_email, u.user_phonenumber, r.res_date, r.type_of_event, r.num_of_attendees, r.add_message, r.status " +
                                   "FROM caterreservation r " +
                                   "JOIN user u ON r.user_id = u.user_id " +
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
    }//GEN-LAST:event_showInfosMouseClicked

    private void showInfosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showInfosMouseEntered
        showInfos.setBackground(hovering);
    }//GEN-LAST:event_showInfosMouseEntered

    private void showInfosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showInfosMouseExited
        showInfos.setBackground(navicolor);
    }//GEN-LAST:event_showInfosMouseExited

    private void DeletesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletesMouseEntered
        Deletes.setBackground(hovering);
    }//GEN-LAST:event_DeletesMouseEntered

    private void DeletesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletesMouseExited
        Deletes.setBackground(navicolor);
    }//GEN-LAST:event_DeletesMouseExited

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
            java.util.logging.Logger.getLogger(caterReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caterReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caterReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caterReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caterReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Add2;
    private javax.swing.JPanel Deletes;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel addbutton1;
    private javax.swing.JButton back;
    private javax.swing.JTable customerconfirmation;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel showInfos;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
