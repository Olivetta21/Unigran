#include <stdio.h>
int _n, _i, _r, _soma;
void main(){
    printf("Numero: ");
    scanf("%d", &_n);
    //Repetir ate n vezes, adicionando 2 a cada repeticao, o numero sempre sera par:
    for (_i=2, _r=1;_r<=_n;_i+=2){
        printf("%d", _i);
        //adicionar a soma todos os numeros que vierem:
        _soma += _i;
        //Aumentar _r em 1, e sempre que ele for menor que o _n(digitado pelo usuario), imprimir o sinal de + :
        _r++;
        if (_r <= _n)printf(" + ");
    }
    printf(" = %d", _soma);





}
