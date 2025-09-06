package school.sptech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LucroCalculador calculadora = new LucroCalculador(12);

        for (int i = 0; i < 12; i++) {
            System.out.println("Entre com o dado de faturamento bruto do mês " + (i+1) + ": ");
            Double faturamento = Double.parseDouble(scanner.nextLine());

            System.out.println("Entre com as despesas totais do mês " + (i+1) + ": ");
            Double despesa = Double.parseDouble(scanner.nextLine());

            calculadora.adicionarDadosMes(i, faturamento, despesa);
        }

        System.out.println("\n=== RELATÓRIO DE LUCRO DA EMPRESA ===");
        for (int i = 0; i < calculadora.getTotalMeses(); i++) {
            System.out.println("Mês " + (i+1) + ":");
            System.out.println("  Faturamento: R$ " + calculadora.getFaturamentoBruto()[i]);
            System.out.println("  Despesas: R$ " + calculadora.getDespesas()[i]);
            System.out.println("  Lucro: R$ " + calculadora.calcularLucroMes(i));
            System.out.println("  Situação: " + calculadora.getSituacaoMes(i));
            System.out.println();
        }


        System.out.println("Lucro total anual: R$ " + calculadora.calcularLucroTotal());
        System.out.println("Lucro médio mensal: R$ " + calculadora.calcularLucroMedio()%.2f);

        scanner.close();
    }
}