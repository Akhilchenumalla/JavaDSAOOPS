package ObjectOrientedPro.AccessModifiers;

public class A
{
    int num;
    String name;
    int[] arr;

    public A()
    {
        this.num=-1;
    }
    public A(int num,String name,int[] arr)
    {
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    //private is for security purposes  we only use in class
    //no modifier or default is class,package and subclass(same pkg) but not use in subclass(diff pkg),World(diff pkg and not subclass)
    //protected is class,package,subclass(same pkg) and subclass(diff pkg) but not in world
    //public is class,package,subclass(same and different pkg) and world also.

}
