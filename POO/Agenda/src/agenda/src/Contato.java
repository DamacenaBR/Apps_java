
package agenda.src;

public class Contato {
    
    public String nome;
    public String email;
    public String[] telefones = new String[10];
    
    public void cadastrarTelefone(String telefone){
        for(int i = 0; i < telefones.length; i++){
            if(telefones[i] == null){
                telefones[i] = telefone;
                break;
            }
        }
    }
    
    public void telefonesDoContato(){
        for(int i = 0; i < telefones.length; i++){
            if(telefones[i] != null){
                System.out.println("Telefone: "+telefones[i]);
            }
        }
    }
   
}
