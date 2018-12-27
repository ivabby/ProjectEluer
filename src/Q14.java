import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Q14 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sequenceLength = 0;
		int startingNumber = 0;
		int sequence;
		LinkedList<Integer> cache = new LinkedList<>();
		cache.add(0);
		cache.add(1);
		
		for (int i = 2; i <= 100000; i++) {
		    sequence = i;
		    int k = 0;
		    while (sequence != 1 && sequence >= i) {
		        k++;
		        if ((sequence % 2) == 0) {
		            sequence = sequence / 2;
		        } else {
		            sequence = sequence * 3 + 1;
		        }
		    }
		    //Store result in cache
		    cache.add(k + cache.get(sequence));
		    //Check if sequence is the best solution
		    if (cache.get(i) > sequenceLength) {
		        sequenceLength =  cache.get(i);
		        startingNumber = i;
		    }
		}
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			
			int number = Integer.parseInt(br.readLine());
			
			System.out.println(cache.get(number));
		}
	}
}
