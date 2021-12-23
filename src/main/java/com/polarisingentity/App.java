package com.polarisingentity;

import java.util.Scanner;

public class App 
{

    private static void menu( String[] args )
    {
        char option = 0;

        System.out.println("Please select your desired command:");
        Scanner input = new Scanner(System.in);

        while (option != 's') {

            System.out.println("(t)ype a new message, (l)oad a new message from .txt file, "
                            +   "(c)heck for any unreceived messages, (s)top the program.");
            option = input.next().charAt(0); //scan the line of text

            if (args[0].equals("-debug")) { System.out.println("Going through switch-statement..."); }                 
            switch (option) {

                //send message
                case 't':
                    if (args[0].equals("-debug")) { System.out.println("Starting function typeMessage()..."); } 
                    //TODO functie typeMessage()
                    break;
                //load .txt file
                case 'l':
                    if (args[0].equals("-debug")) { System.out.println("Starting function loadMessage()..."); } 
                    //TODO implement function loadMessage()
                    break;
                //check for any unreceived messages
                case 'c':
                    if (args[0].equals("-debug")) { System.out.println("Starting function checkMessages()..."); } 
                    //TODO implement function checkMessages()
                    break;
                default:
                    if (args[0].equals("-debug")) { System.out.println("Value evaluated in switch-statement = " + option); } 
                    System.out.println("Invalid command requested. Please choose a valid command.");
            }
            if (args[0].equals("-debug")) { System.out.println("switch-statement completed!"); } 
        }
        if (args[0].equals("-debug")) { System.out.println("Menu function closing..."); }
        input.close(); 
    }

    public static void main( String[] args )
    {
        if (args[0].equals("-debug")) { System.out.println("Program started in debug-mode"); } 
        menu(args);
        if (args[0].equals("-debug")) { System.out.println("Menu function successfully closed!"); }
        if (args[0].equals("-debug")) { System.out.println("Closing program..."); }       
    }

}
