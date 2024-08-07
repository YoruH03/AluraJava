/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Spotify;

/**
 *
 * @author Yuri
 */
public class Podcasts extends Audio{
    
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public int getClassificacao(){
        if(super.getCurtidas()>500){
            return 10;
        }else{
            return 8;
        }
        
    }
    
    
    
}
