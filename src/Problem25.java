import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Problem25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int map[] = new int[5001];
		map[1] = 1;
		BigInteger f[] = new BigInteger[3];
		f[0] = BigInteger.valueOf(1);
		f[1] = BigInteger.valueOf(1);
		int i=2;
		while(true)
		{
			f[2] = f[0].add(f[1]);
			String string = f[2].toString();
			int len = string.length();
			i++;
			if(len > 5000)
				break;
			if(map[len] == 0)
			{
				map[len] = i;
			}
			f[0] = f[1];
			f[1] = f[2];
		}
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			System.out.println(map[n]);
		}
	}
}