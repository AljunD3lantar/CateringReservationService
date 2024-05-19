
package Settings;

import Mainframe.FoodMenu;
import Mainframe.HomePage;
import Mainframe.CateringServices;
import Mainframe.CateringPackages;
import User.user;
import config.Session;
import java.awt.Color;


public class Settings extends javax.swing.JFrame {

   
    public Settings() {
        initComponents();
    }
    
    Color navicolor = new Color(255,255,0);
    Color hovering = new Color(240,240,240);
    Color body = new Color(255,204,102);
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CateringServices = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CateringPackages = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        FoodMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        UserPersonalInfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullnames = new javax.swing.JTextField();
        usernames = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("SETTINGS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(647, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("DASHBOARD");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(49, 30, 152, 29);

        CateringServices.setBackground(new java.awt.Color(255, 255, 0));
        CateringServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CateringServicesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CateringServicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CateringServicesMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CATERING SERVICES");

        javax.swing.GroupLayout CateringServicesLayout = new javax.swing.GroupLayout(CateringServices);
        CateringServices.setLayout(CateringServicesLayout);
        CateringServicesLayout.setHorizontalGroup(
            CateringServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CateringServicesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CateringServicesLayout.setVerticalGroup(
            CateringServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CateringServicesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(CateringServices);
        CateringServices.setBounds(0, 140, 240, 41);

        CateringPackages.setBackground(new java.awt.Color(255, 255, 0));
        CateringPackages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CateringPackagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CateringPackagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CateringPackagesMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CATERING PACKAGES");

        javax.swing.GroupLayout CateringPackagesLayout = new javax.swing.GroupLayout(CateringPackages);
        CateringPackages.setLayout(CateringPackagesLayout);
        CateringPackagesLayout.setHorizontalGroup(
            CateringPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CateringPackagesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        CateringPackagesLayout.setVerticalGroup(
            CateringPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CateringPackagesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(CateringPackages);
        CateringPackages.setBounds(0, 180, 240, 41);

        FoodMenu.setBackground(new java.awt.Color(255, 255, 0));
        FoodMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FoodMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FoodMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FoodMenuMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FOOD MENU");

        javax.swing.GroupLayout FoodMenuLayout = new javax.swing.GroupLayout(FoodMenu);
        FoodMenu.setLayout(FoodMenuLayout);
        FoodMenuLayout.setHorizontalGroup(
            FoodMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FoodMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        FoodMenuLayout.setVerticalGroup(
            FoodMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(FoodMenu);
        FoodMenu.setBounds(0, 220, 240, 41);

        Settings.setBackground(new java.awt.Color(255, 255, 0));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SETTINGS");

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel2.add(Settings);
        Settings.setBounds(0, 489, 240, 41);

        Home.setBackground(new java.awt.Color(255, 255, 0));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("HOME");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(Home);
        Home.setBounds(0, 100, 240, 41);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 530));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel11.setText("jLabel9");

        Logout.setText("jLabel9");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });

        UserPersonalInfo.setText("jLabel9");
        UserPersonalInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPersonalInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserPersonalInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserPersonalInfoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(UserPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 560, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setText("Full Name:");

        jLabel7.setText("Username:");

        fullnames.setEditable(false);

        usernames.setEditable(false);
        usernames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(usernames, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fullnames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fullnames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 560, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CateringServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringServicesMouseClicked
        CateringServices cs = new CateringServices();
        cs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CateringServicesMouseClicked

    private void CateringPackagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringPackagesMouseClicked
        CateringPackages cp = new CateringPackages();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CateringPackagesMouseClicked

    private void CateringServicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringServicesMouseEntered
        CateringServices.setBackground(hovering);
    }//GEN-LAST:event_CateringServicesMouseEntered

    private void CateringServicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringServicesMouseExited
        CateringServices.setBackground(navicolor);
    }//GEN-LAST:event_CateringServicesMouseExited

    private void CateringPackagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringPackagesMouseEntered
        CateringPackages.setBackground(hovering);
    }//GEN-LAST:event_CateringPackagesMouseEntered

    private void CateringPackagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringPackagesMouseExited
        CateringPackages.setBackground(navicolor);
    }//GEN-LAST:event_CateringPackagesMouseExited

    private void FoodMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodMenuMouseClicked
      FoodMenu fm = new FoodMenu();
      fm.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_FoodMenuMouseClicked

    private void FoodMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodMenuMouseEntered
        FoodMenu.setBackground(hovering);
    }//GEN-LAST:event_FoodMenuMouseEntered

    private void FoodMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodMenuMouseExited
        FoodMenu.setBackground(navicolor);
    }//GEN-LAST:event_FoodMenuMouseExited

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        Settings set = new Settings();
        set.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SettingsMouseClicked

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setBackground(hovering);
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        Settings.setBackground(navicolor);
    }//GEN-LAST:event_SettingsMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        fullnames.setText(""+sess.getFullname());
        usernames.setText(""+sess.getUsername());
        
    }//GEN-LAST:event_formWindowActivated

    private void usernamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamesActionPerformed

    private void UserPersonalInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPersonalInfoMouseClicked
        user us = new user();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserPersonalInfoMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LogoutMouseClicked

    private void UserPersonalInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPersonalInfoMouseEntered
        UserPersonalInfo.setBackground(hovering);
    }//GEN-LAST:event_UserPersonalInfoMouseEntered

    private void UserPersonalInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPersonalInfoMouseExited
        UserPersonalInfo.setBackground(body);
    }//GEN-LAST:event_UserPersonalInfoMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setBackground(hovering);
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setBackground(body);
    }//GEN-LAST:event_LogoutMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        HomePage ads = new HomePage();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Home.setBackground(hovering);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBackground(navicolor);
    }//GEN-LAST:event_HomeMouseExited

    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CateringPackages;
    private javax.swing.JPanel CateringServices;
    private javax.swing.JPanel FoodMenu;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel Settings;
    private javax.swing.JLabel UserPersonalInfo;
    private javax.swing.JTextField fullnames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField usernames;
    // End of variables declaration//GEN-END:variables
}
