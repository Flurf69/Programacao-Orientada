package numero1.numero1;
import java.util.Scanner;

public class main {

        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println("qualo nome da pessoa 1?");
        String nome = scanner.next();
        System.out.println("Qual o peso da psssoa1?");
        double peso1 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa1?");
        double altura1 = scanner.nextDouble();
        System.out.println("qualo nome da pessoa 2?");
        String nome2 = scanner.next();
        System.out.println("Qual o peso da psssoa2?");
        double peso2 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa2?");
        double altura2 = scanner.nextDouble();
        System.out.println("qualo nome da pessoa 3?");
        String nome3 = scanner.next();
        System.out.println("Qual o peso da psssoa3?");
        double peso3 = scanner.nextDouble();
        System.out.println("Qual a altura da pessoa3?");
        double altura3 = scanner.nextDouble();
        scanner.close();

        pessoa.setPeso(peso1);
        pessoa.setAltura(altura1);
        pessoa2.setPeso(peso2);
        pessoa2.setAltura(altura2);
        pessoa3.setPeso(peso3);
        pessoa3.setAltura(altura3);
        pessoa.setNome(nome);
        pessoa2.setNome(nome2);
        pessoa3.setNome(nome3);

        System.out.println("o imc da pessoa " + pessoa3.nome + " é "+ pessoa3.calcularImc());
        System.out.println("O Imc da pessoa " + pessoa2.nome + " é " + pessoa2.calcularImc());
        System.out.println("O Imc da pessoa " + pessoa.nome + " é " + pessoa.calcularImc());
        
    }
    
}
