/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String name;
    private String cost;
    private String size;
    private String quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "shop{" 
                + "name=" + name 
                + ", cost=" + cost 
                + ", quantity=" + quantity 
                + '}';
    }
    
}

