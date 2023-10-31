
package watch;

import java.util.Scanner;

public class mainWatch {
    public static void input(){
       Scanner scan = new Scanner(System.in);
       System.out.println("hour: ");
       int hour = scan.nextInt();
       System.out.println("minute: ");
       int minute = scan.nextInt();
       System.out.println("second: ");
       int second = scan.nextInt();
       
       if(hour>=24 || hour<0){
            hour=0;
        }
        if(minute>=60 || minute<0){
            minute=0;
        }
        if(second>=60 || second<0){
            second=0;
        }
       Watch watch = new Watch(hour,minute,second);
       
       System.out.println(watch.getTime());
       
   }
    public static void main(String[] args) {
        Watch w1= new Watch(12,10,2);
        Watch w2= new Watch(12,10);
        Watch w3= new Watch(12);
        Watch w4= new Watch();
        
        System.out.println(w1.getTime());
        
        input();
        }
    
}

