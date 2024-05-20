/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceiptMaker;

import Admin.adminWindow;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author flank
 */
public class receiptmaker extends javax.swing.JFrame {

    /**
     * Creates new form tableReceipt
     */
    public receiptmaker() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fulnames = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numattend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Generate = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        dates = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        locations = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totpay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        paymeth = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerReceipt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customer Fullname:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(fulnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 30));

        jLabel3.setText("Date of Event:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(numattend, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 30));

        jLabel4.setText("Number of Attendees:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 30));

        jLabel5.setText("Time of Event:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Generate.setText("Generate");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        jPanel1.add(Generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, 40));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 70, 40));

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 70, 40));

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 70, 40));
        jPanel1.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        jLabel6.setText("Payment Method:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel1.add(locations, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 30));

        jLabel7.setText("Location:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(totpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 210, 30));

        jLabel8.setText("Total Payment:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        paymeth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type of Payment", "COD", "GCash", "PayMaya" }));
        jPanel1.add(paymeth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 30));

        CustomerReceipt.setColumns(20);
        CustomerReceipt.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        CustomerReceipt.setRows(5);
        jScrollPane1.setViewportView(CustomerReceipt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        CustomerReceipt.setText("****************************************\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "* ALMA'S CATERING RESERVATION SERVICES *\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "****************************************\n");
        
        Date obj = new Date();
        String date = obj.toString();
        String dates = new SimpleDateFormat("mm/dd/yyyy").format(new Date());
        
        CustomerReceipt.setText(CustomerReceipt.getText() + "\n" + date + "\n\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Customers Fullname: " + fulnames.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Date of Event: " + dates +"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Time of Event: " + time.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Number of Attendees: " + numattend.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Location: " + locations.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Payment Method: " + paymeth.getSelectedItem().toString()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Total Payment: " + totpay.getText()+"\n\n");
        
        
        CustomerReceipt.setText(CustomerReceipt.getText() + "****************************************\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "\t THANK YOU FOR CHOOSING \t\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "   ALMA'S CATERING RESERVATION SERVICES\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "****************************************\n");
        
        System.out.println("Customer Information Filled!");
    }//GEN-LAST:event_GenerateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        adminWindow aw = new adminWindow();
        aw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try{
            CustomerReceipt.print();
            System.out.println("Receipt printed Successfully!");
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        CustomerReceipt.setText("");
        fulnames.setText("");
        time.setText("");
        locations.setText("");
        totpay.setText("");
        numattend.setText("");
        System.out.println("Reset Successfully");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(receiptmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receiptmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receiptmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receiptmaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receiptmaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea CustomerReceipt;
    private javax.swing.JButton Generate;
    private javax.swing.JButton Print;
    private javax.swing.JButton Reset;
    private com.toedter.calendar.JDateChooser dates;
    private javax.swing.JTextField fulnames;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locations;
    private javax.swing.JTextField numattend;
    private javax.swing.JComboBox<String> paymeth;
    private javax.swing.JTextField time;
    private javax.swing.JTextField totpay;
    // End of variables declaration//GEN-END:variables
}
