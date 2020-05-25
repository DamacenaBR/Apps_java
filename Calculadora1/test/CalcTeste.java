/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 24LabComp2
 */
public class CalcTeste {
    
    public CalcTeste() {
    }
    
    @Test
    public void test_soma(){
        double esperado = 11;
        double atual = Calc.somar(5, 6);
        assertEquals(esperado, atual, 0.01);
    }
    
    @Test
    public void test_subtrair(){
        double esperado = -1;
        double atual = Calc.subtrair(5, 6);
        assertEquals(esperado, atual, 0.01);
    }
    
    @Test
    public void test_multiplicao(){
        double esperado = 39;
        double atual = Calc.multiplicar(6, 6.5);
        assertEquals(esperado, atual, 0.01);
    }
    
    @Test
    public void test_divisao(){
        double esperado = 5;
        double atual = Calc.dividir(10, 2);
        assertEquals(esperado, atual, 0.01);
    }
    
    @Test(expected=ArithmeticException.class)
    public void test_divisao_zero(){
        double valor = Calc.dividir(10, 0);
    }
}
