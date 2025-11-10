package org.uob.a1;
import org.uob.a1.LavaArea;

import java.util.Scanner;
public class LavaArea
    {
        private String command;

        public void puzzle(Inventory inventory, Score score){
            Scanner scanner = new Scanner(System.in);
            Room lavaArea = new Room("LavaArea", "Part of the cave that has a lava pool.", 'L', new Position(0, 0));
            
            String command = "";

            score.roomsVisited += 1.0;
            
            System.out.println("Careful! You are right next to a lava pit!");
            System.out.println("You need to use your ingots to craft a bucket!");
            System.out.println("Then you can use the bucket to pick up the water on your left, and put the lava out.");

            command = scanner.nextLine();

            inventory.hasItem("Crafting Table");
            inventory.removeItem("Crafting Table"); //places the crafting table & removes from inventory
            System.out.println("Crafting table has been placed down");
            System.out.println("Now you need to craft the bucket");

            command = scanner.nextLine();

            if(command.startsWith("craft")){
                    inventory.hasItem("Silver Ingots");
                    inventory.addItem(command); //crafts the bucket, adds to inventory
                    System.out.println("You have crafted a bucket");
                    inventory.removeItem("Silver Ingots"); //removes ingots from inventory 
            }

            System.out.println("Perfect! Now collect the water on your left.");
            command = scanner.nextLine();
            
            if(command.equals("look left")) //turn to face the water 
            {
                System.out.println("There is a pool of water here");
                System.out.println("Collect this water");
                command = scanner.nextLine();

                if(command.equals("take water")){
                    inventory.addItem(command); //adds 'water bucket' to the inventory
                    System.out.println("You now have a water bucket to put out the lava");
                    System.out.println("Put out the fire on your right");

                    command = scanner.nextLine();

                    if(command.equals("look right")){
                        System.out.println("You are now facing the lava pool");

                        command = scanner.nextLine();

                        if(command.equalsIgnoreCase("place water bucket")){ //ensure it is trimmed and case insensitive
                            inventory.hasItem("Water Bucket");
                            inventory.removeItem("Water Bucket"); //removes water bucket from inventory and replace with an empty one
                            
                            System.out.println("The lava has been put out!");
                            System.out.println("No more dangers have been detected!");

                            
                        }
                    }
                }
                
            }

            score.solvePuzzle();
        }
        
    }