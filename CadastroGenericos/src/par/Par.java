/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par;

/**
 *
 * @author COMPUTER
 */
public class Par <k, e>{

    private k chave;
    private e objeto;
    
    public k getChave(){
        return this.chave;
    }
    
    public e getobjeto(){
        return this.objeto;
    }
    
    public void setChave(k chave){
        this.chave = chave;
    }
    
    public void setObjeto(e objeto){
        this.objeto = objeto;
    }
    
    public static void main(String[] args) {
        Par<Integer,String> par = new Par<>();
        par.setChave(42);
        par.setObjeto("é a resposta para o universo!!!");
        System.out.println(par.getChave() + " " + par.getobjeto());
        
    }
    
}
