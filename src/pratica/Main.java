/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica;

import java.util.ArrayList;

/**
 *
 * @author Yuri
 */
public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Alberto",15);
        Pessoa pessoa2 = new Pessoa("Claudio",27);
        Pessoa pessoa3 = new Pessoa("Kleber",19);
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        
        System.out.println("imprimindo lista de pessoas...");
        
        
        ArrayList<Pessoa> listaPessoas = new ArrayList();
        
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        
        System.out.println(listaPessoas.toString());
        System.out.println(listaPessoas.size());
        System.out.println(listaPessoas.get(0).toString());
    }
    
}
