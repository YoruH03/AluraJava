/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_arraylists;

import java.util.ArrayList;

/**
 *
 * @author Yuri
 */
public class formasMain {
    public static void main(String[] args){
        Circulo circulo = new Circulo(2);
        Quadrado quadrado1 = new Quadrado(3);
        
        ArrayList<Forma> listaFormas = new ArrayList();
        listaFormas.add(circulo);
        listaFormas.add(quadrado1);
        double area=0;
        for(Forma forma : listaFormas){
            area += forma.calcularArea();
            System.out.println("A área é: "+forma.calcularArea());
        }
        
        
        
        
    }
}
