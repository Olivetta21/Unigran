/*Quest�o 01:
Fa�a um programa que leia o valor do sal�rio de uma pessoa e o valor de um financiamento
pretendido. Caso o financiamento seja menor ou igual a 5 vezes o sal�rio da pessoa, o programa
dever� escrever �Financiamento Concedido�, caso contr�rio ele dever� escrever �Financiamento
Negado�.*/
#include <stdio.h>
void main(){
int _sal, _fin;
printf("Qual o seu salario: ");
scanf("%d", &_sal);
printf("Qual o valor do seu financiamento: ");
scanf("%d", &_fin);
if (_fin < (_sal*5)){
    printf("Financiamento concedido!\nPegue seus RS%d.\n", _fin);
}
else{
    printf("Financiamento negado!\nRS%d e muito baixo para um financiamento de RS%d.\n", _sal, _fin);
}
}
