package chat.sd;

import java.io.BufferedWriter;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ServidorThChat extends Thread {

    private static ArrayList<BufferedWriter> clientes;
    private static ServerSocket server;
    private String nome;
    private Socket con;
    private InputStream in;
    private InputStreamReader inr;
    private BufferedReader bfr;
    private static boolean teste;

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
            teste = false;
            while (true) {
                if(teste){
                    break;
                }
                System.out.println("Aguardando conex�o...");
                Socket con = server.accept();
                System.out.println("Cliente conectado...");
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

            String msg;
            OutputStream out = this.con.getOutputStream();//enviar dados para o cliente (writer)
            Writer ouw = new OutputStreamWriter(out);
            BufferedWriter bfw = new BufferedWriter(ouw);

            clientes.add(bfw);
            nome = msg = bfr.readLine();//recebe dados do cliente (reader)
            System.out.println("\n" + nome.toUpperCase() + " est� no chat");

            while (!"Sair".equalsIgnoreCase(msg) && msg != null) {

                msg = bfr.readLine();
                enviarAll(bfw, msg);
                System.out.println(nome + " -> " + msg);

            }
            clientes.remove(bfw);
            if (clientes.size() == 0) {
                server.close();
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
