import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp!=0)
		{
			int a=temp%10;
			rev = rev*10+a;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.println("no");
		}
		sc.close();
	}
}
