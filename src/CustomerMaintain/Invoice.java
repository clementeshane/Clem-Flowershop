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
public class Invoice {
    private int invoiceNo;
    private String itemName;
    private int quantity;
    private double uprice;
    private double tprice;
    
    public Invoice(){
        
    }
    
    public Invoice(String itemName, int quantity, double uprice, double tprice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.uprice = uprice;
        this.tprice = tprice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    public double getTprice() {
        return tprice;
    }

    public void setTprice(double tprice) {
        this.tprice = tprice;
    }
}
