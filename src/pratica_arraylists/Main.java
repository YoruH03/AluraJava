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
public class Main {
    public static void main(String[] args){
        ArrayList<Produto> listaProdutos = new ArrayList();
        
        Produto produto1 = new Produto("Maçã",2);
        Produto produto2 = new Produto("Pera",5);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        
        double soma = 0;
        double media = 0;
        for(Produto item: listaProdutos){
            soma+= item.getPreco();
            
        }
        media = soma/listaProdutos.size();
        System.out.println(media);
        
        
        
    }
}
