/*Quest�o 04:
Fa�a um programa que leia a quantidade atual em estoque, quantidade m�xima em estoque e
quantidade m�nima em estoque de um produto. O programa deve calcular e mostrar a quantidade
m�dia ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em
estoque for maior ou igual a quantidade m�dia escrever a mensagem �N�o efetuar compra�, sen�o
escrever a mensagem �Efetuar compra�.*/
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
