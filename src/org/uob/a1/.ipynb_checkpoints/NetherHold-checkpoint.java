package org.uob.a1;
import org.uob.a1.NetherHold;

import java.util.Scanner;

public class NetherHold{
    
    private String command;

        public void puzzle2(Inventory inventory, Score score){
            Scanner scanner = new Scanner(System.in);
            Room netherportal = new Room("NetherPortal", "Holds the portal leading to the Nether dimension.", 'n', new Position(2, 5));
            
            String command = "";

            score.roomsVisited += 1.0;

            System.out.println("You have entered the Nether Hold room");
            System.out.println("There is a portal ahead. A zombie comes out and is chasing you!");
            System.out.println("Quick equip your sword, and fight him off so you can go into the Nether");

            command = scanner.nextLine();
            if(command.equals("use sword")){
                System.out.println("Use your sword and fight!");
                command = scanner.nextLine();
                System.out.println("This one is tough, he is wearing armour. Hit harder!");
                command = scanner.nextLine();
                System.out.println("Almost there!");
                command = scanner.nextLine();
                System.out.println("There we go! You have slain the zombie!");
                System.out.println("Huzzah!");
                System.out.println("Take its armour so you can equip it yourself!");
                command = scanner.nextLine();

                inventory.addItem(command);
                score.visitRoom("Nether Portal");
                
            }

        }
            
    
}