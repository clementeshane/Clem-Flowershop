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
public class FlowerAcssories {
    
    private String FlowerAccesories;
    private double FAccsPrice;

    public FlowerAcssories(String FlowerAccesories, double FAccsPrice) {
        this.FlowerAccesories = FlowerAccesories;
        this.FAccsPrice = FAccsPrice;
    }

    public String getFlowerAccesories() {
        return FlowerAccesories;
    }

    public void setFlowerAccesories(String FlowerAccesories) {
        this.FlowerAccesories = FlowerAccesories;
    }

    public double getFAccsPrice() {
        return FAccsPrice;
    }

    public void setFAccsPrice(double FAccsPrice) {
        this.FAccsPrice = FAccsPrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.FlowerAccesories);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.FAccsPrice) ^ (Double.doubleToLongBits(this.FAccsPrice) >>> 32));
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
        final FlowerAcssories other = (FlowerAcssories) obj;
        if (Double.doubleToLongBits(this.FAccsPrice) != Double.doubleToLongBits(other.FAccsPrice)) {
            return false;
        }
        if (!Objects.equals(this.FlowerAccesories, other.FlowerAccesories)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  FlowerAccesories +" |  price : \t" + FAccsPrice ;
    }
    
    
    
}
