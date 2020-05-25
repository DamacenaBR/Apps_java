
#include <stdio.h>
#include <stdlib.h> 

int main() {  

    int idade;     

    printf("Digite a idade: ");     
    scanf("%d" ,&idade );     
    
    if (idade > 0 && idade < 16){
        printf("Não Eleitor!"); 
    }
    else if (idade >= 16 && idade < 18){
        printf("Eleitor Facultativo!");
    }
    else if (idade >= 18 && idade <= 65){
        printf("Eleitor Obrigatório!");
    }    
    else{
        printf("Eleitor Facultativo!");
    }
    return 0;
}