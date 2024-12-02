public class SolicitacaoDeCompra {
    public static void main(String[] args) {
        Produto produto = new Produto(3);
        Thread[] thread = new Thread[10];

        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(produto);
            thread[i].setName(" --> Cliente " + (i + 1));
            thread[i].start();
        }
    }
}
