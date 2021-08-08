package ListaCap2;

import java.util.Scanner;

public class Cap2Q26 {

    public static void main(String []args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        System.out.print("Insira outro numero: ");
        n2 = input.nextInt();

        if (n1 % n2 == 0.0) {
            System.out.print(n1 + " Eh multiplo de " + n2);
        } else {
            System.out.print(n1 + " Nao eh multiplo de " + n2);
        }
    }
}
