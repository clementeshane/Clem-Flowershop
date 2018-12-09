/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintain;
import CustomerMaintain.ArrayList;
import CustomerMaintain.Corporate;
/**
 *
 * @author Chew
 */
public class FlowerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Corporate> corporate = CustomerMaintain.generateCorporateList();
        ArrayList<UnpaidInvoice> unpaidInv = CustomerMaintain.generateUnpaidInvoice();
        
        int select = CustomerMaintain.menu(corporate, unpaidInv);
    }
}
