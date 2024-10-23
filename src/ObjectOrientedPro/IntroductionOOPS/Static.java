package ObjectOrientedPro.IntroductionOOPS;

public class Static
{
    //why main is static?
    //ans.1. JVM Access:
    //The Java Virtual Machine (JVM) needs to call the main method to start the execution of your program.
    //If main were not static, the JVM would need to first create an object of the class containing main.
    //By making main static, it belongs to the class itself, not any specific instance, allowing the JVM to call it directly without creating an object.
    //2. Entry Point:
    //The main method serves as the entry point of your Java program.
    //It is the method that is called first when your program starts.
    //By making it static, it ensures that the JVM can locate and execute it without any prior object instantiation.
    //3. Independence:
    //Static methods can be called without creating an instance of the class.
    //This is essential for the main method, as it needs to be accessible even before any objects of your class are created
    public static void main(String[] args)
    {
        //static elements are object independent this elements are dependent on class
//        Human akhil =new Human(10,"akhil");
//        Human virat=new Human(11,"virat");
        System.out.println(Human.population);
        //here see population is static and it is common for everyone
        Static obj=new Static();
        obj.greeting();
        //so we can access the class by creating object to it;
        //otherwise it will not run it gives error;
        //we cannot use the this keyword in static method
    }
    void greeting()
    {
        System.out.println("Hello");
    }


}
class Human {
    int age;
    String name;
    static long population;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population += 1;
    }
}
