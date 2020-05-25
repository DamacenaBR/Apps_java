/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisãoPoo;

/**
 *
 * @author bruno
 */
public class Atendente extends FuncionarioAtenticavel{
    private int ramal;

    public Atendente() {
        
    }
    
    public Atendente(String nome, String cpf, int idade, String matricula, int ramal) {
        super(nome, cpf, idade, matricula);
        this.ramal = ramal;
    }   

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public boolean autenticar(String usuario, String senha) {
        if (usuario ==  "admin" && senha == "123") {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRamal: " + ramal;
    }
}
