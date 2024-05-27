package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class testaEstudante {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

        for(int i = 0; i < 2; i++) {
            System.out.print("Nome do estudante: ");
            String nome = scn.nextLine();
            System.out.print("Nota do estudante: ");
            double nota = scn.nextDouble();

            scn.nextLine();
            Estudante obj = new Estudante(nome, nota);

            estudantes.add(obj);
        }

        for(int i = 0; i < 2; i++) {
            System.out.println(estudantes.toString());
        }

    }
}
