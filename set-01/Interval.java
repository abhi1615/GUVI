import java.util.*;
public class Interval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		//System.out.printf("%d %d",n,m);
		for(int i=n+1;i<m;i++) {
			if(i%2!=0)
				System.out.print(i + " ");
		}
		sc.close();
	}

}
