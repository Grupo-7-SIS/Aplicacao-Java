package school.sptech;

import java.util.Scanner;
import java.util.Random;

        public class PedraPapelTesoura {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                Integer opcao = 1;

                while (opcao != 0) {
                    System.out.println("\nJogo Pedra, Papel e Tesoura!");
                    System.out.println("Digite: 1 = Pedra | 2 = Papel | 3 = Tesoura");
                    System.out.print("Sua escolha: ");
                    Integer jogador = sc.nextInt();

                    Integer computador = random.nextInt(3) + 1; // de 1 a 3

                    System.out.println("Você escolheu: " + opcaoNome(jogador));
                    System.out.println("Computador escolheu: " + opcaoNome(computador));

                    if (jogador.equals(computador)) {
                        System.out.println("Empate!");
                    } else if ((jogador.equals(1) && computador.equals(3)) ||
                            (jogador.equals(2) && computador.equals(1)) ||
                            (jogador.equals(3) && computador.equals(2))) {
                        System.out.println("Você ganhou!");
                    } else {
                        System.out.println("Computador ganhou!");
                    }

                    System.out.print("\nDeseja jogar novamente? (1 = sim, 0 = sair): ");
                    opcao = sc.nextInt();
                }

                sc.close();
            }

            public static String opcaoNome(Integer escolha) {
                if (escolha.equals(1)) return "Pedra";
                if (escolha.equals(2)) return "Papel";
                return "Tesoura";
            }
        }

