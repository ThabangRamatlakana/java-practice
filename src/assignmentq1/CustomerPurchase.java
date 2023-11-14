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
public class CustomerPurchase 
{
    private String customerNumber;
    private String firstName;
    private String surname;
    private String product;
    private double price;
    private int quantity;

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
