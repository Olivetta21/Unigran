/*Questão 04:
Faça um programa que leia a quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. O programa deve calcular e mostrar a quantidade
média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em
estoque for maior ou igual a quantidade média escrever a mensagem “Não efetuar compra”, senão
escrever a mensagem “Efetuar compra”.*/
#include <stdio.h>
void main(){
int _atu, _max, _min;
float _med;
printf("Estoque atual: ");
scanf("%d", &_atu);
printf("Estoque maximo: ");
scanf("%d", &_max);
printf("Estoque minimo: ");
scanf("%d", &_min);
_med = (_max+_min)/2;
if (_atu >= _med){
    printf("Nao efetuar compra.\n");
}
else{
    printf("Efetuar compra.\n");
}
}
