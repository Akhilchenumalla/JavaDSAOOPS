package Arrays;
import java.util.*;
public class Problem
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                System.out.println("FizzBuzz");
            }
            else if(i%a==0)
            {
                System.out.println(i);
                System.out.println("Fizz");
            }
            else if(i%b==0) {
                System.out.println(i);
                System.out.println("Buzz");
            }
            else
            {
                continue;
            }
        }
    }
}
