/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Yuri
 */
public class Titulo implements Comparable<Titulo> {
    public String nome;
    
    @Override
    public int compareTo(Titulo outroTitulo){
        return this.nome.compareTo(outroTitulo.nome);
    }

    public Titulo(String nome) {
        this.nome = nome;
    }
    
    
    
    public static void main(String[] args){
        List<Titulo> listaTitulos = new LinkedList<>();
        listaTitulos.add(new Titulo("Senhor dos Anéis"));
        listaTitulos.add(new Titulo("Hobbit"));
        listaTitulos.add(new Titulo("As crônicas de Nárnia"));
        
        
        for(Titulo item : listaTitulos){
            System.out.println(item.nome);
        }
        
        Collections.sort(listaTitulos);
         for(Titulo item : listaTitulos){
            System.out.println(item.nome);
        }
    }
    
}
