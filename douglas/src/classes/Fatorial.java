/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author COMPUTER
 */
public class Fatorial {

    public int fatorial(int i) {
        if (i <= 1) {
            return 1;
        } else {
            return fatorial(i - 1) * i;
        }
    }
}
