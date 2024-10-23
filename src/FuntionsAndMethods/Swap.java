package FuntionsAndMethods;

public class Swap
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int u,int k)
    {
        int temp=u;
        u=k;
        k=temp;
        System.out.println(u+" "+k);
    }
    /*
    psvm()
    {
    a=10
    print(a);
    }
    change(namm)// namm is called scoping
    {
    namm=20;
    }

    it prints a=10 not 20
    because in java there is pass by value not pass by reference & we creating new object not changing objects thats why
    it shows same ...
     */

}
