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
class ProdutoCadastro {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoCadastro() {
    }

    
    public ProdutoCadastro(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.getNome()+" Preço: "+this.getPreco()+" Quantidade: "+this.getQuantidade();
    }
    
    
    
    
    
    
    
}
public class Produto{
    public static void main(String[] args){
        ArrayList listaProdutos = new ArrayList();

        ProdutoCadastro produto1 = new ProdutoCadastro();
        produto1.setNome("Farinha");
        ProdutoCadastro produto2 = new ProdutoCadastro();
        ProdutoCadastro produto3 = new ProdutoCadastro();
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        
        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(0).toString());
        System.out.println(listaProdutos.toString());
        ProdutoCadastro produto4 = new ProdutoCadastro("William",115,2);
        
        ProdutoPerecivel produto5 = new ProdutoPerecivel("Maçã",5,6,"08/10/222");
        System.out.println(produto5.toString());

        
        
    }

}

