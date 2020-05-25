
package br.edu.fescfafic.classes;

public class Facade {
    
    private Administrativo adm;
    private Auditoria audit;
    private Financeiro fin;
    private Judiciario jus;
    private Marketing mark;
    private RH rh;

    public Facade() {
        this.adm = new Administrativo();
        this.audit = new Auditoria();
        this.fin = new Financeiro();
        this.jus = new Judiciario();
        this.mark = new Marketing();
        this.rh = new RH();
    }
    
    public void cadastrar(Cantor c){
        this.adm.emitirContrato(c);
        this.audit.agendarAuditoria(c);
        this.fin.cash(c);
        this.jus.analisarCadastro(c);
        this.mark.divulgar(c);
        this.rh.cadastrar(c);
    }
}
