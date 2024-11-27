public class App {
    public static void main(String[] args) {
        // Instancia o ImportadorEstoque
        ImportadorEstoque importador = new ImportadorEstoque();

        // Caminho do arquivo CSV
        String caminhoArquivo = "src/L16_Estoque.csv"; // Certifique-se de colocar o caminho correto

        // Processa o arquivo CSV
        importador.processarArquivo(caminhoArquivo);

        // Lista os produtos e suas quantidades
        importador.listarEstoque();
    }
}
