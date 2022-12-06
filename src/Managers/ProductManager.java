/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Product;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class ProductManager {
    private Scanner scanner;

    public ProductManager() {
        this.scanner = new Scanner(System.in);
    }

    public Product createProduct(){
        
        Product product = new Product();
        System.out.println("Name");
        product.setName(scanner.nextLine());
        System.out.println("Cost");
        product.setCost(scanner.nextInt());
        System.out.println("Quantity");
        product.setQuantity(scanner.nextInt());
        return product;
    }
    public void printListProducts(Product[]products){    
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf("Name %s%n", product);
            System.out.printf("Cost %s%n", product);
            System.out.printf("Quantity %s%n", product);
                    }

    }
}

