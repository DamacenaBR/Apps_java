package testeapi;

import java.io.*;
import java.net.*;
import com.google.gson.*;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class api {
    
    //hospedeiro, caminho
    static String host = "https://api.cognitive.microsoft.com";
    static String path = "/bing/v7.0/spellcheck";
    
    static String key = "837b68c6adb7424d826b0dd70e1c0db3";
    
    //?mkt= à cadeia de caracteres de mercado
    static String mkt = "en-US";    
    //parâmetro &mode= ao modo de verificação ortográfica
    static String mode = "proof";
    
    static String text = "Hollo, wrld!";
    
    //Crie uma função chamada check() para criar e enviar a solicitação da API
    public static void check() throws Exception {
        //paramentro
        String params = "?mkt=" + mkt + "&mode=" + mode;
        
        //Crie uma URL combinando o host do ponto de extremidade, o caminho e a cadeia de caracteres de parâmetros.
        //Crie um objeto HttpsURLConnection.
        URL url = new URL(host + path + params);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        
        
        //Defina o método de solicitação como POST usado pra enviar dados ao servidor por meio de um formulario.       
        connection.setRequestMethod("POST");
        
        //usando de forma mais geral para manda texto para o servidor e enviado como uma cadeia de consulta longa
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        
        //Adicione a chave de assinatura ao cabeçalho Ocp-Apim-Subscription-Key.
        connection.setRequestProperty("Ocp-Apim-Subscription-Key", key);
        
        //criar uma conecção duradora
        connection.setDoOutput(true);
        
        
        //Crie um objeto DataOutputStream e envie a solicitação à API.
        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes("text=" + text);
        wr.flush();
        wr.close();
        
        //Crie um BufferedReader e leia a resposta da API. Imprima-a no console.
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(prettify(line));
        }
        in.close();
    }
    
    //Adicione esse método à classe. Ele formata o JSON para uma saída mais legível.
    public static String prettify(String json_text) {
        JsonParser parser = new JsonParser();
        JsonElement json = parser.parse(json_text);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(json);
    }

        
    

}
