package devChat;

import java.io.BufferedWriter;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ServidorThChat extends Thread {

    private static ArrayList<BufferedWriter> clientes;
    private static ServerSocket server;
    private String nome;
    public static Socket con;
    private InputStream in;
    private InputStreamReader inr;
    private BufferedReader bfr;
    public static int cont; // criada uma variavel para ser o contador, onde a mesma irá finalizar o processo

    public ServidorThChat(Socket con) {
        this.con = con;
        try {
            in = con.getInputStream();
            inr = new InputStreamReader(in);
            bfr = new BufferedReader(inr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            server = new ServerSocket(1234);
            clientes = new ArrayList<BufferedWriter>();
            System.out.println("Servidor ativo ");

            while (true) {

                System.out.println("Aguardando conex�o...");
                try {
                    con = server.accept(); // criando a exceção para  a espera do cliente acessar 

                } catch (Exception e) {
                    return;
                }
                System.out.println("Conectado!!!");
                Thread t = new ServidorThChat(con);
                t.start();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {
            cont++;

            String msg;
            OutputStream out = this.con.getOutputStream();//enviar dados para o cliente (writer)
            Writer ouw = new OutputStreamWriter(out);
            BufferedWriter bfw = new BufferedWriter(ouw);

            clientes.add(bfw);
            nome = msg = bfr.readLine();//recebe dados do cliente (reader)
            System.out.println("\n" + nome.toUpperCase() + " est� no chat");

            while (!"Sair".equalsIgnoreCase(msg) && msg != null) {

                cont++;
                msg = bfr.readLine();
                enviarAll(bfw, msg);
                System.out.println(nome + " -> " + msg);

            }
            cont++;
            clientes.remove(bfw);
            if (clientes.isEmpty()) {//verifica se esta string está vazia ou não.
                if (cont != 0) {
                    server.close(); //fecha o servidor, finalizando
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void enviarAll(BufferedWriter bwSaida, String msg) throws IOException {
        BufferedWriter bwS;

        for (BufferedWriter bw : clientes) {
            bwS = (BufferedWriter) bw;
            if (!(bwSaida == bwS)) {
                bw.write(nome + " -> " + msg + "\r\n");
                bw.flush();
            }
        }
    }

}
