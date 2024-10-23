package ConditionalsANDLoops;
import java.util.*;
public class FibinousiNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1; // 0 1 1 2 3 5 8
        int c=2;
        while(c<=n)
        {
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(a);
    }
}
