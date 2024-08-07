/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

/**
 *
 * @author Yuri
 */
abstract class Audio {
    protected String titulo;
    protected double duracao;
    protected int totalReproducoes;
    protected int curtidas;
    protected int classificacao;

    public Audio() {
    }
    
    
    

    public Audio(String titulo, double duracao, int totalReproducoes, int curtidas, int classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducoes = totalReproducoes;
        this.curtidas = curtidas;
        this.classificacao = classificacao;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    public void curte(){
        this.curtidas+=1;
    }
    public void reproduz(){
        this.totalReproducoes+=1;
    }
    
    
    
    
    
    
    
}
