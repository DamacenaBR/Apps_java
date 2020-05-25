
package folhadepagamento;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class FolhaDePagamento {

    private float ganhoHora;
    private float horasTrabalhadas;
    
    private float salario(){
        return ganhoHora * horasTrabalhadas;
    }
    
    private float ir(){
        salario();
        
        if (salario() > 900 && salario() < 1500) {
            return ((salario() * 5) / 100);         
        }
        else if(salario() > 1500 && salario() < 2500){
            return ((salario() * 10) / 100);
        }
        else if(salario() > 2500){
            return ((salario() * 20) / 100);
        }
        return 0;
    }
    
    private float inss(){
        salario();
        
        return ((salario() * 10) / 100);
    }
    
    private float fgts(){
        salario();
        
        return ((salario() * 11) / 100);
    }
    
    private float totalDescontos(){
        return ir() + inss() + fgts();
    }
    
    private float salarioLiquido(){
        salario();
        
        return ((salario() - ir()) - inss());
    }
    
    private int menuOpcao(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println(" ----- Folha de Pagamento -----");
        System.out.println("1 => IR");
        System.out.println("2 => INSS");
        System.out.println("3 => FGTS");
        System.out.println("4 => TOTAL DESCONTOS");
        System.out.println("5 => SALÁRIO LIQUIDO");
        System.out.println("6 => INFORMAÇÕES");
        System.out.println("0 => PARA SAIR");
        System.out.print("OPÇÃO: ");
        
        int opcao = leitor.nextInt();
        
        return opcao;   
    }
    
    private void pegaValores(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe valor pago por hora: ");
        ganhoHora = leitor.nextFloat();
        
        System.out.print("Informe horas trabalhadas: ");
        horasTrabalhadas = leitor.nextFloat();
    }
    
    private void info(){  
        System.out.println(("Salario Bruto: RS") + salario());
        System.out.println("(-)IR(5%): R$ " + ir());
        System.out.println("(-)INSS(10%): R$ " + inss());
        System.out.println("FGTS(11%): R$ " + fgts());
        System.out.println("Total Descontos: R$" + totalDescontos());
        System.out.println("Saçário Liquido: R$ " + salarioLiquido());
    }
    
     private void execute(){
        boolean loop = true;
        
        do {
            
            int opcao = menuOpcao();
            
            switch(opcao){
                case 1: 
                    pegaValores();
                    System.out.println("(-)IR(5%): R$ " + ir());
                    break;
                    
                case 2:
                    pegaValores();
                    System.out.println("(-)INSS(10%): R$ " + inss());
                    break;
                
                case 3:
                    pegaValores();
                    System.out.println("(-)INSS(10%): R$ " + inss());
                    break;
                    
                case 4:
                    System.out.println("Total Descontos: R$" + totalDescontos());
                    break;
                    
                case 5:
                    System.out.println("Saçário Liquido: R$ " + salarioLiquido());
                    break;
                
                case 6:
                    info();
                    break;
                case 0:
                    loop = false;
            }
            
            
        } while (loop == true);
     }
        
    public static void main(String[] args) {
        
        FolhaDePagamento pagamento = new FolhaDePagamento();
        pagamento.execute();
           
    }

}
