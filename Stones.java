import java.util.*;
public class Stones{
    public static void main(String[]args){
        Scanner kbd = new Scanner(System.in);
        int N=kbd.nextInt();
        if((1<=N) && (N<=10000000)){
          if(N%2==0)
             System.out.println("Bob");
          else
            System.out.println("Alice");
        }
    }
}