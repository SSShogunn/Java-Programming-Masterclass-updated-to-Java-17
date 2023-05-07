import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    public static void printActions() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

    public static void addItem( ArrayList<String> groceriesList) {
        System.out.println("Add Items [Separated by commas]:");
        String[] input = scanner.nextLine().split(",");
        for ( String i : input){
            String trimmed = i.trim();
            if(groceriesList.indexOf(trimmed)  < 0){
                groceriesList.add(trimmed);
            }
        }
    }

    public static void removeItem(ArrayList<String> groceriesList) {
        System.out.println("Remove Items [Separated by commas]:");
        String[] input = scanner.nextLine().split(",");
        for ( String i : input){
            String trimmed = i.trim();
            groceriesList.remove(trimmed);
        }

    }
}