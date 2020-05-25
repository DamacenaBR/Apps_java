
#include <stdio.h>
#include <stdlib.h> 
#include <math.h> 

int main(){  

    char nome[40];     
    int idade;         

    printf("Digite o nome: " );
    scanf("%s" ,&nome);    
    
    printf("Digite a idade: ");     
    scanf("%d" ,&idade );     
    
    if (idade < 18){      
       printf("%s é Menor de Idade", nome); 
    }else if (idade >= 18 && idade <= 64){
       printf("%s é Maior de Idade", nome);
    }else if (idade >=65){
       printf("%s é Idoso", nome);
    }
    return 0;
}