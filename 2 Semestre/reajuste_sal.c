/*Questão 02:
Faça um programa que leia o tempo de serviço e o salário de um funcionário e calcule e mostre um
reajuste salarial de acordo com a seguinte situação: se o funcionário possui tempo de serviço
inferior a 10 anos, o reajuste será de 8%, caso contrário, o reajuste salarial será de 10%.*/
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
