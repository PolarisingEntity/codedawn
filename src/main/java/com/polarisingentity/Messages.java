package com.polarisingentity;

import java.util.Scanner;

public class Messages
{

    public static void typeMessage() {
        System.out.println("Please input the message you would like to send:");
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();
        sendMessage(message);

        input.close();
    }

    public static void loadMessage() {
        //TODO implement function
    }

    public static void getMessages(String username, String password) {
        //TODO implement function
        System.out.println("Checking for new messages...");

        //Some serverside function call to check if username and password match known combination on server
        //Some serverside function call to receive array of messages with senders
    }

    private static void sendMessage(String msg) {
        //TODO implement function
        System.out.println("Please input the username for whom the message is intended:");
        Scanner input = new Scanner(System.in);

        String recipient = input.next();

        //Some API function calls to send message to server
        
        input.close();
    }
}
