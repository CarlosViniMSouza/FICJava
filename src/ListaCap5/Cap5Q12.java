package ListaCap5;

public class Cap5Q12 {

    /*
    5.12 Escreva um aplicativo que calcule o produto dos numeros inteiros impares de 1 a 15.
     */

    public static void main(String []args) {

        int cont = 1;

        for (int i = 1; i <= 15; i = i + 2) {
            cont *= i;
            //i = i + 2;
        }

        System.out.println("Multiplication Result: " + cont);
    }
}
