
package br.edu.fescfafic.classes;

public class Facade {
    private CPU cpu;
    private HardDrive hd;
    private Memoria memoria;

    public Facade() {
        this.cpu = new CPU();
        this.hd = new HardDrive();
        this.memoria = new Memoria();
    }
    
    public void construirPc(){
        this.cpu.start();  
        this.hd.read();
        this.memoria.load();
        this.cpu.execute();             
        this.hd.write();
        this.memoria.free();       
    }
    
}
