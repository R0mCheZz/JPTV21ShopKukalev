/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    private Scanner scanner;

    public CustomerManager() {
        this.scanner = new Scanner(System.in);

    }
    public Customer createCustomer(){
        
        Customer customer = new Customer();
        System.out.println("Name");
        customer.setFirstname(scanner.nextLine());
        System.out.println("Lastname");
        customer.setLastname(scanner.nextLine());
        System.out.println("Wallet");
        customer.setWallet(scanner.nextInt());
        return customer;
    }  
    public void printListCustomers(Customer[]customers){
        for (int j = 0; j < customers.length; j++) {
            System.out.printf("Name %s%n", customers[j].getFirstname());
            System.out.printf("Lastname %s%n", customers[j].getLastname());
            System.out.printf("Wallet %s%n", customers[j].getWallet());
        }
    }
}
