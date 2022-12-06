/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Customer;
import entity.Purchase;
import entity.Product;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author mrALE
 */
public class PurchaseManager {

    private CustomerManager customerManager;
    private PurchaseManager purchaseManager;
    private final ProductManager productManager;
    private final Scanner scanner = new Scanner(System.in);
    
    public PurchaseManager(){
       
        productManager = new ProductManager();
        purchaseManager = new PurchaseManager();
        customerManager = new CustomerManager();
    }
    public Purchase doPurchase(Product[] products, Customer[] customers){
        /*
        
        вывести покупателей,
        Выбрать покупателя,который хочет купить товар,
        Вывести список товаров,
        выбрпть товар
        оформить покупку
        
        */
        System.out.print("Do you want to buy a product? (Y/N): ");
        String choose = scanner.nextLine();
        Purchase purchase = new Purchase();
        System.out.println("------------------------------------");
        if(choose.equals("Y")){
//            productManager.createProduct(customers);
            System.out.println("List Customers: ");
            customerManager.printListCustomers(customers);
            System.out.println("Who wanna buy a product,choose a number?: ");
            int numberCustomer = scanner.nextInt();
            System.out.println("__________List products________");
            productManager.printListProducts(products);
            System.out.println("Which product do you want to buy: ");
            int numberProduct = scanner.nextInt();
            System.out.println("How many product do you want: ");
            int quantity = scanner.nextInt();
            customers[numberCustomer-1].setWallet((customers[numberCustomer-1].getWallet()-(products[numberProduct-1].getCost()*quantity)));
            products[numberProduct-1].setQuantity((products[numberProduct-1].getQuantity()-quantity));
         
            System.out.println("________________________________________");
            customers[numberCustomer-1].setWallet(customers[numberCustomer-1].getWallet()-products[numberProduct-1].getCost()*quantity);
            products[numberProduct-1].setQuantity(products.length-1);
            purchase.setProduct(products[numberProduct-1]);
            purchase.setCustomer(customers[numberCustomer-1]);
            purchase.setDate(new GregorianCalendar().getTime());
            purchase.setQuantity(quantity);
        }
        return purchase;
    }

   

    public int getProfite(Purchase[] puchases) { 
        int sum = 0;
        for (int i = 0; i < puchases.length; i++) {
            Purchase purchase = puchases[i];
            sum = sum + purchase.getProduct().getCost()*purchase.getQuantity();
            
        }
       return sum;
    }
    
}