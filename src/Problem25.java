import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger limit = BigInteger.valueOf((long) Math.pow(10, 999));
		BigInteger fib[] = new BigInteger[3];
		fib[0] = BigInteger.valueOf(1);
		fib[1] = BigInteger.valueOf(1);
		int i=1,cnt=2;
		while(fib[i].compareTo(limit) <= 0)
		{
			i=(i+1)%3;
			cnt++;
			fib[i] = fib[(i+1)%3].add(fib[(i+2)%3]);
		}
		System.out.println(i);
	}

}
