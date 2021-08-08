package ListaCap4;

import java.util.Scanner;

public class Cap4Q20 {

    public static void main(String []args) {

        String emp1, emp2, emp3;
        float pay1, pay2, pay3;
        int hours1, hours2, hours3;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome1: ");
        emp1 = input.next();
        System.out.print("\nDigite seu salario1 (por 40h/semana): ");
        pay1 = input.nextFloat();

        System.out.print("\nDigite seu nome2: ");
        emp2 = input.next();
        System.out.print("\nDigite seu salario2 (por 40h/semana): ");
        pay2 = input.nextFloat();

        System.out.print("\nDigite seu nome3: ");
        emp3 = input.next();
        System.out.print("\nDigite seu salario3 (por 40h/semana): ");
        pay3 = input.nextFloat();

        System.out.print("\nHoras trabalhadas nessa semana1: ");
        hours1 = input.nextInt();

        System.out.print("\nHoras trabalhadas nessa semana2: ");
        hours2 = input.nextInt();

        System.out.print("\nHoras trabalhadas nessa semana3: ");
        hours3 = input.nextInt();

        if (hours1 - 40 > 0) {
            System.out.printf("\nGanho semanal do %s: %.2f", emp1, (pay1 + pay1 * 0.5));
        } else {
            System.out.printf("\nGanho semanal do %s: %.2f", emp1, pay1);
        }

        if (hours2 - 40 > 0) {
            System.out.printf("\nGanho semanal do %s: %.2f", emp2, (pay2 + pay2 * 0.5));
        } else {
            System.out.printf("\nGanho semanal do %s: %.2f", emp2, pay2);
        }

        if (hours3 - 40 > 0) {
            System.out.printf("\nGanho semanal do %s: %.2f", emp3, (pay3 + pay3 * 0.5));
        } else {
            System.out.printf("\nGanho semanal do %s: %.2f", emp3, pay3);
        }

        //Codigo funciona, mas tem que melhorar!
    }
}
