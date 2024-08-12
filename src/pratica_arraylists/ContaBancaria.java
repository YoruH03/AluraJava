/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica_arraylists;

import java.util.ArrayList;

/**
 *
 * @author Yuri
 */
public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1,200);
        ContaBancaria conta2 = new ContaBancaria(2,400);
        ContaBancaria conta3 = new ContaBancaria(3,300);
        ArrayList<ContaBancaria> listaContas = new ArrayList();
        
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        
        int i = 0;
        int index_save = 0;
        double saldo_save = 0;
        double saldo_aux;
        /*
        for(ContaBancaria konta : listaContas){
            saldo_aux = konta.getSaldo();
            if(saldo_aux>saldo_save){
                saldo_save = saldo_aux;
                index_save = i;
                
            }
            i+=1;
        }
        System.out.println("A conta que teve o maior saldo é a conta de Id: "+index_save);
        System.out.println("O saldo dela é: "+saldo_save);
*/
        for(ContaBancaria konta: listaContas){
            System.out.println("---------Nova Conta ----------");
            System.out.println("Número da conta: "+konta.getNumeroConta());
            System.out.println("Saldo da conta: "+konta.getSaldo());
        }
    }
    
    
    
}
