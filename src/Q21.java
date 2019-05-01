
public class Q21 {
	static long sumOfFactors(long n)
	{
		long sum = 1;
		long sq = (long)Math.sqrt(n);
		if(n == sq * sq)
		{
			sum+=sq;
			sq--;
		}
		for(int i=2;i<=sq;i++)
		{
			if(n%i == 0)
				sum+= i + n/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		int limits = 10000;
		for(long i=2;i<=limits;i++)
		{
			long s1 = sumOfFactors(i);
			if(s1>i && s1<=limits)
			{
				long s2 = sumOfFactors(s1);
				if(s2 == i)
					sum+=s1+s2;
			}
		}
		System.out.println(sum);
	}
}