package org.uob.a1;
import org.uob.a1.Lake;

import java.util.Scanner;

public class Lake{

    public void activityL(Inventory inventory, Score score){
        Scanner scanner = new Scanner(System.in);
        Room lake = new Room("Lake", "An area that has a stream running through the centre, leading to a large pool of water.", 'l', new Position(1, 3));
        
        String command = "";

        score.roomsVisited += 1.0;

        System.out.println("You have entered the Lake area");
        System.out.println("There is a very high speed flow of water going past");
        System.out.println("There are two paths to take");
        System.out.println("Either: A rocky bridge or Swim through the water");
        System.out.println("Which do you take?");

        command = scanner.nextLine();
        if(command.equals("bridge")){
            System.out.println("You cross the bridge safely, with a few halts");
        }
        else if(command.equals("swim")){
            System.out.println("After being almost pulled into a whirlpool, you manage to swim across in one piece");
        }

        System.out.println("Continue to follow the hallway through South");
        
    }
}