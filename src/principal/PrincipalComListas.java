/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Yuri
 */
public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("Big Boss",1970);
        Filme outroFilme = new Filme("Avatar",2023);
        var filmeDoPaulo = new Filme("Dogville",2003);
        Serie serie = new Serie("Lost",2000);
        
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(meuFilme);
        listaTitulos.add(outroFilme);
        listaTitulos.add(filmeDoPaulo);
        listaTitulos.add(serie);
        
        
        /*
        for(Titulo item: listaTitulos){
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
            //Filme filme = (Filme) item;//Isso afirma que o próximo item será um Filme
            System.out.println("Classificação: "+filme.getClassificacao());    
            }
            
        }
        //listaTitulos.forEach(nome->System.out.println(nome));
        */
        for(Titulo item: listaTitulos){
                System.out.println(item.toString());
        }
        System.out.println("Antes da ordenação");
        System.out.println(listaTitulos.toString());
        Collections.sort(listaTitulos);
        System.out.println("Depois da comparação");
        System.out.println(listaTitulos.toString());
        
        listaTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano...");
        System.out.println(listaTitulos);
        
        
    }
    
}
