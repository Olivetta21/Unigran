/*Questão 03:
Um posto está vendendo Gasolina com os seguintes descontos: até 20 litros, desconto de 4% por
litro e acima de 20 litros, desconto de 6% por litro. Faça um programa que leia o número de litros
vendidos de gasolina e mostre o valor a ser pago pelo cliente. Considere que o preço do litro da
gasolina é R$ 5,40.*/
#include <stdio.h>
void main(){
float _lts, _vlr, _comb=5.4;
printf("Quantos litros de gasolina esta sendo comprados: ");
scanf("%f", &_lts);
if (_lts > 20){
    _vlr = _comb*_lts*0.94;
}
else{
    _vlr = _comb*_lts*0.96;
}
printf("O valor a ser pago e: RS%.2f.\nRS%.2f de desconto.\n", _vlr, _lts*_comb-_vlr);
}
