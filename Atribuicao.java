public class Atribuicao {
    public static void main(String[] args){

//        double bonus = 1000;
//        bonus = bonus + 1000;
//        // ou
//        bonus += 1000;
//        bonus -= 200;
//        bonus *= 4;
//        bonus /= 2; // 5600
//
//        System.out.println(bonus);

        int contador = 0; // O contador inicia com valor ZERO
        contador += 1; // Adiciona o valor UM ao contador // Contador = contador + 1
        System.out.println(contador);

        while (contador < 5){ // Enquanto o contador for menor que 5
            contador += 1; // Adiciona 1 ao contador ou usando o (contador ++ ou --)
            System.out.println(contador);
        }

        int contador2 = 0;
        // Há a opção de colocar o ++ ou -- antes da variavel
        // Dessa forma, ele incrementa o valor 1 antes de msm de printar a mensagem
        System.out.println(++contador2); // Resultado = 1
        //System.out.println(contador2++);
        

    }
}
