/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

/**
 *
 * @author Yuri
 */
public class MinhasPreferidas {

    public MinhasPreferidas() {
    }
    
    
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+"é considerado um sucesso absoluto e preferido por todos!");
        }else{
            System.out.println(audio.getTitulo()+"Também é um dos que todo mundo está curtindo!");
    }
    
}
}
