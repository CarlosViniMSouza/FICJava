package ListaCap6;

import java.util.Scanner;

public class Cap6Q16 {

    /*
    Escreva um metodo 'isMultiple' que determina um par de inteiros se o segundo inteiro for multiplo do primeiro.
    O metodo de aceitar dois argumentos inteiros e retomar 'true' se o segundo for um multiplo do primeiro e false
    se caso contrario. [Dica: utilize o operador de modulo]. Incorpore esse método a um aplicativo que insere uma
    serie de pares inteiros (um par por vez) e detemina se o segundo valor em cada par eh um multiplo do primeiro.
     */

    public static class Pares {

        public void insertPares() {
            Scanner input = new Scanner( System.in );

            System.out.print("Digite 1 par de numeros inteiros separados por espaco: " );
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            boolean resp = isMultiple(number1, number2);

            System.out.println("O resultado da avaliacao eh: " + resp);
        }

        public boolean isMultiple(int number1, int number2) {

            boolean avaliacao = false;

            if(number2 % number1 == 0) {
                avaliacao = true;
            } else {
                avaliacao = false;
            }

            return avaliacao;
        }
    }

    public static void main(String []args) {
        Pares check = new Pares();
        check.insertPares();
    }
}
