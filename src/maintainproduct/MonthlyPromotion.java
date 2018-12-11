/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintainproduct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Brendan Voon Yoong
 */
public class MonthlyPromotion {
    
    public static List<product> productList = new LinkedList<>(); 

    public static boolean a = false;



    public static void main(String[] args) {
        product product1 = new product(1,"Flesh Flower","Rose", 75.50, 8, "No", "In Stock");
        product product2 = new product(2,"Flesh Flower","Sunflower", 50.50, 10, "Yes", "Out of Stock");
        product product3 = new product(3,"Dry Flower","Sunflower", 20.50, 10, "No", "In Stock");
        productList.add(product1);
        productList.add(product2); 
        productList.add(product3);
        menu();
    }

    public static void menu(){

        Scanner s = new Scanner(System.in);

        int option;
        int count = 0;
        do{
            if(count>=1){
                System.out.println("Wrong number entered!");
            }


       // int option;
//        do{

            System.out.println("Menu: ");
            System.out.println("1.View Catalogue");
            System.out.println("2.Add Item");
            System.out.println("3.Update Stock or Promotion");
            System.out.println("4.Update Product Information");
            System.out.println("5.Exit");
            System.out.println("Please Enter your choice : ");
            option = s.nextInt();
            if(option == 1){
                showProductList();
                a = true;
            }else if(option == 2){
                addProduct();
                a = true;
            }else if(option == 3){
                updateStock();
                a = true;
            }else if(option == 4){
                updateInfo();
                a = true;
            }else if(option == 5){
                System.exit(0);
            }
            count++;
        }while(a!=true);

            System.out.println("Please Enter your choice : ");
            option = s.nextInt();
            if(option == 1){
                showList();
                menu();
            }else if(option == 2){
                addProduct();
                menu();
            }else if(option == 3){
                updateStock();
                menu();
            }else if(option == 4){
                updateInfo();
                menu();
            }
//        }while(option>=1||option<=3);

    }
    
