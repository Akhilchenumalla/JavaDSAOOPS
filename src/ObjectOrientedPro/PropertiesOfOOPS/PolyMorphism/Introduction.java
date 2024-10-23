package ObjectOrientedPro.PropertiesOfOOPS.PolyMorphism;

public class Introduction
{
    //poly is many and morphism is ways to represent
    //it occurs while inheritance
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circe = new Circle();
        Square square = new Square();

        square.area();
    }
    //Types of Polymorphism
    //1.compile time / static polymorhism : Achived via method overloading
    //method overloading : same methods name but types , arguments , return types ordering can be different
    // A a = new A();
    // A a2 = new A(3,4);

    //2. Runtime / Dynamic polymorphism : achieved by method overriding
    //we parent class and child class have same method for example in shape and circle void area method is same which
    //is overriding
    //parent obj = new child();
    //here, which method will be called depends on child class this is known as upcasting and ignoring parent is called
    //as overiding
    //how java determines this?
    //Dynamic method dispatch
    //we stop override by final keyword
    //we cannot override the static methods





















}
