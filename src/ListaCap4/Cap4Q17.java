package ListaCap4;

import java.util.Scanner;

public class Cap4Q17 {

    /*
    4.17 (Quilometragem do combustível): Os motoristas se preocupam com a quilometragem obtida por seus automoveis. Um
    motorista monitorou varios tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de
    combustivel em litros utilizados para cada tanque cheio. Desenvolva um app que receba como entrada os quilometros
    dirigidos e os litros de gasolina consumidos (ambos como inteiros) (para cada tanque cheio, o programa deve calcular
    e exibir o consumo em km/L para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de
    combustivel consumidos ate esse ponto. Todos os calculos de media devem produzir resultados de ponto flutuante.
    Utilize a classe Scanner e repeticao controlada por sentinela para obter os dados do usuario.
     */

    public static void main(String []args) {

        float km, L;
        int resp;

        Scanner input = new Scanner( System.in );

        System.out.println("Poderia me dar 2 respostas?");
        System.out.println("(Digite 0 para sair e qualquer num para prosseguir): ");
        resp = input.nextInt();

        while(resp != 0) {

            System.out.print("\nDigite quantos quilometros voce dirigiu = ");
            km = input.nextFloat();

            System.out.print("\nDigite quantos litros seu veiculo suporta = ");
            L = input.nextFloat();

            float res = km / L;

            System.out.printf("\nVoce dirigiu %.2f quilometros/litro", res);

            System.out.print("\nGostaria de encerrar? (Digite 0 para sair): ");
            resp = input.nextInt();

        }

    }
}
