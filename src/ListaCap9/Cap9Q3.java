package ListaCap9;

public class Cap9Q3 {

    /*
     * Muitos programas escritos com herança podem ser escritos com composicao e
     * vice-versa. Reescreva a classe
     * 'BasePlusCommissionEmployee' da hierarquia
     * 'CommissionEmployee-BasePlusCommissionEmployee para utilizar a
     * composicao em vez da heranca.
     */

    public static class BasePlusCommissionEmployee extends CommissionEmployee {
        private double baseSalary;

        public BasePlusCommissionEmployee(String first, String last, String ssn,
                double sales, double rate, double salary) {
            super(first, last, ssn, sales, rate);
            setBaseSalary(salary);
        }

        public void setBaseSalary(double salary) {
            baseSalary = ((salary < 0.0) ? 0.0 : salary);
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        @Override // indica que esse método sobrescreve um método de superclasse
        public double earnings() {
            return (getBaseSalary() + super.earnings());
        }

        @Override // indica que esse método sobrescreve um método de superclasse
        public String toString() {
            return String.format("%s %s\n%s: %.2f", "base-salaried",
                    super.toString(), "base salary", getBaseSalary());
        }
    }

    private static class CommissionEmployee {
        public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        }

        protected double earnings() {
            return 0;
        }
    }

    public static void main(String[] args) {
        BasePlusCommissionEmployee comm1 = new BasePlusCommissionEmployee("Carlos", "Souza", "0119",
                20456.75, 9.5, 15006.00);
        var s = comm1.toString();
        System.out.println("your result: " + s);
    } // o resultado da base salario está oculto por algum motivo.
}
