package Polymorphism;
import java.util.*;
public class MOverloading {
    public static void main(String args[]){
      calculator c=new calculator();
      System.out.println(c.sum(3,2));
      System.out.println(c.sum((float)1.4 ,(float)2.3));
      System.out.println(c.sum(2,5,3));
    }
}
class calculator{

    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }
}


//it is compile time polymorphism