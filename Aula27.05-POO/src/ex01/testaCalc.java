package ex01;

import java.util.Scanner;

public class testaCalc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("2 Números para soma: ");
        System.out.println("Soma: " + Calculadora.somar(scn.nextDouble(), scn.nextDouble()));

        System.out.println("");

        System.out.println("2 Números para subtração: ");
        System.out.println("Subtração: " + Calculadora.subtrair(scn.nextDouble(), scn.nextDouble()));

        System.out.println("");

        System.out.println("2 Números para multiplicação: ");
        System.out.println("Multiplicação: " + Calculadora.multiplicar(scn.nextDouble(), scn.nextDouble()));

        System.out.println("");

        System.out.println("2 Números para divisão: ");
        System.out.println("Divisão: " + Calculadora.dividir(scn.nextDouble(), scn.nextDouble()));
    }
}
