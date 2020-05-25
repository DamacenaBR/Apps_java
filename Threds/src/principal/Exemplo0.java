package principal;

import java.util.ArrayList;
import java.util.List;

public class Exemplo0 implements Runnable {

    //public static ArrayList<Integer> lista = new ArrayList<Integer>();
    public ArrayList<Integer> lista = new ArrayList<Integer>();
    public int inicial;

    public Exemplo0(int valor) {
        this.inicial = valor;
    }

    public Exemplo0(List<Integer> lista) {
        this.lista = (ArrayList<Integer>) lista;
    }

    public static void main(String[] args) {

        List<Integer> listaConcreta1 = new ArrayList<Integer>();
        List<Integer> listaConcreta2 = new ArrayList<Integer>();

        for (int i = 0; i < 34; i++) {
            listaConcreta1.add(i);
        }

        for (int i = 0; i < 45; i++) {
            listaConcreta2.add(i);
        }

//        Exemplo0 exemA = new Exemplo0(5);
//        Exemplo0 exemB = new Exemplo0(7);
//
//        new Thread(exemA).start();
//        new Thread(exemB).start();
        new Thread(new Exemplo0(listaConcreta1)).start();
        new Thread(new Exemplo0(listaConcreta2)).start();

    }

    @Override
    public void run() {

        long id = Thread.currentThread().getId();

//        System.out.println("Executando a thread " + id);
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }

        //System.out.println("Valor inicial da thread " + id + " é " + this.inicial);
        System.out.println("Soma da thread " + id + " é " + soma);

    }
}
