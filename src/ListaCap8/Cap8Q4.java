package ListaCap8;

public class Cap8Q4 {

    /*
     * Crie uma classe 'Rectangle' com atributos 'length' e 'width', cada um dos
     * quais assume o padrão de 1.
     * Forneça metodos que calculem o perimetro e area do retangulo. A classe tem
     * métodos set/get para o comprimento
     * (length) e a largura (width). Os métodos 'set' devem verificar se length e
     * width são, cada um, números de ponto
     * flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar
     * a classe 'Rectangle'.
     */

    static class Rectangle {

        private float length;
        private float width;

        public Rectangle(float length, float width) {
            this.length = length;
            this.width = width;
        }

        public boolean setLength(float length) {
            return length > 0.0 && length < 20.0;
        }

        public boolean setWidth(float width) {
            return width > 0.0 && width < 20.0;
        }

        public float getLength() {

            return length;
        }

        public float getWidth() {

            return width;
        }

        public void Perimeter() {
            if (setLength(length) && setWidth(width)) {
                System.out.println("Your perimeter is: " + 2 * (getLength() + getWidth()));
            } else {
                System.out.println("Error");
            }

        }

        public void Area() {
            if (setLength(length) && setWidth(width)) {
                System.out.println("Your perimeter is: " + (getLength() * getWidth()));
            } else {
                System.out.println("Error");
            }
        }
    }

    public static void main(String[] args) {
        Rectangle calc1 = new Rectangle(19.0f, 10.0f);
        calc1.Perimeter();
        calc1.Area();
    }

}
