package ListaCap4;

public class Cap4Q16 {

    /*
    4.16 - O que o seguinte programa imprime?

    // Exercicios 4.16: Mystery.java

    public class Mystery {

        public static void main( String[] args ) {

        int y;
        int x = 1;
        int total = 0;

        while ( x <= 10 ) {
            y = x * x;
            System.out.println( y );
            total += y;
            ++x;
        }

        System.out.printf( "Total is %d\n" , total );

        } // fim do main()
    } // fim da classe Mystery

     */

    public static void main(String []args) {

        int y;
        int x = 1;
        int total = 0;

        while ( x <= 10 ) {
            y = x * x;
            System.out.println( y );
            total += y;
            ++x;
        }

        System.out.printf( "Total is %d\n" , total );
    }

    /*
    Output:

    1
    4
    9
    16
    25
    36
    49
    64
    81
    100
    Total is 385

     */
}
