import java.util.*;
public class progressbar{
    public static void main(String[] args) throws InterruptedException {
        
System.out.print("\033[H\033[2J");        
int progress = 0;
String prog = "";
        for(int i = 0; i<= progress; i++){
            Thread.sleep(20);
            System.out.print("=");
            System.out.print("\r"); 
        }

        while(progress < 100){
            Thread.sleep(60);
            prog += "=";
            progress += 5;
            if(progress > 95){
                progress -= 4;
                Thread.sleep(1000);
            }
            if(progress == 99){
                Thread.sleep(5000);
            }
            System.out.print("<|");
            System.out.print(prog + progress + "%" + prog);
            System.out.print("|>");
            System.out.print("\r");
        }
        System.out.print("\033[H\033[2J");  
    }
}