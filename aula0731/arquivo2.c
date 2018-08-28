#include<stdio.h>
int main(void){
	int n1=0, n2=0;
	int result1=1;
	int result2=1;
	int final=0;
	printf("Entre com o primeiro numero: ");
	scanf("%d", &n1);
	printf("Entre com o segundo numero: ");
	scanf("%d", &n2);
	printf("%d %d\n", n1, n2);
	if(n1>0 && n2>0){
		while(n1!=0){
			result1 = result1 * n1;
			n1--;
		}
		printf("%d %d\n", n1, n2);
		while(n2!=0){
			result2 = result2 * n2;
			n2--	;
		}
		printf("%d %d\n", n1, n2);
		final = result1 + result2;
		printf("A soma dO fatorial dos dois numeros que você digitou é: %d\n", final);
	}
	else{
		printf("não existe fatorial de um dos números");
	}
	return 0;
}
