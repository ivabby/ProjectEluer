import java.util.*;	

public class Q12 {
	static ArrayList<Integer> prime = new ArrayList<>();
	static boolean b[] = new boolean[1001];
	static void seive()
	{
		int n = 1001;
		Arrays.fill(b , true);
		for(int i=2;i*i<n;i++)
		{
			if(b[i])
			{
				for(int j=i*i;j<n;j+=i)
					b[j] = false;
			}
		}
		for(int i=2;i<n;i++)
			if(b[i])
				prime.add(i);
		//System.out.println(prime);
	}
	static long div(int n)
	{
		long total = 1;
		for(int i=2;i<1001;i++)
		{
			//System.out.println(i+" "+(n%i)+" "+b[i]);
			if(b[i] == true && n%i==0)
			{
				long count = 0;
				while(n%i == 0)
				{
					count++;
					n/=i;
				}
				total = total*(count+1);
				//System.out.println(i+" "+count+" "+total);
			}
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//div(10);
		seive();
		//div(10);
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long n = scanner.nextLong();
			long count = 0;
			int i = 1;
			int j = 2;
			while(count <= n)
			{
				count = div(i);
				if(count > n)
				{
					System.out.println(i);
					break;
				}
				i = i + j;
				j++;
			}
//			System.out.println(i);
		}
	}
}
