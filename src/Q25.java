import java.math.BigInteger;
/*For Project Eluer Website*/
public class Q25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 1000;
		BigInteger f[] = new BigInteger[3];
		f[0] = BigInteger.valueOf(1);
		f[1] = BigInteger.valueOf(1);
		BigInteger i = BigInteger.valueOf(2);
		while(true)
		{
			i = i.add(BigInteger.valueOf(1));
			f[2] = f[0].add(f[1]);
			String s = f[2].toString();
			if(s.length() >= length)
				break;
			f[0] = f[1];
			f[1] = f[2];
		}
		System.out.println(i);
	}
}
