package br.com.spellcheck.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class SpellCheck {

    static String HOST = "https://api.cognitive.microsoft.com";
    static String PATH = "/bing/v7.0/spellcheck";

    static String KEY = "837b68c6adb7424d826b0dd70e1c0db3";

    static String MKT = "en-US";
    //modo de verificação ortográfica
    static String MODE = "proof";
    //static String TEXT = "Hollo, wrld!";

    public static void check(String text) throws Exception {
        String params = "?mkt=" + MKT + "&mode=" + MODE;

        URL url = new URL(HOST + PATH + params);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Ocp-Apim-Subscription-Key", KEY);
        //pode enviar informação
        connection.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes("text=" + text);
        wr.flush();
        wr.close();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String response = "";
        String line;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);
            response += line;
        }
        System.out.println(prettify(response));
        in.close();
    }

    public static String prettify(String json_text) {
        JsonParser parser = new JsonParser();
        JsonElement json = parser.parse(json_text);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(json);
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Type a message: ");
            check(input.nextLine());
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

}
