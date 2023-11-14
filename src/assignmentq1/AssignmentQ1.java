/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentq1;

import java.util.Scanner;

/**
 *
 * @author Thabang
 */
public class AssignmentQ1 
{

    
    public static void main(String[] args) 
    {
        
        String customerNumber;
        String firstName;
        int quantity;
        String product;
        double price;
        String surname;
        double userChoice;
        
       Scanner in = new Scanner(System.in);
	System.out.print("Enter the customer number: ");
	customerNumber = in.nextLine();
	System.out.print("Enter the customer first name: ");
	firstName = in.nextLine();
	System.out.print("Enter the customer surname: ");
	surname = in.nextLine();
	System.out.print("Enter the product: ");
	product = in.nextLine();
	System.out.print("Enter the product price: ");
	price = in.nextDouble();
	System.out.print("Enter the quantity: ");
	quantity = in.nextInt();
        
        
	CustomerPurchase customerPurchases = new CustomerPurchase();
        
	customerPurchases.setCustomerNumber(customerNumber);
	customerPurchases.setFirstName(firstName);
	customerPurchases.setSurname(surname);
	customerPurchases.setProduct(product);
	customerPurchases.setPrice(price);
	customerPurchases.setQuantity(quantity);


	Printing printing = new Printing(customerPurchases);
	printing.PrintDetails();
        
        System.out.println("Would you like to view the product purchase report? Enter (1) to view"
                + " the purchase report or any other key to exit");
        userChoice = in.nextInt();
        
        userChoice= 1;
        
        if (userChoice == 1)
        {
             printing.CustomerPurchaseReport();
        }
        else if ( userChoice != 1)
        {
            System.out.println("GOODBYE");
        }
           
        
        // Farrell, J. 2019. JAVA PROGRAMMING. 9th edition. Boston; Cengage
	

        
         
        
       
        
        
      
            


    }
    
}
