#include <stdio.h>
float _prato;
void main(){
	printf("Quantos kilos seu prato deu?: ");
	scanf("%f", & _prato);
	printf("Voce deve pagar %0.2f reais.", _prato * 40);
}
