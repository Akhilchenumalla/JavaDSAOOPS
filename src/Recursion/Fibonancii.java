package Recursion;

public class Fibonancii
{
    public static void main(String args[])
    {
        int n=10;
        System.out.println(fibonancii(n));
    }
    static int fibonancii(int n)
    {
        //base condition

        if(n<2)
        {
            return n;
        }

      return fibonancii(n-1)  + fibonancii(n-2);
    }
    //identify if you can break down problem into smaller problems
    //write the recurrence relation if needed
    //Draw the recursion tree
    //about the tree:
    //see the flow of functions,how they are getting in stack
    //identify and flows onleft tree calls and right tree calls
    //draw the tree and pointers again and again using pen and paper
    //use a debugger to see the flow

    //see how the values are returned at each step see where two functions call will come























}
