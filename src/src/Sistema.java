public class Sistema {

    public static void main(String[] args) {
        Produto p = new Produto("01", "Leite", "Um fabriante qualquer");
        Lote l1 = new Lote("01", p, 10);
    }
}
