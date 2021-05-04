
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bijal.shah
 */
public class Db {
    static private Connection c;
    public static Connection getCon() throws Exception 
    {
        if (c==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/devarsh","root","");
        }
        return c;
        
    }
    public static void setData(String s) throws Exception
    {
        Db.getCon().createStatement().executeUpdate(s);
    }
    public static ResultSet getData(String sq) throws Exception 
    {
        return Db.getCon().createStatement().executeQuery(sq);
    }
}
