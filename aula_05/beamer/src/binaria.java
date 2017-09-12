vetor[10] = {10, 16, 21, 31, 37, 43, 45, 48, 87, 99}
inicio = 0;
fim = vetor.length - 1;
centro;
do{
	centro = inicio + (fim - inicio)/2;
	if(x < vetor[centro])
		fim = centro - 1;
	else if(x > vetor[centro])
		inicio = centro + 1;
	else return centro;
}while(inicio <= fim);
