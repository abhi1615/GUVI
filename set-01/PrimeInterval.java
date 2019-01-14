import java.util.Scanner;

public class PrimeInterval {

	public static Boolean isPrime(int n)
	{
		if (n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n+1;i<m;i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
		sc.close();
	}

}
