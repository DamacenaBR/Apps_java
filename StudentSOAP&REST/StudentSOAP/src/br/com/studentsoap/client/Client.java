package br.com.studentsoap.client;

import br.com.studentsoap.interfaces.StudentInterface;
import br.com.studentsoap.model.Login;
import br.com.studentsoap.model.Student;
import java.net.URL;
import java.util.Arrays;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Gutemberg
 */
public class Client {
    public static void main(String[] args) throws Exception{
        
        //passar o endereço do WSDL via URL
        URL url = new URL("http://127.0.0.1:2122/student?wsdl");
        
        //namespace e o nome do serviço (classe SIB acrescida da palava Service - WSDL) //
        //targetNamespace
        QName qname = new QName("http://dao.studentsoap.com.br/", "StudentDAOService");
        
        //cria uma inst�ncia do servi�o
        Service ws = Service.create(url, qname);
        
        //interface cliente
        StudentInterface student = ws.getPort(StudentInterface.class);
        
        Student s = new Student();
        s.setName("TestClientSOAP10");
        s.setRg(0000000);
        s.setGrade(5);
        
        Login loginStudent = new Login();
        loginStudent.setUser("005");
        loginStudent.setPassword("005");
        s.setLogin(loginStudent);
        
        //Create new student
        //System.out.println(student.createStudent(s));
        
        Login loginConsult = new Login();
        loginConsult.setUser("001");
        loginConsult.setPassword("001");
        
        //Get a student by login
        System.out.println(student.read(loginConsult).toString());
        
        //Get all students
        //System.out.println(student.readAll());
        
        //Remove an user by login
        //System.out.println(student.delete(loginConsult));
        
    }
    
}
