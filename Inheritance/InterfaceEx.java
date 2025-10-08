package Inheritance;

import java.util.*;
public class InterfaceEx {
    public static void main(String args[]){
    Queen q=new Queen();
    q.move();

    rook r=new rook();
    r.move();

    king k = new king();
    k.move();
    }
}


interface chessplayer{
    void move(); //abstract method is used
}

class Queen implements chessplayer{
    public void move(){
        System.out.println("up,down,right,left,diagonal,(in all 4 dir)");
    }
}

class king implements chessplayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal -(by 1 step)");
    }
}

class rook implements chessplayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}