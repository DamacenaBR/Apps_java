package br.com.studentsoap.interfaces;

import br.com.studentsoap.model.Login;
import br.com.studentsoap.model.Student;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Gutemberg
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface StudentInterface {
    
    @WebMethod
    public boolean createStudent(Student student);
    
    @WebMethod
    public ArrayList<Student> readAll();
    
    @WebMethod
    public Student read(Login login);
    
    @WebMethod
    public boolean delete(Login login);
}
