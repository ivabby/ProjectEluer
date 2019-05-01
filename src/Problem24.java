import java.util.ArrayList;
import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong();
		while(t-->0)
		{
			ArrayList<Integer> a = new ArrayList<>();
			for(int i=0;i<13;i++)
				a.add(i);
			long b[] = new long[13];
			long n = scanner.nextLong() - 1;
			String string = "";
			int j = 12;
			for(int i=1;i<=13;i++)
			{
				long q = n/i;
				long v = n%i;
				//System.out.println(v);
				b[j] = v;
				j--;
				n = q;
			}
			int i = 0;
			//System.out.println();
			//System.out.println(string);
			while(!a.isEmpty())
			{
				//int v = Integer.parseInt(string.charAt(i)+"");
//				System.out.println(b[i]);
				System.out.print((char)(a.get((int) b[i])+97));
				a.remove((int)b[i]);
				i++;
			}
			System.out.println();
		}
	}
}
