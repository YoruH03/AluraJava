/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Yuri
 */
public class Polimorfismo {
    
    public static void main(String[] args){
        
   
    //List<Integer> lista = new LinkedList();
    List<Integer> lista = new ArrayList();

    
    lista.add(1);
    lista.add(6);
    lista.add(10);
    lista.add(8);
    lista.add(2);
    lista.add(20);
    
    for(int i : lista){
        System.out.println(i);
    }
    
        System.out.println("Lista polimorfica");
        List<String> listaPolimorfica;
        
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("1");
        listaPolimorfica.add("12");
        System.out.println("ArrayList: "+listaPolimorfica);
        
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("El");
        listaPolimorfica.add("Cuzco");
        System.out.println("LinkedList: "+listaPolimorfica);
        
    
    
    } 
}
