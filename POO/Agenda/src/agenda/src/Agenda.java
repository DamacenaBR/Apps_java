
package agenda.src;

public class Agenda {
    
    public Contato[] contatos = new Contato[10];
    
    public void cadastrarContato(Contato contato){
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = contato;
                break;
            }
        }
    }
    
    public void listarContatos(){
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                System.out.println("\nNome: "+contatos[i].nome+"\n"
                                + "Email: "+contatos[i].email+"");
                contatos[i].telefonesDoContato();
            }
            
        }

    }
    
}
