import java.io.*;
import java.util.*;
public class Problem21 {
	static long sumOfFactors(long n)
	{
		long sum = 1;
		long sq = (long) Math.sqrt(n);
		if(n == sq*sq)
		{
			sum+=sq;
			sq--;
		}
		for(long i=2;i<=sq;i++)
			if(n%i == 0)
				sum+=i+(n/i);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Long> a = new ArrayList<>();
		long limit = 100000;
		for(int i=2;i<=limit;i++)
		{
			long s1 = sumOfFactors(i);
			if(s1>i && s1<=limit)
			{
				long s2 = sumOfFactors(s1);
				if(s2 == i)
				{
					a.add(s1);
					a.add(s2);
				}
			}
		}
		//System.out.println(a);
		Collections.sort(a);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long sum = 0;
			long n = scanner.nextLong();
			for(Long i : a)
			{
				if(i>n)
					break;
				sum+=i;
			}
			System.out.println(sum);
		}
	}
}
