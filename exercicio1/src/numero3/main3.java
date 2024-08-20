package numero3;
import java.util.Scanner;

import numero1.Pessoa;

public class main3 {

        public static void App(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println("Qual o peso da psssoa1?");
        double peso1 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa1?");
        double altura1 = scanner.nextDouble();
        System.out.println("Qual o peso da psssoa2?");
        double peso2 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa2?");
        double altura2 = scanner.nextDouble();
        System.out.println("Qual o peso da psssoa3?");
        double peso3 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa3?");
        double altura3 = scanner.nextDouble();
        scanner.close();

        pessoa.peso = peso1;
        pessoa.altura=altura1;
        pessoa2.peso = peso2;
        pessoa2.altura=altura2;
        pessoa3.peso = peso3;
        pessoa3.altura=altura3;

        System.out.println("o imc da pessoa 1 é " + pessoa.calcularImc() + " da 2 é " + pessoa2.calcularImc() + " da três é " + pessoa3.calcularImc());
        
    }
    
}
