public class Produto {
    private String nome;
    private double valor;

    // Construtor
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Getters e equals/hashCode para garantir a comparação correta
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return Double.compare(produto.valor, valor) == 0 && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + Double.valueOf(valor).hashCode();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
