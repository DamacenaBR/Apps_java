#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    float quadrado,raiz,num;

    while(1){
        printf("Digite o numero positivo: ");
        scanf("%f", &num);
        if(num >= 0){
            break;
        }
    }

    quadrado = pow(num,2);
    raiz = sqrt(num);

    printf("Quadrado do numero: %f",quadrado);
    printf("\nRaiz quadrada do numero: %f",raiz);

    return 0; 
}

