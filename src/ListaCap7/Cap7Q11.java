package ListaCap7;

public class Cap7Q11 {

    /*
    Escreva instrucoes que realizam as seguintes operações de um array multidimensional:

    a) Configure os 10 elementos do array de inteiros 'counts' como zeros.
    b) Adicione 1 a cada um dos 15 elementos do array de inteiros bonus.
    c) Exiba os cinco valores de array de inteiros 'bestScores' em formato de coluna.
     */

    public static void main(String []args) {

        // a) Configure os 10 elementos do array de inteiros 'counts' como zeros.
        int[] array = new int[10];

        for (int count = 0; count < array.length; count++) {
            array[count] = 0;
            System.out.print(array[count]);
            if(count == 4) {
                System.out.println();
            }

        }

        System.out.println("\n");

        // b) Adicione 1 a cada um dos 15 elementos do array de inteiros bonus.
        int[] bonus = new int[15];

        for (int count1 = 0; count1 < bonus.length; ++count1) {
            bonus[count1] = 1;
            System.out.print(bonus[count1]);
            if(count1 == 4 || count1 == 9) {
                System.out.println();
            }

        }

        System.out.println("\n");

        // c) Exiba os cinco valores de array de inteiros 'bestScores' em formato de coluna.
        int[] bestScores = new int[5];

        for (int count2 = 0; count2 < bestScores.length; ++count2) {
            bestScores[count2] = 10;
            System.out.print(bestScores[count2] + "\t");
        }

    }
}
