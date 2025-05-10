#include <stdio.h>
float _salatual;
void main(){
	printf("Seu salario atual: ");
	scanf("%f", & _salatual);
	printf("\n\nSeu salario: %.2f", _salatual);
	_salatual = _salatual * 1.07;
	printf("\nAno que vem sera de %.2f", _salatual);
	_salatual = _salatual * 1.06;
	printf("\nDaqui dois anos sera: %.2f", _salatual);
	_salatual = _salatual * 1.05;
	printf("\nDaqui tres anos sera: %.2f", _salatual);
}
