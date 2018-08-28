#include<stdio.h>
int fatorial(int numero, int exe){
	int aux1=1;
	int result1=1;
	while(aux1!=numero+1){
		result1 = result1 * aux1;
		if (exe == 4) {
			printf("%d!=%d\n", aux1, result1 );
		}
		aux1++;
	}
	return result1;
}

int main(void){

	int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
	int result1 = 0;
	int result2 = 0;
	int result3 = 0;
	int result4 = 0;
	int aux1 = 1;
	int final = 0;
	printf("Qual exercicio deseja fazer 1, 2, 3 ou 4?\n");
	scanf("%d", &aux1);
	switch (aux1){
   		case 1:
     		printf("Entre com um numero: \n");
			scanf("%d", &n1);
			if(n1>0){
				result1=fatorial(n1, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("%d!=%d\n", n1, result1 );
		break;

		case 2:
			printf("Entre com um numero: \n");
			scanf("%d", &n1);
			if(n1>0){
				result1=fatorial(n1, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("Entre com um numero: \n");
			scanf("%d", &n2);
			if(n2>0){
				result2=fatorial(n2, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			final = result1 + result2;
			printf("A soma dO fatorial dos dois numeros que você digitou é: %d\n", final);
		break;

		case 3:
			printf("Entre com um numero: \n");
			scanf("%d", &n1);
			if(n1>0){
				result1=fatorial(n1, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("Entre com um numero: \n");
			scanf("%d", &n2);
			if(n1>0){
				result2=fatorial(n2, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("Entre com um numero: \n");
			scanf("%d", &n3);
			if(n1>0){
				result3=fatorial(n3, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("Entre com um numero: \n");
			scanf("%d", &n4);
			if(n1>0){
				result4=fatorial(n4, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("%d!=%d\n", n1, result1 );
			printf("%d!=%d\n", n2, result2 );
			printf("%d!=%d\n", n3, result3 );
			printf("%d!=%d\n", n4, result4 );
		break;

		case 4:
			printf("Entre com um numero: \n");
			scanf("%d", &n1);
			if(n1>0){
				result1=fatorial(n1, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
			printf("Entre com um numero: \n");
			scanf("%d", &n2);
			if(n1>0){
				result2=fatorial(n2, aux1);
			}
			else{
				printf("não existe fatorial de um dos números\n");
				break;
			}
		break;

		default:
		break;
	}
	return 0;
}
