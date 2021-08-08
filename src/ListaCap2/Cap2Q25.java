package ListaCap2;

import java.util.Scanner;

public class Cap2Q25 {

    public static void main(String []args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner( System.in );

        int n1;

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        if (n1 % 2 == 0) {
            System.out.print("O numero eh par");
        } else {
            System.out.print("O numero eh impar");
        }

    }
}
