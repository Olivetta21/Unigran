#include <stdio.h>
float _salFix,_vends;
void main(){
	printf("Salario fixo do funcionario: ");
	scanf("%f", & _salFix);
	printf("Valor total das vendas dele: ");
	scanf("%f", & _vends);
	printf("O salario dele vai ser de %0.2f reais.", _salFix + (_vends * 0.05));
}
