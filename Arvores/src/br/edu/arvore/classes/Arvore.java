/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.arvore.classes;

/**
 *
 * @author COMPUTER
 */
public class Arvore {  
    private static No raiz;   
    private int quantidade;
    private No node;

    public Arvore() {
        this.quantidade = 0;
        this.node = null;
    }
    public void inserirValor( int valor){
        inserir(raiz, valor);
    }
    
    public void inserir(No node, int valor){
        if (node == null) {
            raiz = new No(valor);
            this.quantidade++;
            System.out.println("Raiz: " + raiz.getValor());
        }
        else{
            if (valor < node.getValor()) {
                if (node.getEsquerdo() != null) {
                    inserir(node.getEsquerdo(), valor);
                }
                else{
                    node.setEsquerdo(new No (valor));
                    this.quantidade++;
                    System.out.println("valor " + valor + " esta a esquerda de " + node.getValor());
                }
            }
            else if(valor > node.getValor()){
                if (node.getDireito() != null) {
                    inserir(node.getDireito(), valor);
                }
                else{
                    node.setDireito(new No (valor));
                    this.quantidade++;
                    System.out.println("valor " + valor + " esta a direito de " + node.getValor());
                }
            }
        }
    }
    
    public int returnQuantNo(){
        return this.quantidade;
    }
    
    public No returnRaiz(){
        return this.raiz;
    }
   
    public No returnNo(int valor){
        No atual = raiz;
        
        while(valor != atual.getValor()){
            if (valor < atual.getValor()) {
                atual = atual.getEsquerdo();
            }
            else{
                atual = atual.getDireito();
            }           
            if (atual == null) {
                return null;
            }
        }
        return atual;
    }
    
    public void imprimirFolhas(No node){
        if (node != null) {
            if ((node.getEsquerdo() == null) && (node.getDireito()== null)) {
                System.out.println("Folha: "+ node.getValor());
            }
            
            imprimirFolhas(node.getEsquerdo());
            imprimirFolhas(node.getDireito());
        }  
    }
    
    public void retornaPai(No node, int valor){
        No nodePai;
        if (node != null && returnNo(valor) != null) {
            if (node.getValor() == valor) {
                System.out.println("A raiz da arvore não tem pai!");
            }
            else if (node.getValor() != valor && valor < node.getValor()) {
                nodePai = new No (node.getValor());
                node = node.getEsquerdo();
                
                if (node.getValor() == valor) {
                    System.out.println("O pai é " + nodePai.getValor());
                }
                else{
                    retornaPai(node, valor);
                }
            }
            else if (node.getValor() != valor && valor > node.getValor()) {
                nodePai = new No(node.getValor());
                node = node.getDireito();
                
                if (node.getValor() == valor) {
                    System.out.println("O pai é " + nodePai.getValor());
                }
                else{
                    retornaPai(node, valor);
                }
            }   
        }       
    }
    
    public No retonarPai2(No node, int valor){
        No nodePai = null;
        No atual = raiz;    
        while(atual.getValor() != valor){
            nodePai = atual;
            
            if (valor < atual.getValor()) {
                atual = atual.getEsquerdo();
            }
            else{
                atual = atual.getDireito();
            }
            
            if (atual == null) {
                return null;
            }
        }
        return nodePai;
    }
    
    public int retornaNivelNo(No node, int valor){
        int nivel = 0;
        while(node != null && node.getValor() != valor){
            if (valor < node.getValor()) {
                node = node.getEsquerdo();
            }
            else if (valor > node.getValor()) {
                node = node.getDireito();
            }
            nivel++;
        }
        return nivel;
    }
    
    public void retorneFilhos(No node, int valor){
        if (node != null && returnNo(valor) != null) {
            if (node.getValor() == valor) {
                if (node.getEsquerdo() != null && node.getDireito() != null) {
                    System.out.println("Filho a esquerda: " + node.getEsquerdo().getValor());
                    System.out.println("Filho a direita: " + node.getDireito().getValor());
                }
                else if (node.getEsquerdo() == null && node.getDireito() != null) {
                    System.out.println("Filho a esquerda é null");
                    System.out.println("Filho a direita: " + node.getDireito().getValor());
                }
                else if (node.getEsquerdo() != null && node.getDireito() == null) {
                    System.out.println("Filho a esquerda: " + node.getEsquerdo().getValor());
                    System.out.println("Filho a direita é null");
                }
                else if (node.getEsquerdo() == null && node.getDireito() == null) {
                    System.out.println("Filho a esquerdo é null");
                    System.out.println("Filho a direita é null");
                } 
            }
            else if (valor < node.getValor()) {
                node = node.getEsquerdo();
                retorneFilhos(node, valor);
            }
            else if (valor > node.getValor()) {
                node = node.getDireito();
                retorneFilhos(node, valor);
            }
        }
    }
    
    public void imprimirEmOrdem(No node){
        if (node != null) {
            imprimirEmOrdem(node.getEsquerdo());
            System.out.print(node.getValor() + " ");
            imprimirEmOrdem(node.getDireito());
        }
    }
    
