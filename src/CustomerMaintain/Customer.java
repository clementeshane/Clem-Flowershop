/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintain;

/**
 *
 * @author Chew
 */
public class Customer {

    // Private properties
    private String address;
    private String contactNo;

    // Default constructor
    public Customer() {
        this("", "");
    }

    // Parameterized constructor
    public Customer(String address, String contactNo) {
        this.address = address;
        this.contactNo = contactNo;
    }

    // Getters
    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    // Setters
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}