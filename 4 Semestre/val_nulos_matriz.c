#include <stdio.h>
#define tam 5

void main(){
	int _matriz[tam][tam], _somaLinha=0, _somaColuna=0, _lNull=0, _cNull=0;

	//formatar a matriz para zeros.
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


	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_somaLinha+=_matriz[i][j]; //faz a soma da linha na posicao
			_somaColuna+=_matriz[j][i]; //faz a soma da coluna
		}
		if (_somaLinha==0) _lNull++; //se a soma da linha for 0, incrementar a quantidade de linhas nulas.
		_somaLinha=0; //resetar a soma das linhas.
		if (_somaColuna==0) _cNull++; //se a soma da coluna for 0, incrementar a quantidade de colunas nulas.
		_somaColuna=0; //resetar a soma das colunas.

	}

    //mostrar matriz digitada
    printf("\nMatriz:\n");
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			printf("%d\t",_matriz[i][j]);
		}
		printf("\n\n\n");
	}
	//resposta.
	printf("\nTem %d linhas nulas\ne %d colunas nulas.\n", _lNull, _cNull);
}
