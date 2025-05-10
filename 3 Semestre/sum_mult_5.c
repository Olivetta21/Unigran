#include <stdio.h>
float _nlista=1, _num, _soma;
void main(){
    printf("-----LISTA-----\n");
    do{
        printf("%.0f.--> Numero: ", _nlista);
        scanf("%f", & _num);
        //se o numero digitado for um multiplo de 5, adicionar esse numero a soma, e mostrar que ele e um multiplo:
        if (((int)_num % 5) == 0){
            _soma+=_num;
            printf("%.0f.--------------------------->%.0f e um multiplo de 5\n", _nlista, _num);
        }
        _nlista++;
    }while (_num != 0);
    //mostrar o total dos multiplos de 5:
    printf("\nSoma dos numeros multiplos de 5:    %.0f", _soma);
}

