/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeapi;

import static testeapi.api.check;

/**
 *
 * @author COMPUTER
 */
public class TesteApi {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
            try {
                check();
            }
            catch (Exception e) {
                System.out.println (e);
            }
        }
    
}
