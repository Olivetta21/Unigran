#include <stdio.h>
float _alt, _i, _qnt=0;
void main(){
	//repetir ate 10 pessoas
	for (_i = 1; _i <= 10; _i++, _alt =0){
		printf("Qual a altura da %.0f pessoa em metros: ", _i);
		scanf("%f", & _alt);
		//se altura digitada for maior que 1.8 metros, aumentar a quantidade de pessoas em 1
		if (_alt > 1.8){
			_qnt++;
		}
	}
	printf("Pessoas com mais de 1.80 Metros: %.2f", _qnt);
}

