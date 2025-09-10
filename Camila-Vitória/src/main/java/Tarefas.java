import javax.swing.*;
import java.util.*;


public class Tarefas {
    public static void main(String[] args) {
        String[] equipe = {"Artur", "Camila", "Isabela", "Leonardo", "Lorenzo", "Thiago"};
        String[] status = {"Pendente","Em andamento","Concluído"};
        String[] tamanho = {"PP", "P", "M", "G", "GG"};
        List<String> nomeAtividade = new ArrayList<>();
        List<String> tamanhoAtividade = new ArrayList<>();
        List<Integer> tempoAtividade = new ArrayList<>();
        List<String> statusAtividade = new ArrayList<>();
        List<String> responsavelAtividade = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        Integer interacao1 = 0;

        while (true){

            System.out.println("""
                \nO que deseja fazer?
                
                1. Adicionar nova tarefa.
                2. Deletar alguma tarefa.
                3. Vizualizar todas as tarefas.
                4. Mudar status da tarefa.
                5. Outro.
                """);

            System.out.println("\nOpção:");
            interacao1 = scanner.nextInt();

        if(interacao1 >= 1 && interacao1 <= 5){
            break;
        }else {
            System.out.println("Valor Inválido tente novamente");
        }}
        String nomeTarefa = "";
        String tamanhoTarefa = "";
        Integer horasGastas = 0;
        String responsavelTarefa = "";

        if (interacao1.equals(1)){
            System.out.println("Nome da Tarefa:");
            nomeAtividade.add(nomeTarefa = scanner.nextLine());

            System.out.println("Tamanho da tarefa:");
            tamanhoAtividade.add(tamanhoTarefa = scanner.nextLine());

            switch (tamanhoTarefa){

                case "PP" -> tempoAtividade.add(30);
                case "P" -> tempoAtividade.add(60);
                case "M" -> tempoAtividade.add(180);
                case "G" -> tempoAtividade.add(300);
                case "GG" -> tempoAtividade.add(480);
            }

            System.out.println("Status da Atividade:");
            Integer statusTarefa = scanner.nextInt();

            switch (statusTarefa){
                case 1 -> statusAtividade.add(status[0]);
                case 2 -> statusAtividade.add(status[1]);
                case 3 -> statusAtividade.add(status[2]);
            }

            System.out.println("Responsável:");
            Integer responsavel = scanner.nextInt();

            for (int i = 0; i < equipe.length; i++) {
                responsavelAtividade.add(equipe[responsavel-1]);
            }

            System.out.println(new ArrayList(nomeAtividade));
        }
    }
}
