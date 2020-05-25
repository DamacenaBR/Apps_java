/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca2;

/**
 *
 * @author bruno
 */
public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
      
    public void praticar(){
        this.registroProfissional ++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Registro Profissional: " + getRegistroProfissional();
    }
    
}
