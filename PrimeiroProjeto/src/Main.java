public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.nome = "eduardo";
        aluno.idade = 20;

        System.out.println("Nome do aluno é " + aluno.nome + " e a idade é " + aluno.idade );
        System.out.println(aluno.textoApresentacao());
    }
}
