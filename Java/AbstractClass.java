import java.util.*;
abstract class AbstractClass{
    String name;
    String species;
    AbstractClass(String n, String s){
        name = n;
        species = s;

    }

    void eat(String foodItem){
        System.out.println(species+" "+name+" like to have "+foodItem);
    }
    abstract void sound();
    public static void main(String... args){
        A a = new A("picoke","birds");
        a.eat("plant seeds");
        a.sound();
    }
}
class A extends AbstractClass{
    A(String n, String s){
        
        super(n,s);

    }
    void sound(){
            System.out.println("pi pip pi");
    }
}
