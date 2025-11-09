package org.uob.a1;
import org.uob.a1.EndPortal;

import java.util.Scanner;

public class EndPortal{
    
    private String command;

    public void building(Inventory inventory, Score score){
        Scanner scanner = new Scanner(System.in);
        Room endPortal = new Room("EndPortal", "A room that hold a portal to another dimension called The End.", 'e', new Position(0, 5));
        
        String command = "";

        System.out.println("Woah! You have entered the End Portal hold");
        System.out.println("There is a half-built portal here, as well as an end chest");
        System.out.println("Let's open it and see what is inside");
        command = scanner.nextLine();

        if(command.equals("open chest")){
            System.out.println("There are ender pearls here, you can use them to build the portal");
            System.out.println("Place the pearls.");

            command = scanner.nextLine();
            if(command.equals("place the pearls.")){
                System.out.println("Well done.");
                System.out.println("...");
                System.out.println("You hear roars from a fiery dragon coming out.");
                System.out.println("Quick, continue South before you get eaten!");
            }
                
                
            
        }
    }
}