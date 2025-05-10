#include <stdio.h>
#define tam 5

void main(){
	int _matriz[tam][tam], _somaLinha[tam], _somaColuna[tam], _somaVertP=0, _somaVertS=0, p=0;

	//formatar a matrize e vetores para zeros.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_matriz[i][j] = 0;
		}
		_somaLinha[i] = 0;
		_somaColuna[i] = 0;
	}

	//leitura da matriz do usuario.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			printf("Matriz[%d][%d]: ", i+1,j+1);
			scanf("%d", &_matriz[i][j]);
		}
	}

    //somar todas as linhas e colunas, e verticais
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_somaLinha[i]+=_matriz[i][j]; //armazena a soma de cada linha em uma posicao do vetor
			_somaColuna[i]+=_matriz[j][i]; //armazena a soma de cada coluna em uma posicao do vertor
		}
		_somaVertP+=_matriz[i][i]; //armazena a soma da vertical principal nessa variavel
		_somaVertS+=_matriz[i][tam-1-i]; //armazena a soma da vertical secundaria nessa variavel
	}


	//resposta.

	for (int i=1; i<tam && p==0; i++){
        printf("\nTeste %d:\nsumLin0:%d\nsumLin%d:%d\nsumCol%d:%d\nsumVertP:%d\nsumVertS:%d\n",i, _somaLinha[0],i,_somaLinha[i],i,_somaColuna[i],_somaVertP,_somaVertS);


        //Verificar se todas as somas sao iguais, caso um for divergente: parar a verificacao, e dizer que o teste foi reprovado.
        if (_somaLinha[0] != _somaLinha[i] || _somaLinha[0] != _somaColuna[i] || _somaLinha[0] != _somaVertP || _somaLinha[0]!= _somaVertS){
            p=1;
            printf("reprovou\n");
        }
        if (p==0) printf("passou\n");
	}
	if (p==0) printf("\nA matriz e um quadrado magico.\n\n");
	else printf("\nA matriz nao e um quadrado magico.\n\n");
}
