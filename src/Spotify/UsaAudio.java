/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

import java.util.Set;

/**
 *
 * @author Yuri
 */
public class UsaAudio {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setAlbum("Kiss");
        
        for(int i=0;i<1000;i+=1){
            minhaMusica.reproduz();
        }
        for(int i=0;i<50;i+=1){
            minhaMusica.curte();
        }
        
        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("DevBubble");
        meuPodcast.setApresentador("kakarotto");
        
        for(int i=0;i<5000;i+=1){
            meuPodcast.reproduz();
        }
        for(int i=0;i<100;i+=1){
            meuPodcast.curte();
        }
        
        minhaMusica.getClassificacao();
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
        
        
        
        
        
    }
    
}
