/* Crie um sistema de gerenciamento de contas bancárias. Para isso, crie as classes Conta
e Banco. A classe Conta deve ter os atributos numero, titular e saldo. A classe Banco
deve ter um vetor de objetos Conta. Implemente métodos na classe Banco para:
1. Adicionar uma nova conta.
2. Depositar em uma conta.
3. Sacar de uma conta.
4. Transferir dinheiro entre duas contas.
5. Listar todas as contas com suas informações.
*/

package ex_16;

import java.util.Scanner;

public class testaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("        BANCO QUICKPAY         ");
            System.out.println("          1 - ADICIONAR CONTA ");
            System.out.println("          2 - DÉPOSITO ");
            System.out.println("          3 - SAQUE ");
            System.out.println("          4 - TRANSFERIR DINHEIRO ");
            System.out.println("          5 - LISTAR CONTAS");
            System.out.println("          0 - SAIR ");
            System.out.println("-----------------------------------------------");
            System.out.print("-- Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Banco.adcConta();
                    break;
                case 2:
                    Banco.depositar();
                    break;
                case 3:
                    Banco.sacar();
                    break;
                case 4:
                    Banco.transferir();
                    break;
                case 5:
                    Banco.listarContas();
                    break;
                default:
                    System.out.println("Finalizado.");
                    break;
            }
        } while(opcao != 0);
    }
}
