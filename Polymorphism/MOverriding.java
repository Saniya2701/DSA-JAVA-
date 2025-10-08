package Polymorphism;
import java.util.*;
public class MOverriding {
    public static void main(String args[]){
       deer d=new deer();
       d.eat();
    }
}
class Animal{

    void eat(){
        System.out.println("eat anything");
    }
}

class deer extends Animal{

    void eat(){
        System.out.println("eat grass only");
    }
}

//run time polymorphism