/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24LabComp2
 */
public class Calc {
    
    public static double somar (double a, double b){
        return a + b;
    }
    
    public static double subtrair(double a, double b){
        return a - b;
    }

    static double multiplicar(int a, double b) {
        return a * b;
    }

    static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero");
        }
        return a / b;
    }
}
