import java.util.ArrayList;
import java.util.Scanner;
/*
 * Work For Hacker Rank Project Euler #10: Summation of primes
 * And Will Pass All Test Case 
 */
class Q10 {
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                ArrayList<Integer> prime = new ArrayList<>();
                for(int i=2;i<=2000000;i++)
                {
                        boolean flag = true;
                        for(int j=2;j<=Math.sqrt(i);j++)
                        {
                                if(i%j == 0)
                                {
                                        flag = false;
                                        break;
                                }
                        }
                        if(flag)
                        {
                                prime.add(i);
                                //System.out.println(i);
                        }
                }
                Scanner scanner = new Scanner(System.in);
                int t = scanner.nextInt();
                while(t-->0)
                {
                        int n = scanner.nextInt();
                        long sum=0,value=prime.get(0);
                        int i=0;
                        while(value<=n)
                        {
                                sum+=value;
                                i++;
                                value=prime.get(i);
                                //System.out.println(value+" "+n);
                        }
                        System.out.println(sum);
                }
        }
}
