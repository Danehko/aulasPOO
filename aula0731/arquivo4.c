#include<stdio.h>
int main(void){
	int n1=0, n2=0;
	int result1=1;
	int result2=1;
	int aux1=1;
	int aux2=1;
	int final=0;
	printf("Entre com o primeiro numero: ");
	scanf("%d", &n1);
	printf("Entre com o segundo numero: ");
	scanf("%d", &n2);
	printf("%d %d\n", n1, n2);
	if(n1>0 && n2>0){
		while(aux1!=n1+1){
			result1 = result1 * aux1;
			printf("%d!=%d\n", aux1, result1 );
			aux1++;
		}
		while(aux2!=n2+1){
			result2 = result2 * aux2;
			printf("%d!=%d\n", aux2, result2);
			aux2++;
		}
	}
	else{
		printf("não existe fatorial de um dos números");
	}
	return 0;
}
