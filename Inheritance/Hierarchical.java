package Inheritance;
import java.util.*;
public class Hierarchical {
    
    public static void main(String args[]){
       fish f=new fish();
       f.eat();
       f.swim();

       bird b=new bird();
       b.eat();
       b.breath();
       b.fly();
    }
}

//base class
class Animal{
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//derived class 1
class fish extends Animal{
    
    void swim(){
        System.out.println("swims");
    }
}

//derived class 2
class bird extends Animal{

    void fly(){
        System.out.println("flys");
    }
}
