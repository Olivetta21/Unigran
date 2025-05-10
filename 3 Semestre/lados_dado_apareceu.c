#include <stdio.h>
int _i, _lado, _L1=0, _L2=0, _L3=0, _L4=0, _L5=0, _L6=0;
void main(){
    //repetitir ate ser registrados 15 lancamentos validos:
    for (_i=1; _i<=15 ; _i++){
        printf("Lancamento n%d: ", _i);
        scanf("%d", & _lado);
        //se o usuario digitar numeros de 1 a 6, aumentar em 1 a quandidade que esse numero foi digitado:
        switch(_lado){
            case 1:
                _L1++;
                break;
            case 2:
                _L2++;
                break;
            case 3:
                _L3++;
                break;
            case 4:
                _L4++;
                break;
            case 5:
                _L5++;
                break;
            case 6:
                _L6++;
                break;
            default:
                //se um numero digitado nao estiver entre 1 e 6, nao contar como lancamento valido, retirando 1 da contagem, e mostrar o aviso:
                _i--;
                printf("Um dado tem somente 6 lados!\nEscolha entre 1 a 6.\n\n");
        }
    }
    //mostrar a quantidade que os lados apareceram, junto a sua porcentagem perante os 15 lançamentos:
    printf("\nVezes que lado 1 apareceu: %d --- %.1f%%", _L1, ((float)_L1*100)/15);
    printf("\nVezes que lado 2 apareceu: %d --- %.1f%%", _L2, ((float)_L2*100)/15);
    printf("\nVezes que lado 3 apareceu: %d --- %.1f%%", _L3, ((float)_L3*100)/15);
    printf("\nVezes que lado 4 apareceu: %d --- %.1f%%", _L4, ((float)_L4*100)/15);
    printf("\nVezes que lado 5 apareceu: %d --- %.1f%%", _L5, ((float)_L5*100)/15);
    printf("\nVezes que lado 6 apareceu: %d --- %.1f%%", _L6, ((float)_L6*100)/15);
}
