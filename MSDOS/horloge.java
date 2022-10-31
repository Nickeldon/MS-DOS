import java.util.*;
public class horloge {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Stopping time?");
        int timestop = c.nextInt();
        
            horloge.clock();
            int i = 0;
            int min = 0;
            int h = 0;


            for (; i<=timestop  ; ) {
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
                    System.out.print("0" + h + ":");

                } else {
                    System.out.print(h + ":");
                }
                if (min < 10) {
                    System.out.print("0" + min + ":");
                } else {
                    System.out.print(min + ":");
                }
                if (i < 10)
                    System.out.print("0" + i);
                else
                    System.out.print(i);

                System.out.print("\r");
            }}

    static void clock() {
    }
}

    