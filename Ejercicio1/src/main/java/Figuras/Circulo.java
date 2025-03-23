/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Gercray
 */
public class Circulo extends Figuras {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double CalculaArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
}
