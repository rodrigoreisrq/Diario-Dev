import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Bem vindo! Ao nosso programa de doações");
        System.out.println("Para doar 1 real: Digite 1.");
        System.out.println("Para doar 5 real: Digite 5.");
        System.out.println("Para doar 10 real: Digite 10.");

        System.out.println("Qual será a sua doação? ");

        Scanner scanner = new Scanner(System.in); // Cria a função Scanner
        System.out.println("Digite sua doação: ");
        int doacao = scanner.nextInt(); // Lê a entrada do User

        // Condicional
        if (doacao == 1) {
            System.out.println("Você doou 1 real. Obrigado!");
        } else if (doacao == 5){
            System.out.println("Você doou 5 reais. Obrigado!");
        } else if (doacao == 10){
            System.out.println("Você doou 10 reais. Obrigado!");
        } else{
            String mensagem = String.format("Obrigado por doar: %d reais", doacao); // Formata a string para conseguir passar o valor da doação
            System.out.println(mensagem);
        }
    }
}