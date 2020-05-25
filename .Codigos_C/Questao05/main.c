#include <stdio.h>
#include <stdlib.h>

int main(){

    float peso, altura, imc;
    
    printf("Digite seu peso em KG: ");
    scanf("%f", &peso);
    
    printf("Digite sua altura em MT: ");
    scanf("%f", &altura);
    

    imc = peso/(altura*altura);
    
    if(imc < 20){
        printf ("Abaixo do Peso");
    }else if(imc >= 20 && imc <= 25){
        printf("Normal");
}   else if(imc >= 26 && imc <= 30){
        printf("Exesso de Peso");
    }else if(imc >= 31 && imc <= 35){
        printf("Obesidade");
    }else{
        printf("Obesidade Mórbida");
    }
    
    return 0;
}