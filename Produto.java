public class Produto implements Runnable {
    private int estoque;

    public Produto (int estoque) {
        this.estoque = estoque;
    }

    @Override
    //public synchronized void run() {
    public void run() {
        try {
            if (this.estoque > 0) {
                System.out.println("Pedido faturado!" + Thread.currentThread().getName());
                Thread.sleep(250);
                this.estoque--;
            } else {
                System.out.println("Estoque insuficiente!" + Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() + " foi interrompida.");
        }
    }
}
