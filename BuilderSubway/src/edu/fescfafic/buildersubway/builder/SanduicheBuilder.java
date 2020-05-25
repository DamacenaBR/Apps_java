/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fescfafic.buildersubway.builder;

import edu.fescfafic.buildersubway.model.Sanduiche;
import edu.fescfafic.buildersubway.interfaces.SanduicheBuilderInterface;
import java.util.List;

/**
 *
 * @author COMPUTER
 */
public class SanduicheBuilder implements SanduicheBuilderInterface<SanduicheBuilder, Sanduiche>{
    
    private String tipoDoPao;
    private String recheio;
    private List<String> molhos;
    private String extra;
    
    public SanduicheBuilder(String tipoDoPao){
        this.tipoDoPao = tipoDoPao;
    }

    @Override
    public SanduicheBuilder tipoDoPao(String tipoDoPao) {
        this.tipoDoPao = tipoDoPao;
        return this;
    }

    @Override
    public SanduicheBuilder recheio(String recheio) {
        this.recheio = recheio;
        return this;
    }


    @Override
    public SanduicheBuilder extra(String extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public Sanduiche create() {
        return new Sanduiche(tipoDoPao, recheio, molhos, extra);
    }

    @Override
    public SanduicheBuilder molhos(List<String> molhos) {
        this.molhos = molhos;
        return this;
    }
    
}
