/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shopkukalev;

import Managers.CustomerManager;
import entity.Customer;
import Managers.ProductManager;
import Managers.PurchaseManager;
import entity.Product;
import entity.Purchase;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author pupil
 */
public class App {
    private Product[] products;
    private Customer[] customers;
    private Purchase [] purchases;
    private PurchaseManager purchareManager;
    private ProductManager productManager;
    private CustomerManager customerManager;
    
    public App() {
        products = new Product[0];
        customers = new Customer[0];
        purchases = new Purchase [0];
        productManager = new ProductManager();
        customerManager = new CustomerManager();
       
    }
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        OUTER:
        do{
            System.out.println("Список задач:");
            System.out.println("1. Закрыть приложение");
            System.out.println("2. Добавить продукт");
            System.out.println("3. Список продаваемых продуктов");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список зарегестрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Доход магазина за все время работы");
            System.out.println("8. Добавить денег покупателю");
            System.out.println("Выберите номер задачи:");
            int task = scanner.nextInt();
            System.out.println("================");
            switch(task){
                 case 1:
                    repeat = false;
                    System.out.println("Задача 1. Закрыть приложение");
                    break OUTER;
                case 2:
                    System.out.println("Задача 2. Добавить продукт");
                    ProductManager sm = new ProductManager();
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = sm.createProduct();
                    break;
                case 3:
                    System.out.println("Задача 3. Список продаваемых продуктов");
                    for (int i = 0; i < products.length; i++) {
                        Product product = products[i];
                        System.out.printf("Name %s%n", product);
                        System.out.printf("Cost %s%n", product);
                        System.out.printf("Quantity %s%n", product);
                                }
                    break;
                case 4:
                    System.out.println("Задача 4. Добавить покупателя");
                    CustomerManager cm = new CustomerManager();
                    this.customers = Arrays.copyOf(this.customers, this.customers.length+1);
                    this.customers[this.customers.length-1] = cm.createCustomer();
                    break;
                case 5:
                    System.out.println("Задача 5. Список зарегестрированных покупателей");
                    for (int j = 0; j < customers.length; j++) {
                        System.out.printf("Name %s%n", customers[j].getFirstname());
                        System.out.printf("Lastname %s%n", customers[j].getLastname());
                        System.out.printf("Wallet %s%n", customers[j].getWallet());
                                }
                    break;
                case 6:
                    System.out.println("Задача 6. Покупка покупателем продукта");
                    System.out.println("Товар: ");
                    purchareManager.doBuyProduct();
                    for(int i = 0; i < products.length; i++){
                        System.out.println(i+1);
                        
                    }
                    int bought = scanner.nextInt();
                    System.out.println("Покупатель: ");
                    for(int j = 0; j < customers.length; j++){
                        System.out.println(j+1);
                    }
                    int bought2 = scanner.nextInt();
                    int purchase = customers[bought-1].getWallet() -products[bought2 -1].getCost();
                    customers[bought2 -1].setWallet(purchase);
                    this.history = Arrays.copyOf(this.history,this.history.length+1);
                    this.history[this.history.length -1] = products[bought2 -1].getCost();
                    break;
                case 7:
                    System.out.println("Задача 7.  Доход магазина за все время работы");
                   int sum = IntStream.of(history).sum();
                    System.out.println("Доход магазина за все покупки: "+sum);
                    
                    break;
                case 8:
                    System.out.println("Задача 8. Добавить денег покупателю");
                    System.out.println("Выберите покупателя:");
                    System.out.println("Покупатели: ");
                    for(int j = 0; j < customers.length; j++){
                        System.out.println(j+1);
                    }
                    int choise1 = scanner.nextInt();
                    System.out.println("Введите сумму,которую получит покупатель: ");
                    int givecustomermoney = scanner.nextInt();
                    int givemoney = customers[choise1-1].getWallet()+ givecustomermoney;
                    customers[choise1-1].setWallet(givemoney);
                    break;    
                default:
                    System.out.println("Выберите задачу из списка");
            }
        }while(repeat);
    }
}

