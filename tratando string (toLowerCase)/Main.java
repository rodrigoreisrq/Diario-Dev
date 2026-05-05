package Api;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao PromoPPE! Aqui as promoçõs te encontram todos os dias!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adquirir alguma promoção?");
        String resposta = scanner.nextLine();
        resposta = resposta.toLowerCase(); // TRATAMENTO DE STRING, RETORNA TODA A RESPOSTA EM LETRAS MINUSCULAS.

        if (resposta.equals("sim")){
           // System.out.println(resposta);
            System.out.println("Clique na oferta desejada!");

        } else if (resposta.equals("nao")){
           // System.out.println(resposta);
            System.out.println("Tudo bem! Fique a vontade para adquirir em outro momento!");

        } else {
            System.out.println("Opção inválida!");
        }



    }
}