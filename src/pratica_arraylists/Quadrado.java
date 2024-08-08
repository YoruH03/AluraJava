/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_arraylists;

/**
 *
 * @author Yuri
 */
public class Quadrado implements Forma{
    
    public double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
    
    
}
