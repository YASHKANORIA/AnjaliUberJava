package com.hexa;

public class CustomerLoginDetail {
    private String username;
    private String password;
    private Customer customer;

    public CustomerLoginDetail() {
    }

    public CustomerLoginDetail(String username, String password, Customer customer) {
        this.username = username;
        this.password = password;
        this.customer = customer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerLoginDetail{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", customer=" + customer +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
