package org.uob.a1;

public class Map {
    private int width = 6 ;
    private int height = 8;
    private char empty;
    private char[][] map = new char[6][8];
    private String returnMap;

    final private char EMPTY = '.';
    
    public Map(int width, int height) //constructor class
    {
        this.width = width;
        this.height = height;
        
        map = new char[width][height];
        
        for(int i =0; i <width; i++)
            {
                for(int j =0; j<height; j++)
                    {
                       map[i][j] = EMPTY; 
                    }
            }
    }

    public Map() { //instanstiate the values of the map
        this(8, 6); // default size (swapped if you like)
    }

    public void placeRoom(Position pos, char symbol)
    {
        if(pos.equals("lava area")) //assign the symbols to the relevant rooms
           {
            symbol = 'L'; 
           }
        else if(pos.equals("lake"))
           {
            symbol = 'l';
           }
        else if(pos.equals("ravine"))
           {
            symbol = 'r';
           }
        else if(pos.equals("netherworld"))
           {
            symbol = 'N';
           }
        else if(pos.equals("dungeons"))
           {
            symbol = 'd';
           }
        else if(pos.equals("netherhold"))
           {
            symbol = 'n';
           }
        else if(pos.equals("stronghold"))
           {
            symbol = 's';
           }
        else if(pos.equals("mineshaft"))
           {
            symbol = 'm';
           }
        else if(pos.equals("endportal"))
           {
            symbol = 'e';
           }
        else if(pos.equals("witchs library"))
           {
            symbol = 'w';
           }
       
        if (pos.getY() < height && pos.getX() < width && pos.getY() >= 0 && pos.getX() >= 0) {
            map[pos.getY()][pos.getX()] = symbol; //updates the map accordingly when called upon
        }
    }

    public String display() //outputting the map when called upon
    {
        StringBuilder outputMap = new StringBuilder();
            
        for(int row =0; row < width; row ++) //loops and changes line at the end of the x co-ordinates
        {
            for(int col = 0; col < height; col++)
            {
                outputMap.append(map[row][col]);
            }
            outputMap.append(System.lineSeparator());
        }
                                    
        return outputMap.toString();
        
    }
}