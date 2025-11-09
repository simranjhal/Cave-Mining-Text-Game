package org.uob.a1;

public class Inventory {
    private String item;      
    public int numberItems = 0;
    final int MAX_ITEMS = 10;
    public int indexItem = 0;
    public String Inventory[];

    public Inventory(){
        Inventory = new String[MAX_ITEMS]; //initialising the array to hold 10 items

        Inventory[0] = "Silver Ingots";
        Inventory[1] = "Flint & Steel";
        Inventory[2] = "Crafting Table";
        Inventory[3] = "Torch";

        numberItems = 4; //updating the number of items in the array (variable)
        
    }

    public int hasItem(String item){
        item = item.trim();
        
        for(int i = 0; i < numberItems; i++){
            if(Inventory[i] != null && Inventory[i].equalsIgnoreCase(item)){
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item) //placing blocks & removing from inventory
    {
        item = item.trim();
        
        int index = hasItem(item); //index of the item in the array
        if(index == -1){
            System.out.println("Not found in inventory");   
            return;
        }

        for(int i = index; i < numberItems -1; i++){ //loops through to update the new positions of the items in the array
            Inventory[i] = Inventory[i + 1];
        }
        Inventory[numberItems - 1] = null; //sets the last index to null
        numberItems--; //updates the new total 
    }


    public void addItem(String command)//picking up items and adds to the array 
    {
        String item = command.trim();
            /*switch (command) {
            case "take blocks" -> "Nether blocks";
            case "craft bucket" -> "Empty Bucket";
            case "take water" -> "Water Bucket";
            case "mine diamonds" -> "Diamonds";
            case "take sword" -> "Sword";
            default -> null;*/
        

        if (hasItem(item) != -1){
            return;
        }
        

        if (numberItems < MAX_ITEMS){
            Inventory[numberItems++] = item;
        }
    }
        
        /*if (item != null) {
             Inventory[numberItems++] = item;
            System.out.println("Added " + item);
        } else {
            System.out.println("Unknown command: " + command);
        }*/
        
    

    public String displayInventory()
    {
        String result = "Inventory: "; //initiliase the variable
        
        for(int i=0; i < numberItems; i ++) //loops and adds to concatenate a string
        {
            result += Inventory[i];
            if(i < numberItems - 1) result += ", ";
        }
        return result;
    }

}