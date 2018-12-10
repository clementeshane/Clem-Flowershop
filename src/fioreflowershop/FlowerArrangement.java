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
public class FlowerArrangement {
    
    private String FlowerArrange;
    public double priceFA;

    public FlowerArrangement(String FlowerArrange, double priceFA) {
        this.FlowerArrange = FlowerArrange;
        this.priceFA = priceFA;
    }

    public String getFlowerArrange() {
        return FlowerArrange;
    }

    public void setFlowerArrange(String FlowerArrange) {
        this.FlowerArrange = FlowerArrange;
    }

    public double getPriceFA() {
        return priceFA;
    }

    public void setPriceFA(double priceFA) {
        this.priceFA = priceFA;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.FlowerArrange);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.priceFA) ^ (Double.doubleToLongBits(this.priceFA) >>> 32));
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
        final FlowerArrangement other = (FlowerArrangement) obj;
        if (Double.doubleToLongBits(this.priceFA) != Double.doubleToLongBits(other.priceFA)) {
            return false;
        }
        if (!Objects.equals(this.FlowerArrange, other.FlowerArrange)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  FlowerArrange + " |  price : \t" + priceFA ;
    }
    
}
