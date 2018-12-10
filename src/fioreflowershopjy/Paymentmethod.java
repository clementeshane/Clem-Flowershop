/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershopjy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author JiaYao
 */
public class Paymentmethod {
    
    private LocalTime orderTime;
    private LocalDate orderDate;
    public static List<Item> itemsList = new LinkedList<>();
    private String deliveryType;
    private LocalDate deliveryDate;
    private String deliveryTime;
    
    public Paymentmethod(){
    
    }

    public Paymentmethod(LocalTime orderTime, LocalDate orderDate, String deliveryType, LocalDate deliveryDate, String deliveryTime) {
        this.orderTime = orderTime;
        this.orderDate = orderDate;
        this.deliveryType = deliveryType;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
    }
    
    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public static List<Item> getItemsList() {
        return itemsList;
    }

    public static void setItemsList(List<Item> itemsList) {
        Paymentmethod.itemsList = itemsList;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
}
