/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.prinicipal;

import br.edu.fafic.classesAbstrata.Desktop;
import br.edu.fafic.classesAbstrata.Fabrica;
import br.edu.fafic.classesAbstrata.Notebook;
import br.edu.fafic.classesConcreta.DesktopConcreto;
import br.edu.fafic.classesConcreta.FabricaConcreto;
import br.edu.fafic.classesConcreta.NotebookContreto;

/**
 *
 * @author COMPUTER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaConcreto();
        
        Notebook not = fabrica.notebook("Intel", 1, 500);
        Desktop desk = fabrica.desktop("AMD", 1, 256);
        
        not.pc();
        desk.pc();
              
    }
    
}
