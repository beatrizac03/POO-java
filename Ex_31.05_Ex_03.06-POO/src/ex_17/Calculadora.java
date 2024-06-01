package ex_17;

import java.util.Scanner;

public class Calculadora {
    public static void somar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("SOMA ENTRE 2 NÚMEROS");
        System.out.print("Digite o primeiro número: ");
        double num1= scn.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2= scn.nextDouble();

        System.out.println(num1 + " + " + num2 + " : " + (num1 + num2));
        System.out.println("");
    }

    public static void subtrair() {
        Scanner scn = new Scanner(System.in);

        System.out.println("SUBTRAÇÃO ENTRE 2 NÚMEROS");
        System.out.print("Digite o primeiro número: ");
        double num1= scn.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2= scn.nextDouble();

        System.out.println(num1 + " - " + num2 + " : " + (num1 - num2));
        System.out.println("");
    }

    public static void multiplicar(){
        Scanner scn = new Scanner(System.in);

        System.out.println("MULTIPLICAÇÃO ENTRE 2 NÚMEROS");
        System.out.print("Digite o primeiro número: ");
        double num1= scn.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2= scn.nextDouble();

        System.out.println(num1 + " X " + num2 + " : " + (num1 * num2));
        System.out.println("");
    }

    public static void dividir(){
        Scanner scn = new Scanner(System.in);

        System.out.println("DIVISÃO ENTRE 2 NÚMEROS");
        System.out.print("Digite o primeiro número: ");
        double num1= scn.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2= scn.nextDouble();

        System.out.println(num1 + " / " + num2 + " : " + (num1 / num2));
        System.out.println("");
    }

}
