package ex_16;

import java.util.Scanner;

public class Banco {
    static final int CAPACIDADE = 100;
    static int qtdeContas = 0;
    static Conta[] vetContas = new Conta[CAPACIDADE];

    public static void adcConta() {
        System.out.println("");
        Scanner scn = new Scanner(System.in);

        System.out.print("Qtde de Contas a serem adicionadas: ");
        int qtdeAdc = scn.nextInt();
        System.out.println("");

        scn.nextLine();

        for(int i = 0; i < qtdeAdc; i++) {
            if(qtdeContas < CAPACIDADE) {
                System.out.println("CONTA " + (i + 1));
                System.out.print("Títular: ");
                String titular = scn.nextLine();
                System.out.print("Número Conta: ");
                String numero = scn.nextLine();
                System.out.print("Saldo: R$ ");
                double saldo = scn.nextDouble();
                scn.nextLine();

                vetContas[qtdeContas] = new Conta(titular, numero, saldo);
                System.out.println("");
                qtdeContas++;
            } else {
                System.out.println("Não é possível adicionar mais livros. Capacidade máxima atingida.");
            }

        }
    }

    public static void depositar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----- DEPÓSITO -----");
        System.out.print("Número Conta: ");
        String contaEscolhida = scn.nextLine();

        boolean contaEncontrada = false;

        for(int i=0; i < qtdeContas; i++) {
            if(vetContas[i].getNumero().equals(contaEscolhida)) {
                System.out.println("Titular: " + vetContas[i].getTitular());
                System.out.println("Número Conta: " + vetContas[i].getNumero());
                System.out.println("Saldo Atual: R$ " + vetContas[i].getSaldo());
                System.out.print("VALOR DO DEPÓSITO: R$ ");
                vetContas[i].setSaldo((vetContas[i].getSaldo() + scn.nextDouble()));
                contaEncontrada = true;
                break;
            }
        }

        if(!contaEncontrada) {
            System.out.println("Número de Conta não encontrado. Tente novamente.");
        }
    }

    public static void sacar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----- SAQUE -----");
        System.out.print("Número Conta: ");
        String contaEscolhida = scn.nextLine();

        boolean contaEncontrada = false;

        for(int i=0; i < qtdeContas; i++) {
            if(vetContas[i].getNumero().equals(contaEscolhida)) {
                System.out.println("Titular: " + vetContas[i].getTitular());
                System.out.println("Número Conta: " + vetContas[i].getNumero());
                System.out.println("Saldo Atual: R$ " + vetContas[i].getSaldo());
                System.out.print("VALOR DO SAQUE: R$ ");
                vetContas[i].setSaldo(vetContas[i].getSaldo() - scn.nextDouble());
                contaEncontrada = true;
                break;
            }
        }

        if(!contaEncontrada) {
            System.out.println("Número de Conta não encontrado. Tente novamente.");
        }
    }

    public static void transferir() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----- TRANSFERÊNCIA -----");
        System.out.print("Número Conta 1 (origem): ");
        String contaEscolhida1 = scn.nextLine();
        System.out.print("Número Conta 2 (destino): ");
        String contaEscolhida2 = scn.nextLine();

        Conta contaOrigem = null;
        Conta contaDestino = null;

        for(int i = 0; i < qtdeContas; i++) {
            if (vetContas[i].getNumero().equals(contaEscolhida1)) {
                contaOrigem = vetContas[i];
            }
            if (vetContas[i].getNumero().equals(contaEscolhida2)) {
                contaDestino = vetContas[i];
            }
        }

        if (contaOrigem != null && contaDestino != null) {
            System.out.print("VALOR DA TRANSFERÊNCIA: R$ ");
            double valTransf = scn.nextDouble();

            if (contaOrigem.getSaldo() >= valTransf) {
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valTransf);
                contaDestino.setSaldo(contaDestino.getSaldo() + valTransf);
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente na conta de origem.");
            }
        } else {
            System.out.println("Alguma das contas não existe. Verifique os números de conta informados.");
        }
    }

    public static void listarContas(){
        System.out.println("");
        System.out.println("LISTAGEM DE CONTAS");
        for(int i = 0; i < qtdeContas; i++) {
            System.out.println(vetContas[i].toString());
        }
        System.out.println("");
    }



}
