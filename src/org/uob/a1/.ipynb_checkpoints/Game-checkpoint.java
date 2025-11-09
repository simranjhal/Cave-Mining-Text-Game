package org.uob.a1;

import java.util.Scanner; 

public class Game {  
    
        public static String command;
        public static String feature;
        
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in); //initialise scanner object to take inputs
            Inventory inventory = new Inventory(); //create new instance of the inventory in this class
            Map map = new Map();
            LavaArea lavaArea = new LavaArea();
            Ravine ravine = new Ravine();
            Mineshaft mineshaft = new Mineshaft();
            EndPortal endportal = new EndPortal();
            Lake lake = new Lake();
            NetherHold netherhold = new NetherHold();
            Dungeons dungeons = new Dungeons();
            Stronghold stronghold = new Stronghold();
            Netherworld netherworld = new Netherworld();
            Library library = new Library();
            
            System.out.println("You are inside a dark cave, there are torches showing three hallways to take : South, West and East");
            
            String command = "";
            Score score = new Score(1000.0);
            Position position = new Position(1, 0);

            while (!command.equals("quit")){
               
                command = scanner.nextLine(); //takes command from the user inside the loop, at the end of each turn 
                
                if(command.equals("help")){
                    System.out.println("Key commands are : 'look'; 'look<direction>'; 'move<direction>'; 'item'; 'help'; 'inventory'; 'map'; 'quit' .");
                }
                else if(command.startsWith("take") || command.startsWith("craft")){
                    inventory.addItem(command); //picking up items 
                    System.out.println("You picked have picked it up");
                }
                else if (command.equals("look")) {
                    String place = position.updatePlace(position.x, position.y);  
                }
                else if (command.equals("inventory")) {
                    System.out.println(inventory.displayInventory());
                }
                else if(command.equals("score")){
                    System.out.println(score.getScore());
                }
                else if(command.equals("map")){
                    System.out.println(map.display());
                }
                else if(command.equals("ignite portal")){
                    System.out.println("Portal has been lit.");
                }
                else{
                    if(command.equals("move south")){
                        position.update(command);
                        
                        System.out.println("You continue to walk South"); 
                        command = scanner.nextLine();
                        position.update(command);
                        if(command.equals("move south")){ //RAVINE
                            position.update(command);
                            ravine.puzzleR(inventory, score);
                            map.placeRoom(position, 'r');
                            score.visitRoom("Ravine");
                        }

                        System.out.println("Let's follow the stream South");
                        command = scanner.nextLine();
                        System.out.println(inventory.displayInventory());
                        System.out.println("Let's follow the stream South");
                        command = scanner.nextLine();
                        
                        if(command.equals("move south")){ //LAKE
                            position.update(command);
                            lake.activityL(inventory, score);
                            map.placeRoom(position, 'l');
                            score.visitRoom("Lake");

                            command = scanner.nextLine();
                            System.out.println("You follow the hallway South");
                            command = scanner.nextLine();
                            System.out.println("You follow the hallway South. It turns to the West.");
                            command = scanner.nextLine();

                            position.update(command);
                            endportal.building(inventory, score); //END PORTAL
                            map.placeRoom(position, 'e');
                            score.visitRoom("End Portal");

                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue to follow the hallway North."); 
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue to follow the hallway North."); 
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue to follow the hallway North."); 
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue to follow the hallway North."); 
                            command = scanner.nextLine(); //+1
                            
                            position.update(command); //LAVA AREA
                            lavaArea.puzzle(inventory, score);
                            map.placeRoom(position, 'L');
                            score.visitRoom("Lava Area");
                            System.out.println("Continue to follow the hallway East");

                            command = scanner.nextLine();

                            if(command.equals("score")){
                                System.out.println(score.getScore());
                            }
                            
                            position.update(command);
                            System.out.println("You continue East");
                            command = scanner.nextLine();
                            position.update(command);
                            System.out.println("You continue East");
                            command = scanner.nextLine();

                            position.update(command); //MINESHAFT
                            mineshaft.loot(inventory, score); 
                            map.placeRoom(position, 'm');
                            score.visitRoom("Mineshaft");

                            command = scanner.nextLine();
                            if(command.equals("map")){
                                System.out.println(map.display());
                            }

                            command = scanner.nextLine();
                            if(command.equals("help")){
                                System.out.println("Key commands are : 'look'; 'look<direction>'; 'move<direction>'; 'item'; 'help'; 'inventory'; 'map'; 'quit' .");
                            }

                            System.out.println("You continue East");
                            command = scanner.nextLine();
                            position.update(command);
                            System.out.println("You continue East");
                            command = scanner.nextLine();
                            
                            position.update(command); //DUNGEONS
                            dungeons.activityD(inventory, score);
                            map.placeRoom(position, 'd');
                            score.visitRoom("Dungeons");

                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue South");
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue South");
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue South");
                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue South");

                            position.update(command);
                            library.activityBooks(inventory, score); //LIBRARY
                            map.placeRoom(position, 'w');
                            score.visitRoom("Library");

                            command = scanner.nextLine(); //+1
                            position.update(command);
                            System.out.println("You continue West");
                            command = scanner.nextLine(); //+1

                            position.update(command);
                            stronghold.activityS(inventory, score); //STRONGHOLD
                            map.placeRoom(position, 's');
                            score.visitRoom("Stronghold");

                            command = scanner.nextLine();
                            position.update(command);
                            System.out.println("You continue West. Follow the hallway South");
                            command = scanner.nextLine();

                            position.update(command);
                            netherhold.puzzle2(inventory, score); //NETHERPORTAL
                            map.placeRoom(position, 'n');

                            System.out.println("Continue South");
                            command = scanner.nextLine();

                            position.update(command);
                            netherworld.activityN(inventory, score); //NETHERWORLD
                            map.placeRoom(position, 'N');       
                            score.visitRoom("Nether World");

                            command = scanner.nextLine();
                        }
                    }
                }
            System.out.println("Game Over");
        }
    }
}