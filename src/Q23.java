import java.util.ArrayList;
import java.util.Scanner;
/*
 * 	For Hackerrank
 */
public class Q23 {
	static long sumOfFactor(long n)
	{
		long sum = 1;
		long sq = (long) Math.sqrt(n);
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
		//long sum = (limit*(limit+1))/2;
		ArrayList<Integer> abundant = new ArrayList<>();
		for(int i=2;i<=limit;i++)
		{
			long factors = sumOfFactor(i);
			if(factors > i)
			{
				abundant.add(i);
			}
		}
//		System.out.println(abundant);
		boolean b[] = new boolean[28124];
		ArrayList<Integer> sumOfAbundant = new ArrayList<>();
		for(int i=0;i<abundant.size();i++)
		{
			for(int j=i;j<abundant.size();j++)
			{
				int s = abundant.get(i) + abundant.get(j);
				if(s<=limit)
					b[s] = true;
			}
		}
		long sum = 0;
		for(int i=1;i<=limit;i++)
		{
			if(b[i])
				continue;
			sum+=i;
		}
		System.out.println(sum);
	}
}
