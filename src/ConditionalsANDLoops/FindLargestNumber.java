package ConditionalsANDLoops;

public class FindLargestNumber
{
    public static void main(String[] args) {
        int n=10;
        int a=20;
        int b=30;

//        int max=a;
//        if(b>max)
//        {
//            max=b;
//        }
//
        int max=Math.max(n,Math.max(a,b));
        System.out.println(max);

    }
}
