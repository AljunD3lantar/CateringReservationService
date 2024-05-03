package MainframeContent;

import Mainframe.HomePage;
import Settings.Settings;
import java.awt.Color;

public class CateringPackages extends javax.swing.JFrame {

   
    public CateringPackages() {
        initComponents();
    }
    
    Color navicolor = new Color(255,255,0);
    Color hovering = new Color(240,240,240);
    Color weddingbg = new Color(255,153,51);
    Color kidspartybg = new Color(204,255,51);
    Color normalpartybg = new Color(153,255,0);
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CateringServices = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CateringPackages = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Venues = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        FoodMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Wedding = new javax.swing.JPanel();
        kidsParty = new javax.swing.JPanel();
        normalParty = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("DASHBOARD");

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
                .addContainerGap(33, Short.MAX_VALUE))
        );
        CateringServicesLayout.setVerticalGroup(
            CateringServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CateringServicesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        Venues.setBackground(new java.awt.Color(255, 255, 0));
        Venues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VenuesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VenuesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VenuesMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VENUES");

        javax.swing.GroupLayout VenuesLayout = new javax.swing.GroupLayout(Venues);
        Venues.setLayout(VenuesLayout);
        VenuesLayout.setHorizontalGroup(
            VenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenuesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VenuesLayout.setVerticalGroup(
            VenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenuesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(FoodMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FoodMenuLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        FoodMenuLayout.setVerticalGroup(
            FoodMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(FoodMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FoodMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

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

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HOME");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CateringServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CateringPackages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FoodMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Venues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Settings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
            .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CateringServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CateringPackages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FoodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Venues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 530));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText("CATERING PACKAGES");

        Wedding.setBackground(new java.awt.Color(255, 153, 51));
        Wedding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WeddingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WeddingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout WeddingLayout = new javax.swing.GroupLayout(Wedding);
        Wedding.setLayout(WeddingLayout);
        WeddingLayout.setHorizontalGroup(
            WeddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        WeddingLayout.setVerticalGroup(
            WeddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kidsParty.setBackground(new java.awt.Color(204, 255, 51));
        kidsParty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kidsPartyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kidsPartyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kidsPartyLayout = new javax.swing.GroupLayout(kidsParty);
        kidsParty.setLayout(kidsPartyLayout);
        kidsPartyLayout.setHorizontalGroup(
            kidsPartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        kidsPartyLayout.setVerticalGroup(
            kidsPartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        normalParty.setBackground(new java.awt.Color(153, 255, 0));
        normalParty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                normalPartyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                normalPartyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout normalPartyLayout = new javax.swing.GroupLayout(normalParty);
        normalParty.setLayout(normalPartyLayout);
        normalPartyLayout.setHorizontalGroup(
            normalPartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        normalPartyLayout.setVerticalGroup(
            normalPartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Wedding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(kidsParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(normalParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(normalParty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Wedding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kidsParty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 560, 530));

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
        CateringPackages ads = new CateringPackages();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CateringServicesMouseClicked

    private void CateringPackagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CateringPackagesMouseClicked
        CateringPackages ads = new CateringPackages();
        ads.setVisible(true);
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

    private void VenuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenuesMouseClicked
        Venues vn = new Venues();
        vn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VenuesMouseClicked

    private void VenuesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenuesMouseEntered
        Venues.setBackground(hovering);
    }//GEN-LAST:event_VenuesMouseEntered

    private void VenuesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenuesMouseExited
        Venues.setBackground(navicolor);
    }//GEN-LAST:event_VenuesMouseExited

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

    private void WeddingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeddingMouseEntered
        Wedding.setBackground(hovering);
    }//GEN-LAST:event_WeddingMouseEntered

    private void WeddingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeddingMouseExited
        Wedding.setBackground(weddingbg);
    }//GEN-LAST:event_WeddingMouseExited

    private void kidsPartyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kidsPartyMouseEntered
        kidsParty.setBackground(hovering);
    }//GEN-LAST:event_kidsPartyMouseEntered

    private void kidsPartyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kidsPartyMouseExited
        kidsParty.setBackground(kidspartybg);
    }//GEN-LAST:event_kidsPartyMouseExited

    private void normalPartyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalPartyMouseEntered
        normalParty.setBackground(hovering);
    }//GEN-LAST:event_normalPartyMouseEntered

    private void normalPartyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalPartyMouseExited
        normalParty.setBackground(normalpartybg);
    }//GEN-LAST:event_normalPartyMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
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
            java.util.logging.Logger.getLogger(CateringPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CateringPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CateringPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CateringPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CateringPackages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CateringPackages;
    private javax.swing.JPanel CateringServices;
    private javax.swing.JPanel FoodMenu;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Venues;
    private javax.swing.JPanel Wedding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel kidsParty;
    private javax.swing.JPanel normalParty;
    // End of variables declaration//GEN-END:variables
}
