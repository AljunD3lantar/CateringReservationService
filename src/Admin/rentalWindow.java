
package Admin;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SCC
 */
public class rentalWindow extends javax.swing.JFrame {

    public rentalWindow() {
        initComponents();
        displayData();
        rentalTable.setDefaultEditor(Object.class, null);
    }
    
    boolean checkadd = true;
    Color navicolor = new Color(255,255,0);
    Color hovering = new Color(255,255,153);
    public String destination = "";
    public String oldpath;
    public String path;
    File selectedFile;
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT rent_id, rent_name, rent_status FROM rentals");
            rentalTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
    }
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
        
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
 
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
    private void clearFields(){
         
         rent_name.setText("");
         rent_price.setText("");
         rent_size.setText("");
         rent_stats.setSelectedItem(0);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        acc_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        addbutton = new javax.swing.JPanel();
        addbutton1 = new javax.swing.JPanel();
        Add1 = new javax.swing.JLabel();
        Add2 = new javax.swing.JLabel();
        Update = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        Clear = new javax.swing.JPanel();
        Add3 = new javax.swing.JLabel();
        Delete = new javax.swing.JPanel();
        Add6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentalTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        rent_image = new javax.swing.JLabel();
        Remove = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        rent_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rent_size = new javax.swing.JTextField();
        rent_stats = new javax.swing.JComboBox<>();
        rent_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("RENTALS WINDOW");

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

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

        addbutton.setBackground(new java.awt.Color(255, 255, 0));
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbuttonMouseExited(evt);
            }
        });
        addbutton.setLayout(null);

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

        addbutton.add(addbutton1);
        addbutton1.setBounds(0, 0, 0, 0);

        Add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add2.setText("ADD ");
        addbutton.add(Add2);
        Add2.setBounds(20, 0, 150, 30);

        Update.setBackground(new java.awt.Color(255, 255, 0));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("UPDATE");

        javax.swing.GroupLayout UpdateLayout = new javax.swing.GroupLayout(Update);
        Update.setLayout(UpdateLayout);
        UpdateLayout.setHorizontalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpdateLayout.setVerticalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Clear.setBackground(new java.awt.Color(255, 255, 0));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearMouseExited(evt);
            }
        });

        Add3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add3.setText("CLEAR");

        javax.swing.GroupLayout ClearLayout = new javax.swing.GroupLayout(Clear);
        Clear.setLayout(ClearLayout);
        ClearLayout.setHorizontalGroup(
            ClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Add3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClearLayout.setVerticalGroup(
            ClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Delete.setBackground(new java.awt.Color(255, 255, 0));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });

        Add6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add6.setText("DELETE");

        javax.swing.GroupLayout DeleteLayout = new javax.swing.GroupLayout(Delete);
        Delete.setLayout(DeleteLayout);
        DeleteLayout.setHorizontalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Add6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        DeleteLayout.setVerticalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(acc_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acc_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 530));

        rentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        rentalTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        rentalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentalTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 290, 490));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(rent_image, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rent_image, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 280, 170));

        Remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Remove.setText("REMOVE");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel1.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 90, 30));

        Select.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Select.setText("SELECT");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        jPanel1.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Rental ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        rid.setEditable(false);
        rid.setAutoscrolls(false);
        rid.setEnabled(false);
        jPanel1.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 190, 35));

        rent_name.setAutoscrolls(false);
        jPanel1.add(rent_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 190, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Size:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Status:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        rent_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rent_sizeActionPerformed(evt);
            }
        });
        jPanel1.add(rent_size, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 190, 35));

        rent_stats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        jPanel1.add(rent_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 190, 30));

        rent_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rent_priceActionPerformed(evt);
            }
        });
        jPanel1.add(rent_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 190, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Price:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminWindow ads = new adminWindow();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        user_name.setText(""+sess.getFullname());
        acc_id.setText(""+sess.getUserID());
    }//GEN-LAST:event_formWindowActivated

    private void addbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseEntered
         addbutton.setBackground(hovering);
    }//GEN-LAST:event_addbuttonMouseEntered

    private void addbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseExited
         addbutton.setBackground(navicolor);
    }//GEN-LAST:event_addbuttonMouseExited

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked
        if(checkadd){
            if(rent_name.getText().isEmpty() || rent_price.getText().isEmpty() | rent_size.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!");
            }else{
                dbConnector dbc = new dbConnector();
                dbc.insertData( "INSERT INTO rentals (rent_name, rent_price, rent_size, rent_status, image) VALUES ('" + rent_name.getText() + "','" + rent_price.getText() + "','" + rent_size.getText() + "', '" + rent_stats.getSelectedItem() + "', '" + destination + "')");
                JOptionPane.showMessageDialog(null, "Rental Successfully Added!");
                displayData();
                checkadd = true;
                rid.setText("");
                rent_name.setText("");
                rent_price.setText("");
                rent_size.setText("");
                rent_stats.setSelectedIndex(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Clear The Field First!");
        }
    }//GEN-LAST:event_addbuttonMouseClicked

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        Remove.setEnabled(false);
        Select.setEnabled(true);
        rent_image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_RemoveActionPerformed

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            rent_image.setIcon(ResizeImage(path, null, rent_image));
                            Select.setEnabled(false);
                            Remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_SelectActionPerformed

    private void rentalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentalTableMouseClicked
        int rowIndex = rentalTable.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Select an accout to edit.");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = rentalTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM rentals WHERE rent_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                
                if(rs.next()){
                rid.setText(""+rs.getInt("rent_id"));
                rent_name.setText(""+rs.getString("rent_name"));
                rent_price.setText(""+rs.getString("rent_price"));
                rent_size.setText(""+rs.getString("rent_size"));
                rent_stats.setSelectedItem(""+rs.getString("rent_status"));
                addbutton.setEnabled(false);
                checkadd = false;
               }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
        
        TableModel tbl = rentalTable.getModel();
    }//GEN-LAST:event_rentalTableMouseClicked

    private void addbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseClicked

    private void addbutton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseEntered

    private void addbutton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutton1MouseExited

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        Update.setBackground(hovering);
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update.setBackground(navicolor);
    }//GEN-LAST:event_UpdateMouseExited

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        checkadd = true;
        rid.setText("");
        rent_name.setText("");
        rent_size.setText("");
        rent_price.setText("");
        rent_stats.setSelectedIndex(0);
    }//GEN-LAST:event_ClearMouseClicked

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
        Clear.setBackground(hovering);
    }//GEN-LAST:event_ClearMouseEntered

    private void ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseExited
        Clear.setBackground(navicolor);
    }//GEN-LAST:event_ClearMouseExited

    private void rent_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rent_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rent_priceActionPerformed

    private void rent_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rent_sizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rent_sizeActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        if(rid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select rentals!");
        }else{
            if(rent_name.getText().isEmpty() || rent_price.getText().isEmpty() | rent_size.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All fields are required!");
            }else{
                dbConnector dbc = new dbConnector();
                dbc.updateData("UPDATE rentals SET rent_name = '"+ rent_name.getText() +
               "', rent_price = '"+ rent_price.getText() +
               "', rent_size = '"+ rent_size.getText() +
               "', rent_status = '"+ rent_stats.getSelectedItem() +
               "' WHERE rent_id = '"+ rid.getText() +"'");
                
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
                displayData();
                checkadd = true;
                rid.setText("");
                rent_name.setText("");
                rent_price.setText("");
                rent_size.setText("");
                rent_stats.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_UpdateMouseClicked

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete.setBackground(hovering);
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(navicolor);
    }//GEN-LAST:event_DeleteMouseExited

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        
    }//GEN-LAST:event_DeleteMouseClicked

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
            java.util.logging.Logger.getLogger(rentalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rentalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rentalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rentalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rentalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Add2;
    private javax.swing.JLabel Add3;
    private javax.swing.JLabel Add4;
    private javax.swing.JLabel Add5;
    private javax.swing.JLabel Add6;
    private javax.swing.JPanel Clear;
    private javax.swing.JPanel Delete;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Select;
    private javax.swing.JPanel Update;
    private javax.swing.JPanel Update1;
    private javax.swing.JPanel Update2;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel addbutton;
    private javax.swing.JPanel addbutton1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rent_image;
    public javax.swing.JTextField rent_name;
    public javax.swing.JTextField rent_price;
    private javax.swing.JTextField rent_size;
    private javax.swing.JComboBox<String> rent_stats;
    private javax.swing.JTable rentalTable;
    public javax.swing.JTextField rid;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
