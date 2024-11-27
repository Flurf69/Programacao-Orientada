import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ImportadorEstoque {
    private HashMap<Produto, Integer> estoque;

    // Construtor
    public ImportadorEstoque() {
        estoque = new HashMap<>();
    }

    // Métod para processar o arquivo CSV
    public void processarArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            // Ignorando o cabeçalho
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                double valor = Double.parseDouble(dados[1]);
                int quantidade = Integer.parseInt(dados[2]);

                Produto produto = new Produto(nome, valor);

                // Se o produto já estiver no mapa, soma a quantidade
                estoque.put(produto, estoque.getOrDefault(produto, 0) + quantidade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para listar os produtos e suas quantidades
    public void listarEstoque() {
        for (Produto produto : estoque.keySet()) {
            System.out.println(produto + " - Quantidade em estoque: " + estoque.get(produto));
        }
    }

    // Getter para o estoque
    public HashMap<Produto, Integer> getEstoque() {
        return estoque;
    }
}
