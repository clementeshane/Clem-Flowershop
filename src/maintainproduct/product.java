/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintainproduct;

/**
 *
 * @author Brendan Voon Yoong
 */
public class product {
    private int productId;
    private String productType;
    private String name;
    private double price;
    private int quantity;
    private String promo;
    private String alert;
    
    public product(){
        
    }
    
    public product(int productId, String productType, String name, double price, int quantity, String promo, String alert) {
        this.productId = productId;
        this.productType = productType;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promo = promo;
        this.alert = alert;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductType() {
        return productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPromo() {
        return promo;
    }

    public String getAlert() {
        return alert;
    }
    

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    @Override
    public String toString() {
        return "product{" + "productId=" + productId + ", productType=" + productType + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", promo=" + promo + '}';
    }

    
    
    
     
}
