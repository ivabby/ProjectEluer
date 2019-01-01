import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int a[][] = new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<=i;j++)
					a[i][j] = scanner.nextInt();
			
			for(int i=n-2;i>=0;i--)
				for(int j=0;j<=i;j++)
					a[i][j]+=Math.max(a[i+1][j],a[i+1][j+1]);
			
			System.out.println(a[0][0]);
		}
	}
}
