/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class Customize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        
        double totalprice = 0.0;
  
        
        List FlowerList = new ArrayList<>();
        //ArrayList<FlowerCatalog> flowerList = new ArrayList<>();
        FlowerCatalog f1 = new FlowerCatalog ("Rose \t\t \t     ",  7.00);
        FlowerCatalog f2 = new FlowerCatalog("Baby Breath                ",  8.50);
        FlowerCatalog f3 = new FlowerCatalog("Sunflower  \t\t     ",  12.80);
        
        List FArrangementList = new ArrayList<>();
        //ArrayList<FlowerArrangement> farrangementList = new ArrayList<>();
        FlowerArrangement fa1 = new FlowerArrangement ("Bouquets \t\t     ",  8.00);
        FlowerArrangement fa2 = new FlowerArrangement("Table Centrepieces         ",  9.50);
        FlowerArrangement fa3 = new FlowerArrangement("Wreaths  \t\t     ",  15.80);
  
        List FSizeList = new ArrayList<>();
        FlowerSize fs1 = new FlowerSize ("Large\t\t     ",  18.00);
        FlowerSize fs2 = new FlowerSize("Medium             ", 11.50);
        FlowerSize fs3 = new FlowerSize("Small  \t     ",  8.80);
        
        List FAccesoriesList = new ArrayList<>();
        FlowerAcssories faccs1 = new FlowerAcssories ("Shiny Jeweled Stars\t\t     ",  8.00);
        FlowerAcssories faccs2 = new FlowerAcssories("Premium Owl Feathers               ", 10.50);
        FlowerAcssories faccs3 = new FlowerAcssories("Butterfly painted Fabric  \t     ",  9.80);
        
        List FPriorityList = new ArrayList<>();
        FlowerPriority fp1 = new FlowerPriority ("Express\t      ",  15.00);
        FlowerPriority fp2 = new FlowerPriority("Normal              ", 10.00);
        FlowerPriority fp3 = new FlowerPriority("Flexible  \t      ",  5.00);
        
        
        Stack<Integer> customList = new Stack<>();
        Customer currentCust = new Customer();
        currentCust.setName("Madelynn");
        
        int choice;
        int choice1 = 0;
        boolean valid = false;
        
        //1st Step
do{
                System.out.println("===============================================\n"
                + "Step One: Select flower arrangement style. \n"
                + "=============================================== \n"
                + "1."+fa1+"\n"
                + "2."+fa2+"\n"
                + "3."+fa3+"\n"
                +"Please make your choices :");
        choice = scan.nextInt();
        if(choice==1 || choice==2 || choice==3){
            customList.add(choice);
            valid = true;
            
        }else{
                 System.out.println("===============================================\n"
                + "Step One: Select flower arrangement style. \n"
                + "=============================================== \n"
                + "1. Bouquets \n"
                + "2. Table Centrepieces \n"
                + "3. Wreaths \n"
                + "Please enter choices given.");
            choice = scan.nextInt();
            customList.add(choice);
        }
    }while(valid != true);
        
