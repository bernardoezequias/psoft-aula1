public class Produto {
    private String id;
    private String nome;
    private String fabricante;

    public Produto(String id, String nome, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String toString() {
        return "O produto " + this.nome + " foi fabricado por: " + this.fabricante
            + ". ID: " + this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
