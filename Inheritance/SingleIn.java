package Inheritance;
import java.util.*;
public class SingleIn {
    
public static void main(String args[]){
     Fish f=new Fish();
     f.eat();
     f.breath();
}

}
//base class
class Animal{
    String color; //property

    void eat(){ //function 1
        System.out.println("eats");
    }

    void breath(){ //function 2
        System.out.println("breath");
    }
}

//derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}
