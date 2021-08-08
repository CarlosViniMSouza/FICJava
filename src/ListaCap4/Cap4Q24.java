package ListaCap4;

import java.util.Scanner;

public class Cap4Q24 {

    /*
    4.24 (Validando entrada de usuario) Modifique o programa na figura 4.12 para validar suas entradas. Para qualquer
    entrada, se o valor inserido for diferente de 1 ou 2, continue o loop até o usuario inserir um valor correto.
     */

    public static void main(String []args) {

        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input= new Scanner( System.in );

        // inicializando variaveis nas declarações
        int resp, result, resultTotal = 0; // um resultado do exame (fornecido pelo usuario)

        System.out.print( "Enter a number: " );
        resp = input.nextInt();

        // processa 10 alunos com o loop controlado por contador
        while ( resp != 1 && resp != 2 ) {
            // solicita ao usuário uma entrada e obtém o valor fornecido pelo usuário
            System.out.print( "Enter your note: " );
            result = input.nextInt();

            resultTotal += result;

            System.out.print( "Enter a number: " );
            resp = input.nextInt();

        } //fim do while

        //fase de término; prepara e exibe os resultados
        System.out.printf( "Result Total: %d" , resultTotal );
    }
}
