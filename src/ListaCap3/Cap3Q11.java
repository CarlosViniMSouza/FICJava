package ListaCap3;

public class Cap3Q11 {

    public static void main(String []args) {

        /* II Figura 3.10: GradeBook.java

            // Classe GradeBook com um construtor para inicializar o nome de um curso.

             public class GradeBook {

                private String courseName; // nome do curso para esse GradeBook

             // O construtor inicializa 'courseName' com o argumento String

                public GradeBook( String name ) {
                    courseName name; // Inicializa courseName
             } // Fim do construtor

             // Metodo para configurar o nome do curso

                public void setCourseName( String name ) {
                    courseName = name; // Armazena o nome do curso
             } // Fim do metodo setCourseName

             // Metodo para recuperar o nome do curso
                public String getCourseName() {
                    return courseName;
             } // Fim do metodo getCourseName

             // Exibe uma mensagem de boas-vindas para o usuario GradeBook
                public void displayMessage() {

             // Essa instrucao chama 'getCourseName' para obter o
             // Nome do curso que esse GradeBook representa:

                System.out.printf( "Welcome to the GradeBook for\ n%s!\ n" ,
                getCourseName() );
                } // Fim do metodo displayMessage

             } // Fim da classe GradeBook

         */

        /* Faca as seguintes alteracoes:

        a) Inclua uma variavel de instancia String que representa o nome do instrutor do curso.
        b) Forneça um metodo 'set' para alterar o nome do instrutor e um metodo 'get' para recupera-lo.
        c) Modifique o construtor para especificar 2 parametros - 1 para o nome do curso, e 1 para o nome do instrutor.
        d) Modifique o metodo 'displayMessage' para gerar saída da mensagem de boas-vindas e do nome do curso,
        seguido por "This course is presented by: "O nome do professor".

        Utilize sua classe modificada cm um aplicativo de teste que demonstra as novas capacidades da classe.

         */

        class GradeBook {

            private String courseName;
            private String instructor;

            // Inicializando construtor com 2 parametros:
            public GradeBook( String course, String name ) {
                courseName = course;
                instructor = name;
            } // Fim do construtor

            // Metodo para configurar o nome do curso
            public void setCourseName( String course ) {
                courseName = course;
            }

            // Metodo para configurar o nome do instrutor
            public void setInstructor( String name ) {
                instructor = name;
            }

            // Metodo para recuperar o nome do curso
            public String getCourseName() {
                return courseName;
            }

            // Metodo para recuperar o nome do instrutor
            public String getInstructor() {
                return instructor;
            }

            // Exibe uma mensagem de boas-vindas para o usuario GradeBook
            public void displayMessage() {

                System.out.println("Welcome to the GradeBook for: " + getCourseName());

                System.out.println("This course is presented by: " + getInstructor());

            }
        }

        GradeBook MyGradeBook = new GradeBook("Java Orientado a Objetos", "Vitor Bremgartner da Frota");
        // Nosso Objeto de Classe foi criado, permitindo-nos fazer quaisquer chamadas necessarias:

        MyGradeBook.displayMessage(); // O console vai emitir uma mensagem.

    }
}

