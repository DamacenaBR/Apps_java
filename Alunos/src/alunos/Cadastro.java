/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

/**
 *
 * @author COMPUTER
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "abcdef";
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.insert(string.length() - 2, ',');
        System.out.println(stringBuilder.toString());
    }
    
}
