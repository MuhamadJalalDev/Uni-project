
package watch;

import java.util.Scanner;

public class Watch {
    private int hour;
   private int minute;
   private int second;
   
   Watch(int hour,int minute,int second){
       this.hour=hour;
       this.minute=minute;
       this.second=second;
   }
   Watch(int hour,int minute){
       this.hour=hour;
       this.minute=minute;
       
   }
   Watch(int hour){
       this.hour=hour;
   }
      Watch(){
       
   }
      
     public void setTime(int hour,int minute,int second){
         Scanner scan= new Scanner(System.in);
         
         this.hour=hour;
         this.minute=minute;
         this.second=second;
     }
   public String getTime(){
       return this.hour+":"+this.minute+":"+this.second;
   }  
}

