import java.util.ArrayList;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<a.length;i++)
			arrayList.add(a[i]);
		int value = 999999;
		String s = "";
		for(int i=1;i<=10;i++)
		{
			int q = value/i;
			int rem = value%i;
			s = rem + s;
			value = q;
		}
		int i = 0;
		while(!arrayList.isEmpty())
		{
//			System.out.println();
			int v = Integer.parseInt(s.charAt(i)+"");
			System.out.print(arrayList.get(v));
			arrayList.remove((int)v);
			i++;
		}
	}

}
