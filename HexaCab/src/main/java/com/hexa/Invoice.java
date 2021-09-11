package com.hexa;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public class Invoice
{
    public static void InvoicePrint(int InvoiceNo,String CurrentDate)
    {
        System.out.println("----------------Invoice----------------");
        System.out.println("HexaCab \t \t \t Invoice No: "+InvoiceNo);
        System.out.println("\t \t \t \t"+CurrentDate);
        System.out.println("Customer Details");
    }
}