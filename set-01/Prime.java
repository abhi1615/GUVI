import java.util.*;
import java.lang.Math;
public class Prime {

	public static Boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(isPrime(n))
			System.out.print("yes");
		else
			System.out.print("no");
		sc.close();
	}

}
