import sun.misc.Unsafe;

import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.format.TextStyle;
import java.util.*;
import java.util.Timer;
import static java.lang.System.out;
import static java.lang.System.in;

public class MSDOS {
    private static String primary;

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException{
        out.print("\r");
        String command, primary = "C:", logical =  "D:", extended = "E:", inputline = "C:/>";
        String Cformat = "NTFS", Dformat = "FAT32", Eformat = "FAT16";
        String cformatchoice, eformatchoice, dformatchoice;
        float calculateresponse;
        String textchoice = "Y", memory = "", text = "";
        String echodisabled = "on", loopphrase = "", loopfinal = "";
        int offcounter = 0, echoloop = 0;
        Timer timer = new Timer();
        String[] echoloopdirectory = new String[2];
        String spacecommand = "";
        echoloopdirectory[0] = ":";
        boolean space = false;
        int shutdown = 0;

        Scanner c = new Scanner(in);
        Random r = new Random();
        long maxMemory = Runtime.getRuntime().maxMemory();
        
        UIManager.put("TextField.caretForeground", new ColorUIResource(Color.blue));
        out.print("\033[H\033[2J");
        out.println("                                 *.                                                /@.                             .@%                                  "); 
        out.println("                               .,,,,                                              /@/@*                                                                 ");  
        out.println("                              .                                                  /&  ,@#   .@,   /@  @,*@@) ,@,*@  @% (@**@  %@*#/@  @/&@/@             ");
        out.println("                                 %%%%%%%%%                                      /# == .@&  .@.',/ @  ( ~~'  ,@. '  @% |@     *@  /@  @/  *@             ");
        out.println("                         %%%%%%%%%%%%%%%%%%%                                   /@      (@@ /@*   #@, @@@@@  (@*    @@ |@@@@. *&@/@| ,@(  #@.            ");        
        out.println("                      ........................                                                                                                          ");        
        out.println("                                        ........                              &@@.     /@@&,                                                            ");        
        out.println("                 *%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                            |&&@    /@&@                         |@                                    ");        
        out.println("               ,,**,******,              ,*********,                          |& #@. /@ &@ (#-=#@  (*==@, (@&#/@ ==|@===,@,*@ @,*@@) @/@/@   @,@).  @&## ");        
        out.println("                           *,           ,                                     |&  (@,@  &@ |/ ~~  @     @ (    @   |@   |@. ' | ~~'  @/  *@  @   )   '&  ");        
        out.println("                      %%%%%%%%#       ,         /%%%%%%%%.                    |@   (@   @@ |@@/(@ @%  _/) *@(.@@.  |@*, |@*   |@@@@ ,@(  #@. @* @  .@@*  ");        
        out.println("       .%%%%%%%%%%%%%%%%%%%%%%%%% #%%%%%%%%%%%%%%%%%%%%%%%%*                                      #' ',.        '                                        ");        
        out.println("     .........................................................                                    ^.   '@         ___________________________________    ");        
        out.println("                                                       ,,,,,,,,.                                    '''          |AMIBIOS (C)1999 American Megatrends    ");        
        out.println("*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                               | Released: 12/01/99                    ");
        out.println("");out.println("");
        Thread.sleep(500); 
        out.println("AMD Ryzen 7 5800HS (tm)");
        out.println("");
        out.println("Verifing System memory...");
        /* Total memory currently available to the JVM */
        
            long ramemory =  Runtime.getRuntime().maxMemory()/10000;
        Thread.sleep(200);
        out.println("");
        for(int i = 0; i <= 196000; i++){
            out.print(i + "/196000 KiloBytes ");
            out.print("\r");
        }
        out.println();
        out.print(" OK ");
        out.println();
        out.println();
        Thread.sleep(1000);
        out.print("WAIT");
        Thread.sleep(500);
        out.print(". ");Thread.sleep(500);
        out.print(". ");Thread.sleep(500);
        out.print(". ");
        Thread.sleep(5000);
    
        Thread.sleep(200);
        out.print("\033[H\033[2J");  
        out.print("\r");
        Thread.sleep(2000);
        out.print("\u001B[A");
        out.print("\033[H\033[2J");
        out.flush();
        Thread.sleep(3000);
        out.println("Starting MS-DOS...");
        out.println("HIMEM is testing extended memory");
        Thread.sleep(500);
        out.print(". ");Thread.sleep(500);
        out.print(". ");Thread.sleep(500);
        out.print(". ");
        Thread.sleep(5000);
        out.print("done.");
        Thread.sleep(500);
        out.print("\n");
        out.println("\033[H\033[2J");
        out.flush();
        Thread.sleep(5000);
        out.println("Microsoft MS-DOS version 6.0.2");
        Thread.sleep(400);
        out.println("Copyright 2022 Microsoft Corp.");
        Thread.sleep(5000);
        do {
            out.println();
            out.println();
            out.println(inputline);
            out.print("_");
            command = c.nextLine().toLowerCase();
            command += " .";
            String[] echo = command.split("\\s"); // First step
            if(command.equals(" ") || command.equals("  ") || command.equals("   ") || command == null){
                out.println();
            }
            else{
            for(int i = 0; i < echo.length; i++){
                if(echo[i] == null)
                out.println("bad");
                else command = echo[0];}
            }
            switch (command) {
                case "clear" -> {
                    if (echo[1].equals("memory")){
                        memory = "";
                        out.println("Memory cleared");
                    }
                    else{
                        out.println("\033[H\033[2J");
                    }
                }
                case "dir" -> {
                    if(inputline.equals("C:/>")) {
                        out.println("Volume in drive C has no label./n");
                        out.println("Volume Serial Number is F4AC-9851/n");
                        Thread.sleep(100);
                        out.println("Directory of C:///n");
                        Thread.sleep(100);
                        out.println("09/02/2015 12:41 PM /n");
                        Thread.sleep(100);
                        out.println("$SysReset/n");
                        Thread.sleep(100);
                        out.println("05/30/2016 06:22 PM 93 HaxLogs.txt/n");
                        Thread.sleep(100);
                        out.println("05/07/2016 02:58 AM PerfLogs/n");
                        Thread.sleep(100);
                        out.println("05/22/2016 07:55 PM Program Files/n");
                        Thread.sleep(100);
                        out.println("05/31/2016 11:30 AM Program Files (x86)/n");
                        Thread.sleep(100);
                        out.println("07/30/2015 04:32 PM Temp/n");
                        Thread.sleep(100);
                        out.println("05/22/2016 07:55 PM Users/n");
                        Thread.sleep(100);
                        out.println("05/22/2016 08:00 PM Windows/n");
                        Thread.sleep(100);
                        out.println("05/22/2016 09:50 PM Windows.old/n");
                        Thread.sleep(100);
                        out.println("1 File(s) 93 bytes");
                    }
                    if(inputline.equals("D:/>")){
                        out.println("DIR FOLDER D");
                        out.println("Volume in drive D has no label./n");
                        out.println("Volume Serial Number is F4AC-9851/n");
                    }if(inputline.equals("E:/>")){
                        out.println("DIR FOLDER E");
                        out.println("Volume in drive E has no label./n");
                        out.println("Volume Serial Number is F4AC-9851/n");
                    }
                }
                case "text" -> {
                    if(echo[1].equals("e")){
                        out.println("\033[H\033[2J");
                    out.println("");
                    do{
                    out.println("Write here |");
                    out.println("           V");
                    text = c.nextLine();
                    memory += text;
                    out.println("Continue?");
                    textchoice = c.nextLine(); 
                }while(textchoice.equals("Y"));
                out.println("Return");
        out.println("\033[H\033[2J");}

                }
                case "echo", "@echo" -> {
                    for(int e = 1; e <= echo.length -1; e++){
                    if(echo[e].equals(""))
                    out.println();
                    if(echo[1].equals("off") || echodisabled.equals("off")){
                    echodisabled = "off";
                    if(offcounter == 0){
                    out.println("Echomode_disabled");}
                    offcounter ++;}
                    if(echoloop == 1){
                    loopphrase =  " " + echo[e];
                   loopfinal += loopphrase;}
                    if(echo[1].equals("on") || echodisabled.equals("on")){
                        offcounter = 0;
                    echodisabled = "on";
                    out.print(" " + echo[e]);}}
                    
                }
                
                case "->" -> {
                    echoloopdirectory[1] = echo[1];
                    if(echodisabled.equals("off")){
                    echoloop = 1;}
                    else
                    out.println();
                }
                case "goto" -> {
                    if(echo[1].equals(echoloopdirectory[1])){
            while(echoloop == 1){
                Thread.sleep(15);
    out.println(loopfinal);}}
                }
                case "memory" -> {
                    out.println(memory);
                }
                case "whoami" -> {
                    out.println("In developpement!");
                    Thread.sleep(400);
                    out.println("User: ");
                    out.println("Session: ");
                    out.println("Computer s/n: ");
                    out.println("Sudo rights?: ");
                }
                
                

                case "cd" -> {

                        if ((extended + "/").equals(echo[1])){
                            if((echo[1] + ">").equals(inputline)){
                                out.println("Already chosen directory");
                            }else{
                                inputline = (extended + "/>");
                            }
                        }
                    else if ((primary + "/").equals(echo[1])){
                        if((echo[1] + ">").equals(inputline)){
                            out.println("Already chosen directory");
                        }else{
                            inputline = (primary + "/>");
                        }
                    }
                    else if ((logical + "/").equals(echo[1])){
                        if((echo[1] + ">").equals(inputline)){
                            out.println("Already chosen directory");
                        }else{
                            inputline = (logical + "/>");
                        }
                    }else {
                            System.err.println("Unreachable drive");
                        }
                    }
                    
                    case "clock" -> {
                        out.println(new Date());
                    }
                    case "timer" -> {
                        horloge.clock();
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
                    
                case "cd C:/" -> {
                    out.println("Already chosen directory");
                    Thread.sleep(1000);
                }
                case "calculate", "calc" -> {
                    Thread.sleep(500);
                    out.println("Microsoft Calculator version 1.0.1");
                    Thread.sleep(400);
                    out.print("Input number 1: ");
                    float number1 = c.nextInt();
                    out.print(" (addition -> 1)) ");
                    out.print(" (substraction) -> 2)) ");
                    out.print(" (division) -> 3)) ");
                    out.print(" (multiplication -> 3)) ");
                    int calculatechoice = c.nextInt();
                    out.print("Input number 2: ");
                    float number2 = c.nextInt();
                    if(number2 == 0 && calculatechoice == 3){
                        System.err.println("Cannot devise a number by zero");
                        System.err.println("Unreachable mathematical statement");
                    }

                        if (calculatechoice == 1){
                            calculateresponse = (number2 + number1);
                            out.println("anwser: " + calculateresponse);
                        }
                        else if (calculatechoice == 2){
                            calculateresponse = (number1 - number2);
                            out.println("awnser: " + calculateresponse);
                        }
                        else if (calculatechoice == 3){
                            calculateresponse = (number1/number2);
                            out.println("awnser: " + calculateresponse);
                        }
                        else if (calculatechoice == 4){
                            calculateresponse = (number1 * number2);
                            out.println("awnser: " + calculateresponse);
                        }
                        else{
                            System.err.println("Unreachable mathematical statement");
                        }
                }
                case "Service.MS.paint.dat" -> {
                    out.println("In developpement!");
                }
                case "shutdown" ->{
                    if(echo[1].equals("") || echo[1].equals(" "))
                    out.println();
                    else{
                    if(echo[1].equals("/s")){
                    out.println(" ");
                shutdown = 1;}
                if(echo[1].equals("/r")){
                    out.println("Restart? -> In developpement!");
                    shutdown = 2;
                }}}
                case "help" ->{
                    out.println("calculate/calc                     Opens the mathematical calculator interpreter");
                    out.println("diskpart                           Opens the diskpart interpreter");
                    out.println("shutdown/s                         Turns off the system (Java JVM)");
                    out.println("cd                                 Directs to an chosen directory");
                    out.println("help                               posters the possible commands");
                    out.println("clear                              clears the console");
                    out.println("text-e                             opens the text editor ");
                    out.println("memory                             displays the previously written text stored in the memory");
                    out.println("timer                              opens the in-built timer (restart needed to exit)");
                    out.println("clock                              displays the actual date");
                    out.println("whoami                             displays the user's information");
                    out.println("echo/@echo                         Repeats users entry");
                    out.println("echo off / on                      disables or enables the feature");
                    out.println("goto                               enters the users echo mem entry");


                }

                case "diskpart" -> {
                    Thread.sleep(400);
                    out.println("\033[H\033[2J");
                    Thread.sleep(200);
                    out.println("Please use 'Sudo' command in the future for administrator rights");
                    Thread.sleep(700);
                    out.println("Microsoft DiskPart version 1.0.3");
                    out.println("Copyright (C) Microsoft Corporation.");
                    out.println("Computing module device : LAPTOP-876364C2");
                    String Diskcommand;
                    do {
                        Thread.sleep(400);
                        out.println(" ");
                        out.print("DISKPART>_ ");
                        Diskcommand = c.next();
                        switch (Diskcommand) {
                            case "clear" -> {
                                if (echo[1]!=null &&echo[1].equals("memory")){
                                    out.print("MEMORY!");
                                    }
                                    else
                                out.println("\033[H\033[2J");
                            }
                            case "format" -> {
                                System.err.println("CAUTION: Changing a drives format will erase the drive to what will occur to a complete suppression of data which cannot be recovered");
                                System.err.println("Proceed? (Y/N) -> Y: Cannot be canceled");
                                String formatchoice = c.next().toUpperCase();
                                if(!formatchoice.equals("Y"))
                                    System.err.println("Operation canceled EE3");
                                else{
                                    out.println("Please choose a drive module to erase");
                                    out.println("List of drives");
                                    out.println(primary + "        Main System partition letter (primary - " + Cformat );
                                    out.println(logical + "        CD-ROM drive partition letter (logical - " + Dformat );
                                    out.println(extended + "        Detachable extern storage module (extended - " + Eformat );
                                    String Diskletter = c.next().toUpperCase();
                                    if (Diskletter.equals(primary)) {
                                        System.err.println("CAUTION: The " + primary + " Drive is a Boot partition. If badly modified, System Corruption can occurs.");
                                        out.println("Proceed? Y/N");
                                        String Cdrivechoice = c.next().toUpperCase();
                                        if (Cdrivechoice.equals("Y")) {
                                            String Cformatmem = Cformat;
                                            out.println("Please choose the format type you want the drive be erased to");
                                            out.println("PC Partitions : 1)");
                                            String Choice1 = c.next();
                                            if (Choice1.equals("1)")) {
                                                out.println("DOS, Windows and OS/2 file Systems : 1)");
                                                out.println("Unix file Systems : 2)");
                                                Choice1 = c.next();
                                                if (Choice1.equals("1)")) {
                                                    out.println("Format to: ");
                                                    out.println("FAT32 : 1)");
                                                    out.println("exFAT : 2)");
                                                    out.println("NTFS : 2)");
                                                    cformatchoice = c.next();

                                                        Cformat = switch (cformatchoice) {
                                                            case "1)" -> "FAT32";

                                                            case "2)" -> "exFAT";

                                                            case "3)" -> "NTFS";
                                                            default -> Cformat;
                                                        };


                                                }
                                                }
                                                if (Choice1.equals("2)")) {
                                                    out.println("Mac OS X / Mac OS : 1)");
                                                    out.println("Linux : 2)");
                                                    Choice1 = c.next();
                                                    if (Choice1.equals("2)")) {
                                                        out.println("Format to: ");
                                                        out.println("ext4 : 1)");
                                                        cformatchoice = c.next();
                                                        if(cformatchoice.equals("1)"))
                                                            Cformat.equals("ext4");
                                                    }
                                                    if (Choice1.equals("1)")) {
                                                        out.println("Format to: ");
                                                        out.println("APFS : 1)");
                                                        out.println("HFS+ : 2)");
                                                        cformatchoice = c.next();
                                                        Cformat = switch(cformatchoice){
                                                            case "1)" -> "APFS";
                                                            case "2)" -> "HFS+";
                                                            default -> Cformat;
                                                        };
                                                    }
                                                }
                                            out.println("Applying changes? Y/N");
                                                String finalchanges = String.valueOf(c.next().toUpperCase().charAt(0));
                                                if(finalchanges.equals("Y")) {
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(200);
                                                    out.println("formatted successfully.");
                                                }

                                                else {
                                                    out.println("Operation canceled EE2");
                                                    Cformat = Cformatmem;
                                                }
                                            }
                                        else {
                                            out.println("Operation canceled EE1");
                                        }
                                        }
                                    else if (Diskletter.equals(extended)) {
                                        String Emem = Eformat;

                                            out.println("Please choose the format type you want the drive be erased to");
                                            out.println("PC Partitions : 1)");
                                            String Choice1 = c.next();
                                            if (Choice1.equals("1)")) {
                                                out.println("DOS, Windows and OS/2 file Systems : 1)");
                                                out.println("Unix file Systems : 2)");
                                                Choice1 = c.next();
                                                if (Choice1.equals("1)")) {
                                                    out.println("Format to: ");
                                                    out.println("FAT32 : 1)");
                                                    out.println("exFAT : 2)");
                                                    out.println("NTFS : 2)");
                                                    eformatchoice = c.next();
                                                    Eformat = switch (eformatchoice) {
                                                        case "1)" -> "FAT32";

                                                        case "2)" -> "exFAT";

                                                        case "3)" -> "NTFS";
                                                        default ->  Eformat;
                                                    };
                                                }
                                            }
                                            if (Choice1.equals("2)")) {
                                                out.println("Mac OS X / Mac OS : 1)");
                                                out.println("Linux : 2)");
                                                Choice1 = c.next();
                                                if (Choice1.equals("2)")) {
                                                    out.println("Format to: ");
                                                    out.println("ext4 : 1)");
                                                    eformatchoice = c.next();
                                                    if(eformatchoice.equals("1)"))
                                                        Eformat.equals("ext4");
                                                }
                                                if (Choice1.equals("1)")) {
                                                    out.println("Format to: ");
                                                    out.println("APFS : 1)");
                                                    out.println("HFS+ : 2)");
                                                    eformatchoice = c.next();
                                                    Eformat = switch(eformatchoice){
                                                        case "1)" -> "APFS";
                                                        case "2)" -> "HFS+";
                                                        default -> Eformat;
                                                    };
                                                }
                                            }
                                            out.println("Applying changes? Y/N");
                                                String finalchanges = String.valueOf(c.next().toUpperCase().charAt(0));
                                                if(finalchanges.equals("Y")) {
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(400);
                                                    out.print(".");
                                                    Thread.sleep(200);
                                                    out.println("formatted successfully.");
                                                }

                                                else {
                                                    out.println("Operation canceled EE2");
                                                    Dformat = Emem;
                                                } 
                                        }
                                        else if (Diskletter.equals(logical)) {
                                            String Dmem = Dformat;
    
                                                out.println("Please choose the format type you want the drive be erased to");
                                                out.println("PC Partitions : 1)");
                                                String Choice1 = c.next();
                                                if (Choice1.equals("1)")) {
                                                    out.println("DOS, Windows and OS/2 file Systems : 1)");
                                                    out.println("Unix file Systems : 2)");
                                                    Choice1 = c.next();
                                                    if (Choice1.equals("1)")) {
                                                        out.println("Format to: ");
                                                        out.println("FAT32 : 1)");
                                                        out.println("exFAT : 2)");
                                                        out.println("NTFS : 2)");
                                                        dformatchoice = c.next();
                                                        Dformat = switch (dformatchoice) {
                                                            case "1)" -> "FAT32";
    
                                                            case "2)" -> "exFAT";
    
                                                            case "3)" -> "NTFS";
                                                            default ->  Dformat;
                                                        };
                                                    }
                                                }
                                                if (Choice1.equals("2)")) {
                                                    out.println("Mac OS X / Mac OS : 1)");
                                                    out.println("Linux : 2)");
                                                    Choice1 = c.next();
                                                    if (Choice1.equals("2)")) {
                                                        out.println("Format to: ");
                                                        out.println("ext4 : 1)");
                                                        dformatchoice = c.next();
                                                        if(dformatchoice.equals("1)"))
                                                            Dformat.equals("ext4");
                                                    }
                                                    if (Choice1.equals("1)")) {
                                                        out.println("Format to: ");
                                                        out.println("APFS : 1)");
                                                        out.println("HFS+ : 2)");
                                                        dformatchoice = c.next();
                                                        Dformat = switch(dformatchoice){
                                                            case "1)" -> "APFS";
                                                            case "2)" -> "HFS+";
                                                            default -> Dformat;
                                                        };
                                                    }
                                                }
                                                out.println("Applying changes? Y/N");
                                                    String finalchanges = String.valueOf(c.next().toUpperCase().charAt(0));
                                                    if(finalchanges.equals("Y")) {
                                                        Thread.sleep(400);
                                                        out.print(".");
                                                        Thread.sleep(400);
                                                        out.print(".");
                                                        Thread.sleep(400);
                                                        out.print(".");
                                                        Thread.sleep(200);
                                                        out.println("formatted successfully.");
                                                    }
    
                                                    else {
                                                        out.println("Operation canceled EE2");
                                                        Dformat = Dmem;
                                                    } 
                                            }
                                        

                            }
                            }


                            case "assign" -> {
                                out.println("Please choose a drive module to which will be assigned a Drive letter");
                                out.println("List of drives");
                                String primary1 = primary, logical1 = logical, extended1 = extended;
                                out.println(primary + "        Main System partition letter (primary - " +  Cformat + ")");
                                out.println(logical + "        CD-ROM drive partition letter (logical - " + Dformat + ")");
                                out.println(extended + "        Detachable extern storage module (extended - " + Eformat + ")");
                                String Diskletter = c.next().toUpperCase();
                                if (Diskletter.equals(primary)) {
                                    System.err.println("CAUTION: The " + primary + " Drive is a Primary and MBR partition. If badly modified, System Corruption can occurs.");
                                    out.println("Proceed? Y/N");
                                    String Cdrivechoice = c.next().toUpperCase();
                                    if (Cdrivechoice.equals("Y")) {
                                        out.println("Please type which letter should it be assigned");
                                        primary = String.valueOf(c.next().charAt(0)).toUpperCase() + ":";
                                        if(primary.equals(logical) || primary.equals(extended)){
                                            System.err.println("Operation canceled");
                                            Thread.sleep(300);
                                            System.err.println("The chosen letter is already assigned to another drive");
                                            System.err.println("Assigning it to another letter");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(200);
                                            out.println("done.");
                                            primary = String.valueOf((char)(r.nextInt(26) + 'a')).toUpperCase() + ":";
                                        }
                                        else {
                                            out.println(primary1 + " letter will be changed to " + primary + ". Ok? (Y/N)");
                                            Cdrivechoice = c.next().toUpperCase();
                                            if (Cdrivechoice.equals("Y")) {
                                                Thread.sleep(200);
                                                out.println("Processing");
                                                Thread.sleep(400);
                                                out.print(".");
                                                Thread.sleep(400);
                                                out.print(".");
                                                Thread.sleep(400);
                                                out.print(".");
                                                Thread.sleep(200);
                                                out.println("Ok!");
                                                inputline.equals(primary + "/>");
                                                primary1 = primary;
                                            } else {
                                                primary = primary1;
                                                System.err.println("Operation canceled");
                                            }
                                        }
                                    }
                                }
                                if (Diskletter.equals(logical)) {
                                    out.println("Please type which letter should it be assigned");
                                    logical = c.next().toUpperCase();
                                    if(logical.equals(primary) || logical.equals(extended)){
                                        System.err.println("Operation canceled");
                                        Thread.sleep(300);
                                        System.err.println("The chosen letter is already assigned to another drive");
                                        System.err.println("Assigning it to another letter");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(200);
                                        out.println("done.");
                                        logical = String.valueOf((char)(r.nextInt(26) + 'a')).toUpperCase() + ":";
                                    }
                                    else {
                                        out.println(logical1 + " letter will be changed to " + logical + ". Ok? (Y/N)");
                                        String Ddrivechoice = c.next();
                                        if (Ddrivechoice.equals("Y")) {
                                            Thread.sleep(200);
                                            out.println("Processing");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(200);
                                            out.println("Ok!");
                                            logical1 = logical;
                                            inputline.equals(logical + "/>");
                                        } else {
                                            logical = logical1;
                                            System.err.println("Operation canceled");
                                        }
                                    }
                                }
                                if (Diskletter.equals(extended)) {
                                    out.println("Please type which letter should it be assigned");
                                    extended = c.next().toUpperCase();
                                    if(extended.equals(logical) || extended.equals(primary)){
                                        System.err.println("Operation canceled");
                                        Thread.sleep(300);
                                        System.err.println("The chosen letter is already assigned to another drive");
                                        System.err.println("Assigning it to another letter");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(400);
                                        out.print(".");
                                        Thread.sleep(200);
                                        out.println("done.");
                                        extended = String.valueOf((char)(r.nextInt(26) + 'a')).toUpperCase() + ":";
                                    }
                                    else {
                                        out.println(extended1 + " letter will be changed to " + extended + ". Ok? (Y/N)");
                                        String Edrivechoice = c.next().toUpperCase();
                                        if (Edrivechoice.equals("Y")) {
                                            Thread.sleep(200);
                                            out.println("Processing");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(400);
                                            out.print(".");
                                            Thread.sleep(200);
                                            out.println("Ok!");
                                            extended1 = extended;
                                            inputline.equals(extended + "/>");
                                        } else {
                                            extended = extended1;
                                            System.err.println("Operation canceled");
                                        }
                                    }
                                }
                            }
                            case "Listdisk" -> {
                                out.println("List of drives");
                                out.println(primary + "        Main System partition letter (Primary - " + Cformat);
                                out.println(logical + "        CD-ROM drive partition letter (Logical - " + Dformat);
                                out.println(extended + "        Detachable extern storage module (Extended - " + Eformat);
                            }
                            
                            case "exit" -> {

                                out.println("Verifying corrupted files");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(200);
                                out.println(" ");
                                Thread.sleep(400);
                                out.println("Verifying bad sectors on drives");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(400);
                                out.print(".");
                                Thread.sleep(200);
                                if(extended.equals(logical) || extended.equals(primary) || logical.equals(primary) || !Cformat.equals("NTFS")){
                                    out.println("\033[H\033[2J");
                                    System.err.println("ALERT: ILLEGAL OPERATTION ERROR");
                                    Field f = Unsafe.class.getDeclaredField("theUnsafe");
                                    f.setAccessible(true);
                                    Unsafe unsafe = (Unsafe) f.get(null);
                                    unsafe.putAddress(0, 0);
                                    System.exit(0);

                                }
                                else {
                                    out.println("Done!");
                                    out.println("No system integrity violation detected on drives");
                                }
                            }
                            default -> {
                                out.println("assign               Assigns a drive letter or mount point to the volume with focus.");
                                out.println("Listdisk             Shows a list of every drive module");
                                out.println("exit                 Exits the diskpart command interpreter.");
                            }
                        }
                        }while (!Diskcommand.equals("exit"));
                    out.println("Exiting Diskpart...");
                    out.print("");
                    }

                default -> {System.err.println();
                    System.err.println("'" + command + "'" + " Is not recognised as an command line or is a Syntax violation"); System.err.print("");
                                    }}
            }while(shutdown != 1);
            Thread.sleep(500);
            out.print("\033[H\033[2J");
        out.println("Shutting down MS-DOS...");
        Thread.sleep(2000);
        out.print("\033[H\033[2J");
        Thread.sleep(1000);
    }

    private static Runtime getRuntime() {
        return null;
    }
}