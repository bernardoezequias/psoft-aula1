public class Sistema {

    public static void main(String[] args) {
        Produto p = new Produto("P01", "Leite", "Um fabriante qualquer");
        Lote l1 = new Lote("L01", p, 10);

        System.out.println(p);
        System.out.println(l1);
    }
}
