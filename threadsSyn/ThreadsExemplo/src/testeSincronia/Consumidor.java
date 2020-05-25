package testeSincronia;

public class Consumidor extends Thread {

    private Cubo cubo;
    private int number;

    public Consumidor(Cubo c, int number) {
        cubo = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubo.get();
            System.out.println("Consumidor pegou o n�mero:" + value);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