    public void imprimirPorOrdem(No node){
        if (node != null) {            
            System.out.print(node.getValor() + " ");
            imprimirEmOrdem(node.getEsquerdo());
            imprimirEmOrdem(node.getDireito());
        }
    }
    
    public void imprimirPosOrdem(No node){
        if (node != null) {
            imprimirEmOrdem(node.getEsquerdo());
            imprimirEmOrdem(node.getDireito());
            System.out.print(node.getValor() + " ");
        }
    }

    public void removerNo(No node, int valor){
        if (returnNo(valor) != null && valor != raiz.getValor()) {
            No atual = returnNo(valor);
            No pai = retonarPai2(node, valor);
            System.out.print("\nO nó a ser removido é " + atual.getValor() + " e o seu pai é " + pai.getValor() );
            
            //remover folhas
            if (atual.getEsquerdo() == null && atual.getDireito() == null) {
                if (atual.getValor() > pai.getValor()) {
                    pai.setDireito(null); 
                    this.quantidade --;
                }
                else if (atual.getValor() < pai.getValor()){
                    pai.setEsquerdo(null);
                    this.quantidade--;
                }                
            }
            // remover apenas na esquerda com um filho
            else if (atual.getEsquerdo() != null && atual.getDireito() == null){
                //remove se o valor esta a esquerda
                if (atual.getValor() < pai.getValor()) {
                    pai.setEsquerdo(atual.getEsquerdo());
                    atual = null;
                    this.quantidade--;
                }
                //remove se o valor esta a direita
                else if (atual.getValor() > pai.getValor()) {
                    pai.setDireito(atual.getEsquerdo());
                    atual = null;
                    this.quantidade--;
                }
            }
            //remover apenas na direita com um filho
            else if (atual.getEsquerdo() == null && atual.getDireito() != null) {
                //remove se o valor esta a esquerda
                if (atual.getValor() < pai.getValor()) {
                    pai.setEsquerdo(atual.getDireito());
                    atual = null;
                    this.quantidade--;                   
                }
                //remove se o valor esta a direita
                else if (atual.getValor() > pai.getValor()) {
                    pai.setDireito(atual.getDireito());
                    atual = null;
                    this.quantidade--;
                }
            }
            //remover filho na direita e esquerda diferentes de null
            else if (atual.getEsquerdo() != null && atual.getDireito() != null) {
                //remove se o valor esta a esquerda do pai, eo filho a esqueda, e desça mais a direita 
                
                if (atual.getValor() < pai.getValor()) {
                    No filhoEsquerdoAtual = atual.getEsquerdo();
                    
                    if (filhoEsquerdoAtual.getDireito() != null) {
                        
                        while (filhoEsquerdoAtual.getDireito() != null) {
                            filhoEsquerdoAtual = filhoEsquerdoAtual.getDireito();
                        }
                        
                        No paiFilhoEsquerdoAtual = retonarPai2(raiz, filhoEsquerdoAtual.getValor());
                        atual.setValor(filhoEsquerdoAtual.getValor());

                        if (filhoEsquerdoAtual.getEsquerdo() != null) {
                            paiFilhoEsquerdoAtual.setDireito(filhoEsquerdoAtual.getEsquerdo());
                            filhoEsquerdoAtual = null;

                        } else if (filhoEsquerdoAtual.getDireito() == null) {
                            paiFilhoEsquerdoAtual.setDireito(null);
                        }
                    }
                    else if (filhoEsquerdoAtual.getDireito() == null) {
                        atual.setValor(filhoEsquerdoAtual.getValor());
                        atual.setEsquerdo(null);
                        filhoEsquerdoAtual = null;
                    }
                }
                //remove o valor esta a direita do pai, eo filho a direita, e desça mais a esquerda
                else if (atual.getValor() > pai.getValor()) {
                    No filhoDireitaAtual = atual.getDireito();
                    
                    if (filhoDireitaAtual.getEsquerdo() != null) {
                        while(filhoDireitaAtual.getEsquerdo() != null){
                            filhoDireitaAtual = filhoDireitaAtual.getEsquerdo();
                        }
                        
                        No paiFilhoDireitoAtual = retonarPai2(raiz, filhoDireitaAtual.getValor());
                        atual.setValor(filhoDireitaAtual.getValor());
                        
                        if (filhoDireitaAtual.getDireito()!= null) {
                            paiFilhoDireitoAtual.setEsquerdo(filhoDireitaAtual.getDireito());
                            filhoDireitaAtual = null;
                        }
                        else if (filhoDireitaAtual.getEsquerdo() == null) {
                            paiFilhoDireitoAtual.setEsquerdo(null);
                        }
                    }
                    else if (filhoDireitaAtual.getEsquerdo() == null) {
                        atual.setValor(filhoDireitaAtual.getValor());
                        atual.setDireito(null);
                        filhoDireitaAtual = null;
                    }
                }
            }
        }
        else{
            System.out.println("O valor não existe ou ele é o raiz da arvore!");
        }
    }
    
    
}
