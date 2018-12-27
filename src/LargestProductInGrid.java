import java.util.Scanner;

class LargestProductInGrid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[20][20];
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
				arr[i][j] = scanner.nextInt();
		}
		long max = Long.MIN_VALUE;
		//	Horizontally
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<17;j++)
			{
				long p = arr[i][j] * arr[i][j+1] * arr[i][j+2] * arr[i][j+3];
				max = Math.max(p, max);
			}
		}
		//	Vertically
		for(int i=0;i<17;i++)
		{
			for(int j=0;j<20;j++)
			{
				long p = arr[i][j] * arr[i+1][j] * arr[i+2][j] * arr[i+3][j];
				max = Math.max(p, max);
			}
		}
		
		System.out.println("max:"+max);
	}
}
