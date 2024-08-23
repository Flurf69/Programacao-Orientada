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

        JOptionPane.showMessageDialog(null, "O nome da pessoa 1 é "+ salario[0].getNome() +  salario[0].getSalario() +
                "O nome da pessoa 2 é " + salario[1].getNome() + salario[1].getSalario() + "O nome da pessoa 3 é " + salario[2].getNome() + salario[2].getSalario() +
                "O nome da pessoa 4 é " + salario[3].getNome() + salario[3].getSalario()+ "O nome da Pessoa 5 é " + salario[4].getNome() + salario[4].getSalario());
    }
}
//teste