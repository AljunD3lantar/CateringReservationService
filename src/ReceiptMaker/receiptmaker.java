
package ReceiptMaker;

import java.util.Date;

public class receiptmaker extends javax.swing.JFrame {

    public receiptmaker() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fulnames = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dates = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locations = new javax.swing.JTextField();
        numattend = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        printreceipt = new javax.swing.JButton();
        genreceipt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerReceipt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        paymeth = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fullname:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel1.add(fulnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 240, 30));

        jLabel2.setText("Date of Event:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 240, 30));

        jLabel3.setText("Payment Method:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setText("Location");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(locations, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 240, 30));
        jPanel1.add(numattend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 240, 30));

        jLabel7.setText("Number of Attendees:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel8.setText("Payment:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel1.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 240, 30));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 70, 40));

        printreceipt.setText("Print Receipt");
        printreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreceiptActionPerformed(evt);
            }
        });
        jPanel1.add(printreceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, 40));

        genreceipt.setText("Generate Receipt");
        genreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreceiptActionPerformed(evt);
            }
        });
        jPanel1.add(genreceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 40));

        CustomerReceipt.setEditable(false);
        CustomerReceipt.setColumns(20);
        CustomerReceipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CustomerReceipt.setRows(5);
        jScrollPane2.setViewportView(CustomerReceipt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 340, 420));

        jLabel5.setText("Date of Event:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 240, 30));

        paymeth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type of Payment", "COD", "GCash", "BPI", "BPO", "Pay Maya", "" }));
        jPanel1.add(paymeth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 240, 30));

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

    private void genreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreceiptActionPerformed
        
        CustomerReceipt.setText("****************************************\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "* ALMA'S CATERING RESERVATION SERVICES *\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "****************************************\n");
        
        Date obj = new Date();
        
        String date = obj.toString();
        
        CustomerReceipt.setText(CustomerReceipt.getText() + "\n" + date + "\n\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Customers Fullname: " + fulnames.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Date of Event: " + dates.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Time of Event: " + time.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Location: " + locations.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Payment Method: " + paymeth.getSelectedItem().toString()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Payment: " + payment.getText()+"\n");
        CustomerReceipt.setText(CustomerReceipt.getText() + "Number of Attendees: " + numattend.getText()+"\n");
        System.out.println("Customer Information Filled!");
    }//GEN-LAST:event_genreceiptActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        CustomerReceipt.setText("");
        fulnames.setText("");
        dates.setText("");
        time.setText("");
        locations.setText("");
        payment.setText("");
        numattend.setText("");
        System.out.println("Reset Successfully");
    }//GEN-LAST:event_resetActionPerformed

    private void printreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreceiptActionPerformed
        try{
            CustomerReceipt.print();
            System.out.println("Receipt printed Successfully!");
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_printreceiptActionPerformed

    
    
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receiptmaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CustomerReceipt;
    private javax.swing.JTextField dates;
    private javax.swing.JTextField fulnames;
    private javax.swing.JButton genreceipt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locations;
    private javax.swing.JTextField numattend;
    private javax.swing.JTextField payment;
    private javax.swing.JComboBox<String> paymeth;
    private javax.swing.JButton printreceipt;
    private javax.swing.JButton reset;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
