/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica;

/**
 *
 * @author Yuri
 */
public class ProdutoPerecivel extends ProdutoCadastro{
    private String dataValidade;
    
    public ProdutoPerecivel(String nome,double preco,int quantidade,String dataValidade){
        super(nome,preco,quantidade);
        this.dataValidade = dataValidade;
        
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += " Validade: "+this.getDataValidade();
        return resultado;
    }
    
}
