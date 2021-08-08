package ListaCap4;

import java.util.Scanner;

public class Cap4Q37 {

    /*
    a) Escreva um aplicativo que le um inteiro nao-negativo, calcula e imprime seu fatorial.
    b) Escreva un aplicativo que estima o valor da constante matemática 'e': 1 + 1/1! + 1/2! + 1/3! + ...
    c) Escreva um aplicativo que computa o valor de 'e^x': 1 + x/1! + (x^2)/2! + (x^3)/3! + ...
     */

    public static void main(String []args) {

        int n;
        int fat = 1;
        float fracao = 0;
        float soma = 0;
        float x;

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor de n?: ");
        n = input.nextInt();

        System.out.print("\nValor de x: ");
        x = input.nextFloat();

        if (n > 1) {
            for (int i = 1; i <= n; ++i) {
                fat = fat * i;
            }
            System.out.println("Letra (a): " + fat);
        } else {
            System.out.println("Letra (a): 1");
        }

        fat = 1;

        if (n > 1) {
            for (int i = 1; i <= n; ++i) {
                fat = fat * i;
                fracao += 1.0 / fat;
            }
            soma = 1 + fracao;
        } else {
            System.out.println("Letra (b): 1");
        }

        System.out.println("Letra (b): " + soma);

        fat = 1;
        soma = 0;

        if (n > 1) {
            for (int i = 1; i <= n; ++i) {
                fat = fat * i;
                fracao += x / fat;
            }
            soma = 1 + fracao;

        } else {
            System.out.println("Letra (c): 1");
        }

        System.out.println("Letra (c): " + soma);

    }
}
