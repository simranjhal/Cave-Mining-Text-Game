package org.uob.a1;
import org.uob.a1.Library;

import java.util.Scanner;

public class Library{

    public void activityBooks(Inventory inventory, Score score){
        Scanner scanner = new Scanner(System.in);
        Room library = new Room("Library", "A quiet place full of books.", 'w', new Position(5, 4));
        
        String command = "";

        score.roomsVisited += 1.0;

        System.out.println("You have entered the Library");
        System.out.println("You just tripped on a book");
        System.out.println("     ");
        System.out.println("  lol  ");
        System.out.println("Pick up the book on the floor and put it back.");

        command = scanner.nextLine(); //allow the user to pick up the fallen books

        System.out.println("Great, you carry on West.");

    }
}


        