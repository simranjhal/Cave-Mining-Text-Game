package org.uob.a1;
import org.uob.a1.Mineshaft;

import java.util.Scanner;

public class Mineshaft{
    public String command = "";
    
    public void loot(Inventory inventory, Score score){
        Scanner scanner = new Scanner(System.in);
        Room mineshaft = new Room("Mineshaft", "A narrow room that hold old railway tracks, that hold loot.", 'm', new Position(3, 0));

        score.roomsVisited += 1.0;
        
        System.out.println("You have entered a mineshaft");
        System.out.println("There is a loot chest ahead, take a look inside.");

        command = scanner.nextLine();

        if(command.equals("open chest")){
            System.out.println("There is a sword in the chest, add it to your inventory for protection");

            command = scanner.nextLine();
            if(command.equals("take sword")){
                inventory.addItem(command);
                System.out.println("Perfect. Lets continue East, there is a lit hallway");
            }
        }

        
        
    }
}