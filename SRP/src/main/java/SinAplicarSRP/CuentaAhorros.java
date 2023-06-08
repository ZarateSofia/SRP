/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinAplicarSRP;

/**
 *
 * @author DELL
 */
public class CuentaAhorros {
    String numeroCuenta;
    double balance;
    
    
//  Adaptado del siguiente video: https://www.youtube.com/watch?v=n-JDQu2qi4o
    
    public CuentaAhorros(String numeroCuenta,double balance){
        this.numeroCuenta=numeroCuenta;
        this.balance=balance;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void depositar(int valor){
        //metodo para depositar
    }
    
    public double calculateIntereset(){
        //metodo para calculara interes
        return 0.0;
    }
}
