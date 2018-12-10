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
public class FlowerSize {
    
    private String FlowerSize;
    private double priceFS;

    public FlowerSize(String FlowerSize, double priceFS) {
        this.FlowerSize = FlowerSize;
        this.priceFS = priceFS;
    }

    public String getFlowerSize() {
        return FlowerSize;
    }

    public void setFlowerSize(String FlowerSize) {
        this.FlowerSize = FlowerSize;
    }

    public double getPriceFS() {
        return priceFS;
    }

    public void setPriceFS(double priceFS) {
        this.priceFS = priceFS;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.FlowerSize);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.priceFS) ^ (Double.doubleToLongBits(this.priceFS) >>> 32));
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
        final FlowerSize other = (FlowerSize) obj;
        if (Double.doubleToLongBits(this.priceFS) != Double.doubleToLongBits(other.priceFS)) {
            return false;
        }
        if (!Objects.equals(this.FlowerSize, other.FlowerSize)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  FlowerSize +" |  price : \t" + priceFS ;
    }
    
    
}
