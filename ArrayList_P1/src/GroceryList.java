import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item "+(position+1)+" has been Modified");
    }
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public static void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+" items in your grocery List.");
        for (int i=0;i< groceryList.size();i++){
            System.out.println( i+1 +". " +groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }else {
            System.out.println("Item was not found.");
        }
    }
    public void removeGroceryItem(String Item){
        int position = findItem(Item);
        if (position>=0){
            removeGroceryItem(position);
        }
    }
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
    public boolean onFile(String item){
        int position = findItem(item);
        if(position>=0){
            return true;
        }else {
            return false;
        }
    }
}
