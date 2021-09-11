package com.hexa;
import java.sql.*;
import java.util.ArrayList;
import javax.sql.*;

public class DetailsPrint{
     ArrayList<Customer> customerList = new ArrayList<>();

     ArrayList<Customer> selectCustRecord(Connection con)
    {
        try{
            Statement st=con.createStatement();      
            ResultSet rs=st.executeQuery("select * from CustomerDetails ");


            while(rs.next())           
            {
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
                customerList.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }

            }
            catch(SQLException er)          
            {          
            er.printStackTrace();
            }
        return customerList;
    }
     void selectCabDetails(Connection con)
    {
        try{
            Statement st=con.createStatement();      
            ResultSet rs=st.executeQuery("select * from CabDetails");          
            while(rs.next())           
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));         
            }
           
            }
            catch(SQLException er)          
            {          
            er.printStackTrace();
            }
    }
     void selectJourneyDetails(Connection con)
    {
        try{
            Statement st=con.createStatement();      
            ResultSet rs=st.executeQuery("select * from JourneyDetails");          
            while(rs.next())           
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));         
            }
           
            }
            catch(SQLException er)          
            {          
            er.printStackTrace();
            }
    }
}