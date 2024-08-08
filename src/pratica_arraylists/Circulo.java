/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_arraylists;

/**
 *
 * @author Yuri
 */
public class Circulo implements Forma{
    
    public int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public Circulo() {
    }
    
    
    
    

    @Override
    public double calcularArea() {
        double resultado = (3.14516*(raio*raio));
        return resultado;
        
    }
    
    
}
