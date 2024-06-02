package Admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class rentalReservation extends javax.swing.JFrame {

    
    public rentalReservation() {
        initComponents();
        displayData();
        rentaltable.setDefaultEditor(Object.class, null);
    }
    
    Color navicolor = new Color(255, 255, 0);
    Color hovering = new Color(240, 240, 240);
    
    public void displayData() {
    try {
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData(
            "SELECT ro.rr_id, u.user_username, r.rent_price, ro.date, ro.status " +
            "FROM rentalorder ro " +
            "JOIN user u ON ro.user_id = u.user_id " +
            "JOIN rentals r ON ro.rent_id = r.rent_id"
        );
        rentaltable.setModel(DbUtils.resultSetToTableModel(rs));
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
        rentaltable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        acc_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        Update = new javax.swing.JPanel();
        addbutton1 = new javax.swing.JPanel();
        Add1 = new javax.swing.JLabel();
        Add3 = new javax.swing.JLabel();
        Deletes = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        Add2 = new javax.swing.JLabel();
        rrid = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        Add4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        Add5 = new javax.swing.JLabel();
        rentitem = new javax.swing.JTextField();
        Add6 = new javax.swing.JLabel();
        Add7 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        Add8 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        Add9 = new javax.swing.JLabel();
        Add10 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("RENTAL ORDER FORM:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        rentaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        rentaltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentaltableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rentaltable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 310, 430));

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

        Update.setBackground(new java.awt.Color(255, 255, 0));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        Update.setLayout(null);

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

        Update.add(addbutton1);
        addbutton1.setBounds(0, 0, 0, 0);

        Add3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add3.setText("UPDATE STATUS");
        Update.add(Add3);
        Add3.setBounds(20, 0, 150, 30);

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
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add2.setText("Rental Order Table:");
        jPanel1.add(Add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 140, 30));

        rrid.setEditable(false);
        rrid.setEnabled(false);
        jPanel1.add(rrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 30));
        jPanel1.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 30));

        Add4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add4.setText("Fullname:");
        jPanel1.add(Add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 200, 30));

        Add5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add5.setText("Date:");
        jPanel1.add(Add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 80, 20));
        jPanel1.add(rentitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, 30));

        Add6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add6.setText("Rental Items:");
        jPanel1.add(Add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 20));

        Add7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add7.setText("Size:");
        jPanel1.add(Add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, 20));
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 200, 30));

        Add8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add8.setText("Status:");
        jPanel1.add(Add8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 80, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Confirm" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 200, 30));

        Add9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add9.setText("Rentai Reservation ID:");
        jPanel1.add(Add9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 30));

        Add10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add10.setText("Quantity:");
        jPanel1.add(Add10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 20));
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 200, 30));

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

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        
    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        Update.setBackground(hovering);
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update.setBackground(navicolor);
    }//GEN-LAST:event_UpdateMouseExited

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

    private void rentaltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentaltableMouseClicked
       int rowIndex = rentaltable.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Select a user to update status.");
} else {
    try {
        dbConnector dbc = new dbConnector();
        TableModel tbl = rentaltable.getModel();
        ResultSet rs = dbc.getData(
            "SELECT ro.rr_id, u.user_fullname, r.rent_name, r.rent_price, r.rent_size, ro.quantity, ro.date, ro.status " +
            "FROM rentalorder ro " +
            "JOIN user u ON ro.user_id = u.user_id " +
            "JOIN rentals r ON ro.rent_id = r.rent_id " +
            "WHERE ro.rr_id = '" + tbl.getValueAt(rowIndex, 0) + "'"
        );

        if (rs.next()) {
            rrid.setText(rs.getString("rr_id"));
            fullname.setText(rs.getString("user_fullname"));
            rentitem.setText(rs.getString("rent_name"));
            size.setText(rs.getString("rent_size"));
            size.setText(rs.getString("quantity"));
            date.setText(rs.getString("date"));
            status.setSelectedItem(rs.getString("status"));
        }
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_rentaltableMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(rentalReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rentalReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rentalReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rentalReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rentalReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Add10;
    private javax.swing.JLabel Add2;
    private javax.swing.JLabel Add3;
    private javax.swing.JLabel Add4;
    private javax.swing.JLabel Add5;
    private javax.swing.JLabel Add6;
    private javax.swing.JLabel Add7;
    private javax.swing.JLabel Add8;
    private javax.swing.JLabel Add9;
    private javax.swing.JPanel Deletes;
    private javax.swing.JPanel Update;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel addbutton1;
    private javax.swing.JButton back;
    private javax.swing.JTextField date;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField qty;
    private javax.swing.JTable rentaltable;
    private javax.swing.JTextField rentitem;
    private javax.swing.JTextField rrid;
    private javax.swing.JTextField size;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
