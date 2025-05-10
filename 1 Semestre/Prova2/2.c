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
