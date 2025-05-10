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
