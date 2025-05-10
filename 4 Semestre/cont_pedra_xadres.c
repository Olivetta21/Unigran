#include <stdio.h>
#define tam 5

void main(){
	int _matriz[tam][tam], _pedra[7];

	//formatar a matriz para zeros.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_matriz[i][j] = 0;
		}
	}
	//formatar o vetor para zeros.
	for (int i=0; i<7; i++){
		_pedra[i] = 0;
	}
    printf("Tabela:\n1-Peoes\n2-Torres\n3-Reis\n4-Cavalos\n5-Bispos\n6-Rainhas\n7-Casas vazias\n\n");
	//leitura da matriz do usuario.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){

            //aceitar numeros somente de 1 a 7.
            do{
                printf("Tabuleiro coluna[%d] linha[%d]: ", i+1,j+1);
                scanf("%d", &_matriz[i][j]);
                if (_matriz[i][j] < 1 || _matriz[i][j] > 7) printf("\nSomente numeros de 1 a 7.\n");
            }while (_matriz[i][j] < 1 || _matriz[i][j] > 7);
		}
	}

    //contar as pedras.
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			_pedra[_matriz[i][j] - 1]++; //incrementar em 1 o vetor na posicao do valor que aparecer no conteudo da matriz
		}
	}

	//mostrar o tabuleiro digitado.
	printf("\nTabuleiro:\n");
	for (int i=0; i<tam; i++){
		for (int j=0; j<tam; j++){
			printf("%d\t",_matriz[i][j]);
		}
		printf("\n\n\n");
	}

	//resposta.
	printf("\n\nQuantidade de pedras:\n");
    for (int i=0; i<7; i++){

        //switch para mostrar os nomes das pedras
        switch(i){
            case 0:{
                printf("Peoes: ");
                break;
            }
            case 1:{
                printf("Torres: ");
                break;
            }
            case 2:{
                printf("Reis: ");
                break;
            }
            case 3:{
                printf("Cavalos: ");
                break;
            }
            case 4:{
                printf("Bispos: ");
                break;
            }
            case 5:{
                printf("Rainhas: ");
                break;
            }
            case 6:{
                printf("Casas vazias: ");
                break;
            }
        }
        printf("%d\n", _pedra[i]); //mostrar a quantidade da respectiva pedra
    }
}
