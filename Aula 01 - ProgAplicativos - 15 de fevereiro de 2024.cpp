#include <stdio.h>
#include <string.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "portuguese");
    char produto[200]; 
    int Ma, Mb, Mc;
    float Tr, Lr, VMD, Emin, Emax, EA;
 
   printf("Digite o nome do produto solicitado: ");
   gets(produto);
   
   fflush(stdin);
   
   printf("Digite o primeiro més: ");
   scanf("%d", &Ma);
   
   printf("Digite o primeiro més: ");
   scanf("%d", &Mb);
   
   printf("Digite o primeiro més: ");
   scanf("%d", &Mc);
     
   VMD = ((Ma + Mb + Mc)/3)/25;
   
   printf("A venda média diaria é: %.2f", VMD);
   printf("\n\n");
   
   printf("Digite o tempo de reposição: ");
   scanf("%f", &Tr);
   
   Emin = (VMD * Tr);
   
   printf("Estoque minimo atual: %.2f ", Emin);
   printf("\n\n");
   
   printf("Digite o lote de reposição: ");
   scanf("%f", &Lr);
   
   Emax = Emin + Lr;
   
   printf("Estoque maxímo atual: %.2f", Emax);
   printf("\n\n");
   
   printf("Digite o estoque atual: ");
   scanf("%f", &EA);
   
   if (EA > Emin) {
       printf("Não comprar");
   } else {
       printf("Comprar");
   }
   
    return 0;
}
