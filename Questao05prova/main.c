#include <stdio.h>

int main(void) {

  float valor, perc;

  printf("Valor do produto:");
  scanf("%f", &valor);

  printf("Percentual de desconto: ");
  scanf("%f", &perc);

  float valorProd = (perc * valor) / 100;
  float valorT = valor - valorProd;

  printf("Valor total: %.2f\n", valorT);
  printf("Valor desconto: %.2f\n", valorProd);

  return 0;
}

