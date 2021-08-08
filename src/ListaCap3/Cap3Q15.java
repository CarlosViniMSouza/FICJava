package ListaCap3;

public class Cap3Q15 {

    public static void main(String []args) {

        class Date {

            public int Date_Dia;
            public int Date_Mes;
            public int Date_Ano;

            public Date(int dia, int mes, int ano) {
                Date_Dia = dia;
                Date_Mes = mes;
                Date_Ano = ano;
            }

            public void setDate_Dia(int dia) {
                Date_Dia = dia;
            }

            public void setDate_Mes(int mes) {
                Date_Mes = mes;
            }

            public void setDate_Ano(int ano) {
                Date_Ano = ano;
            }

            public int getDate_Dia() {
                return Date_Dia;
            }

            public int getDate_Mes() {
                return Date_Mes;
            }

            public int getDate_Ano() {
                return Date_Ano;
            }

            public void DateTest() {
                System.out.println("The day is: " + getDate_Dia() + "/" + getDate_Mes() + "/" + getDate_Ano());
            }
        }

        Date newData = new Date(15, 12, 2021);
        // criei um objeto da classe employee usando eu como examplo.

        newData.DateTest(); //vai mostrar minhas informacoes.
        // fim da aplicabilidade da classe Employee.

    }
}