    public static void addProduct(){
        product products = new product();
        Scanner s = new Scanner(System.in);

        int count = 0;
        int choice = 0;
        
        System.out.print("Product ID:");
        products.setProductId(productList.size()+1);
        System.out.println(products.getProductId());
        System.out.println("Enter Product Type: ");
        products.setProductType(s.nextLine());
        System.out.println("Enter new item name: ");
        products.setName(s.nextLine());
        System.out.println("Enter price: ");
        products.setPrice(s.nextDouble());
        System.out.println("Enter quantity:");
        products.setQuantity(s.nextInt());
        System.out.println("Promotion:");
        products.setPromo(s.next());
        System.out.println("\n");
        productList.add(products);
        
        System.out.println("New item successfully added!\n");
        System.out.println("New list");
        
        showList();
        while(a!=true){
                    if(count>=1){
                        System.out.println("Wrong number entered!");
                    }
                    System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option e.g. 2 to exit");
                    choice = s.nextInt(); 
                    if(choice==1){
                        menu();
                        a = true;
                    }else if(choice==2){
                        System.exit(0);
                    }
                    count++;
                }
        

        
        System.out.print("Product ID:");
        products.setProductId(productList.size()+1);
        System.out.print("Enter new Product Type: ");
        products.setProductType(s.nextLine());
        System.out.print("Enter new item name: ");
        products.setName(s.nextLine());
        System.out.print("Enter price: ");
        products.setPrice(s.nextInt());
        System.out.print("Enter quantity: ");
        products.setQuantity(s.nextInt());
        System.out.print("Promotion: ");
        products.setPromo(s.nextLine());
        
        productList.add(products);
        
        showList();   

    }
    
    
    public static void updateStock(){
        int choice =0;
        String promotion;

        int count =0;
        showList();
        System.out.println("Select item by number to update stock or promotion: e.g. 1 for Roses. 0 return to main menu");
        Scanner b = new Scanner(System.in);
        choice = b.nextInt();
        promotion = b.nextLine();
        boolean checking =false;
        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getProductId() == choice){
                System.out.println("Enter quantity");
                Scanner stock = new Scanner(System.in);
                int newQ = stock.nextInt();
                productList.get(i).setQuantity(newQ);
                
                System.out.println("Promotion");
                Scanner promo = new Scanner(System.in);
                String newP = promo.nextLine();
                productList.get(i).setPromo(newP);
                System.out.println("Stock and promotion have been updated!\n");
                checking = true;
//                do{
                while(a!=true){
                    if(count>=1){
                        System.out.println("Wrong number entered!");
                    }
                    System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option e.g. 2 to exit");
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
//                }while(a!=true);
                
            }else if(choice ==0){
                menu();
            }
    }
        if(checking!= true){
            do{
                System.out.println("Invalid item\n");
                System.out.println("1.Return to Main Menu");
                System.out.println("2.Exit");
                System.out.println("Please choose an option e.g. 2 to exit");
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

        showList();
                System.out.println("Select item by number to update stock or promotion:");
                Scanner a = new Scanner(System.in);
                choice = a.nextInt();
                if(choice==1){
                    System.out.println("Enter quantity");
                    Scanner stock = new Scanner(System.in);
                    int newQ = stock.nextInt();
                    productList.get(0).setQuantity(newQ);
                    showList();
                    
                    System.out.println("Promotion");
                    Scanner promo = new Scanner(System.in);
                    String newP = promo.nextLine();
                    productList.get(0).setPromo(newP);
                    showList();

                }else if(choice==2){
                    System.out.println("Enter quantity");
                    productList.get(1).setQuantity(a.nextInt());
                   showList();
                   
                   System.out.println("Promotion");
                    productList.get(1).setPromo(a.nextLine());
                   showList();
                }

    }
    
    public static void updateInfo(){
        int choice =0;
        String name;

        int count =0;
        showInfoList();
        System.out.println("Select item by number to update Product Information: e.g. 1 for Roses. 0 return to main menu");
        Scanner d = new Scanner(System.in);
        choice = d.nextInt();
        name = d.nextLine();
        boolean checking =false;
        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getProductId() == choice){
                System.out.println("Enter New Name");
                Scanner proName = new Scanner(System.in);
                String newN = proName.nextLine();
                productList.get(i).setName(newN);
                
                System.out.println("Enter New ProductType");
                Scanner proType = new Scanner(System.in);
                String newT = proType.nextLine();
                productList.get(i).setProductType(newT);
                
                System.out.println("Enter New Price");
                Scanner prices = new Scanner(System.in);
                double newPrice = prices.nextDouble();
                productList.get(i).setPrice(newPrice);
                System.out.println("Information have been updated!\n");
                checking = true;
//                do{
                while(a!=true){
                    if(count>=1){
                        System.out.println("Wrong number entered!");
                    }
                    System.out.println("1.Return to Main Menu");
                    System.out.println("2.Exit");
                    System.out.println("Please choose an option e.g. 2 to exit");
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
//                }while(a!=true);
                
            }else if(choice ==0){
                menu();
            }
    }
        if(checking!= true){
            do{
                System.out.println("Invalid item\n");
                System.out.println("1.Return to Main Menu");
                System.out.println("2.Exit");
                System.out.println("Please choose an option e.g. 2 to exit");
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

        showInfoList();
                System.out.println("Select item by number to Product Information:");
                Scanner a = new Scanner(System.in);
                choice = a.nextInt();
                if(choice==1){
                    System.out.println("Enter Name");
                    Scanner proName = new Scanner(System.in);
                    String newN = proName.nextLine();
                    productList.get(0).setName(newN);
                    showList();
                    
                    System.out.println("Product Type");
                    Scanner proType = new Scanner(System.in);
                    String newT = proType.nextLine();
                    productList.get(0).setProductType(newT);
                    showList();
                    
                    System.out.println("Price");
                    Scanner prices = new Scanner(System.in);
                    double newPrice = prices.nextDouble();
                    productList.get(0).setPrice(newPrice);
                    showList();

                }else if(choice==2){
                    System.out.println("Enter Name");
                    productList.get(1).setName(a.nextLine());
                   showList();
                   
                   System.out.println("Product Type");
                    productList.get(1).setProductType(a.nextLine());
                   showList();
                   
                   System.out.println("Price");
                    productList.get(1).setPrice(a.nextDouble());
                   showList();
                }

    }
    
    public static void showList(){
        System.out.println("No. Item\t\t" + "Product Type\t\t" + "Quantity\t\t" + "Promotion");
        System.out.println("=========================================================================");
            for(int i =0; i<productList.size(); i++){

                System.out.printf("%-3d %-8s \t\t %-10s \t\t %8d \t\t %-5s \n", i+1, productList.get(i).getName(), productList.get(i).getProductType(), productList.get(i).getQuantity(), productList.get(i).getPromo());
            }
        
    }
    
    public static void showInfoList(){
        System.out.println("No. Item\t\t" + "Product Type\t\t" + "Price");
        System.out.println("=========================================================================");
            for(int i =0; i<productList.size(); i++){

                System.out.printf("%-3d %-8s \t\t %-10s \t\t %.2f\n", i+1, productList.get(i).getName(), productList.get(i).getProductType(), productList.get(i).getPrice());
            }
        
    }
    
    public static void showProductList(){
        //do{
        int count = 0;
        
        System.out.println("No. Item\t" + "  ProductType\t\t" + "  Name\t\t" + "  Price\t\t" + "Quantity\t\t" + "Promotion");
        System.out.println("================================================================================================================");
            for(int i =0; i<productList.size(); i++){
                System.out.printf("%-3d \t\t %-10s \t\t %-10s \t RM%.2f %8d \t\t\t %-10s\n\n", i+1, productList.get(i).getProductType(), productList.get(i).getName(), productList.get(i).getPrice(), productList.get(i).getQuantity(), productList.get(i).getPromo());
            }
           
            while(a!=true){ 
                if(count>=1){
                System.out.println("Wrong number entered!");
            }
        System.out.println("1.Return to Main Menu");
        System.out.println("2.Exit");
        System.out.println("Please choose an option e.g. 2 to exit");
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
        

               // System.out.printf("%-3d %-8s \t\t %-2d \n", i+1, itemsList.get(i).getName(), itemsList.get(i).getQuantity());
            }

    }
