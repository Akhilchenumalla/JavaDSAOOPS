package FuntionsAndMethods;

public class Scope {
    static int x=20; // shadowing scope
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            a=80;// ressign the origin ref variable to some other valueww
            int c=22; // block scope we cannot acces the sout out side the braceses
            // values initialised in this block , will remain in block
        }
        int c=22;
        System.out.println(x);
        int x;
        //sout(x) it gives error because scope will begin when value is initialised
        //temp; we cannot access here we access only in function scope only
    }
    static void random(int marks)
    {
        int temp;
    }
}
