/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.questao02.classes;

/**
 *
 * @author COMPUTER
 */
public class No {
    private No aponteProximo;
    private Aluno aluno;
    
    public No (Aluno aluno){
        this.aponteProximo = null;
        this.aluno = aluno;
    }

    public No getAponteProximo() {
        return aponteProximo;
    }

    public void setAponteProximo(No aponteProximo) {
        this.aponteProximo = aponteProximo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
