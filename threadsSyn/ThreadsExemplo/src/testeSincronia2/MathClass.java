package testeSincronia2;

public class MathClass {

    public void printNumbers(int n) throws InterruptedException{

        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                System.out.println(Thread.currentThread().getName() + " :: " + i);
                Thread.sleep(500);
            }
        }
        System.out.println("FORA DO SYNC");
    }
}
