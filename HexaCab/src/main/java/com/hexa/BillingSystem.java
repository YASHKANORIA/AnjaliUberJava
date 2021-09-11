package com.hexa;
import java.sql.*;
import javax.sql.*;
import java.util.*;
//import java.Math.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BillingSystem
{
    public static void BillGenerate()
    {
        int distance,distance_fare;
        int base_fare;
        double total_fare;
        int waiting_time;
        int InvoiceNo=6100;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String CurrentDate =dtf.format(now);
        int day =now.getDayOfMonth();


        // waiting_time=(int)(Math.random()*30);
        // if(distance>5)
        // {
        //     total_fare=base_fare;
        // }
        // else
        // {
        //     distance=distance-5;
        //     total_fare=base_fare+(distance_fare*distance);
        //     total_fare=(total_fare*102)/100;
        //     total_fare=total_fare+((waiting_time/15)*10);
        // }
        Invoice invoice=new Invoice();
        invoice.InvoicePrint(InvoiceNo,CurrentDate);
    }
}