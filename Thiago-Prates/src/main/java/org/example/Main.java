package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        Integer artista1 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista2 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista3 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista4 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista5 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista6 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista7 = ThreadLocalRandom.current().nextInt(2, 101);
        Integer artista8 = ThreadLocalRandom.current().nextInt(2, 101);

        List<Integer> historico = new ArrayList<>();

        votacao( artista1,  artista2,  artista3,  artista4,  artista5,  artista6, artista7, artista8, historico);

    }







    public static void votacao(Integer artista1, Integer artista2, Integer artista3, Integer artista4, Integer artista5, Integer artista6, Integer artista7,
                               Integer artista8, List<Integer> historico) {

        Scanner sc = new Scanner(System.in);

        Scanner sc1 = new Scanner(System.in);

        Integer escolha;

        Boolean votou = false;


            System.out.println("============================================================");
            System.out.println("|                    VOTAÇÃO DE ÁLBUNS                     |");
            System.out.println("============================================================");

            System.out.println("   _______        _________        _______        _________ ");
            System.out.println("  |       |      |         |      |PINK   |      |ALICE IN |");
            System.out.println("  |NIRVANA|      |METALLICA|      |FLOYD  |      |CHAINS   |");
            System.out.println("  |_______|      |_________|      |_______|      |_________|");
            System.out.println("  Nevermind      Black Album      The Wall        Dirt      ");
            System.out.println("                                                            ");
            System.out.println();

            System.out.println("   _______        _______        _______        ________   ");
            System.out.println("  |       |      |GREEN  |      |PEARL  |      |LED     |  ");
            System.out.println("  | AC/DC |      |DAY    |      |JAM    |      |ZEPPELIN|  ");
            System.out.println("  |_______|      |_______|      |_______|      |________|  ");
            System.out.println("  Back in Black  American        Ten           IV          ");
            System.out.println("                  Idiot                                    ");

            System.out.println("============================================================");
            System.out.println("|                     ESCOLHA SEU VOTO                     |");
            System.out.println("============================================================");
            System.out.println("| 1 - Nirvana - Nevermind                                  |");
            System.out.println("| 2 - Metallica - Black Album                              |");
            System.out.println("| 3 - Pink Floyd - The Wall                                |");
            System.out.println("| 4 - Alice In Chains - Dirt                               |");
            System.out.println("| 5 - AC/DC - Back in Black                                |");
            System.out.println("| 6 - Green Day - American Idiot                           |");
            System.out.println("| 7 - Pearl Jam - Ten                                      |");
            System.out.println("| 8 - Led Zeppelin - IV                                    |");
            System.out.println("| 0 - Pular Votação                                        |");
            System.out.println("============================================================");

            System.out.println("\n Digite a escolha desejada: ");
            escolha = sc.nextInt();

            if (escolha != 0 && escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5 && escolha != 6 && escolha != 7 && escolha != 8) {
                System.out.println("Insira uma opção válida");
                votacao(artista1,  artista2,  artista3,  artista4,  artista5,  artista6, artista7, artista8, historico);
            }

            if (escolha == 1) {
                System.out.println("Voto cadastrado para: 1 - Nirvana - Nevermind ");
                artista1++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 2) {
                System.out.println("Voto cadastrado para: 2 - Metallica - Black Album ");
                artista2++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 3) {
                System.out.println("Voto cadastrado para: 3 - Pink Floyd - The Wall ");
                artista3++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 4) {
                System.out.println("Voto cadastrado para: 4 - Alice In Chains - Dirt ");
                artista4++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 5) {
                System.out.println("Voto cadastrado para: 5 - AC/DC - Back in Black ");
                artista5++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 6) {
                System.out.println("Voto cadastrado para: 6 - Green Day - American Idiot ");
                artista6++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 7) {
                System.out.println("Voto cadastrado para: 7 - Pearl Jam - Ten ");
                artista7++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 8) {
                System.out.println("Voto cadastrado para: 8 - Led Zeppelin - IV ");
                artista8++;
                historico.add(escolha);
                votou = true;
            }
            if (escolha == 0) {
                votou = true;
            }






        if (votou == true) {

            int total_votos = artista1 + artista2 + artista3 + artista4 + artista5 + artista6 + artista7 + artista8;

            System.out.println("===============================================================");
            System.out.println("                    RESULTADO DA VOTAÇÃO                   ");
            System.out.println("===============================================================");
            System.out.printf("%-3s %-45s %-10s %-3s\n", "#", "Álbum", "Votos", "%");
            System.out.println("---------------------------------------------------------------");

            graficoBarras( 1,  "Nirvana - Nevermind", artista1, total_votos);
            graficoBarras( 2, "Metallica - Black Album", artista2, total_votos);
            graficoBarras( 3, "Pink Floyd - The Wall", artista3, total_votos);
            graficoBarras( 4, "Alice In Chains - Dirt", artista4, total_votos);
            graficoBarras( 5, "AC/DC - Back in Black", artista5, total_votos);
            graficoBarras( 6, "Green Day - American Idiot", artista6, total_votos);
            graficoBarras( 7, "Pearl Jam - Ten", artista7, total_votos);
            graficoBarras( 8, "Led Zeppelin - IV", artista8, total_votos);

            System.out.println("============================================================");
            System.out.println("Obrigado por participar da votação!");








            String prosseguir;
            do {
                System.out.println("Deseja prosseguir para o próximo painel? (s/n)");

                prosseguir = sc1.nextLine().trim().toLowerCase();

            } while (!prosseguir.equalsIgnoreCase("s") && !prosseguir.equalsIgnoreCase("n"));
            if (prosseguir.equalsIgnoreCase("s")) {

                Integer menu;
                while (true){
                    System.out.println("|=================================|");
                    System.out.println("|              MENU               |");
                    System.out.println("|=================================|");
                    System.out.println("| 1 - VOTAR NOVAMENTE             |");
                    System.out.println("| 2 - VER SEU HISTÓRICO DE VOTOS  |");
                    System.out.println("| 0 - Sair                        |");
                    System.out.println("|=================================|");

                    System.out.print("Escolha a opção desejada: ");
                    menu = sc.nextInt();


                    if (menu == 1) {
                        votacao(artista1, artista2, artista3, artista4, artista5, artista6, artista7, artista8, historico);
                        break;
                    } else if (menu == 0) {
                        System.out.println("Saindo do sistema...");
                        break;
                    } else if (menu == 2) {
                        if (historico.isEmpty()) {
                            System.out.println("Você não votou em nenhum álbum.");
                        } else {
                            for (int i = 0; i < historico.size(); i++) {

                                int votoFeito = historico.get(i);

                                if (votoFeito == 1) {
                                    System.out.printf("%dº voto: Nirvana - Nevermind\n", i + 1);
                                } else if (votoFeito == 2) {
                                    System.out.printf("%dº voto: Metallica - Black Album\n", i + 1);
                                } else if (votoFeito == 3) {
                                    System.out.printf("%dº voto: Pink Floyd - The Wall\n", i + 1);
                                } else if (votoFeito == 4) {
                                    System.out.printf("%dº voto: Alice In Chains - Dirt\n", i + 1);
                                } else if (votoFeito == 5) {
                                    System.out.printf("%dº voto: AC/DC - Back in Black\n", i + 1);
                                } else if (votoFeito == 6) {
                                    System.out.printf("%dº voto: Green Day - American Idiot\n", i + 1);
                                } else if (votoFeito == 7) {
                                    System.out.printf("%dº voto: Pearl Jam - Ten\n", i + 1);
                                } else if (votoFeito == 8) {
                                    System.out.printf("%dº voto: Led Zeppelin - IV\n", i + 1);
                                } else {
                                    System.out.printf("%dº voto: Voto inválido\n", i + 1);
                                }
                            }
                        }
                    }
                }
            }

            if (prosseguir.equalsIgnoreCase("n")){
                System.out.println("Obrigado por usar nosso sistema! Saindo...");
            }
        }
    }






    public static void graficoBarras(int numero, String nome, int votos, double total_votos) {
        int barra = votos / 2;
        double porcentagem = (votos * 100) / total_votos;

        System.out.printf("| %-2d %-45s %-8d %2.1f |\n", numero, nome, votos, porcentagem);
        System.out.print("   ");

        for (int i = 0; i < barra; i++) {
            System.out.print("█");
        }
        System.out.println();
    }
}