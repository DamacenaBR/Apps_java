/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
public class Triangulo {
    
    public static boolean tringuloExiste1(int a, int b, int c){
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            if (a == b && b== c) {
                System.out.println("Triangulo Equilátero");
                return true;
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Triangulo Isósceles");
                return true;
            }
            else if (a != b && b != c && a != c) {
                System.out.println("Triangulo Escaleno");
                return true;
            }          
        }
        else{
            System.out.println("Não é um triangulo");
            return false;
        }
        return false;
    }
    
    public static String tringuloExiste2(int a, int b, int c){
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            if (a == b && b== c) {
                System.out.println("Triangulo Equilátero");
                return "Triangulo Equilátero";
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Triangulo Isósceles");
                return "Triangulo Isósceles";
            }
            else if (a != b && b != c && a != c) {
                System.out.println("Triangulo Escaleno");
                return "Triangulo Escaleno";

            }          
        }
        else{
            System.out.println("Não é um triangulo");
            return "Não é um triangulo";
        }
        return null;
    }
}
