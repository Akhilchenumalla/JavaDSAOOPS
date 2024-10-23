package Recursion;
import java.util.*;
public class Recursion1234
{
    public static void main(String args[])
    {
        //function calling itself is recursion;
        //it is very important for futher data structures and algorithms
        //how to learn recursion
        //two things too remember  we need to know about the functions
        //while the functions is not finished executing it will remain in stack
        //when a function finishes excuting , it is removed from stack ,and the flow of program is finished
        print(1);
    }
    static void print(int n)
    {
        if(n==50)
        {
            System.out.print(n);
            return; // it will return to last function and make them to execute
        }

        System.out.print(n+" ");
        //this is tail recursion
        //this is the last function call
        print(n+1);
        //if you are calling a function again and again, you can treat it as a separate call in the stack and store different memeory
        //why recursion?
        //it helps us in solving bigger/complex problems in a simple way.
        //you can convert recursion solution into iteration and vice versa;


    }
}
