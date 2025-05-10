#include <stdio.h>
float _lata350,_g600,_g2000;
void main(){
	printf("Lista de vendas");
	printf("Latas de 350ml: ");
	scanf("%f", & _lata350);
	printf("Garrafas de 600ml: ");
	scanf("%f", & _g600);
	printf("Garrafas de 2L: ");
	scanf("%f", & _g2000);
	printf("Total: %0.1f litros litros vendidos", ((_lata350*350)+(_g600*600)+(_g2000*2000))/1000);
}
