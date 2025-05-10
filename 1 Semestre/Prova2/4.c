#include <stdio.h>
#define tam 5

void main(){
    int _matriz[tam][tam], _x;

    for (int i=0; i<tam; i++){
        for (int j=0; j<tam; j++){
            printf("Matriz[%d][%d]", i+1,j+1);
            scanf("%d",&_matriz[i][j]);
        }
    }

    printf("Multiplicar por: ");
    scanf("%d", &_x);

    for (int i=0; i<tam; i++){
        _matriz[3][i] = _matriz[3][i] * _x;
    }

    printf("Matriz:\n");
    for (int i=0; i<tam; i++){
        for (int j=0; j<tam; j++){
            printf("%d\t", _matriz[i][j]);
        }
        printf("\n\n\n");
    }
}
