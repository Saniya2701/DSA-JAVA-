package Inheritance;
import java.util.*;
public class Hybrid {
    public static void main(String args[]){
       fish f=new fish();
       f.fins=4;
       System.out.println(f.fins);
       f.eat();

       dog d=new dog();
       d.breath();

       tuna t=new tuna();
        t.swim();
        t.type();
        t.eat();

    }
}

class Animal{

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class fish extends Animal{
   int fins;
    void swim(){
        System.out.println("swims");
    }
}

class dog extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class tuna extends fish{
    void type(){
        System.out.println("tuna diffrent");
    }
}