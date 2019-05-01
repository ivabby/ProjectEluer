import java.util.ArrayList;
import java.util.Scanner;

public class Problem23 {
	static long sumOfFactors(int n)
	{
		long sum = 1;
		long sq = (int) Math.sqrt(n);
		if(n == sq*sq)
		{
			sum+=sq;
			sq--;
		}
		for(int i=2;i<=sq;i++)
			if(n%i == 0)
				sum+=i+(n/i);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 28123;
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=2;i<=limit;i++)
		{
			long sum = sumOfFactors(i);
			if(sum > i)
				arrayList.add(i);
		}
		//System.out.println(arrayList);
		boolean b[] = new boolean[limit+1];
		for(int i=0;i<arrayList.size();i++)
		{
			for(int j=i;j<arrayList.size();j++)
			{
				int sum = arrayList.get(i) + arrayList.get(j);
				if(sum<=limit)
					b[sum] = true;
			}
		}
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			if(n>limit)
				System.out.println("NO");
			else {
				if(b[n])
				System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}