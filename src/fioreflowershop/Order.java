/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Aida
 * @param <T>
 */
public class Order<T> implements OrderInterface<T>{
    private String order_number;
    private String order_date;
    private double order_amount;
    private String order_person;
    private String order_address;
    private String order_status;
    private T[] lists;
    private int NumberOfEntries = 0;
   public static int newPosition = 0;
    private String timestamp;
       @Override
    public void add(T newEntry) {
        lists[NumberOfEntries]= newEntry;
        NumberOfEntries++;
    }
    public Order() {
    }

    public Order(String order_number, String order_date, double order_amount, String order_person, String order_address, String order_status, String timestamp) {
        this.order_number = order_number;
        this.order_date = order_date;
        this.order_amount = order_amount;
        this.order_person = order_person;
        this.order_address = order_address;
        this.order_status = order_status;
        this.timestamp = timestamp;
    }

    public Order(String order_number, String order_date, double order_amount, String order_person, String order_address, String order_status) {
        this.order_number = order_number;
        this.order_date = order_date;
        this.order_amount = order_amount;
        this.order_person = order_person;
        this.order_address = order_address;
        this.order_status = order_status;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(double order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_person() {
        return order_person;
    }

    public void setOrder_person(String order_person) {
        this.order_person = order_person;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    
    @Override
    public String toString() {
        return "Order{" + "order_number=" + order_number + ", order_date=" + order_date + ", order_amount=" + order_amount + ", order_person=" + order_person + ", order_address=" + order_address + ", order_status=" + order_status + '}';
    }


    public static List dailyOrder(List orderList){
        LocalDate date = java.time.LocalDate.now();
        List dailyOrder = new ArrayList<>();
        
        for(int i =0; i < orderList.size(); i++){

            LocalDate convertDate = LocalDate.parse(((Order)orderList.get(i)).getOrder_date());
            String status = ((Order)orderList.get(i)).getOrder_status();
            if(convertDate.compareTo(date)==0){
                if ("PICKUP".equals(status)) {      
                    dailyOrder.add(new Order(((Order)orderList.get(i)).getOrder_number(), ((Order)orderList.get(i)).getOrder_date(), ((Order)orderList.get(i)).getOrder_amount(),((Order)orderList.get(i)).getOrder_person(), ((Order)orderList.get(i)).getOrder_address(),((Order)orderList.get(i)).getOrder_status()));
                }
            }
    }
        
        return dailyOrder;
    }







   
}
