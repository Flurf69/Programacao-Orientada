package numero2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroConta1, numeroConta2,titularConta1, titularConta2;
        System.out.println("informe o numero da conta 1");
        numeroConta1=sc.nextLine();
        System.out.println("informe o numero da conta 2");
        numeroConta2=sc.nextLine();
        System.out.println("informe o titular da conta 1");
        titularConta1=sc.nextLine();
        System.out.println("informe o titular da conta 2");
        titularConta2=sc.nextLine();

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        c1.setTitular(titularConta1);
        c1.setNumero(numeroConta1);
        c2.setTitular(titularConta2);
        c2.setNumero(numeroConta2);

        c1.depositar(1000);
        c1.depositar(700);

        c2.depositar(5000);

        c2.sacar(3000);

        c2.transferir(c1,1800);

        System.out.println(c1.getTitular() + c1.getSaldo());
        System.out.println(c2.getTitular() + c2.getSaldo());
    }
}
