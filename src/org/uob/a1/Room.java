package org.uob.a1;

public class Room {
    private String name;
    private String description;
    private char symbol;
    private Position position;

    public Room(String name, String description, char symbol, Position position)
    {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;

    }

    public String getName()
    {
        return name;
    }

    public String getDescription() //will return the relevant desc of the room when called upon in 'look'
    {
        return description;
    }

    public char getSymbol()
    {
        return symbol;
    }

    public Position getPosition()
    {
        return position;
    }
}