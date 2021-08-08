package ListaCap4;

import java.util.Scanner;

public class Cap4Q20v2 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        class Employees {

            public double pay;

            public String setEmployee_Name() {
                String name;
                System.out.println("Write your name: ");
                name = input.next();
                return name;
            }

            public int setEmployee_Salary_Hours() {
                int salary;
                int hours;

                System.out.println("Write your work hours in week: ");
                hours = input.nextInt();
                System.out.println("Write your salary: ");
                salary = input.nextInt();

                if (hours > 40) {
                    pay = salary + (0.5 * salary);
                } else {
                    pay = salary;
                }
                return hours;
            }

            public void Request() {

                System.out.println("Employee Account:");
                System.out.println("name: " + setEmployee_Name());
                System.out.println("hours: " + setEmployee_Salary_Hours());
                System.out.println("Your pay: " + pay);

            }
        }

        Employees Employee1 = new Employees();
        Employee1.Request();

        Employees Employee2 = new Employees();
        Employee2.Request();

        Employees Employee3 = new Employees();
        Employee3.Request();

    }
}
