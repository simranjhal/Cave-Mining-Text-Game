
package org.uob.a1;
import java.util.Scanner;
import org.uob.a1.Stronghold;

public class Stronghold
    {
        private String command;

        public void activityS(Inventory inventory, Score score){
            final String RESET = "\u001B[0m"; //values for the colours of the text
            final String PURPLE = "\u001B[35m";
            
            Scanner scanner = new Scanner(System.in);
            Room stronghold = new Room("Stronghold", "An underground structure that is filled with mobs and loot.", 's', new Position(3, 4));
            
            String command = "";

            score.roomsVisited += 1.0;

            System.out.println("You have entered the Stronghold");
            System.out.println("There is a witch ahead. You speak to her");
            System.out.println(PURPLE + "Welcome to my Stronghold, can you help me cast my spell to create my potion?" + RESET );

            command = scanner.nextLine();
            boolean correct = false; //initliase variables to check when the user enters the correct spell
            boolean right = false;
            
            System.out.println(PURPLE + "Just repeat after me :" + RESET );
            System.out.println(PURPLE + "When I rise I see the sunshine, but not at night." + RESET );
            command = scanner.nextLine();
            
            while(!correct){ //loops that repeats until the user enters the correct spells
                if(!command.equals("When I rise I see the sunshine, but not at night.")){
                    System.out.println(PURPLE + "Just repeat after me :" + RESET );
                    System.out.println(PURPLE + "When I rise I see the sunshine, but not at night." + RESET );
                    command = scanner.nextLine();
                }
                else{
                    System.out.println(PURPLE + "High high just like a kite, i want to fly." + RESET );
                    command = scanner.nextLine();
                    while(!right){
                        if(!command.equals("High high just like a kite, i want to fly.")){
                            System.out.println(PURPLE + "Just repeat after me :" + RESET );
                            System.out.println(PURPLE + "High high just like a kite, i want to fly." + RESET );
                            command = scanner.nextLine();
                        }
                        else{
                            right = true;
                            correct = true;
                        }
                    }
                }
            }

            System.out.println(PURPLE + "Thank you so much" + RESET);
            System.out.println(PURPLE + "You may continue West" + RESET);
            
        }
    }
            