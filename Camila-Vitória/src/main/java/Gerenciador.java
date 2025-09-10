import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        String[] equipe = {"Artur", "Camila", "Isabela", "Leonardo", "Lorenzo", "Thiago"};
        String[] status = {"Pendente","Em andamento","Concluído"};
        Scanner leitor = new Scanner(System.in);
        Boolean menu1 = true;

        //Criação da Tarefa
        List <String> nomeLista = new ArrayList<>();
        List <String> tamanhoLista = new ArrayList<>();
        List <Integer> tempoLista = new ArrayList<>();
        List <String> responsavelLista = new ArrayList<>();
        List <String> statusLista = new ArrayList<>();

        // Nomes de tarefas
        nomeLista.add("API Login");
        nomeLista.add("Banco de Dados");
        nomeLista.add("Protótipo da Dashboard");
        nomeLista.add("Python na EC2");
        nomeLista.add("Documentação");

        // Tamanhos
        tamanhoLista.add("M");
        tamanhoLista.add("G");
        tamanhoLista.add("P");
        tamanhoLista.add("GG");
        tamanhoLista.add("PP");

        // Tempos correspondentes
        tempoLista.add(3);
        tempoLista.add(5);
        tempoLista.add(2);
        tempoLista.add(8);
        tempoLista.add(1);

        // Responsáveis
        responsavelLista.add(equipe[0]);
        responsavelLista.add(equipe[1]);
        responsavelLista.add(equipe[4]);
        responsavelLista.add(equipe[5]);
        responsavelLista.add(equipe[2]);


        // Status
        statusLista.add(status[0]);
        statusLista.add(status[1]);
        statusLista.add(status[2]);
        statusLista.add(status[0]);
        statusLista.add(status[1]);

        while (menu1 == true){
           Boolean menu2 = true;

            System.out.println("""
                    _____________________________________________________________
                    |                   Gerenciador de Tarefas                  |
                    |___________________________________________________________|
                    | 1. Adicionar nova tarefa;                                 |
                    | 2. Deletar tarefa;                                        |
                    | 3. Mudar status da tarefa;                                |
                    | 4. Vizualizar todas as tarefas;                           |
                    | 5. Tempo dos Integrantes;                                 |
                    | 6. Status de tempo da Sprint;
                    |___________________________________________________________|                                                         
                    """);

            System.out.println("O que deseja fazer:");
            Integer interacao1 = leitor.nextInt();
            leitor.nextLine();

            if (interacao1 > 0 && interacao1 <= 6){


                    if(interacao1.equals(1)) {
                        System.out.println("Nome da Atividade:");
                        String nomeTarefa = leitor.nextLine();
                        nomeLista.add(nomeTarefa);

                        System.out.println("Tamanho da Tarefa:");
                        String tamanhoTarefa = leitor.nextLine();
                        tamanhoLista.add(tamanhoTarefa);

                        Integer tempoTarefa = 0;
                        switch (tamanhoTarefa){
                            case "PP" -> tempoTarefa = 1;
                            case "P" -> tempoTarefa = 2;
                            case "M" -> tempoTarefa = 3;
                            case "G" -> tempoTarefa = 5;
                            case "GG" -> tempoTarefa = 8;
                        }
                        tempoLista.add(tempoTarefa);

                        System.out.println("Responsável:");
                        Integer responsavel = leitor.nextInt();
                        switch (responsavel){
                            case 1 -> responsavelLista.add(equipe[0]);
                            case 2 -> responsavelLista.add(equipe[1]);
                            case 3 -> responsavelLista.add(equipe[2]);
                            case 4 -> responsavelLista.add(equipe[3]);
                            case 5 -> responsavelLista.add(equipe[4]);
                            case 6 -> responsavelLista.add(equipe[5]);
                        }

                        System.out.println("Status:");
                        Integer statusTarefa = leitor.nextInt();

                        switch (statusTarefa){
                            case 1 -> statusLista.add(status[0]);
                            case 2 -> statusLista.add(status[1]);
                            case 3 -> statusLista.add(status[2]);
                        }

                        System.out.println("""
                                Tarefa: %s 
                                Tamanho: %s
                                Tempo: %d hora
                                Responsável: %s
                                Status: %s
                                """.formatted(nomeLista.get(nomeLista.size() - 1),
                                tamanhoLista.get(tamanhoLista.size() - 1),
                                tempoLista.get(tempoLista.size() - 1),
                                responsavelLista.get(responsavelLista.size() - 1),
                                statusLista.get(statusLista.size() - 1)));


                    } else if (interacao1.equals(2)) {
                        System.out.println("Número da Atividade: ");
                        Integer intemExcluir = leitor.nextInt();

                        if (intemExcluir > 0 && intemExcluir <= nomeLista.size()-1){
                            nomeLista.remove(intemExcluir-1);

                            System.out.println("\nTarefa excluída com sucesso.");

                        }else {
                            System.out.println("Número Inválido!");
                        }
                    } else if (interacao1.equals(3)) {
                        System.out.println("Número da Atividade:");
                        Integer indiceMudar = leitor.nextInt();
                        System.out.println("Novo Status:");
                        Integer novoStatus = leitor.nextInt();

                        if (indiceMudar > 0 && indiceMudar < statusLista.size()){
                            statusLista.set(indiceMudar-1, status[novoStatus-1]);
                            System.out.println("Mudança realizada!");
                        }else{
                            System.out.println("Valor Inválido!");
                        }
                        }

                    else if (interacao1.equals(4)){
                        for (int i = 0; i < nomeLista.size(); i++) {
                            System.out.println("""
                                _____________________________________________________
                                |                   Task %d                         
                                | Tarefa: %s                                        
                                | Tamanho: %s                                       
                                | Tempo: %d hora                                    
                                | Responsável: %s                                   
                                | Status: %s                                        
                                |___________________________________________________
                                """.formatted(i+1, nomeLista.get(i),
                                    tamanhoLista.get(i),
                                    tempoLista.get(i),
                                    responsavelLista.get(i),
                                    statusLista.get(i)));

                        }
                    }

                    else if (interacao1.equals(5)){
                    Integer tempo1 = 0;
                    Integer tempo2 = 0;
                    Integer tempo3 = 0;
                    Integer tempo4 = 0;
                    Integer tempo5 = 0;
                    Integer tempo6 = 0;

                        for (int i = 0; i < nomeLista.size(); i++) {
                            if (responsavelLista.get(i) == equipe[0]){
                                tempo1 += tempoLista.get(i);
                            }
                            else if (responsavelLista.get(i).equals(equipe[1])){
                                tempo2 += tempoLista.get(i);
                            }
                            else if (responsavelLista.get(i).equals(equipe[2])){
                                tempo3 += tempoLista.get(i);
                            }
                            else if (responsavelLista.get(i).equals(equipe[3])){
                                tempo4 += tempoLista.get(i);
                            }
                            else if (responsavelLista.get(i).equals(equipe[4])){
                                tempo5 += tempoLista.get(i);
                            }
                            else if (responsavelLista.get(i).equals(equipe[5])){
                                tempo6 += tempoLista.get(i);
                            }
                        }

                        System.out.println("""
                                Artur: %d horas
                                Camila: %d horas
                                Isabela: %d horas
                                Leonardo: %d horas
                                Lorenzo: %d horas
                                Thiago: %d horas
                                """.formatted(tempo1,tempo2,tempo3,tempo4,tempo5,tempo6));
                    }
                 else if (interacao1.equals(6)) {
                        Integer tempoTotal = 0;
                        Integer tempoFeito = 0;

                        for (int i = 0; i < tempoLista.size(); i++) {
                            tempoTotal += tempoLista.get(i);

                            if (statusLista.get(i).equals(status[2])){
                                tempoFeito += tempoLista.get(i);
                            }
                        }

                        Integer tempoFazer = tempoTotal - tempoFeito;

                        System.out.println("""
                                |-------------------------------|
                                |       Status da Sprint        |
                                |-------------------------------|
                                | Tempo Total: %d horas.        |
                                | Tempo realizado: %d horas.     |
                                | Tempo restante: %d horas.     |
                                |-------------------------------|
                                """.formatted(tempoTotal,tempoFeito,tempoFazer));
                    }}

            else {
                System.out.println("Coloque um valor válido!");
            }
            while (menu2 == true){
            System.out.println("Deseja continuar?(s/n):");
            String interacaoContinuar = leitor.nextLine();
            interacaoContinuar = leitor.nextLine();


            if (interacaoContinuar.equals("n") || interacaoContinuar.equals("não")){
                menu1 = false;
                menu2 = false;
            }else{
                menu2 = false;
            }
                }}
            }
        }

