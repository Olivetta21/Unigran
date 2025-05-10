#include <stdio.h>
float _raio, _altura;
void main(){
	printf("O raio da lata: ");
	scanf("%f", & _raio);
	printf("A altura da lata: ");
	scanf("%f", & _altura);
	printf("O volume da lata e de: %0.2f", 3.14159 * (_raio*_raio) * _altura);
}
