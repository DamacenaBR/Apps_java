

#include <stdio.h>
#include <stdlib.h>
/*
 * 
 */
int main(void)
{
  //Declaração das variáveis
  float nota1, nota2, nota3, nota4, media;
  
  //Entrada de dados
  printf("Digite a primeira nota do aluno: ");
  scanf("%f",&nota1);
  
  printf("Digite a segunda nota do aluno: ");
  scanf("%f",&nota2);
  
  printf("Digite a terceira nota do aluno: ");
  scanf("%f",&nota3);
  
  printf("Digite a quarta nota do aluno: ");
  scanf("%f",&nota4);
  
  //Processamento
  media = (nota1 + nota2 + nota3 + nota4) / 4;
  
  //Saída
  printf("Media do aluno = %.1f\n",media);
  
  return 0;//retorno da função main  
}

