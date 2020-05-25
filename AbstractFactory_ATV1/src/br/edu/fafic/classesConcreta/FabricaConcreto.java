/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classesConcreta;

import br.edu.fafic.classesAbstrata.Desktop;
import br.edu.fafic.classesAbstrata.Fabrica;
import br.edu.fafic.classesAbstrata.Notebook;

/**
 *
 * @author COMPUTER
 */
public class FabricaConcreto extends Fabrica{

    @Override
    public Notebook notebook(String processador, int capacidadeTB, int memoriaGB) {
        return new NotebookContreto(processador, capacidadeTB, memoriaGB);
    }

    @Override
    public Desktop desktop(String processador, int capacidadeTB, int memoriaGB) {
        return new DesktopConcreto(processador, capacidadeTB, memoriaGB);
    }
    
}
