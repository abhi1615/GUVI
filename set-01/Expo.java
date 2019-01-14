import java.util.*;
import java.lang.Math;
public class Expo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		int res=(int) (Math.pow(n,m));
		System.out.print(res);
		sc.close();
	}
	
}
