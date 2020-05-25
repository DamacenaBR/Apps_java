/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientews;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import model.Aluno;


public class HttpExemplo {
 
	private final String USER_AGENT = "Mozilla/5.0";
 
	public static void main(String[] args) throws Exception {
 
		HttpExemplo http = new HttpExemplo();
                String url = "http://localhost:8080/WebApplication1/webresources/sala/Aluno";
 
		System.out.println("Testing 1 - Evia a requisicao Http GET ");
		String json = http.sendGet(url);
                System.out.println(json);
 
                //tratar o arquivo json recebido
                Gson gson = new Gson();
                
                Aluno aluno = new Aluno();
                
                aluno = gson.fromJson(json, new TypeToken<Aluno>(){}.getType());
                System.out.println(aluno.getLogin());
                
	}
 
	// HTTP GET request
	private String sendGet(String url) throws Exception {
 
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		
                return response.toString();
	}
 
}
