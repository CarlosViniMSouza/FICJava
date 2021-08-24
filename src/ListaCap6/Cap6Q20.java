package ListaCap6;

import java.util.Scanner;

public class Cap6Q20 {

    /*
    Escreva um aplicativo que solicite ao usuário o raio de um círculo e utilize um método chamado 'circleArea'
    para calcular a área do círculo.
     */

    public static class Result {

        public void Circumference() {
            Scanner input = new Scanner( System.in );

            System.out.print("Digite o raio do circulo: " );
            float rain = input.nextFloat();

            float resp = circleArea(rain);
            System.out.println("A circunferencia mede: " + resp);
        }

        public float circleArea(float rain) {
            return (float) (2 * Math.PI * rain);
        }
    }

    public static void main(String []args) {
        Result circle_Area = new Result();
        circle_Area.Circumference();
    }
}
