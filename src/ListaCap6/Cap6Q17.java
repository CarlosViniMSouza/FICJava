package ListaCap6;

import java.util.Scanner;

public class Cap6Q17 {

    /*
    Escreva um método 'isEven' que utiliza o operador de resto (%) para determinar se um inteiro é par. O método
    deve levar um argumento inteiro e retomar 'true' se o número inteiro for par, e 'false', caso contrário.
    Incorpore esse método a um aplicativo que insere uma sequência de inteiros (um por vez) e determina se cada
    um é par ou ímpar.
     */

    public static class checkPar {

        public void insertNumber() {
            Scanner input = new Scanner( System.in );

            System.out.print("Digite 1 numero inteiro: " );
            int number1 = input.nextInt();

            boolean resp = isEven(number1);

            System.out.println("Eh Par? Resposta: " + resp);
        }

        public boolean isEven(int number1) {

            boolean avaliacao = false;

            if(number1 % 2 == 0) {
                avaliacao = true;
            } else {
                avaliacao = false;
            }

            return avaliacao;
        }
    }

    public static void main(String []args) {
        checkPar check = new checkPar();
        check.insertNumber();
    }
}
