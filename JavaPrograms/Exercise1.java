import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String []args){
        int pessoas = 5;
        // Criando uma lista
        //List<Integer> alturasHomens = new ArrayList<>();
        List<Integer> alturasHomens = Arrays.asList(190, 150, 176);

        // Adicionar os elementos à lista
//        alturasHomens.add(150);
//        alturasHomens.add(175);
//        alturasHomens.add(190);

        // Criando a media
        int soma = 0;


        // Loop para percorrer cada valor e soma-lo ao próximo
        for(int altura: alturasHomens){
            soma += altura;
        }
        // Criando a média das alturas
        int media = soma / 3;

        // Mostrando o resultado
        System.out.println("A média das alturas dos homens é " + media);

      //  if (alturas <= 1.45){
           // System.out.println("Altura Inferior");
        }
    }

