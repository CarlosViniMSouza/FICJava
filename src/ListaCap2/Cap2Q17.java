package ListaCap2;

import java.util.Scanner;

public class Cap2Q17 {

    public static void main(String []args) {
        // TODO Auto-generated method stub
        /*
         * 2.17 - Escreva um aplicativo que insere três inteiros digitados pelo
         * usuário e exibe a soma, média, produto e os números menores e maiores. Utilize
         * as técnicas mostradas na Figura 2.15. [Nota: o cálculo da média neste exerc.
         * deve resultar em uma representação de inteiro da média. Assim, se a soma dos
         * valores for 7, a média devera ser 2, e não 2,3333...)
         */

        Scanner input = new Scanner( System.in );

        int n1, n2, n3, maior, menor;

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        n2 = input.nextInt();

        System.out.print("Insira o ultimo numero: ");
        n3 = input.nextInt();

        if (Math.max(n1, n2) == Math.max(n1, n3)) {
            maior = n1;
        } else if (Math.max(n2, n1) == Math.max(n2, n3)) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (Math.min(n1, n2) == Math.min(n1, n3)) {
            menor = n1;
        } else if (Math.min(n2, n1) == Math.min(n2, n3)) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("Resultado da soma = " + (n1 + n2 + n3));
        System.out.println("Resultado do Produto = " + (n1 * n2 * n3));
        System.out.println("Resultado da Media = " + Math.ceil((n1 + n2 + n3)/3));
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

    }
}
