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
public class Corporate extends Customer{
    private String corpName;
    private double creditLimit;
    
    public Corporate(){
        
    }
    
    public Corporate(String corpName, String address, String contactNo, double creditLimit){
        super(address, contactNo);
        this.corpName = corpName;
        this.creditLimit = creditLimit;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    
}
