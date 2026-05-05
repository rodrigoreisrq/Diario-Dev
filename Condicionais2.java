public class Condicionais2 {
    public static void main(String[] args) {
        // IDADE < 15 - CATEGORIA INFANTIL
        // IDADE >= 15 && IDADE < 18 - JUVENIL
        // IDADE >= 18 ADULTO

        int idade = 0;
        String categoria;

//        if (idade >=18){
//            System.out.println("Categoria: Adulto");
//        } else if (idade >= 15) {
//            System.out.println("Categoria: Juvenil");
//        }else if (idade >= 10) {
//            System.out.println("Categoria: Infantil");
//        }else{
//            System.out.println("Inscrições a partir dos 10 anos de idade!");
//        }

        if (idade >=18){
            categoria = "Categoria: Adulto";
        } else if (idade >= 15) {
            categoria = "Categoria: Juvenil";
        }else if (idade >= 10) {
           categoria = "Categoria: Infantil";
        }else{
            categoria = "Inscrições a partir dos 10 anos de idade!";
        }
        System.out.println(categoria);
        
    }
    }

