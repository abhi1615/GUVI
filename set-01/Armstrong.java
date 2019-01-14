import java.util.Scanner;

public class Armstrong {

	public static int findLen(int n) {
		int c=0;
		while(n!=0) {
			n/=10;
			c+=1;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int len = findLen(n);
		int n2 = n;
		int sum = 0;
		while(n!=0) {
			int temp = n%10;
			sum += Math.pow(temp, len);
			n /= 10;
		}
		if (n2==sum)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
