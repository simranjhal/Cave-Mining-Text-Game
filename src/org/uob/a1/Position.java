package org.uob.a1;

public class Position {
    public int x; //intilialising the starting position of the player
    public int y; //zero-indexing it as it is an array
    public String pos;
    
    public Position(int x, int y)
    {
        this.x = x; 
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void update(String command)//will change the coordinates of the player dependent on their place on the map
    {
        int length = command.length();
        String value = command.substring(4, length-1);

        x = 1;
        y= 0;
        
        if(value.equals("north"))
           {
            y += 1;
           }
        else if(command.equals("east"))
           {
            x +=1;
           }
        else if(command.equals("west"))
           {
            x -=1;
           }
        else if(command.equals("south"))
           {
            y -=1;
           }
    }

    public String updatePlace(int x, int y)
    {
        pos = "";
         
        if(x == 0 && y == 3) //lava area
        {
            pos = "Lava Area";
        }
        else if (x == 3 && y == 0)//mineshaft
        {
            pos = "Mineshaft";
        }
        else if (x == 5 && y == 0)//dungeon
        {
            pos = "Dungeon";
        }
        else if (x == 1 && y == 2)//revene
        {
            pos = "Ravine";
        }
        else if (x == 1 && y == 3)//lake
        {
            pos = "Lake";
        }
        else if (x == 3 && y == 4)//stronghold
        {
            pos = "Stronghold";
        }
        else if (x == 5 && y == 4)//witch library
        {
            pos = "Library";
        }
        else if (x == 0 && y == 5)//end portal
        {
            pos = "End Portal";
        }
        else if (x == 2 && y == 5)//netherhold
        {
            pos = "NetherPortal";
        }
        else if (x == 2 && y == 7)//netherworld
        {
            pos = "Netherworld";
        }

        return(pos);
    }
}