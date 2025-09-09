package school.sptech;

import java.util.Scanner;

public class Banco {
    public static void iniciarOps() {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Saque/Depósito");
            System.out.println("2 - Mostrar Histórico e saldo");
            System.out.println("0 - Sair");
            int opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                saqueDepositoComHistorico();
            } else if (opcao == 2) {
                mostrarHistorico();
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public static Double SaqueDeposito() {

        Double saldo = 0.0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você deseja sacar ou depositar?: ");
        String saqDep = leitor.nextLine().toLowerCase();
        if (saqDep.equals("sacar") || saqDep.equals("saque")) {
            System.out.println("Quanto você deseja sacar?: ");
            Double saque = leitor.nextDouble();
            if (saque > 0) {
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.println("Operação feita com sucesso!");
                    System.out.println("seu saldo atual é: " + saldo);
                    return saldo;
                } else {
                    System.out.println("Você não tem o suficiente para fazer este saque!");
                    SaqueDeposito();
                }
            } else {
                System.out.println("Número de deposito inválido, tente novamente!");
                SaqueDeposito();
            }

        }
        if (saqDep.equals("depositar") || saqDep.equals("deposito") || saqDep.equals("depósito")) {
            System.out.println("Quanto você deseja depositar?: ");
            Double deposito = leitor.nextDouble();
            if (deposito > 0) {
                saldo += deposito;
                System.out.println("Operação feita com sucesso!");
                System.out.println("seu saldo atual é: " + saldo);
                return saldo;

            }
        } else {
            System.out.println("Número de depósito inválido, tente novamente!");
            SaqueDeposito();

        }
        return saldo;
    }

    static double saldoReal = 0.0;
    static String[] historico = new String[100];
    static int qtdOperacoes = 0;

    public static void saqueDepositoComHistorico() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você deseja sacar ou depositar?: ");
        String saqDep = leitor.nextLine().toLowerCase();

        if (saqDep.equals("sacar") || saqDep.equals("saque")) {
            System.out.println("Quanto você deseja sacar?: ");
            double saque = leitor.nextDouble();
            if (saque > 0 && saldoReal >= saque) {
                saldoReal -= saque;
                historico[qtdOperacoes] = "Saque de R$ " + saque + " | Saldo: R$ " + saldoReal;
                qtdOperacoes++;
                System.out.println("Operação feita com sucesso!");
            } else {
                System.out.println("Saque inválido!");
            }
        } else if (saqDep.equals("depositar") || saqDep.equals("deposito") || saqDep.equals("depósito")) {
            System.out.println("Quanto você deseja depositar?: ");
            double deposito = leitor.nextDouble();
            if (deposito > 0) {
                saldoReal += deposito;
                historico[qtdOperacoes] = "Depósito de R$ " + deposito + " | Saldo: R$ " + saldoReal;
                qtdOperacoes++;
                System.out.println("Operação feita com sucesso!");
            } else {
                System.out.println("Depósito inválido!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void mostrarHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (int i = 0; i < qtdOperacoes; i++) {
            System.out.println((i + 1) + " - " + historico[i]);
        }
        System.out.println("Saldo atual: R$ " + saldoReal);
    }
}
