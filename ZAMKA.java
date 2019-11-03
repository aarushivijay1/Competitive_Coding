import java.util.Scanner;
public class ZAMKA {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		int L= sc.nextInt();
		System.out.println();
		int D= sc.nextInt();
		System.out.println();
		int X= sc.nextInt();
		findN(L, D, X);
        findM(L,D,X);
	}
	
	public static void findM(int L, int D, int X)
	{
		int M = 0;
		int sum ;
		for(int i=L; i<=D; i++)
		{
			sum=0;
			int j=i;
			while (j!=0)
			{
				int k= j%10;
				sum= sum+k;
				j =(j-k)/10;
			}
		if(sum==X)
		{
			M= i;
		}
		}
		
		System.out.println(M);
	}
	
	public static void findN(int L, int D, int X)
	{
		int N=0;
		int sum;
		for(int i=D; i>=L; i--)
		{
			sum=0;
			int j=i;
			while (j!=0)
			{
				int k= j%10;
				sum= sum+k;
				j =(j-k)/10;
			}
		if(sum==X)
		{
			N= i;
		}
		}
		
		System.out.println(N);
		
	}
}
