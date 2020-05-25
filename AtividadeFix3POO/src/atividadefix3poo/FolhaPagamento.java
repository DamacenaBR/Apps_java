/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefix3poo;

import java.util.Scanner;

/**
 *
 * @author Gutemberg
 */

// Aplicativo para a Simulação de uma folha de pagamento
public class FolhaPagamento {
    
    // Variáveis de instância
    private float ganhoHora;
    private float horasTrabalhadas;

    
    // Método para calcular o Imposto de Renda
    private float IR(){
        //Variável para o cálculo do salário bruto
        float salarioBruto = ganhoHora * horasTrabalhadas;
        
        // Verifica as condições do valor do salário bruto
        // e decide qual disconto será aplicado
        if(salarioBruto <= 900.00){
            return salarioBruto;
        }
        else if(salarioBruto > 900.00 || salarioBruto <= 1500.00){
            return (float) (salarioBruto * 5 / 100);
        }
        else if(salarioBruto > 1500 || salarioBruto <= 2500.0){
            return (float) (salarioBruto * 10 / 100);
        }
        else if(salarioBruto > 2500.0){
            return (float) (salarioBruto * 20 / 100);
        }
        return salarioBruto;
    }// Fim do método IR (Imposto de Renda)
    
    // Método para calcular o INSS
    private float INSS(){
        //Variável para o cálculo do salário bruto
        float salarioBruto = ganhoHora * horasTrabalhadas;
        
        return (float) (salarioBruto * 10 / 100);
    }
    
    // Método para calcular o FGTS
    private float FGTS(){
        //Variável para o cálculo do salário bruto
        float salarioBruto = ganhoHora * horasTrabalhadas;
        
        return (float) (salarioBruto * 11 / 100);
    }
    
    // Método para calcular o total de descontos
    private float totalDescontos(){
        return (float) IR() + INSS();
    }
    
    // Método para calcular o total líquido
    private float totalLiquido(){
        //Variável para o cálculo do salário bruto
        float salarioBruto = ganhoHora * horasTrabalhadas;
        
        //Retona o valor líquido do salário bruto descontado
        return salarioBruto - totalDescontos();
    }
    
    // Método para implementação do menu
    private int menuOpcao(){
        
        // Instância um objeto de Scanner
        Scanner input = new Scanner(System.in);
        
        // Imprime o menu no console
        System.out.print("[*] Menu [*]\n"
                + "1 --> IR\n"
                + "2 --> INSS\n"
                + "3 --> FGTS\n"
                + "4 --> Total de Descontos\n"
                + "5 --> Salário líquido\n"
                + "6 --> Informações\n"
                + "0 --> Sair\n"
                + "Opção: ");
        
        // Retorna a opção selecionada pelo usuário
        return input.nextInt();
        
    }// Fim do método menuOpcao
    
    // Método para obtenção dos valores para atribuir
    // as variáveis de intância
    private void pegaValores(){
        
        // Instância um objeto de Scanner
        Scanner input = new Scanner(System.in);
        
        // Imprime a solicitação do Ganho por Hora
        System.out.print("Ganho por hora: R$ ");
        
        // Atribui o valor float de Ganho por hora
        // na variável de instância "ganhoHora"
        this.ganhoHora = input.nextFloat();
        
        //Imprime a solicitação de Horas trabalhadas
        System.out.print("Horas trabalhadas: ");
        
        // Atribui o valor float de Horas trabalhadas
        // na variável de instância "horasTrabalhadas"
        this.horasTrabalhadas = input.nextFloat();
        
    }// Fim do método pegaValores
    
    // Método para imprimir informações dispostas
    private void info(){
        
        //Variável para o cálculo do salário bruto
        float salarioBruto = ganhoHora * horasTrabalhadas;
        
        // Exibe todas as informações necessárias para o usuário
        System.out.println("\nSalário Bruto: R$ "+salarioBruto+"\n"
                + "(-) IR: R$ "+IR()+"\n"
                + "(-) INSS(10%): R$ "+INSS()+"\n"
                + "FGTS(11%): R$ "+FGTS()+"\n"
                + "Total de Descontos: R$ "+totalDescontos()+"\n"
                + "Salário Líquido: "+totalLiquido()+"\n");
    }// Fim do método info
    
    // Método para execução do programa
    public void execute(){
        
        // Variável auxiliar para o controle do loop
        boolean continueLoop = true;
        
        // Executa o loop até que o usuário digite 0
        do{
            
            // Variável para pegar o retorno das opções
            // do método menuOpcao
            int opcao = menuOpcao();
            
            switch(opcao){
                case 1:
                    pegaValores();
                    System.out.println("(-) IR: R$ " + IR());
                    break;
                case 2:
                    pegaValores();
                    System.out.println("(-) INSS: R$ " + INSS());
                    break;
                case 3:
                    pegaValores();
                    System.out.println("FGTS: R$ " + FGTS());
                    break;
                case 4:
                    System.out.println("Total de Descontos: R$ " 
                            + totalDescontos());
                    break;
                case 5:
                    System.out.println("Total líquido: " + totalLiquido());
                    break;
                case 6:
                    info();
                    break;
                case 0:
                    continueLoop = false;
                    break;
            }
        
        }while(continueLoop == true);
        
    }// Fim do método execute
    
}
