package org.uob.a1;
import org.uob.a1.Dungeons;

import java.util.Scanner;
public class Dungeons
    {
        private String command;

        public void activityD(Inventory inventory, Score score){
            Scanner scanner = new Scanner(System.in);
            Room dungeon = new Room("Dungeon", "An old, abandoned room with a randomised mob spawner.", 'd', new Position(5, 0));
            
            String command = "";

            score.roomsVisited += 1.0;

            System.out.println("You have entered the dungeons");
            System.out.println("There is a spider mob spawner");
            System.out.println("Destroy the mob spawner to prevent any spawning quick!");
            command = scanner.nextLine();

            if(command.equals("destroy mob spawner")){
                System.out.println("You destroyed the mob spawner and are safe.");
                System.out.println("There have been some XP bottles dropped, pick them for safe keepin :)");
                command = scanner.nextLine();
                if(command.equals("pick up xp bottles")){
                    inventory.addItem(command);
                    System.out.println("Continue down the hallway South");
                }
            }
        }
    }
            