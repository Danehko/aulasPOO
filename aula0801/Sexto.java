import java.util.Random;


public class Sexto{
	
	public static void main (String[] args){
		long[] vet = new long[10];
		Random x = new Random();
		int b = 0;
		while(b<10){
			int a = 0;
			long DV = 0;

			vet[0]=1;
			vet[1]=(x.nextInt(7)+2);
			vet[2]=(x.nextInt(2)+1);
			vet[5]=x.nextInt(10);
			vet[6]=x.nextInt(10);
			vet[7]=x.nextInt(10);
			vet[8]=x.nextInt(10);

			while(a!=10){
				if (a<9){
					DV = DV + (vet[a] * (10-a));
				}
				a = a + 1;	
			}
			DV = DV * 10;
			vet[9] = DV % 11;
			String result = Long.toString(vet[0])+Long.toString(vet[1])+Long.toString(vet[2])+Long.toString(vet[3])+Long.toString(vet[4]) + Long.toString(vet[5])+Long.toString(vet[6])+Long.toString(vet[7])+Long.toString(vet[8])+Long.toString(vet[9]);
			if(result.length() == 10){
				System.out.println(result);
				b = b+1;
			}
		}
	}
}
