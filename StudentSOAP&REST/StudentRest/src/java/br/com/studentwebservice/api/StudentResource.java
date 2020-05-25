package br.com.studentwebservice.api;

import br.com.studentwebservice.dao.StudentDAO;
import br.com.studentwebservice.model.Login;
import br.com.studentwebservice.model.Student;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Gutemberg
 */
@Path("student")
public class StudentResource {

    @Context
    private UriInfo context;
    
    private StudentDAO studentDAO;
    private Gson gson;

    public StudentResource() {
        studentDAO = new StudentDAO();
        gson = new Gson();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String wellcome() {
        return new Gson().toJson("Wellcome to my API");
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("create")
    public String createStudent(Student student){
        boolean result = studentDAO.createStudent(student);
        return result ? "Success" : "Error";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public String getAllStudents() {
        List<Student> results = studentDAO.readAll();
        return results != null ? gson.toJson(results) : 
                gson.toJson("No students to show!");
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/{user}/{password}")
    public String getStudent(@PathParam("user") String user, 
            @PathParam("password") String password){
        
        Login login = new Login();
        login.setUser(user);
        login.setPassword(password);
        
        Student student = studentDAO.read(login);
        
        return student != null ? gson.toJson(student) 
                : gson.toJson("No student to show!");
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("remove/{user}/{password}")
    public String deleteStudent(@PathParam("user") String user, 
            @PathParam("password") String password){
        
        Login login = new Login();
        login.setUser(user);
        login.setPassword(password);
        
        boolean result = studentDAO.delete(login);
        
        return result ? "Success" : "Error";
    }
}
