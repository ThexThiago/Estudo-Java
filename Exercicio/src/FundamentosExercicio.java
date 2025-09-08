import java.util.Scanner;

public class FundamentosExercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pede para o usuário escolher a operação e armazena em uma única variável 'opcao'
        System.out.println("Para somar, digite 1. Para subtrair, digite 2.");
        int opcao = entrada.nextInt();

        // Agora, lemos os dois números que serão usados nas operações
        System.out.println("Escolha o primeiro número:");
        int primeiro = entrada.nextInt();

        System.out.println("Escolha o segundo número:");
        int segundo = entrada.nextInt();

        // A lógica de decisão
        // Se a variável 'opcao' for igual a 1...
        if (opcao == 1) {
            int soma = primeiro + segundo;
            System.out.println("A soma dos dois números é: " + soma);

            // Se a variável 'opcao' não for 1, o programa entra aqui
        } else {
            int subtracao = primeiro - segundo;
            System.out.println("A subtração dos dois números é: " + subtracao);
        }

        entrada.close();
    }
}