/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author Elivelton Cabral
 */
public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número da conta do cliente:");
        numero = ler.nextInt();
        ler.nextLine(); 
        System.out.println("Digite a agência:");
        agencia = ler.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = ler.nextLine();
        System.out.println("Digite o saldo do cliente:");
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
