package Inheritance;
import java.util.*;
public class Multilple {
    public static void main(String args[]){
     bear b=new bear();
     b.eat();
    }
}

interface Herbivore{
    void eat();
    
}

interface carnivore{
    void eat();
}

class bear implements Herbivore,carnivore{
    public void eat(){
        System.out.println("eats grass an animal");
    }
}