#include <stdio.h>

void main(){
	float _A=9000000, _B=20000000;
	int _anos;

	for (_anos=1; _A<=_B; _anos++){
		_A= _A*1.03;
		_B= _B*1.015;
	}
	printf("Para a populacao do pais B ultrapassar a do A\nsera necessario %d anos.", _anos);
	printf("\nO pais A tera aproximadamente %.0f habitantes", _A);
	printf("\nO pais B tera aproximadamente %.0f habitantes", _B);
}





#include <stdio.h>

void main(){
	int _idade = 0, _count = 1, _maior;
	do{
		printf("Idade da pessoa %d: ", _count);
		scanf("%d", &_idade);
		if (_count == 1){
			_maior = _idade;
		}
		else{
			if (_idade > _maior){
				_maior = _idade;
			}
		}
		_count++;
	}while (_idade != 0);
	printf("A maior idade digitada foi: %d", _maior);
}





#include <stdio.h>

void main(){
	float _vet[10], _soma=0, _media=0;
	int _res[2];

    for (int i=0; i<2; i++){
        _res[i] = 0;
    }

	for (int i=0; i<10; i++){
		printf("Vetor[%d]", i+1);
		scanf("%f", &_vet[i]);
		_soma+= _vet[i];
	}

	_media = _soma/10;

	for (int i=0; i<10; i++){
        if (_vet[i] < _media){
            _res[0]++;
        }
        else _res[1]++;
	}

    printf("Media: %.1f\n", _media);
	printf("Numeros abaixo da media: %d\n", _res[0]);
	printf("Numeros acima da media: %d\n", _res[1]);
}







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
