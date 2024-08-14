package numero2;
import java.util.Scanner;

import numero1.Pessoa;

public class main2 {
    public static void App(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Qual o peso da psssoa?");
        double peso = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa?");
        double altura = scanner.nextDouble();
        scanner.close();

        pessoa.peso = peso;
        pessoa.altura=altura;

        System.out.println("o imc da pessoa é " + pessoa.calcularImc());
        
    }
}