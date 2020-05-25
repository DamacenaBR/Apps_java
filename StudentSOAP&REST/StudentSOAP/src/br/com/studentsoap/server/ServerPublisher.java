
package br.com.studentsoap.server;

import br.com.studentsoap.dao.StudentDAO;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Gutemberg
 */
public class ServerPublisher {

    public static void main(String[] args) {
        // localhost 127.0.0.1
		
	//Permite publicar um serviço em um servidor
	//parametros: o endere�o do servidor e a instancia do SIB        
        Endpoint.publish("http://127.0.0.1:2122/student", new StudentDAO());
        System.out.println("WebService started successfuly!");
    }
    
}
