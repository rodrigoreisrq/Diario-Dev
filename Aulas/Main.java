package Aulas;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        String welcomeMessage = "Bem vindo ao app da Performance !" +
                "Academia perfeita e acessível para você!" + "Acesse suas planilhas ou registre suas atividades.";
        System.out.println(welcomeMessage);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual opção deseja? \n 1. Cadastrar 2.Acessar conta");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1){
            System.out.println("Cadastre-se agora mesmo!");
            // Cadastro


            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();


            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua senha: ");
            int senha = scanner.nextInt();


            System.out.println("Digite seu email: ");
            String email = scanner.nextLine();
            scanner.nextLine();

            // Validação

            System.out.println("Cadastro concluído!");

        } if(escolha == 2){
            System.out.println("Digite seu email: ");
            String email = scanner.nextLine();


            System.out.println("Digite sua senha: ");
            int senha = scanner.nextInt();

//            public boolean equals()
//                if (email.equals(email) && senha.(senha)){
//                System.out.println("Login efetuado com sucesso!");
//                }

        }





    }

}