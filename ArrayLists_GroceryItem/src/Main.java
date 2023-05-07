import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count,name.toUpperCase(), type);
    }

}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE",6);
        groceryArray[2] = new GroceryItem( "Oranges","PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Curd");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Water"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges","PRODUCE", 5));
        groceryList.set(0, new GroceryItem("Apples","PRODUCE",6));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}