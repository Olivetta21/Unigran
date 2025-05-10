#include <stdio.h>
int _anos,_meses,_dias;
void main(){
	printf("Anos vividos: ");
	scanf("%d", & _anos);
	printf("Meses vividos: ");
	scanf("%d", & _meses);
	printf("Dias vividos: ");
	scanf("%d", & _dias);
	printf("Voce ja viveu por %d dias!", (_anos*365)+(_meses*30)+_dias);
}
