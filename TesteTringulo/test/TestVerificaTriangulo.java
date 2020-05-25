
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author COMPUTER
 */
public class TestVerificaTriangulo {   
    @Test
    public void CT01(){
        boolean esperado = true;
        boolean atual = Triangulo.tringuloExiste1(5,6,10);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT02(){
        boolean esperado = false;
        boolean atual = Triangulo.tringuloExiste1(5,6,20);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT03(){
        String esperado = "Não é um triangulo";
        String atual = Triangulo.tringuloExiste2(5,6,20);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT04(){
        String esperado = "Triangulo Equilátero";
        String atual = Triangulo.tringuloExiste2(6,6,6);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT05(){
        String esperado = "Triangulo Isósceles";
        String atual = Triangulo.tringuloExiste2(6,6,10);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT06(){
        String esperado = "Triangulo Isósceles";
        String atual = Triangulo.tringuloExiste2(6,10,6);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT07(){
        String esperado = "Triangulo Isósceles";
        String atual = Triangulo.tringuloExiste2(10,6,6);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void CT08(){
        String esperado = "Triangulo Escaleno";
        String atual = Triangulo.tringuloExiste2(6,7,8);
        assertEquals(esperado, atual);
    }    
}
