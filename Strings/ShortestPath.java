package Strings;
import java.util.*;
public class ShortestPath {
    
    public static float Shortest_Path(String path){
         int x=0;
         int y=0;
         
         for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            } //north
            else if(dir=='N'){
                y++;
            } //east
            else if(dir=='E'){
                x++;
            }//west
            else{
                x--;
            }
         }
         int X2 =x*x;
         int Y2 = y*y;
         return(float)Math.sqrt(X2 + Y2);

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a path");
        String path=sc.nextLine();

        System.out.println("Shortest path:"+Shortest_Path(path));
    }

}
//TC =O(n)