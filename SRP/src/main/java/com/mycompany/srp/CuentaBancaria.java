/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srp;

/**
 *
 * @author CltControl
 */
public class CuentaAhorros{
    String numeroCuenta;
    double balance;
    
    
//    https://www.youtube.com/watch?v=n-JDQu2qi4o
    public CuentaBancaria(String numeroCuenta,double balance){
        this.numeroCuenta=numeroCuenta;
        this.balance=balance;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getBalance(){
        return balance;
    }
    
//    public double calculateIntereset(){
//        return 0.0;
//    }
    
}
