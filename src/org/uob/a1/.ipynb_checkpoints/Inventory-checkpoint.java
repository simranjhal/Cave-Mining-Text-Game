package org.uob.a1;

public class Inventory {  
    public int numberItems = 0;
    final int MAX_ITEMS = 10;
    public String inventory[];

    public Inventory(){
        inventory = new String[MAX_ITEMS]; //initialising the array to hold 10 items

        inventory[0] = "Silver Ingots"; //the inital four items in the inventory
        inventory[1] = "Flint & Steel";
        inventory[2] = "Crafting Table";
        inventory[3] = "Torch";

        numberItems = 4; //updating the number of items in the array (variable)
        
    }

    public int hasItem(String item){ //finds the position of the item in the array
        item = item.trim();
        
        for(int i = 0; i < numberItems; i++){ 
            if(inventory[i] != null && inventory[i].equalsIgnoreCase(item)){
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item) //removing an item once it has been used
    {
        item = item.trim();
        
        int index = hasItem(item); //index of the item in the array
        if(index == -1){
            System.out.println("Not found in inventory");   
            return;
        }

        for(int i = index; i < numberItems -1; i++){ //loops through to update the new positions of the items in the array
            inventory[i] = inventory[i + 1];
        }
        inventory[numberItems - 1] = null; //sets the last index to null
        numberItems--; //updates the new total 
    }


    public void addItem(String item)//picking up items and adds to the array 
    {
        item = item.trim();

        if (hasItem(item) != -1){
            return;
        }
        
        if (numberItems < MAX_ITEMS){ 
            inventory[numberItems++] = item; //adds to the next available space
        }
    }
    

    public String displayInventory()
    {
        String result = "Inventory: "; //initiliase the variable
        
        for(int i=0; i < numberItems; i ++) //loops and adds to concatenate a string
        {
            result += inventory[i];
            if(i < numberItems - 1) result += ", ";
        }
        return result;
    }

}