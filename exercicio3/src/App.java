import javax.swing.*;

public class App {

    static int qtdPessoa = 0;
    static Pessoa[] salario = new Pessoa[5];

    public static void main(String[] args) {

        do{
            String nomePessoa =  JOptionPane.showInputDialog("Digite o nome do pessoa: ");
            double SalarioV = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario da pessoa"));

            salario[qtdPessoa] = new Pessoa(SalarioV, nomePessoa);
            qtdPessoa++;

        } while (qtdPessoa <= 4);

    }
}
