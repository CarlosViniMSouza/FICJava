package ListaCap8;

public class Cap8Q12 {

    /*
    Crie uma classe chamada Complex para realizar aritmetica com numeros complexos. Os numeros complexos tem a
    forma: parteReal + parteImaginaria * i (lembrando que i = sqrt(-1))

    Escreva um programa para testar sua classe. Utilize variaveis de ponto flutuantes para representar os dados
    'private' da classe. Forneça um construtor que permita que um objeto dessa classe seja inicializado quando ele
    for declarado. Forneca um construtor sem argumento com valores padrao caso nenhum inicializador seja fornecido.
    forneça metodos 'public' que realizam as seguintes operacoes:

    a) Somar dois números Complex: as partes reais sao somadas de um lado e as partes imaginarias sao somadas de outro.
    b) Subtrair dois números Complex: a parte real do operando direito é subtraída da parte real do operando esquerdo
    e a parte imaginaria do operando direito eh subtraida da parte imaginaria do operando esquerdo.
    c) Imprimir numeros Complex na forma (a, b), onde 'a' eh a parte real e 'b' eh a parte imaginaria.
     */

    static class Complex {

        private float real1, real2, imag1, imag2;

        public Complex(float real1, float imag1) {
            this.real1 = real1;
            this.imag1 = imag1;
            this.real2 = real2;
            this.imag2 = imag2;
        }

        public void Sum() {
            System.out.println("Sum of parts real: " + (real1 + real2));
            System.out.println("Sum of parts imaginaries: " + (imag1 + imag2));
        }

        public void Sub() {
            System.out.println("Sub of parts real: " + (real1 - real2));
            System.out.println("Sub of parts imaginaries: " + (imag1 + imag2));
        }

        public void Form() {
            System.out.println("Form (I): (" + real1 + ", " + imag1 + ")");
            System.out.println("Form (II): (" + real2 + ", " + imag2 + ")");
        }
    }

    public static void main(String []args) {
        Complex eq1 = new Complex(2.0f, 4.5f);
    }
}
