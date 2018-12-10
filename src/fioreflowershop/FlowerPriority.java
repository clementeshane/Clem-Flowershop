/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

import java.util.Objects;

/**
 *
 * @author User
 */
public class FlowerPriority {
    
    private String FlowerPriority;
    private double FPprice;

    public FlowerPriority(String FlowerPriority, double FPprice) {
        this.FlowerPriority = FlowerPriority;
        this.FPprice = FPprice;
    }

    public String getFlowerPriority() {
        return FlowerPriority;
    }

    public void setFlowerPriority(String FlowerPriority) {
        this.FlowerPriority = FlowerPriority;
    }

    public double getFPprice() {
        return FPprice;
    }

    public void setFPprice(double FPprice) {
        this.FPprice = FPprice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.FlowerPriority);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.FPprice) ^ (Double.doubleToLongBits(this.FPprice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FlowerPriority other = (FlowerPriority) obj;
        if (Double.doubleToLongBits(this.FPprice) != Double.doubleToLongBits(other.FPprice)) {
            return false;
        }
        if (!Objects.equals(this.FlowerPriority, other.FlowerPriority)) {
            return false;
        }
        return true;
    }

     
    @Override
    public String toString() {
        return FlowerPriority + " |  price : \t" + FPprice ;
    }
    
    
    
}
