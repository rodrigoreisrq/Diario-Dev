package Aulas;
import java.io.InputStream;
import java.util.Scanner;

public class relacionais {
    public static void main(String[]args){
        // % - resto da divisão
        int numberOne = 10;
        int numberTwo = 20;
        double resto = 25 % 2;
        System.out.println(resto); // Se o resto for 0 = numero par, senao é impar

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        int result = numero % 2;
        System.out.println(result);

        if (result == 0){
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar!");
        }
        // -----------------------------------------------------------

        // < > - <=(menor igual) >=(maior igual) ==(igual) !=(diferente)
        boolean resultado = 10 != 20;
        System.out.println(resultado);
    }



}

