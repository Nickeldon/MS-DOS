import java.util.*;
        import java.awt.event.KeyAdapter;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;
        import javax.swing.*;
        import java.util.EventListener;
        import static java.lang.System.out;
public class TextEditor {
    public static void main(String[] args) throws InterruptedException {

        Scanner c = new Scanner(System.in);

        String test = "y";
        String memory = "", textchoice = "Y";
        String textentry = "5";
        

        String field = "#############################################################################################";
        String field1 = "#############################################################################################";
        String field2 = "#############################################################################################";
        String field3 = "#############################################################################################";
        String popup = "////////////////////////////////////////////////////////             ";
        String popup1 ="///////////////Welcome to MS-DOS Editor/////////////////             ";
        String popup2 ="/////Copyright (C) Microsoft Corporation, 1987-1992/////             ";
        String popup3 ="//////////////////All rights reserved///////////////////             ";
        String popup4 ="////////////////////////////////////////////////////////             ";
        String popup5 ="////////<Press Enter to see the Survival Guide>/////////             ";
        String popup6 ="////////////////////////////////////////////////////////             ";
        String button1 = "//FILE//";



        do
        {
            System.out.println("\033[H\033[2J");
            System.out.println("\033[H\033[2J");
            System.out.println("#############################################################################################");
            System.out.println("#########" + button1 + "############################################################################");
            System.out.println("#############################################################################################");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######          " + popup + "#######");
            System.out.println("#######          " + popup1 + "#######");
            System.out.println("#######          "+popup2+"#######");
            System.out.println("#######          "+popup3+"#######");
            System.out.println("#######          "+popup4+"#######");
            System.out.println("#######          "+popup5+"#######");
            System.out.println("#######          "+popup6+"#######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#######                                                                               #######");
            System.out.println("#############################################################################################");
            System.out.println("#############################################################################################");
            System.out.println("#############################################################################################");                
            textentry = c.nextLine();
            if (textentry.equals("w") || textentry.equals("W")){
                button1.equals("--FILE--");}
            if(textentry.equals("")){
                popup = "                                                                     " ;
                popup1 = "                                                                     ";
                popup2  = "                                                                     " ;
                popup3  = "                                                                     " ;
                popup4  = "                                                                     " ;
                popup5  = "                                                                     " ;
                popup6  = "                                                                     " ;
            }
            }while(test.equals("y"));



        do{
            out.println("Write here |");
            out.println("           V");
            String text = c.nextLine();
            memory += text;
            out.println("Continue?");
            textchoice = c.nextLine();
        }while(textchoice.equals("Y"));
        out.println("Return");
        out.println("\033[H\033[2J");
 
    }}