package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbConnector {
    private Connection connect;
    
    public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3377/catering", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    public Connection getConnection() {
        return connect;
    }
    
    //
    //Function to save data
    public boolean insertData(String sql){
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully");
            pst.close();
            return true;
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
            return false;
        }
        
    }

    public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
    public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }
    
    public void deleteAccount(int userID){
        
        try{
            Statement stmt = connect.createStatement();
            
            String query = "DELETE FROM tbl_user WHERE user_id = " + userID;
            int rowsAffected = stmt.executeUpdate(query);
            stmt.close();
            
            if(rowsAffected > 0){
                System.out.println("Account Deleted Successfully!");
            }else{
                System.out.println("No account or user found with ID: " + userID);
            }
        }catch (SQLException e){
            System.out.println("Error deleting an account." + e.getMessage());
        }
        
    }
}