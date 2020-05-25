/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fescfafic.beans;

import br.edu.fescfafic.exportacao.RuaInvalidoException;
import br.edu.fescfafic.exportacao.EnderecoInvalidoException;
/**
 *
 * @author bruno
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;
        
    public Endereco(){
        
    }
    
    public Endereco(String rua, String bairro, String cidade, String estado, int numero) 
            throws EnderecoInvalidoException, RuaInvalidoException{
        
        if (rua.isEmpty()) {
            throw new RuaInvalidoException("  ERRO.: RUA DO CLIENTE INVALIDO!!!");
        }
        this.rua = rua;
        
        if (bairro.isEmpty()) {
            throw new EnderecoInvalidoException("  ERRO.: BAIRRO DO CLIENTE INVALIDO!!!");
        }
        this.bairro = bairro;
        
        if (cidade.isEmpty() || cidade.length() < 4 || cidade.length() > 20) {
            throw new EnderecoInvalidoException("  ERRO.: NOME DA CIDADE INVALIDO!!!");
        }else{
        String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] letras = cidade.toCharArray();
            for (int i = 0; i < letras.length; i++) {
                String str = Character.toString(cidade.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new EnderecoInvalidoException("  ERRO.: NOME DA CIDADE INVALIDO!!!");
                    }
                }
            }
        }
        this.cidade = cidade;
        
        if(estado.isEmpty() || estado.length() > 20 || estado.length() < 4 ){
            throw new EnderecoInvalidoException("  ERRO.: NOME DO ESTADO INVALIDO!!!");
        }else{
            String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] letras = estado.toCharArray();
            for (int i = 0; i < letras.length; i++) {
                String str = Character.toString(estado.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new EnderecoInvalidoException("  ERRO.: NOME DO ESTADO INVALIDO!!!");
                    }                    
                }
            }
        }          
        this.estado = estado;
        
        this.numero = numero;
        
    }   

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws RuaInvalidoException {
        if (rua.isEmpty()) {
            throw new RuaInvalidoException("  ERRO.: RUA DO CLIENTE INVALIDO!!!");
        }
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws EnderecoInvalidoException {
        if ( bairro.isEmpty()) {
            throw new EnderecoInvalidoException("  ERRO.: BAIRRO DO CLIENTE INVALIDO!!!");
        }
        this.bairro = bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade)  throws EnderecoInvalidoException {
        if (cidade.isEmpty() || cidade.length() < 4 || cidade.length() > 20) {
            throw new EnderecoInvalidoException("  ERRO.: NOME DA CIDADE INVALIDO!!!");
        }else{
        String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] letras = cidade.toCharArray();
            for (int i = 0; i < letras.length; i++) {
                String str = Character.toString(cidade.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new EnderecoInvalidoException("  ERRO.: NOME DA CIDADE INVALIDO!!!");
                    }
                }
            }
        }
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado)  throws EnderecoInvalidoException {
        if(estado.isEmpty() || estado.length() < 4 || estado.length() > 20 ){
            throw new EnderecoInvalidoException("  ERRO.: NOME DO ESTADO INVALIDO!!!");
        }else{
            String vetor[] = {"0","1","2","3","4","5","6","7","8","9"};
            char [] letras = estado.toCharArray();
            for (int i = 0; i < letras.length; i++) {
                String str = Character.toString(estado.charAt(i));
                for (int j = 0; j < vetor.length; j++) {
                    if(str.equals(vetor[j])){
                        throw new EnderecoInvalidoException("  ERRO.: NOME DO ESTADO INVALIDO!!!");
                    }                    
                }
            }
        }
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nENDEREÇO:{" + "RUA= " + rua + ", BAIRRO= " + bairro + ", NUMERO= " + numero +
                ", CIDADE= " + cidade + ", ESTADO= " + estado + "}";
    }
}
