/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.arvore.classes;

/**
 *
 * @author COMPUTER
 */
public class Arvore {
    private static No raiz;
    private int quantidade;
    private No node;
    
    public Arvore(){
        this.quantidade = 0;
        this.node = null;
    }
    
    public void inserirValor(int valor){
        inserir(raiz, valor);
    }
    
    public void inserir(No node, int valor){
        if (node == null) {
            raiz = new No(valor);
            this.quantidade++;
            System.out.println("A raiz do nó é " + raiz.getValor());
        }
        else{
            if (valor < node.getValor()) {
                if (node.getEsquerdo() != null) {
                    inserir(node.getEsquerdo(), valor);
                }
                else{
                    node.setEsquerdo(new No(valor));
                    this.quantidade++;
                    System.out.println("O valor " + valor + " fica a esquerda do valor " + node.getValor());
                }
            }
            else if (valor > node.getValor()) {
                if (node.getDireito() != null) {
                    inserir(node.getDireito(), valor);
                    
                }
                else{
                    node.setDireito(new No(valor));
                    this.quantidade++;
                    System.out.println("O valor " + valor + " fica a direita do valor " + node.getValor());
                }
            }
        }        
    }
    
    public No returnRaiz(){
        return raiz;
    }
    
    public int returnQuantidade(){
        return quantidade;
    }
    
    public No returnPai(int valor){
        No pai = null;
        No atual = raiz;
        
        while(atual.getValor() != valor){
            pai = atual;
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
        return pai;
    }
    
    public No returnNo(int valor){
        No atual = raiz;
        if (atual != null) {
            while(atual.getValor() != valor){
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
        }
        return atual;
    }
    
    public int returnNivel(No node, int valor){
        int nivel = 0;
        if (node != null && returnNo(valor) != null) {
            while(node.getValor() != valor){
                if (valor < node.getValor()) {
                    node = node.getEsquerdo();
                }
                else{
                    node = node.getDireito();
                }
                nivel++;
            }
        }
        return nivel;
    }
    
    public void imprimirRaiz(No node){
        if (node != null) {
            if (node.getEsquerdo() == null && node.getDireito() == null) {
                System.out.println("Raiz: " + node.getValor());
            }
            imprimirRaiz(node.getEsquerdo());
            imprimirRaiz(node.getDireito());
        }
    }
    
    public void returnFilhos(No node, int valor){
        if (node != null && returnNo(valor) != null) {
            if (node.getValor() == valor) {
                if (node.getEsquerdo() != null && node.getDireito() != null) {
                    System.out.println("O filho do " + valor + " a esquerda: " + node.getEsquerdo().getValor());
                    System.out.println("O filho do " + valor + " a direita: " + node.getDireito().getValor());
                }
                else if (node.getEsquerdo() != null && node.getDireito() == null) {
                    System.out.println("O filho do " + valor + " a esquerda: " + node.getEsquerdo().getValor());
                    System.out.println("O filho do " + valor + " a direita: null");
                }
                else if (node.getEsquerdo() == null && node.getDireito() != null) {
                    System.out.println("O filho do " + valor + " a esquerda: null");
                    System.out.println("O filho do " + valor + " a direita: " + node.getDireito().getValor());
                }
                else if (node.getEsquerdo() == null && node.getDireito() == null){
                    System.out.println("O filho do " + valor + " a esquerda: null");
                    System.out.println("O filho do " + valor + " a direita: null");
                }    
            }
            if (valor < node.getValor()) {
                node = node.getEsquerdo();
                returnFilhos(node, valor);
            }
            else if (valor > node.getValor()){
                node = node.getDireito();
                returnFilhos(node, valor);
            }            
        }
    }
    
    public int quantidadeNo(No node){
        if (node != null) {
            return 1 + quantidadeNo(node.getEsquerdo()) + quantidadeNo(node.getDireito());
        }
        else{
            return 0;
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
            imprimirPorOrdem(node.getEsquerdo());            
            imprimirPorOrdem(node.getDireito());
        }
    }
    
    public void imprimirPosOrdem(No node){
        if (node != null) {
            imprimirPosOrdem(node.getEsquerdo());
            imprimirPosOrdem(node.getDireito());
            System.out.print(node.getValor() + " ");
        }
    }
    
    public void removerNo(No node, int valor){
        if (returnNo(valor) != null && valor != raiz.getValor()) {
            No atual = returnNo(valor);
            No pai = returnPai(valor);
            
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
                        
                        No paiFilhoEsquerdoAtual = returnPai(filhoEsquerdoAtual.getValor());
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
                        
                        No paiFilhoDireitoAtual = returnPai(filhoDireitaAtual.getValor());
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
    
    public No returnMenorValor(No node){
        No valor = raiz;
        
        while(node.getEsquerdo() != null){
            node = node.getEsquerdo();
            if(valor.getValor() > node.getValor()){
                valor = node;
            }
        }        
        return valor;
    }
    
    public No returnMaiorValor(No node){
        No valor = raiz;       
        while(node.getDireito() != null){
            node = node.getDireito();
            if(valor.getValor() < node.getValor()){
                valor = node;
            }
        }
        return valor;
    }
    
    public int returnAlturaNo(No node){
        if (node == null) {
            return -1;
        }
        if (node.getEsquerdo() == null && node.getDireito() == null) {
            return 0;
        }
        else if (node.getEsquerdo() == null) {
            return 1 + returnAlturaNo(node.getDireito());
        }
        else if (node.getDireito() == null) {
            return 1 + returnAlturaNo(node.getEsquerdo());
        }
        else{
            return 1 + Math.max(returnAlturaNo(node.getDireito()), returnAlturaNo(node.getEsquerdo()));
        }
    }
    
    public int fatorBalanceamento(No node){
        return returnAlturaNo(node.getDireito()) - returnAlturaNo(node.getEsquerdo());
    }
    
    public int altura(){
        return altura(raiz);
    }
    
    public int altura(No node){
        if (node != null) {
            int esquerda, direita;
            
            esquerda = altura(node.getEsquerdo());
            direita = altura(node.getDireito());
            
            if (esquerda > direita) {
                return esquerda + 1;
            }
            else{
                return direita + 1;
            }
        }
        return 0;
    }
    
    public int somaNos(No node){
        if (node != null) {
            return node.getValor() + somaNos(node.getEsquerdo()) + somaNos(node.getDireito());
        }
        return 0;
    }
    
    public int somadeFolhas(No node){
        int nivel = 0;
        if (node != null) {
            nivel = somadeFolhas(node.getEsquerdo()) + somadeFolhas(node.getDireito());
            if (node.getEsquerdo() == null && node.getDireito() == null) {
                nivel += node.getValor();
            }
            return nivel;
        }
        return 0;
    }
    
    public int quantFolhas(No node){
        int nivel = 0;
        if (node != null) {
            nivel = somadeFolhas(node.getEsquerdo()) + somadeFolhas(node.getDireito());
            if (node.getEsquerdo() == null && node.getDireito() == null) {
                nivel++;
            }
            return nivel;
        }
        return 0;
    }
}
