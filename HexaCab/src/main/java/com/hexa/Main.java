package com.hexa;
import java.sql.*;
import java.util.Scanner;
import java.util.*;
import java.lang.String;

public class Main {
    Scanner sc = new Scanner(System.in);
    Connection con = DbConnection.getConnect();
    DetailsPrint detailsPrint =  new DetailsPrint();
    ArrayList<CustomerLoginDetail> customerLoginDetails =  new ArrayList<>();
    Customer customer = new Customer();
    String getuname,getpassword;
    int i_index;
//    System.out.println("Please Enter Your CREDENTIALS");
//    String username = sc.nextLine();
//    String password = sc.nextLine();


    private Object String;

    public void mainDetails() {



        //Validator


        detailsPrint.selectCustRecord(con);
//        for(int i =0;i<=detailsPrint.customerList.size()-1;i++)
//        {
//            System.out.println("--------------");
//            System.out.println(detailsPrint.customerList.get(i).getCust_id());
//        }
        
        customerLoginDetails.add(new CustomerLoginDetail("Anjali","anjali@123",detailsPrint.customerList.get(0)));
        customerLoginDetails.add(new CustomerLoginDetail("yash","Yash@123",detailsPrint.customerList.get(1)));
        customerLoginDetails.add(new CustomerLoginDetail("ritika","ritika@123",detailsPrint.customerList.get(2)));
//        customerLoginDetails.forEach(System.out::println);




    }
//        displayDetails();


     CustomerLoginDetail validator() {
         System.out.println("Please Enter Your CREDENTIALS");
         String username = sc.nextLine();
         String password = sc.nextLine();
         this.getuname=username;
         this.getpassword=password;

        for (int i = 0; i <= customerLoginDetails.size() - 1; i++)
            if (username.equalsIgnoreCase(customerLoginDetails.get(i).getUsername()) && password.equalsIgnoreCase(customerLoginDetails.get(i).getPassword())) {
                System.out.println(i);
                menu();
              this.i_index=i;


                return customerLoginDetails.get(i);
            }
        System.out.println("Oops ! User not Found");
        return null;
    }


    public void displayDetails() {
        try {
            System.out.println("Enter ur choice");
            int option = sc.nextInt();
            switch (option) {
                case 1:
//                    displayCustomerDetails();
                    System.out.println(this.i_index);
                    System.out.println("Customer Id:  "+customerLoginDetails.get(this.i_index).getCustomer().getCust_id());

                    System.out.println("Customer Name:  "+customerLoginDetails.get(this.i_index).getCustomer().getCust_name());
                    System.out.println("Customer Phone:"+customerLoginDetails.get(this.i_index).getCustomer().getCust_phone());
                    System.out.println("Customer Email :"+customerLoginDetails.get(this.i_index).getCustomer().getCust_email());
                    System.out.println("Customer Address : "+customerLoginDetails.get(this.i_index).getCustomer().getCust_address());
                    break;
                case 2:
                    displayCabDetails();
                    break;
                case 3:
                    displayJourneyDetails();
                    break;
                case 4:
                    CabBooking();
                    break;
                case 5:
                    Runtime.getRuntime().halt(0);
                    break;
                default:
                    System.out.println("Choose either 1, 2, 3, 4 or 5");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        mainDetails();
    }

    // void displayStudentRecord() {
    //     Student s[] = StudentDAO.selectStuRecord(con);
    //     for (Student st : s) {
    //         System.out.println(st);
    //         //System.out.println(st.getId()+ " "+st.getName() );
    //     }

    // }


    // void insertStudentRecord()
    // {
    //     System.out.println("Enter id ");
    //     int id=sc.nextInt();
    //     System.out.println("Enter name");
    //     String name=sc.next();
    //     String res= StudentDAO.insertStuRecord(con,id,name );
    //     System.out.println(res);

    // }

    void displayCustomerDetails()
    {
        System.out.println("Display customer called");
//        detailsPrint.selectCustRecord(con);
        System.out.println(detailsPrint.customerList);
           
    }

    void displayCabDetails()
    {
        System.out.println("Cab Details called");
        detailsPrint.selectCabDetails(con);
    }

    void displayJourneyDetails()
    {
        System.out.println("Journey Details called");
        detailsPrint.selectJourneyDetails(con);
    }

    void CabBooking()
    {
        System.out.println("Cab booking called");
        CabBooking cb=new CabBooking();
        cb.Booking(con,customerLoginDetails.get(this.i_index).getCustomer().getCust_id(),customerLoginDetails.get(this.i_index).getCustomer().getCust_name());
    }

    public static void main(String ar[])
    {


        Main main =  new Main();
        main.mainDetails();
        System.out.println( main.validator());
        while (true)
        {
            main.displayDetails();
        }



        
    }
    public static void menu()
    {
        System.out.println("-------------------------");
        System.out.println("Cab Booking System");
        System.out.println("-------------------------");
        System.out.println("1. Display Customer Details");
        System.out.println("2. Display Cab Details");
        System.out.println("3. Display journey Details");
        System.out.println("4. Book a Cab");
        System.out.println("5. Exit");
        System.out.println("-------------------------");
    }


}