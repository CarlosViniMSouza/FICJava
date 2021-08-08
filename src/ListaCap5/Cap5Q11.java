package ListaCap5;

import java.util.Scanner;

public class Cap5Q11 {

    /*
    (Localize o menor numero) Escreva um aplicativo que localize o menor de varios numeros inteiros.
    Assuma que o primeiro valor lido especifica o numero de valores a serem inseridos pelo usuario.
     */

    public static void main(String []args) {

        Scanner input = new Scanner( System.in );

        int n1, n2, n3, menor;

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        n2 = input.nextInt();

        System.out.print("Insira o ultimo numero: ");
        n3 = input.nextInt();

        if (Math.min(n1, n2) == Math.min(n1, n3)) {
            menor = n1;
        } else if (Math.min(n2, n1) == Math.min(n2, n3)) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("Menor valor dos 3 numeros: " + menor);

    }
}
