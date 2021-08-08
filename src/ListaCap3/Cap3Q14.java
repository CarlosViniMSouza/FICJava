package ListaCap3;

public class Cap3Q14 {

    /*

    Crie uma classe chamada Employee que inclua 3 variaveis de instancia - um primeiro nome (tipo 'String'),
    um sobrenome (tipo String) e um salario mensal (double). Forneca um construtor que inicializa as 3 variaveis
    de instancia. Forneca um metodo 'set' um 'get' para cada variavel de instancia.
    Se o salario mensal nao for positivo, nao configure seu valor. Escreva um aplicativo de teste chamado 'EmployeeTest'
    que demonstra as capacidades da classe 'Employee'. Crie 2 objetos 'Employee' e exiba o salario anual de cada objeto.
    Então dê a cada 'Employee' um aumento de 10% e exiba novamente o salario anual de cada 'Employee'.

     */

    public static void main(String []args) {

        class Employee {

            public String employee_Name;
            public String employee_LastName;
            public double employee_MonthlySalary;

            public Employee(String name, String lastName, double Salary) {
                employee_Name = name;
                employee_LastName = lastName;
                employee_MonthlySalary = Salary;
            }

            public void setName(String name) {
                employee_Name = name;
            }

            public void setEmployee_LastName(String lastName) {
                employee_LastName = lastName;
            }

            public void setEmployee_Salary(double Salary) {
                employee_MonthlySalary = Salary;
            }

            public String getEmployee_Name() {
                return employee_Name;
            }

            public String getEmployee_UserName() {
                return employee_LastName;
            }

            public Double getEmployee_Salary() {
                return employee_MonthlySalary;
            }

            public void Message() {

                System.out.println("Employee Account:");
                System.out.println("name: " + getEmployee_Name());
                System.out.println("last name: " + getEmployee_UserName());

                if (employee_MonthlySalary < 0.0) {
                    System.out.println("Salary Invalid. Restart the system!");
                } else {
                    System.out.println("Ok, your actual salary is: " + getEmployee_Salary() + "\n");
                }
            }
        }

        Employee newEmployee = new Employee("Carlos","Souza", 23500.4);
        // criei um objeto da classe employee usando eu como examplo.

        newEmployee.Message(); //vai mostrar minhas informacoes.
        // fim da aplicabilidade da classe Employee.

        class EmployeeTest {

            private double employee_AnnualSalary;

            public EmployeeTest(double Salary) {
                employee_AnnualSalary = (Salary * 12);
            }

            public void setEmployee_Salary(double Salary) {
                employee_AnnualSalary = (Salary * 12);
            }

            public Double getEmployee_Salary() {
                return employee_AnnualSalary;
            }

            public Double getSalaryUp() {
                return employee_AnnualSalary + (employee_AnnualSalary * 0.1);
            }

            public void MessageTest() {
                System.out.println("Your Annual Salary is: " + getEmployee_Salary());
                System.out.println("After the raise, your salary will be: " + getSalaryUp() + "\n");
            }
        }

        EmployeeTest newEmployeeNum1 = new EmployeeTest(100);
        EmployeeTest newEmployeeNum2 = new EmployeeTest(25000);

        newEmployeeNum1.MessageTest();
        newEmployeeNum2.MessageTest();

    }
}
