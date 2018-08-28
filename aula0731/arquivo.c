#include<stdio.h>
int main(void){
	int i;
	int result=1;
	printf("Entre com um numero: ");
	scanf("%d", &i);
	if(i>0){
		while(i!=0){
			result = result * i;
			i--	;
		}
	printf("O fatorial do numero que você digitou é: %d\n", result);
	}
	else{
		printf("não existe fatorial desse número");
	}
	return 0;
}
