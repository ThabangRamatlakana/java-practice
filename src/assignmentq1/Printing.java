/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentq1;

/**
 *
 * @author Thabang
 */
public class Printing 
{
    
   private CustomerPurchase customerPurchases;
   
   public Printing(CustomerPurchase customerPurchases) 
   {
       this.customerPurchases = customerPurchases;
   }
   public void PrintDetails() 
   {
     System.out.println("CUSTOMER INVOICE");
     System.out.println("***************************");
     System.out.println("CUSTOMER NUMBER: " + this.customerPurchases.getCustomerNumber());
     System.out.println("CUSTOMER FIRST NAME: " + this.customerPurchases.getFirstName());
     System.out.println("CUSTOMER SURNAME: " + this.customerPurchases.getSurname());
     System.out.println("PRODUCT PRICE: R " + String.format("%.2f", this.customerPurchases.getPrice()));
     System.out.println("PRODUCT QUANTITY: " + this.customerPurchases.getQuantity());
     System.out.println("***************************");
	
   } 
   
   public void CustomerPurchaseReport() 
   {
	double productPrice = this.customerPurchases.getQuantity() * this.customerPurchases.getPrice();
	double tax=0.15*productPrice;
	double commission=0.085*productPrice;
	double discount=0.1*productPrice;
	double total=(productPrice + tax) - (discount + commission);
	System.out.println("\nCUSTOMER PURCHASE REPORT");
	System.out.println("***************************");
	System.out.println("PRODUCT PRICE: R " + String.format("%.2f", productPrice));
	System.out.println("TAX (15%): R " + String.format("%.2f", tax));
	System.out.println("COMMISSION (8.5% ): R " + String.format("%.2f", commission));
	System.out.println("DISCOUNT (10% ): R " + String.format("%.2f", discount));
	System.out.println("TOTAL: R " + String.format("%.2f", total));
	System.out.println("***************************");
    }
}

