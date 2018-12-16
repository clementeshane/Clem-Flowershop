/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintain;
import java.util.Scanner;
import CustomerMaintain.Corporate;
import CustomerMaintain.ArrayList;
import java.util.Date;

/**
 *
 * @author Chew
 */
public class CustomerMaintain {
    
    
    
    private static Scanner scan = new Scanner(System.in);
    public static ArrayList<Corporate> generateCorporateList() {
        ArrayList<Corporate> corps = new ArrayList<>();

        corps.add(new Corporate("Jy Art.Sdn.Bhd.", "144, Lorong 12, Taman Sentosa, 34000 Taiping, Perak", "085569987", 1400.00));
        corps.add(new Corporate("Johnson Florist", "8, Jalan Pangung Wayang, 34000 Taiping, Perak", "082456693", 2000.00));
        return corps;
    }
    
    public static ArrayList<UnpaidInvoice> generateUnpaidInvoice(){
        ArrayList<UnpaidInvoice> unInvo = new ArrayList<>();
        
        unInvo.add(new UnpaidInvoice("Johnson Florist", "8, Jalan Pangung Wayang, 34000 Taiping, Perak", "082456693","November", 1800.00));
        
        return unInvo;
    }
    
    public static int menu(ArrayList<Corporate>corporate, ArrayList<UnpaidInvoice>unpaidInv){
        String selection = "";
        while (true){
            System.out.println("Customer Maintenance & Invoice Payment\n");
            System.out.println("1.New consumer\n");
            System.out.println("2.New corporate customer\n");
            System.out.println("3.Generate Invoice\n");
            System.out.println("4.Customer List\n");
            System.out.println("5.Unpaid Invoice\n");
            System.out.println("6.Exit\n");
            System.out.println("Please enter your selection: ");
            selection = scan.nextLine();
            if(selection.matches("^[1-6]$")){
                break;
            }else{
                System.out.println("Invalid selection, please choose again!!");
            }
        }
        if(selection.equals("1")){
            
        }else if (selection.equals("2")){
            CustomerMaintain.newCorporate(corporate, unpaidInv);
        }else if(selection.equals("3")){
            CustomerMaintain.generateInvoice();
        }else if(selection.equals("4")){
            CustomerMaintain.showCustomerList(corporate, unpaidInv);
        }else if(selection.equals("5")){
            CustomerMaintain.showUnpaidInvoice(corporate, unpaidInv);
        }
        return Integer.parseInt(selection);
    }
    
    public static void newCorporate(ArrayList<Corporate>corporate, ArrayList<UnpaidInvoice>unpaidInv){
        String corpName = "";
        String creditLimit = "";
        String address = "";
        String contactNo = "";
        boolean existCorp = false;
        
        System.out.println("\nNew Coporate Customer");
        while(true){
            System.out.println("Enter corporate name: ");
            corpName = scan.nextLine();
            break;
        }
        while(true){
            System.out.println("Enter address: ");
            address = scan.nextLine();
            break;
        }
        while(true){
            System.out.println("Enter contact number: ");
            contactNo = scan.nextLine();
            break;
        }
        while(true){
            System.out.println("Enter credit limit: ");
            creditLimit = scan.nextLine();
            break;
        }
        
        Corporate newCorp = new Corporate(corpName, address, contactNo, Double.parseDouble(creditLimit));
        
        for(int i=0; i<corporate.size();i++){
            if(corporate.get(i).getCorpName().equals(newCorp.getCorpName())){
                existCorp = true;
            }
        }
        if(!existCorp){
            corporate.add(newCorp);
            System.out.println("New corporate customer has been added");
            CustomerMaintain.menu(corporate, unpaidInv);
        }else{
            System.out.println("Corporate customer already exist");
        }
    }
    
    public static void showCustomerList(ArrayList<Corporate>corporate, ArrayList<UnpaidInvoice>unpaidInv) {
        System.out.println("\nCorporate List");
        System.out.println("\nCorporate Name \t\t" + "Contact Number \t\t" + "Corporate Address \t\t\t\t" + "Monthly Credit(RM)");
        for (int i = 0; i < corporate.size(); i++) {
            System.out.println(String.format("%-10s \t %-10s \t %-10s \t %-6.2f", corporate.get(i).getCorpName(), corporate.get(i).getContactNo(), corporate.get(i).getAddress(), corporate.get(i).getCreditLimit()));
        }
        System.out.println("\n");
        CustomerMaintain.menu(corporate, unpaidInv);
    }

    public static void showUnpaidInvoice(ArrayList<Corporate>corporate, ArrayList<UnpaidInvoice>unpaidInv) {
        
        System.out.println("\nUnpaid Invoice");
        System.out.println("\nCorporate Name \t\t" + "Contact Number \t\t" + "Corporate Address \t\t\t\t" + "Month\t\t" + "Amount(RM)");
        for(int i = 0; i<unpaidInv.size(); i++){
            System.out.println(String.format("%-10s \t %-10s \t %-10s \t %-10s \t %-6.2f", unpaidInv.get(i).getCorpName(), unpaidInv.get(i).getContactNo(), unpaidInv.get(i).getAddress(), unpaidInv.get(i).getMthInvoice(), unpaidInv.get(i).getInvoiceAmmt()));
        }
        System.out.println("\n");
        CustomerMaintain.menu(corporate, unpaidInv);
    }
    
    public static void generateInvoice(){
        System.out.println("\nInvoice");
        System.out.println("");
    }
}
