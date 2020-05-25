package testeSincronia;

public class Produtor extends Thread {

    private Cubo cubo;
    private int number;

    public Produtor(Cubo c, int number) {
        cubo = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubo.put(i);
            System.out.println("Produtor colocou o n�mero:" + i);

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }
}
