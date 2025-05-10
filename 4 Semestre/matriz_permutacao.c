#include <stdio.h>
#define tam 5

void main(){
	int _matriz[tam][tam], p=0, _um=0;

	//formatar toda a matriz para zeros.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_matriz[i][j] = 0;
		}
	}

	//leitura da matriz do usuario.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			printf("Matriz[%d][%d]: ", i+1,j+1);
			scanf("%d", &_matriz[i][j]);
		}
	}


	/*
        Toda vez que encontrar o numero 1, fazer a soma da linha e coluna da posicao dele
	se a soma ultrapassar 2(2 porque vai somar ele mesmo duas vezes) significa que tem
	algum outro numero diferente de zero na linha ou coluna.
        Desse jeito, evita ter que fazer a somatoria de TODAS as colunas e linha da matriz.
	*/
	for (int i=0; i<tam && p==0; i++){ //percorrer a coluna da matriz.
		for (int j=0; j<tam && p==0; j++){ //percorrer a linha da matriz.
            if (_matriz[i][j]==1){
                for (int k=0, soma=0; k<tam && p==0; k++){
                    soma+=_matriz[i][k]+_matriz[k][j]; //isso soma a linha e coluna da posicao que foi encontrada o numero 1.
                    if (soma > 2){
                        p=1; //isso faz o codigo parar, pois uma vez encontrado um numero diferente de 0 ele ja deixa de ser permutado
                    }
                }
            }
            else{
                _um++;
            }
		}
	}

	//resposta.
	if (_um < (tam*tam)){
        if (p==0)printf("\n\nA matriz e de permutacao!");
        else printf("\n\nA matriz nao e de permutacao!");
        printf("\n\n");
	}
	else printf("\n\nO numero 1 nao foi encontrado!");
}
