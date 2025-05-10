#include <stdio.h>
float _alt=-1, _p=1, _maior=0, _quem;
void main(){

	do{
		printf("Qual a altura da %.0f pessoa em metros: ", _p);
		scanf("%f", & _alt);
		/*
		se a altura digitada for maior que o maior numero armazenado, definir o maior
		numero como a atual altura digitada. E registrar o numero desta pessoa.
		*/
		if (_alt > _maior){
			_maior=_alt;
			_quem=_p;
		}
		_p++;//_p refere-se ao numero da pessoa
	}while(_alt != 0);
	printf("\nA pessoa '%.0f' tem a maior altura: %.2f", _quem, _maior);
}


