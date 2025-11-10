package org.uob.a1;
import org.uob.a1.Ravine;
import java.util.Scanner;
public class Ravine{

    private String command;

    public void puzzleR(Inventory inventory, Score score){
            Scanner scanner = new Scanner(System.in);
            Room ravine = new Room("Ravine", "A narrow steep-sided valley that has by running water along the edges.", 'r', new Position(1, 2));

            score.roomsVisited += 1.0;
            
            System.out.println("It is too dark in here");
            System.out.println("Use your torch so you can see better");
            command = scanner.nextLine();
            
            if(command.equals("place torch")){
                inventory.removeItem("Torch"); //torch has been placed so is removed from inventory

                System.out.println("Take a closer look at the room.");
                command = scanner.nextLine(); //'look' command is called upon
                if(command.equals("look")){
                    System.out.println(ravine.getDescription());
                }
                System.out.println("To the east it looks like there is something twinkling in the distance.");
                System.out.println("To the north there is a further hallway to go through.");
                System.out.println("Which path do you take?");
                command = scanner.nextLine();

                if(command.equals("move north")){
                    System.out.println("You move north");
                    System.out.println("There is something peeping out of the rocks, take a closer look at the rock");

                    command = scanner.nextLine();
                    if(command.equals("look at rock")){
                        System.out.println("There are some diamonds here!");
                        System.out.println("Mine them and add it to your inventory");

                        command = scanner.nextLine();
                        if(command.equals("mine diamonds")){
                            inventory.addItem(command); //adds the diamonds to inventory
                            System.out.println("Look at how shiny it is.");
                            command = scanner.nextLine();
                            System.out.println("You are holding a diamond. It is blue and is almost blinding you with its shine.");
                            
                            System.out.println("There is another room further in the hallway, let's continue South");
                        }
                    }
                    
                    
                }
                else if(command.equals("move east")){
                    
                }
                    
            }
        }
        

    
    
    }
