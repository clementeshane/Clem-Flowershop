/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershopjy;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author JiaYao
 */
public class FioreFlowershopJY {

    public static List<Item> itemsList = new LinkedList<>(); 
    public static List<Paymentmethod> methodList = new LinkedList<>(); 

    public static boolean a = false;
    
    
    public static void main(String[] args) {
        //Item items1 = new Item(1,"Roses", 3 , 8.0);
        //Item items2 = new Item(2,"Sunflowers",10);
        //itemsList.add(items1);
        //itemsList.add(items2); 
        menu();
    }
    
    public static void menu(){

        Scanner s = new Scanner(System.in);

        int option;
        int count = 0;
        do{
            if(count>=1){
                System.out.println("");
                System.out.println("");
                System.out.println("Please enter again the correct number!");
            }

            System.out.println("Menu: ");
            System.out.println("1.View Item You Selected");
            System.out.println("2.Order Item");
            System.out.println("3.Update Quantity");

            System.out.println("4.Exit");
            System.out.println("Please enter your choice : ");
            option = s.nextInt();
            if(option == 1){
                viewItemList();
                a = true;
            }else if(option == 2){
                orderItem();
                a = true;
            }else if(option == 3){
                updateQuantity();
                a = true;
            }
            else if(option == 4){
                System.exit(0);
            }
            count++;
        }while(a!=true);

            System.out.println("Please enter your choice : ");
            option = s.nextInt();
            if(option == 1){
                viewItemList();
                menu();
            }else if(option == 2){
                orderItem();
                menu();
            }else if(option == 3){
                updateQuantity();
                menu();
            }
    }
    
