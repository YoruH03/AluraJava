/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

/**
 *
 * @author Yuri
 */
public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public Musica() {
    }

    public Musica(String titulo, double duracao, int totalReproducoes, int curtidas, int classificacao) {
        super(titulo, duracao, totalReproducoes, curtidas, classificacao);
    }
    
    
    

    public Musica(String album, String cantor, String genero, String titulo, double duracao, int totalReproducoes, int curtidas, int classificacao) {
        super(titulo, duracao, totalReproducoes, curtidas, classificacao);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    
    
    
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getClassificacao(){
        if(super.getTotalReproducoes()>200){
            //System.out.println(super.getTotalReproducoes());
            return 10;
        }else{
            return 7;
        }
    }
    
    
    
}
