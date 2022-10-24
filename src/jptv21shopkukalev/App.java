/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shopkukalev;

import entity.Product;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Product[] products;
    
    public App() {
        this.products = new Product[0];        
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
                    
                    break;
                case 3:
                    System.out.println("Задача 2. Добавить продукт");
                    this.products = Arrays.copyOf(this.products, this.products.lenght+1);
                    this.products[this.products.lenght-1] = products.createProduct();
                    break;
                case 4:
                    System.out.println("Задача 3. Список продаваемых продуктов");
                   
                    break;
                case 5:
                    System.out.println("Задача 4. Добавить покупателя");
                    
                    break;
                case 6:
                    System.out.println("Задача 5. Список зарегестрированных покупателей");
                   
                    break;
                case 7:
                    System.out.println("Задача 6. Покупка покупателем продукта");
                   
                    break;
                case 8:
                    System.out.println("Задача 7.  Доход магазина за все время работы");
                    
                    break;    
                case 9:
                    System.out.println("Задача 8. Добавить денег покупателю");
                default:
                    System.out.println("Выберите задачу из списка");
            }
        }while(repeat);
    }
}

