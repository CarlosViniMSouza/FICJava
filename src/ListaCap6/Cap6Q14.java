package ListaCap6;

import java.util.Scanner;

public class Cap6Q14 {

    /*
    Escreva um método integerPower(base, exponent) que retorne o valor de 'base x expoent'.
    Por exemplo, integerPower(3, 4) calcula 81 (ou 3 * 3 * 3 * 3). Assuma que exponente é um inteiro não zero,
    positivo e base é um inteiro. O método integerPower deve utilizar uma instrução for ou while para controlar
    o cálculo. Não utilize métodos da classe Math. Incorpore esse método a um aplicativo . O que lê os maiores
    inteiros para base e exponent e realiza o cálculo com o método integerPower.
     */

    public static class Result {

        public void detIntPower() {
            Scanner input = new Scanner( System.in );

            System.out.print("Digite 2 inteiros separados por espaco: " );
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            int resp = integerPower(number1, number2);

            System.out.println("O resultado da potenciacao eh: " + resp);
        }

        public int integerPower(int number1, int number2) {

            int pot = 1;

            for(int i = 1; i <= number2; i++) {
                pot *= number1;
            }

            return pot;
        }
    }

    public static void main(String []args) {
        Result result = new Result();
        result.detIntPower();
    }
}
