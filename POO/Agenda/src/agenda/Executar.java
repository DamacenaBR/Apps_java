
package agenda;

import agenda.src.Agenda;
import agenda.src.Contato;

public class Executar {

    public static void main(String[] args) {
        
        Contato[] c = new Contato[10];
        
        c[0] = new Contato();
        c[0].nome = "Bruno";
        c[0].email = "bruno23cz@gmail.com";
        c[0].cadastrarTelefone("(83) 9 8888-8888");
        c[0].cadastrarTelefone("(83) 9 2222-2222");
        c[0].cadastrarTelefone("(83) 9 3333-3333");
        
        c[1] = new Contato();
        c[1].nome = "David";
        c[1].email = "David@gmail.com";
        c[1].cadastrarTelefone("(83) 9 5555-5555");
        c[1].cadastrarTelefone("(83) 9 6666-6666");
        
        c[2] = new Contato();
        c[2].nome = "Felipe";
        c[2].email = "Felipe@gmail.com";
        c[2].cadastrarTelefone("(83) 9 1111-1111");
        c[2].cadastrarTelefone("(83) 9 4444-4444");
        
        Agenda[] a = new Agenda[10];
        
        a[0] = new Agenda();
        a[0].cadastrarContato(c[0]);
        a[0].cadastrarContato(c[1]);
        a[0].cadastrarContato(c[2]);
        a[0].listarContatos();
        
    }
    
}
