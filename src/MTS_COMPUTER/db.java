/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MTS_COMPUTER;

import java.sql.Connection;
import java.sql.DriverManager;
public class db {
    
    public static Connection mycon(){
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mts_com","root","");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
