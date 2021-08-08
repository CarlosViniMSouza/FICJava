package ListaCap4;

public class Cap4Q34 {

    /*
    4.34 O que ha de errado com a seguinte instrucao? Forneça a instrucao correta para adicionar 1 à soma de x e y.

    System.out.println( ++(x + y) );
     */

    public static void main(String []args) {

        /*
        Bem, eu imagino que há vários problemas: erro de identificacao das variaveis, erro na logica, erro na construcao
        do algoritmo, enfim. Vou fazer algumas correcoes.
         */

        int x = 10;
        int y = 11;

        System.out.printf("%d", (x + y + 1));
        //output: 22

    }
}
