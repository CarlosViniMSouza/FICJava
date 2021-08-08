package ListaCap4;

public class Cap4Q15 {

    /*

    Identifique e corrija os erros em cada um dos seguintes fragmentos de código.
    [Nota: pode haver mais de um erro em cada trecho de código.]

    a)
    if (age >= 65 );
        System.out.println( "Age is greater than or equal to 65" );
    else
        System.out.println( "Age is less than 65 )";

    b)
    int x = 1, total;
    while ( x <= 10 ) {
        total += x;
        ++x;
    }

    c)
    while ( x <= 100 )
        total += x;
        ++x;

    d)
    while ( y > 0 ) {
        System.out.println( y );
        ++y;

     */

    public static void main(String []args) {

        //(a)
        int age = 70;

        if ( age >= 65 ) {
            System.out.println( "Age is greater than or equal to 65" );
        } else {
            System.out.println( "Age is less than 65" );
        }

        //(b)
        int x = 1;
        int total = 0;

        while ( x <= 10 ) {
            total += x;
            ++x;
        } //aviso: O programa funciona, porem nao imprimiu nada no console! Adicionei um Sysout para resolver isso.

        System.out.println("\nYour total: " + total);

        //(c)
        int X = 1;
        int Total = 0;

        while ( X <= 100 ) {
            Total += X;
            ++X;
        }

        System.out.println("\nOther Total: " + Total);

        //(d)
        int y = 0;

        while ( y > 0 ) {
            System.out.println(y);
            ++y;
        } //Se y = 1, entra em loop infinito!

        System.out.println("\nThe word 'y' is: " + y);

    }
}
