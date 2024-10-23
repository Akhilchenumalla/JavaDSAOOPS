package ObjectOrientedPro.AbstractInterfaceAnnotations;

public class Son extends AbstractClass
{
    @Override
    void career(String name)
    {
        System.out.println("i need to be doctor");
    }

    @Override
    void patner(String name,int age)
    {
        System.out.println("I need Patner");
    }
}
