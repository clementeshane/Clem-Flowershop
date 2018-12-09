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
public class UnpaidInvoice extends Customer{
    private String corpName;
    private String mthInvoice;
    private double invoiceAmmt;
    
    public UnpaidInvoice(){
        
    }
    
    public UnpaidInvoice(String corpName, String address, String contactNo, String mthInvoice, double invoiceAmmt){
        super(address, contactNo);
        this.corpName = corpName;
        this.mthInvoice = mthInvoice;
        this.invoiceAmmt = invoiceAmmt;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getMthInvoice() {
        return mthInvoice;
    }

    public void setMthInvoice(String mthInvoice) {
        this.mthInvoice = mthInvoice;
    }

    public double getInvoiceAmmt() {
        return invoiceAmmt;
    }

    public void setInvoiceAmmt(double invoiceAmmt) {
        this.invoiceAmmt = invoiceAmmt;
    }
}
