/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectHospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DIPESH SHOME
 */
public class CONNECTSQLPROJECT {
    
      public Connection connection;
     public void connectDB(){  
         try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectHospitalAdmission;selectMethod=cursor",  "sa", "12345");  
   
             System.out.println("DATABASE NAME IS: " + connection.getMetaData().getDatabaseProductName());  
             
             Statement statement = connection.createStatement();  
             
             ResultSet resultSet = statement .executeQuery("SELECT * FROM  ChargeTable");  
             
             
             
             while (resultSet.next()) {  
                 
                 System.out.println("Bed Charge: " + resultSet.getString("BedCharge") );
                
                 
                       }  
         } catch (Exception e) {  
             e.printStackTrace();  
         }  
     } 
    
}