    public static void orderItem(){
        Item items = new Item();
        Paymentmethod method = new Paymentmethod();
        Scanner s = new Scanner(System.in);

        int option = 0;
        int count = 0;
        int choice = 0;
        int choose = 0;
        int time = 0;
        String flower1 = "Sunflowers";
        String flower2 = "Roses";
        String flower3 = "Lily";
        double price1 = 5.00;
        double price2 = 4.50;
        double price3 = 7.00;
        double totalprice = 0.0;
        
        System.out.print("ID:");
        items.setId(itemsList.size()+1);
        System.out.println(items.getId());
        
        System.out.println("1. Sunflowers  RM5.00");
        System.out.println("2. Roses       RM4.50");
        System.out.println("3. Lily        RM7.00");
        System.out.println("4. Return to Main Menu");
        System.out.println("Please enter your choice:");
        option = s.nextInt();
        
        if(option == 1){
            items.setName(flower1);
            items.setPrice(price1);
        }else if(option == 2){
            items.setName(flower2);
            items.setPrice(price2);
        }else if(option == 3){
            items.setName(flower3);
            items.setPrice(price3);
        }else if(option == 4){
            menu();
        }else {
            System.out.println("Please enter again the correct number!");
            orderItem();
        }
                    
        //System.out.println("Enter item name:");
        //items.setName(s.next());
        System.out.println("Enter quantity:");
        items.setQuantity(s.nextInt());
        totalprice = items.getQuantity() * items.getPrice();
        items.setPrice(totalprice);
        System.out.println("\n");
        itemsList.add(items);
        
        System.out.println("Order successfully added!\n");
        System.out.println("New item list");
        showList();
        
        System.out.println("");
        System.out.println("Do your want to add more item?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Please select an option:");
        option = s.nextInt();
        if(option == 1){
            orderItem();
        }else{
            
            System.out.println("Please select payment method!");
            System.out.println("1. Cash On Delivery");
            System.out.println("2. Pick Up");
            choose = s.nextInt();
            if(choose == 1){
                method.setDeliveryType("Cash On Delivery");
                System.out.println("Please enter delivery date!");
                System.out.print("Day   : ");
                int day = s.nextInt();
                System.out.print("Month : ");
                int month = s.nextInt();
                System.out.print("Year  : ");
                int year = s.nextInt();
                
                method.setDeliveryDate(LocalDate.of(year, month, day));
                method.setDeliveryTime(null);
           
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                
                Calendar cal = Calendar.getInstance();
                
                int orderYear = cal.get(Calendar.YEAR);
                int orderMonth = cal.get(Calendar.MONTH) + 1;
                int orderDay = cal.get(Calendar.DAY_OF_MONTH);
                
                while(year < orderYear){
                    System.out.println("Delivery year cannot before order year! Please enter again!");
                    System.out.print("Year  : ");
                    year = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
                
                while(year >= orderYear && month < orderMonth){
                    System.out.println("Delivery month cannot before order month while delivery year is same to order year! Please enter again!");
                    System.out.print("Month : ");
                    month = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
                
                while(year >= orderYear && month >= orderMonth && day < orderDay){
                    System.out.println("Delivery day cannot before order day while delivery year & month is same with order year & month! Please enter again!");
                    System.out.print("Day   : ");
                    day = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
                
                    System.out.println("");
                    System.out.println("========================================");
                    System.out.println("||          Purchase Invoice          ||");
                    System.out.println("========================================");
                    System.out.println("Order ID          : " + items.getId());
                    System.out.println("Delivery Method   : " + method.getDeliveryType());
                    System.out.println("Order Date & Time : " + formatter.format(date));
                    System.out.println("Delivery Date     : " + method.getDeliveryDate());
                    System.out.println("-------------------------------");
                    System.out.printf("  Total Price : RM %6.2f \n", items.getPrice());
                    System.out.println("-------------------------------\n");
                
            }else{
                method.setDeliveryType("Pick Up");
                System.out.println("Please enter delivery date!");
                System.out.print("Day   : ");
                int day = s.nextInt();
                System.out.print("Month : ");
                int month = s.nextInt();
                System.out.print("Year  : ");
                int year = s.nextInt();
                
                method.setDeliveryDate(LocalDate.of(year, month, day));
                
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                
                Calendar cal = Calendar.getInstance();
                
                int orderYear = cal.get(Calendar.YEAR);
                int orderMonth = cal.get(Calendar.MONTH) + 1;
                int orderDay = cal.get(Calendar.DAY_OF_MONTH);
                
                while(year < orderYear){
                    System.out.println("Pick up year cannot before pick up year! Please enter again!");
                    System.out.print("Year  : ");
                    year = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
                
                while(year >= orderYear && month < orderMonth){
                    System.out.println("Pick up month cannot before order month while pick up year is same to order year! Please enter again!");
                    System.out.print("Month : ");
                    month = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
                
                while(year >= orderYear && month >= orderMonth && day < orderDay){
                    System.out.println("Pick up day cannot before order day while pick up year & month is same with order year & month! Please enter again!");
                    System.out.print("Day   : ");
                    day = s.nextInt();
                    
                    method.setDeliveryDate(LocalDate.of(year, month, day));
                }
           
                System.out.println("1.  9.00am - 11.00am");
                System.out.println("2. 11.00am -  1.00pm");
                System.out.println("3.  1.00pm -  3.00pm");
                System.out.println("4.  3.00pm -  5.00pm");
                System.out.println("Please select pick up time:");
                time = s.nextInt();
                if(time == 1){
                    method.setDeliveryTime("9.00am - 11.00am");
                }else if(time == 2){
                    method.setDeliveryTime("11.00am -  1.00pm");
                }else if(time == 3){
                    method.setDeliveryTime("1.00pm -  3.00pm");
                }else{
                    method.setDeliveryTime("3.00pm -  5.00pm");
                }
           
                
                
                System.out.println("");
                System.out.println("========================================");
                System.out.println("||          Purchase Invoice          ||");
                System.out.println("========================================");
                System.out.println("Order ID          : " + items.getId());
                System.out.println("Delivery Method   : " + method.getDeliveryType());
                System.out.println("Order Date & Time : " + formatter.format(date));
                System.out.println("Delivery Date     : " + method.getDeliveryDate());
                System.out.println("Delivery Time     : " + method.getDeliveryTime());
                System.out.println("-------------------------------");
                System.out.printf("  Total Price : RM %6.2f \n", items.getPrice());
                System.out.println("-------------------------------\n");
            }
            /*System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option");
                    choice = s.nextInt(); 
                    if(choice==1){
                        menu();
                        a = true;
                    }else if(choice==2){
                        System.exit(0);
                    }
                    count++;*/
        }
        
        
        
        while(a!=true){
                    if(count>=1){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter again the correct number!");
                    }
                    System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option");
                    choice = s.nextInt(); 
                    if(choice==1){
                        menu();
                        a = true;
                    }else if(choice==2){
                        System.exit(0);
                    }
                    count++;
        }
        

        
        /*System.out.print("ID:");
        items.setId(itemsList.size()+1);
        System.out.print("Enter new item name: ");
        items.setName(s.next());
        System.out.print("Enter quantity: ");
        items.setQuantity(s.nextInt());
        
        itemsList.add(items);
        
        showList();   */

    }
    
    
    public static void updateQuantity(){
        int choice =0;

        int count =0;
        showList();
        System.out.println("Select item by number to update quantity:");
        Scanner b = new Scanner(System.in);
        choice = b.nextInt();
        boolean checking =false;
        for(int i=0; i<itemsList.size(); i++){
            if(itemsList.get(i).getId() == choice){
                System.out.println("Enter quantity");
                Scanner stock = new Scanner(System.in);
                int newQ = stock.nextInt();
                itemsList.get(i).setQuantity(newQ);
                System.out.println("Quantity have been updated!\n");
                showList();
                menu();
                checking = true;
//                do{
                while(a!=true){
                    if(count>=1){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter again the correct number!");
                    }
                    System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option");
                    Scanner s = new Scanner(System.in);
                    choice = s.nextInt(); 
                    if(choice==1){
                        menu();
                        a = true;
                    }else if(choice==2){
                        System.exit(0);
                    }
                    count++;
                }
//                while(a!=true);
                
            }else if(choice ==0){
                menu();
            }
        }
        if(checking!= true){
            do{
                System.out.println("This kind of item is not exist!\n");
                System.out.println("1.Return to Main Menu");
                System.out.println("2.Exit");
                System.out.println("Please choose an option");
                Scanner s = new Scanner(System.in);
                choice = s.nextInt(); 
                if(choice==1){
                    menu();
                    a = true;
                }else if(choice==2){
                    System.exit(0);
                }
            }while(a != true);
        }
        
        
//                if(choice==1){
//                    System.out.println("Enter quantity");
//                    Scanner stock = new Scanner(System.in);
//                    int newQ = stock.nextInt();
//                    itemsList.get(0).setQuantity(newQ);
//                    showList();
//
//                }else if(choice==2){
//                    System.out.println("Enter quantity");
//                    itemsList.get(1).setQuantity(a.nextInt());
//                   showList();
//                }

        /*showList();
                System.out.println("Select item by number to update quantity:");
                Scanner a = new Scanner(System.in);
                choice = a.nextInt();
                if(choice==1){
                    System.out.println("Enter quantity");
                    Scanner stock = new Scanner(System.in);
                    int newQ = stock.nextInt();
                    itemsList.get(0).setQuantity(newQ);
                    showList();

                }else if(choice==2){
                    System.out.println("Enter quantity");
                    itemsList.get(1).setQuantity(a.nextInt());
                   showList();
                }*/

    }
    
    public static void showList(){
        System.out.println("No. Item\t\t" + "Quantity\t\t" + "Price");
        System.out.println("======================================================");
            for(int i =0; i<itemsList.size(); i++){
                System.out.printf("%-3d %-8s \t\t%-2d \t\t\t %-5.2f \n", i+1, itemsList.get(i).getName(), itemsList.get(i).getQuantity(), itemsList.get(i).getPrice());
            }
    }
    
    public static void viewItemList(){
        //do{
        int count = 0;
        int i;
        double finalprice = 0.0;
        
        System.out.println("No. Item\t" + "Quantity\t\t" + "Price");
        System.out.println("==============================================");
            
            for(i =0; i<itemsList.size(); i++){
                finalprice += itemsList.get(i).getPrice();
                System.out.printf("%-3d %-10s %8d \t\t %-5.2f \n\n", i+1, itemsList.get(i).getName(), itemsList.get(i).getQuantity(), itemsList.get(i).getPrice());
            }
            
            System.out.printf("Total Price: RM %-5.2f\n\n", finalprice);
           
            while(a!=true){ 
                if(count>=1){
                System.out.println("");
                System.out.println("");
                System.out.println("Please enter again correct number!");
                }
                System.out.println("1.Return to Main Menu");
                System.out.println("2.Exit");
                System.out.println("Please choose an option");
                Scanner s = new Scanner(System.in);
                int c = s.nextInt(); 

                if(c==1){
                    a = true;
                    menu();
                }else if(c==2){
                    System.exit(0);
                }
                count++;
            }
        
            
        //System.out.printf("%-3d %-8s \t\t %-2d \n", i+1, itemsList.get(i).getName(), itemsList.get(i).getQuantity());
    }
}
