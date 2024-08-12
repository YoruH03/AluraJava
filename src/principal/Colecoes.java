/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import java.util.*;

/**
 *
 * @author Yuri
 */
public class Colecoes {
    public static void main(String[] args){
        ArrayList<String> buscaPorArtista = new ArrayList();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);
        
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        
    }
    
}
