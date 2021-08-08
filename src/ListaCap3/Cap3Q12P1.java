package ListaCap3;

import java.util.Scanner;

public class Cap3Q12P1 {

    public static void main(String []args) {

        /*

        Modifique a classe Account(Figura 3.13) para fornecer um metodo chamado 'debito' que retira dinheiro
        de uma Account. Assegure que a quantidade de 'debito' nao exceda o saldo de Account. Se exceder,
        o saldo deve ser deixado inalterado e o metodo deve imprimir uma mensagem que indica "Debito"
        amount exceeded account balance" [Quantia de debito excedeu o saldo da conta].

        Modifique a classe AccountTest (Figura 3.14) para testar o metodo debito.

         */

        class Account {

            private double balance;

            public Account( double initialBalance ) {
                //valida a condicao de initialBalance, que deve ser maior que 0:
                if ( initialBalance > 0.0 ) {
                    balance = initialBalance;
                }
            }

            /*
            public void credit ( double amount ) {

                balance = balance + amount;
            }
            */

            // retira uma certa quantia na Account:
            public void debit( double due ) {

                if ( balance < due ) {
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
            // A classe account com um construtor para validar e inicializar a variável de
            // instancia 'balance' do tipo 'double'.
        }

        Account myAccount = new Account(500);

        System.out.println("Seu saldo eh = " + myAccount.getBalance());

        myAccount.debit(550);

        System.out.println("Seu saldo agora eh = " + myAccount.getBalance());

    }
}

