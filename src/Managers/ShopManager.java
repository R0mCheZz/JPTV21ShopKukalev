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
public class ShopManager {
    private Scanner scanner;

    public ShopManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Product createProduct(){
        Product product = new Product();
        System.out.println("Cost");
        product.setCost(scanner.nextLine());
        System.out.println("Quantity");
        product.setQuantity(scanner.nextLine());
        return product;
    }


}

