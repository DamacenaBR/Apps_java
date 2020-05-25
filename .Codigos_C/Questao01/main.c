#include <stdio.h>
#include <stdlib.h>

int main(){

  float nota1, nota2, nota3, nota4, media;
  
  printf("Digite a 1ª nota do aluno: ");
  scanf("%f", &nota1);
  
  printf("Digite a 2ª nota do aluno: ");
  scanf("%f", &nota2);
  
  printf("Digite a 3ª nota do aluno: ");
  scanf("%f", &nota3);
  
  printf("Digite a 4ª nota do aluno: ");
  scanf("%f", &nota4);
  
  media = (nota1 + nota2 + nota3 + nota4) / 4;
  
  printf("Média do aluno: %.1f\n", media);
  
  return 0;
}