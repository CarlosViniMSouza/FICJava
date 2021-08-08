package ListaCap5;

public class Cap5Q27 {

    // 5.27 O que o seguinte segmento de programa faz?

    public static void main(String []args) {

        for ( int i = 1 ; i <= 5; i++ ) {
            for ( int j = 1 ; j <= 3; j++ ) {
                for ( int k = 1; k <= 4 ; k++ ) {
                    System.out.print('*');
                System.out.println();
                }
            } // fim do for interno
            System.out.println();
        } // fim do for externo
    }
    /*
    Output: imprime 5 grupos de 12 x '*'
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *

    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *

    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *

    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *

    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
     */
}
