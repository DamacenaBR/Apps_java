package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        setVolume(50);
        setLigado(true);
        setTocando(false);               
    }

    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    @Override
    public void ligar(){        
       this.setLigado(true);         
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("------MENU------");
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.print("Volume: " + getVolume());
        
        for (int i = 0; i <= getVolume(); i += 10){
            System.out.print("|");
        }
        
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu!!!");
    }
    
    @Override
    public void maisVolume(){
        if (getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Impossivel aumentar o volume!!!");
        }
    }
    
    @Override
    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Inpossivel deminuir o volume!!1");
        }
    }
    
    @Override
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }        
    }
    
    @Override
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
        else{
            System.out.println("Não é possivel reproduzir!!!");
        }
    }
    
    
    @Override
    public void pause(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
        else{
            System.out.println("Não é possivel da pause!!!");
        }
    }
    
    
} 