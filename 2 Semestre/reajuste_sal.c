/*Quest�o 02:
Fa�a um programa que leia o tempo de servi�o e o sal�rio de um funcion�rio e calcule e mostre um
reajuste salarial de acordo com a seguinte situa��o: se o funcion�rio possui tempo de servi�o
inferior a 10 anos, o reajuste ser� de 8%, caso contr�rio, o reajuste salarial ser� de 10%.*/
#include <stdio.h>
void main(){
int _tmp;
float _sal;
printf("Qual o tempo de servico em anos: ");
scanf("%d", &_tmp);
printf("Qual o salario: ");
scanf("%f", &_sal);
if (_tmp < 10){
    _sal *= 1.08;
}
else{
    _sal *= 1.1;
}
printf("O novo salario sera: RS%.2f\n", _sal);
}
