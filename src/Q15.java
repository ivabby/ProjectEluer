import java.util.Scanner;

public class Q15 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long mod = (long) (Math.pow(10, 9) + 7);
		while(t-->0)
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			n++;
			m++;
			long grid[][] = new long[n][m];
			for(int i=0;i<m;i++)
				grid[0][i] = 1;
			for(int i=0;i<n;i++)
				grid[i][0] = 1;
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<m;j++)
				{
					grid[i][j] = (grid[i-1][j] + grid[i][j-1]) % mod;
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
					System.out.print(grid[i][j]+" ");
				System.out.println();
			}
			System.out.println(grid[n-1][m-1]);
		}
	}
}
