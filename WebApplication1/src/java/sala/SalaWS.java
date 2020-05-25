/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala;


import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import model.Aluno;

/**
 * REST Web Service
 *
 * @author rnsg
 */
@Path("sala")
public class SalaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SalaWS
     */
    public SalaWS() {
    }
    
    @GET
    @Produces("application/jso")
    public String getNota(){
        return "Testando";
    }

    
    @GET
    @Produces("application/text")
    public String getAlunoText() {
        return "testando";
    }
    
    /**
     * Retrieves representation of an instance of sala.SalaWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("Aluno")
    public String getAluno() {
        
        Aluno aluno = new Aluno("rnsg", 8 , 1245367);
       
        Gson gson = new Gson();
        
        //converte para Json
        return gson.toJson(aluno);
    }
    
    @GET
    @Produces("application/json")
    @Path("Aluno/get/{login}")
    public String getAluno(@PathParam("login") String login)  {
        
        //buscar aluno com alunoDAO
        
        return "testando";
    }

    /**
     * PUT method for updating or creating an instance of SalaWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
