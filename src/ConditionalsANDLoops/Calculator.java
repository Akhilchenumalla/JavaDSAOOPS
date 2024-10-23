package ConditionalsANDLoops;
import java.util.*;
public class Calculator
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ans=0;
        while(true)
        {
            char op=s.next().trim().charAt(0);
            if(op =='+'|| op=='-' || op =='*' || op == '/' || op == '%')
            {
                int num1 = s.nextInt();
                int num2=s.nextInt();

                if(op =='+')
                {
                    ans = num1 +num2;
                }
            }
        }
    }
}
