/* Crie uma classe Aluno com os atributos nome e nota. Em seguida, crie um vetor
de objetos Aluno para armazenar 5 alunos e imprima o nome e a nota de cada
aluno.
*/

package ex_12;

import java.util.Scanner;

public class testaAluno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        final int QTDE_ALUNOS = 5;
        Aluno[] vetAlunos = new Aluno[QTDE_ALUNOS];

        for(int i = 0; i < QTDE_ALUNOS; i++) {
            vetAlunos[i] = new Aluno();

            System.out.println("ALUNO " + (i + 1));
            System.out.print("Nome: ");
            vetAlunos[i].setNome(scn.nextLine());
            System.out.print("Nota: ");
            vetAlunos[i].setNota(scn.nextDouble());

            scn.nextLine();
        }

        for(int i = 0; i < QTDE_ALUNOS; i++) {
            System.out.println(vetAlunos[i].toString());
        }
    }
}
