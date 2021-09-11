package com.hexa;
import java.util.*;
public class Customer{
    int cust_id;
    String cust_name;
    String cust_phone;
    String cust_email;
    String cust_address;
    Customer() {
    }
    Customer(int cust_id,String cust_name,String cust_phone,String cust_email,String cust_address)
    {
        this.cust_id=cust_id;
        this.cust_name=cust_name;
        this.cust_phone=cust_phone;
        this.cust_email=cust_email;
        this.cust_address=cust_address;
    }
    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust_name='" + cust_name + '\'' +
                ", cust_phone='" + cust_phone + '\'' +
                ", cust_email='" + cust_email + '\'' +
                ", cust_address='" + cust_address + '\'' +
                '}';
    }
}