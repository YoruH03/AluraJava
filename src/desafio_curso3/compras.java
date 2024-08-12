/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_curso3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

/**
 * @author Yuri
 */

class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean desconta(double saldo) {
        if (this.getLimite() >= saldo) {
            setLimite(this.getLimite() - saldo);
            return true;
        } else {
            return false;
        }
    }
}

public class compras{
    private double saldo;
    private String nome;

    public compras() {
    }

    public compras(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /*@Override
    public int compareTo(compras o) {
        return Double.compare(this.saldo, o.getSaldo());
    }*/

    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha pendente
        
        Cartao cartao = new Cartao(limite);
        List<compras> listaCompras = new ArrayList<>();

        while (n != 0) {
            System.out.println("Digite a descrição da compra:");
            String pedido = scanner.nextLine();
            
            System.out.println("Digite o valor da compra:");
            double custo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha pendente
            
            compras compra = new compras(custo, pedido);
            boolean tentativaCompra = cartao.desconta(compra.getSaldo());
            
            if (tentativaCompra) {
                listaCompras.add(compra);
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }

            System.out.println("Digite 0 para sair ou 1 para continuar:");
            n = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente
        }

        System.out.println("COMPRAS REALIZADAS:");
        //Collector.sort(listaCompras);
        for (compras item : listaCompras) {
            System.out.println(item.getNome() + " - " + item.getSaldo());
        }
    }
}

