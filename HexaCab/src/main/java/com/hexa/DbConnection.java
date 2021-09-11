
package com.hexa;
import java.sql.*;
import javax.sql.*;

public class DbConnection
{
    public static Connection getConnect()
    {
        Connection con =null;
        try
        {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The driver loaded");

        }

        catch(ClassNotFoundException clse)

        {

            clse.printStackTrace();
            System.out.println("Sql Connection Problem");
            System.out.println("Driver Connection Failed");
        }

        try{

            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/HexaCab","root","root");

        }

        catch(SQLException e)

        {
            System.out.println("Error in Connection");
            e.printStackTrace();

        }

        return con;

    }

}