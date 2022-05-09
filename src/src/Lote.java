public class Lote {
    private String id;
    private Produto produto;
    private int quantidade;

    public Lote(String id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString() {
        return this.produto.getNome();
    }
}
