/* Crie uma classe Funcionario com os atributos nome, salario e departamento. Em
seguida, crie um vetor de objetos Funcionario para armazenar 5 funcionários.
Implemente um método que aumenta o salário de todos os funcionários de um
determinado departamento em 10%.
 */

package ex_14;

import java.util.Scanner;

public class testaFuncionario {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        final int QTDE_FUNCIONARIOS = 2;
        Funcionario[] vetFuncionarios = new Funcionario[QTDE_FUNCIONARIOS];

        for(int i = 0; i < QTDE_FUNCIONARIOS; i++) {
            vetFuncionarios[i] = new Funcionario();

            System.out.println("FUNCIONÁRIO " + (i + 1));
            System.out.print("Nome: ");
            vetFuncionarios[i].setNome(scn.nextLine());
            System.out.print("Departamento: ");
            vetFuncionarios[i].setDepartamento(scn.nextLine());
            System.out.print("Salário: R$");
            vetFuncionarios[i].setSalario(scn.nextDouble());

            scn.nextLine();
            System.out.println("");
        }

        System.out.print("Departamento que terá aumento de 10%: ");
        String depEscolhido = scn.nextLine().toUpperCase();
        System.out.println("");

        System.out.println("DEPARTAMENTO " + depEscolhido + " - AUMENTO DE 10%");
        System.out.println("");
        for(int i = 0; i < QTDE_FUNCIONARIOS; i++) {
            if(vetFuncionarios[i].getDepartamento().toUpperCase().equals(depEscolhido)) {
                vetFuncionarios[i].setSalario(vetFuncionarios[i].getSalario() * 1.1);
                System.out.println("Funcionário(a) " + vetFuncionarios[i].getNome() + ": R$" + vetFuncionarios[i].getSalario());
            }
        }

        scn.close();
    }
}
