public class Condicionais {
    public static void main(String[]args) {
        int idade = 8;

        boolean idadeAutorizada = idade >= 18;
        if (idadeAutorizada) {
            System.out.println("Compra autorizada!");
            // } else{
            //      System.out.println("Compra nao autorizada!");

//        if (!idadeAutorizada) { // ! - Serve como negação // Sempre vai fazer a analise
//            System.out.println("Compra não autorizada!");

        } else{
            System.out.println("Compra não autorizada!");
        }

    }}
