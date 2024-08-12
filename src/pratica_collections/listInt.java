/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Yuri
 */
public class listInt {
    public static void main(String[] args){
        
 
    List<Integer> listaInteiros = new LinkedList();
    
    listaInteiros.add(1);
    listaInteiros.add(5);
    listaInteiros.add(3);
    listaInteiros.add(7);
    listaInteiros.add(6);
    
        System.out.println(listaInteiros);
    Collections.sort(listaInteiros);
        System.out.println(listaInteiros);
    
        
    
    
}
}
