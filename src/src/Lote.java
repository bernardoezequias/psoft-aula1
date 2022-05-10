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
        return "Este é um lote do produto " + this.produto.getNome() + ". Possui " + this.quantidade
                + " unidades em estoque. ID: " + this.id;
    }
}
