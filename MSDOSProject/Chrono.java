import java.util.*;
import static java.lang.System.*;
public class Chrono {
    public static void main(String[] args) throws InterruptedException {
       
        
        int timestop = 12;
        int s = 0;
        int min = 0;
        int h = 0;
        boolean turns = false;
        for(s = timestop ; s<=timestop && s >= 0 ; s--){
            Thread.sleep(1000);
            if(turns)
            System.out.print("\r");
            if(s == 60){
                s = 0;
                min ++;
            }
            if(min == 60){
                min = 0;
                h++;
            }
            if (h < 10) {
                out.print("0" + h + ":");

            } else {
                out.print(h + ":");
            }
            if (min < 10) {
                out.print("0" + min + ":");
            } else {
                out.print(min + ":");
            }
            if (s < 10)
                out.print("0" + s);
            else
                out.print(s);
            turns = true;
        }

    }
    
}
