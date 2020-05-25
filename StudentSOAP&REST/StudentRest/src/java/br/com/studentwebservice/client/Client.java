/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.studentwebservice.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;


public class Client {
 
	private final String USER_AGENT = "Mozilla/5.0";
 
	public static void main(String[] args) throws Exception {
 
		Client http = new Client();

		System.out.println("[Request][New Student] => POST");
                String jsonContent = "{\"name\": \"TestePOSTJava\", \"rg\": 1234, \"grade\": 8, \"login\": {\"user\": \"000\", \"password\": \"000\"}}";
		http.sendPost("http://localhost:8080/StudentRest/webresources/student/create/", 
                        jsonContent);
               
		System.out.println("\n[Request][All Students] => GET");
		http.sendGet("http://localhost:8080/StudentRest/webresources/student/all");
                //System.out.println(http.sendGet("http://localhost:8080/StudentRest/webresources/student/all"));
                
                System.out.println("\n[Request][Get Student] => GET");
                http.sendGet("http://localhost:8080/StudentRest/webresources/student/get/000/000");
                //System.out.println(http.sendGet("http://localhost:8080/StudentRest/webresources/student/get/000/000"));
                System.out.println("\n[Request][Remove Student] => GET");
                http.sendGet("http://localhost:8080/StudentRest/webresources/student/remove/000/000");
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
		System.out.println("Sending 'GET' request to URL : " + url);
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
 
	// HTTP POST request
	private void sendPost(String url, String urlParameters) throws Exception {
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		//cabecalho da requisicao
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
                con.setRequestProperty("Content-Type", "application/json");

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                
		System.out.println(response.toString());
 
	}
 
}
