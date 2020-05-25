
package br.edu.fescfafic.classes;

public class Auditoria {
    public void agendarAuditoria(Cantor c){
        String s = String.format("Aditoria do Cantor (%s) agendado com sucesso!",c.getNome());
        System.out.println(s);
    }
}
