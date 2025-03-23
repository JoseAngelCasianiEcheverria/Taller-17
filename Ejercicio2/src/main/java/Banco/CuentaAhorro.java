/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Gercray
 */
public class CuentaAhorro extends CuentasBancarias{
    private double saldo;

    public CuentaAhorro(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void mostrarsaldo() {
        System.out.println("Su saldo es de: " + saldo);
    }
    
    
}
