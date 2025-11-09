package org.uob.a1;
import org.uob.a1.Netherworld;

import java.util.Scanner;

public class Netherworld{

    public void activityN(Inventory inventory, Score score){
        Scanner scanner = new Scanner(System.in);
        Room netherWorld= new Room("NetherWorld", "A hell-like dimension.", 'N', new Position(2, 7));
        
        String command = "";

        score.roomsVisited += 1.0;

        System.out.println("You have entered the NetherWorld");
        System.out.println("See if you can see anything.");
        command = scanner.nextLine();

        if(command.equals("look left")){
            System.out.println("There is some quartz ahead");
        }
        else if(command.equals("Look Right")){
            System.out.println("There is some gold ahead");
        }

    }
}