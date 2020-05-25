
package model;


public class Aluno {
    
    private String login;
    private float nota;
    private int rg;
    
    public Aluno(){
        
    }

    public Aluno(String login, float nota, int rg){
        this.login = login;
        this.nota = nota;
        this.rg = rg;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }


    


    
    
    
}
