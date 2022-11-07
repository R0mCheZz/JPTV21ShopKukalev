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
public class Customer {
private String Firstname;
private String Lastname;
private int Wallet;

    public Customer() {
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getWallet() {
        return Wallet;
    }

    public void setWallet(int Wallet) {
        this.Wallet = Wallet;
    }

    @Override
    public String toString() {
        return "Customer{" + "Firstname=" 
                + Firstname + ", Lastname=" 
                + Lastname + ", Wallet=" + Wallet 
                + '}';
    }

}
