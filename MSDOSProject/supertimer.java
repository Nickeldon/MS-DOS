import java.util.*;
import java.util.function.Function;
import static java.lang.System.*;;
public class supertimer {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int i = 0;
                        int min = 0;
                        int h = 0;
                        out.println("Stopping time?");
                    int timestop = c.nextInt();
                        out.println("Format?");
                        out.println("hours               1)");
                        out.println("minutes             2)");
                        out.println("seconds             3)");
                        String Timechoice = c.next();
                        if(Timechoice.equals("1)")){
                            timestop = timestop * 3600;
                        }
                        else if(Timechoice.equals("2)")){
                            timestop = timestop*60;
                        }
                        else if(Timechoice.equals("3)")){
                            timestop = timestop*1;
                        }
                        for (; i<=timestop -1  ; ) {
                            i++;
                            if (i == 60) {
                                min++;
                                i = 0;
                            } else if (min == 60) {
                                h++;
                                min = 0;
                            } else if (h == 24) {
                                h = 0;
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
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
                            if (i < 10)
                                out.print("0" + i);
                            else
                                out.print(i);
            
                            out.print("\r");
                        }}
static void clock() {
    }
}   