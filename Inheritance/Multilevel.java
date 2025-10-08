package Inheritance;
import java.util.*;
public class Multilevel {
   public static void main(String args[]){
     dog d=new dog();
     d.eat();
     d.legs=4;
     System.out.println(d.legs);
     d.color="black";
     System.out.println(d.color);
   } 
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class mammals extends Animal{
      int legs;

}

class dog extends mammals{
    String bred;
}