do{
        //2nd Step 
                System.out.println("************************************************\n"
                + "Step two: Select flower arrangment size. \n"
                + "************************************************\n"
                + "1."+fs1+"\n"
                + "2."+fs2+"\n"
                + "3."+fs3+"\n"
                 +"Please make your choices :");
        choice = scan.nextInt();
        if(choice==1 || choice==2 || choice==3){
            customList.add(choice);
            valid=true;
        }else{
                 System.out.println("************************************************\n"
                + "Step two: Select flower arrangment size. \n"
                + "************************************************\n"
                + "1. Large \n"
                + "2. Medium \n"
                + "3. Small \n"
                + "Please enter choices given.");
            choice = scan.nextInt();
            customList.add(choice);
        }
   }while(valid != true);
            
        //3rd Step 
          int count1 = 0;
        while(choice!=4){
            count1++;
        do{
                System.out.println("===============================================\n"
                + "Step three: Select flowers. \n"
                + "=============================================== \n"
                + "1." +f1 +"\n"
                + "2." +f2+"\n"
                + "3."+f3+"\n"
                 +"4. Exit, when selection is done.\n"
                +"Please make your choices :");
        choice = scan.nextInt();
        if(choice==1 || choice==2 || choice==3|| choice==4){
            customList.add(choice);
            valid=true;
        }else{
                System.out.println("===============================================\n"
                + "Step three: Select flowers. \n"
                + "=============================================== \n"
                + "1. Rose \n"
                + "2. Baby Breath \n"
                + "3. Sunflower \n"
                +"4. Exit, when selection is done.\n"
                + "Please enter choices given.");
            choice = scan.nextInt();
            customList.add(choice);
        }
           }while(valid != true);
        }
        
        //Step 4
          int count2 = 0;
        while(choice1!=4){
            count2++;
            do{
             System.out.println("************************************************\n"
                + "Step four: Select accessories. \n"
                + "************************************************\n"    
                + "1."+faccs1+"\n"
                + "2."+faccs2+"\n"
                + "3."+faccs3+"\n"
                +"4. Exit, when selection is done.\n"
                +"Please make your choices :");
        choice1 = scan.nextInt();
        if(choice1==1 || choice1==2 || choice1==3 || choice1==4){
            customList.add(choice1);
            valid = true;
        }else{
                System.out.println("************************************************\n"
                + "Step four: Select accessories. \n"
                + "************************************************\n"    
                + "1. Shiny Jeweled Stars \n"
                + "2. Premium Owl Feathers \n"
                + "3. Butterfly painted Fabric \n"
                +"4. Exit, when selection is done.\n"
                + "Please enter choices given.");
            choice1 = scan.nextInt();
            customList.add(choice1);
        }    
                    }while(valid != true);
        }
        

        currentCust.setCustomList(customList);

        
        do{
        System.out.println("##################################################\n"
                + "Select your priortity: \n"
                +"##################################################\n"
                + "1."+fp1+"\n"
                + "2."+fp2+"\n"
                + "3."+fp3+"\n"
                +"Please choose your priority :");
        choice = scan.nextInt();
        if(choice==1 || choice==2 || choice==3){
            customList.add(choice);
            valid = true;
        }else{
                 System.out.println("##################################################\n"
                + "Select your priortity: \n"
                +"##################################################\n"
                + "1."+fp1+"\n"
                + "2."+fp2+"\n"
                + "3."+fp3+"\n"
                + "Please enter priority given.");
            choice = scan.nextInt();
            customList.add(choice);
        }
                }while(valid != true);
        
    //    System.out.println(customList);
    
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n"
                + "\nCongratulations " + currentCust.name +
                ", your Custom Floral Arrangement has been saved. \n"
                +"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");

 //       Stack<Integer> show = currentCust.getCustomList();
        

        
     do{      
          System.out.println("===========================================================================\n"
                + "Do you want to print the Itemized Bill \n"
                +"===========================================================================\n"
                +"1. Yes\n"
                +"2.No, Exit \n"
                +"Please make your choices"  
          );
           choice = scan.nextInt();
        if(choice==1)
            valid = true;
        else if(choice==2)
            System.exit(0);
       else{
            System.out.println("===========================================================================\n"
                + "Do you want to print the Itemized Bill \n"
                +"===========================================================================\n"
                +"1.Yes\n"
                +"2.No\n"
                +"Please enter only the choices given."  
          );
        }
        
     } while(valid != true);
     
                    System.out.println("\n\n");
                     System.out.println("=========================================");
                    System.out.println("\t Itemized Bill");
                    System.out.println("==========================================");
     Stack<Integer> show = currentCust.getCustomList();
        
        if(show.firstElement() == 1){
            System.out.println("Your flower arrangement style choice is " +fa1.getFlowerArrange() + "." + "Price : " +fa1.getPriceFA());
            totalprice += fa1.getPriceFA();
            show.remove(0);
        }else if(show.firstElement()== 2){
            System.out.println("Your flower arrangement style choice is " +fa2.getFlowerArrange() + "." + "  Price : " +fa2.getPriceFA());
            totalprice += fa2.getPriceFA();
            show.remove(0);
        }else{
            System.out.println("Your flower arrangement style choice is" +fa3.getFlowerArrange() + "." + "Price : " +fa3.getPriceFA());
            totalprice += fa3.getPriceFA();
            show.remove(0);
        }
        
        if(show.firstElement() == 1){
            System.out.println("Your flower arrangment size is " +fs1.getFlowerSize() + "." + "                Price : " +fs1.getPriceFS());
            totalprice += fs1.getPriceFS();
            show.remove(0);
        }else if(show.firstElement()== 2){
            System.out.println("Your flower arrangment size is " +fs2.getFlowerSize() + "." + "                   Price : " +fs2.getPriceFS());
            totalprice += fs2.getPriceFS();
            show.remove(0);
        }else{
            System.out.println("Your flower arrangment size is " +fs3.getFlowerSize() + "." + "                        Price : " +fs3.getPriceFS());
            totalprice += fs3.getPriceFS();
            show.remove(0);
        }
        
        for(int i=0;i<count1;i++){
            if(show.firstElement() == 1){
                System.out.println("Your flower is " +f1.getFlowerName() + "." + "                        Price : " +f1.getPrice()); 
                totalprice += f1.getPrice();
                show.remove(0);
            }else if(show.firstElement()== 2){
                System.out.println("Your flower is " +f2.getFlowerName() + "." + "                           Price : " +f2.getPrice());
                totalprice += f2.getPrice();
                show.remove(0);
            }else if(show.firstElement()== 3){
                System.out.println("Your flower is " +f3.getFlowerName() + "." + "                        Price : " +f3.getPrice());
                totalprice += f3.getPrice();
                show.remove(0);
            }else if(show.firstElement()== 4){
                show.remove(0);
            }
        }
        
        for(int i=0;i<count2;i++){
            if(show.firstElement() == 1){
                System.out.println("Your accessories is " +faccs1.getFlowerAccesories() + "." + "\t\t      Price : " +faccs1.getFAccsPrice());
                totalprice += faccs1.getFAccsPrice();
                show.remove(0);
            }else if(show.firstElement()== 2){
                System.out.println("Your accessories is " +faccs2.getFlowerAccesories() + "." + "\t      Price : " +faccs2.getFAccsPrice());
                totalprice += faccs2.getFAccsPrice();
                show.remove(0);
            }else if(show.firstElement()== 3){
                System.out.println("Your accessories is " +faccs3.getFlowerAccesories() + "." + "\t\t      Price : " +faccs3.getFAccsPrice());
                totalprice += faccs3.getFAccsPrice();
                show.remove(0);
            }else if(show.firstElement()== 4){
                show.remove(0);
            }
        }
        
        if(show.firstElement() == 1){
            System.out.println("Your priority is " +fp1.getFlowerPriority() + "." + "\t\t\t\t      Price : " +fp1.getFPprice());
            totalprice += fp1.getFPprice();
            show.remove(0);
        }else if(show.firstElement()== 2){
            System.out.println("Your priority is " +fp2.getFlowerPriority() + "." + "\t\t\t\t      Price : " +fp2.getFPprice());
            totalprice += fp2.getFPprice();
            show.remove(0);
        }else{
            System.out.println("Your priority is " +fp3.getFlowerPriority() + "." + "\t\t\t\t      Price : " +fp3.getFPprice());
            totalprice += fp3.getFPprice();
            show.remove(0);
        }
      
                    System.out.println("\t\t\t\t\t\t         Total Price        : RM " + totalprice);   
                    System.out.println("\n");
                    System.out.println("Thank You ! " + currentCust.name);
                   }
                  
     }
    
    

