package ListaCap7;

import java.util.Scanner;
import java.util.Arrays;

public class Cap7Q9 {

    /*
    Considere um array de inteiros dois por três t.

    a) Escreva uma instrucao que declara e cria t.
    b) Quantas linha tem t?
    c) Quantas colunas tem t?
    d) Quantos elementos tem t?
    e) Escreva expressoes de acesso para todos os elementos na linha 1 de t.
    f) Escreva expressoes de acesso para todos os elementos na coluna 2 de t.
    g) Escreva uma unica instrucao que configura o elemento de t na linha 0 e na coluna 1 como zero.
    h) Escreva instrucoes especificas para inicializar cada elemento de t em zero.
    i) Escreva uma instrucao 'for' aninhada que inicializa cada elemento de t como zero.
    j) Escreva uma instruçao 'for' aninhada que insere os valores para os elementos de t a partir do usuario.
    k) Escreva uma serie de instrucoes que determina e exibe o valor menor em t.
    I) Escreva uma unica instrucao printf que exibe os elementos da primeira linha de t.
    m) Escreva uma instrucao que soma os elementos da terceira coluna de t. Não utilize repeticao.
    n) Escreva uma serie de instrucoes que exibe o conteudo de t no formato tabular. Liste os indices de coluna
    como titulos na parte superior e liste os indices de linha a esquerda de cada linha.
     */

    public static void main(String []args) {

        // a) Escreva uma instrucao que declara e cria t. Resp:
        int[][] t = {{1, 2, 3}, {4, 5, 6}};

        // b) Quantas linha tem t? Resp: 2

        // c) Quantas colunas tem t? Resp: 3

        // d) Quantos elementos tem t? Resp: 6

        // e) Escreva expressoes de acesso para todos os elementos na linha 1 de t. Resp:
        System.out.println("Fist line: " + Arrays.toString(t[1]));
        System.out.println("Access first line other form: [" + t[1][0] + ", " + t[1][1] + ", " + t[1][2] + "]");

        // f) Escreva expressoes de acesso para todos os elementos na coluna 2 de t.
        System.out.println("Element t[1, 2]: " + t[0][2]);
        System.out.println("Element t[2, 2]: " + t[1][2]);

        // g) Escreva uma unica instrucao que configura o elemento de t na linha 0 e na coluna 1 como zero. Resp:
        t[0][1] = 0;
        System.out.println("Look change: " + Arrays.toString(t[0]));

        // h) Escreva instrucoes especificas para inicializar cada elemento de t em zero. Resp:
        t[0][0] = 0; t[0][1] = 0; t[0][2] = 0;
        t[1][0] = 0; t[1][1] = 0; t[1][2] = 0;
        System.out.println("Restart (1): \n" + Arrays.toString(t[0]) + "\n" + Arrays.toString(t[1]));

        // i) Escreva uma instrucao 'for' aninhada que inicializa cada elemento de t como zero. Resp:
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                t[i][j] = 0;
            }
        }
        System.out.println("Restart (2): \n" + Arrays.toString(t[0]) + "\n" + Arrays.toString(t[1]));

        // j) Escreva uma instruçao 'for' aninhada que insere os valores para os elementos de t a partir do usuario.
        Scanner input = new Scanner(System.in);
        System.out.print("Which number you want do write: ");
        int init = input.nextInt();

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                t[i][j] = init;
            }
        }
        System.out.println("Your list: \n" + Arrays.toString(t[0]) + "\n" + Arrays.toString(t[1]));

        // k) Escreva uma serie de instrucoes que determina e exibe o valor menor em t. Resp:
        t[0][0] = 1; t[0][1] = 2; t[0][2] = 3;
        t[1][0] = 4; t[1][1] = 5; t[1][2] = 6;

        Arrays.sort(t[0]);
        Arrays.sort(t[1]);

        if(t[0][0] < t[1][0]) {
            System.out.println("Less Number: " + t[0][0]);
        } else {
            System.out.println("Less Number: " + t[1][0]);
        }

        // I) Escreva uma unica instrucao printf que exibe os elementos da primeira linha de t.
        System.out.printf("First line: %s", Arrays.toString(t[0]));

    }
}
