import java.util.Scanner;
import java.util.TreeMap;

class Q10 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		TreeMap<Integer, Integer> hMap = new TreeMap<>();
		int factor = 1;
		int x = 1,i=2;
		hMap.put(x, factor);
		while(factor<=(Math.pow(10, 3)))
		{
			factor = 1;
			x = x + i;
			for(int j=2;j<=x;j++)
				if(x%j == 0)
					factor++;
			i++;
			System.out.println(x+" "+factor);
			if(!hMap.containsKey(factor))
				hMap.put(factor, x);
		}
		System.out.println(hMap);
	}
}
