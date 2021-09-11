package com.hexa;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public class CabBooking
{

    public static void Booking (Connection con , int id ,String name)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your id");
        int cust_id=id;
        System.out.print("Welcome "+name+"Thanks for choosing us..");
        try
        {
            PreparedStatement stat=con.prepareStatement ("Select cust_name from CustomerDetails where cust_id=?");
            stat.setInt (1,cust_id);
            ResultSet rset=stat.executeQuery();
            while (rset.next())
            {
                System.out.println(rset.getString(1));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }



        try
        {
            DetailsPrint detailsPrint = new DetailsPrint();
            detailsPrint.selectCabDetails(con);
            System.out.println("Enter Cab id which you want to ride");
            int cab_id=sc.nextInt();
            PreparedStatement stat=con.prepareStatement ("Select cab_model, base_fare, distance_fare from CabDetails where cab_id=?");
            stat.setInt(1, cab_id);
            ResultSet rset=stat.executeQuery();
        while (rset.next())
        {
            System.out.println(rset.getString (1) +" "+rset.getInt (2) +" "+rset.getInt (3));
        }
        }
        catch (SQLException e)
        {
        e.printStackTrace();
        }

        BillingSystem billingsystem=new BillingSystem();
        BillingSystem.BillGenerate();
    }
}
