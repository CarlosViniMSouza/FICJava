package ListaCap3;

import java.util.Scanner;

public class Cap3Q12P2 {

    public static void main(String []args) {

        class Account {

            private double balance;

            public Account( double initialBalance ) {
                //valida a condicao de initialBalance, que deve ser maior que 0:
                if ( initialBalance > 0.0 ) {
                    balance = initialBalance;
                }
            }

            public void credit ( double amount ) {

                balance = balance + amount;
            }

            // retira uma certa quantia na Account:
            public void debit( double due ) {

                if ( balance < due) {
                    System.out.println("Quantia de debito excedeu o saldo da conta");
                } else {
                    System.out.println("Seu saldo esta OK !");
                    balance = balance - due;
                }
            }

            // retorna o saldo da Account:
            public double getBalance() {

                return balance;
            }

        }

        // metodo main inicia a execucao do aplicativo Java
        Account account1 = new Account(50.00); // cria o objeto Account
        Account account2 = new Account(100.50); // cria o objeto Account

        // exibe o saldo inicial de cada objeto
        System.out.println("account1 balance : \n" + account1.getBalance());
        System.out.println("account2 balance : \n" + account2.getBalance());

        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        double depositAmount;
        double dueAmount;

        System.out.println("Enter deposit amount for account1 : "); // prompt
        depositAmount = input.nextDouble(); //entrada do usuario
        System.out.println("Adding to account1 balance : " + depositAmount);
        account1.credit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        System.out.println("account1 balance : " + account1.getBalance());
        System.out.println("account2 balance : " + account2.getBalance());
        // prompt

        System.out.println("Enter deposit amount for account2 : ");
        depositAmount = input.nextDouble(); //entrada do usuário
        System.out.println("Adding to account2 balance: " + depositAmount);
        account2.credit(depositAmount); // adicionar ao saldo

        //de account2 exibe os saldos com os acrescimos
        System.out.println("account1 balance : " + account1.getBalance());
        System.out.println("account2 balance : " + account2.getBalance());

        // inserir divida em cada conta
        System.out.println("Enter due total for account1:"); // prompt
        dueAmount = input.nextDouble(); //entrada do usuario
        System.out.println("Removing to account1 balance: " + dueAmount);
        account1.debit(dueAmount); // adiciona a divida em account1

        System.out.println("Enter due total for account2 : ");
        dueAmount = input.nextDouble(); //entrada do usuário
        System.out.println("Removing to account1 balance: " + dueAmount);
        account2.debit(dueAmount); // adicionar ao saldo

        //de account2 exibe os saldos com os decrescimos
        System.out.println("account1 balance : " + account1.getBalance());
        System.out.println("account2 balance : " + account2.getBalance());

    }
}

