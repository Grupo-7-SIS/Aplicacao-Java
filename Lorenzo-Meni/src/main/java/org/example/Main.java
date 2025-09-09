package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random sorteador = new Random();

        Integer numeroEscolhido;
        do {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroEscolhido = sc.nextInt();
        } while (numeroEscolhido < 0 || numeroEscolhido > 100);

        Integer primeiraVez = null;
        for (Integer i = 1; i <= 200; i++) {
            Integer sorteado = sorteador.nextInt(101);

            if (sorteado.equals(numeroEscolhido) && primeiraVez == null) {
                primeiraVez = i;
            }
        }

        if (primeiraVez == null) {
            System.out.println("\nSeu número não foi sorteado nas 200 tentativas!");
        } else {
            System.out.printf("\nSeu número foi sorteado pela primeira vez no sorteio nº %d\n", primeiraVez);

            if (primeiraVez < 10) {
                System.out.println("Você é MUITO sortudo!");
            } else if (primeiraVez <= 50) {
                System.out.println("Você é sortudo!");
            } else {
                System.out.println("Melhor parar de apostar e ir trabalhar!");
            }
        }
    }
}