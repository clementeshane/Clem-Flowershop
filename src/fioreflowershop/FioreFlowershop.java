/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Aida
 */
public class FioreFlowershop {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int choice;
        String orderNum;
        String output;
        List orderList = new ArrayList<>();
        List dailyPickup = new ArrayList<>();
        Order order1 = new Order( "001" , "2018-12-11", 30.90 ,"Clemente","Kepong","DELIVERED", "2018/12/11 12.31.12");
        Order order2 = new Order( "002" , "2018-12-11", 30.90 ,"Shane","Kepong","PICKUP", " ");
        Order order3 = new Order( "003" , "2018-10-30", 30.90 ,"Lemen","Kepong","DELIVERED", "2018/10/31 03.53.58");
        Order order4 = new Order( "004" , "2018-12-11", 30.90 ,"Tan","Kepong","DELIVERED", "2018/12/11 11.10.59");
        Order order5 = new Order( "005" , "2018-12-11", 30.90 ,"Meng","Kepong","PICKUP", " ");
        
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3); 
        orderList.add(order4);
        orderList.add(order5);
        
        do{
            choice = menu();
            if(choice == 1 || choice == 2 || choice == 3){
                if(choice == 1){//Show daily pickup
                    dailyPickup = Order.dailyOrder(orderList);
                    if(dailyPickup.isEmpty())
                    {
                        System.out.println("No record found!");
                    }
                    else
                    {

                        System.out.println("\n\nOrder Number     Date           Amount     Person     Address     Status\n");
                        System.out.println("========================================================================\n");
                        for(int i = 0; i < dailyPickup.size(); i++){

                            System.out.println(((Order)dailyPickup.get(i)).getOrder_number()+"        "+ ((Order)dailyPickup.get(i)).getOrder_date()+"        RM"+String.format("%.2f",(((Order)dailyPickup.get(i)).getOrder_amount()))+"     "+((Order)dailyPickup.get(i)).getOrder_person()+"     "+ ((Order)dailyPickup.get(i)).getOrder_address()+"     "+((Order)dailyPickup.get(i)).getOrder_status()+"\n");

                        }
                        System.out.println("Press the ENTER key to continue... \n");
                        System.in.read();
                        /*System.out.println("Enter order number that has been picked up: ");
                            Scanner sc = new Scanner(System.in); 
                            String orderNumber = sc.nextLine();

                        for(int i = 0; i < dailyPickup.size(); i++){
                            if(orderNumber == ((Order)dailyPickup.get(i)).getOrder_number());
                            Order order = new Order(((Order)dailyPickup.get(i)).getOrder_number(),((Order)dailyPickup.get(i)).getOrder_date(),(((Order)dailyPickup.get(i)).getOrder_amount()),((Order)dailyPickup.get(i)).getOrder_person(),((Order)dailyPickup.get(i)).getOrder_address(),((Order)dailyPickup.get(i)).getOrder_status());
                               timeStampPickup(order);
                        }*/



                    }
                }
                else if(choice == 2){
                    String repeat = "y";
                    
                    String changeStatus = "DELIVERED";
                    do{
                        
                       int check = 0;
                            System.out.print("Enter the order number that have been picked up: ");
                        orderNum = s.nextLine();
                        for(int i = 0; i < orderList.size(); i++){
                            String status = ((Order)orderList.get(i)).getOrder_status();
                            if(((Order)orderList.get(i)).getOrder_number().equals(orderNum)){
                                if("PICKUP".equals(status)){
                                    String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date());
                                    ((Order)orderList.get(i)).setTimestamp(timeStamp);
                                    ((Order)orderList.get(i)).setOrder_status(changeStatus);
                                    check++;
                                }
                            }
                        }
                        if(check ==0){
                            System.out.println("Order Number Invalid. Please try again!\n");
                            
                        }
                        else
                        {
                            System.out.println("Order status has been updated!\n");
                            System.out.println("Press the ENTER key to continue... \n");
                            repeat = "n";
                            System.in.read();
                        }
                    
                    }while("y".equals(repeat));
                    
                }
                else if(choice == 3){
                    System.out.println("\n\nOrder Number     Date           Amount     Person     Address     Status         Time Stamp(YYYY/MM/DD HH:mm:ss)\n");
                        System.out.println("=================================================================================================================\n");
                    for(int i = 0; i < orderList.size(); i++){
                        if("DELIVERED".equals(((Order)orderList.get(i)).getOrder_status())){
                            System.out.println(((Order)orderList.get(i)).getOrder_number()+"        "+ ((Order)orderList.get(i)).getOrder_date()+"        RM"+String.format("%.2f",(((Order)orderList.get(i)).getOrder_amount()))+"     "+((Order)orderList.get(i)).getOrder_person()+"     "+ ((Order)orderList.get(i)).getOrder_address()+"     "+((Order)orderList.get(i)).getOrder_status()+"         "+((Order)orderList.get(i)).getTimestamp()+"\n");
                        }
                    }
                    System.out.println("Press the ENTER key to continue... \n");
                    System.in.read();

                }
                else if(choice !=1 && choice !=2 && choice !=3 && choice !=4 )
                {
                    System.out.println("Choice entered is invalid. Please try again!");
                 
                }

            }
        }while(choice != 4);
  
    }
    
    //User Menu
    public static int menu(){
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("        MAIN MENU\n");
        System.out.println("============================");
        System.out.println("1. View pickups of the day\n");
        System.out.println("2. Update order pickup status\n");
        System.out.println("3. Show pass records\n");
        System.out.println("4. Exit\n");
        System.out.print("Choose your choice(1,2,..): ");
        choice = s.nextInt();
        return choice;
    }
    
}
