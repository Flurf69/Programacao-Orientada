package numero1;

public class main {
    public static void App(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 78;

        System.out.println("O imc da psesoa é " + pessoa.calcularImc());
    }
}
