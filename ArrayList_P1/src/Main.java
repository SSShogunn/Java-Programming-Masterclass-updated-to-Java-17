import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        try {
            mainOption();
        }catch (InputMismatchException e){
            System.out.println("Please Enter the option for the list only.");
        }

    }
    public static void mainOption(){
        boolean quit= false;
        int choice = 0;
        printInstructions();
        while ((!quit)){
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }

    }
    public static void printInstructions () {
        System. out.println("\n Press ");
        System. out.println("\t 0 - To print choice options.");
        System. out.println("\t 1 - To print the list of grocery items.");
        System. out.println("\t 2 - To add an item to the list.");
        System. out.println("\t 3 - To modify an item in the list.");
        System. out.println("\t 4 - To remove an item from the list.");
        System. out.println("\t 5 - To search for an item in the list.");
        System. out.println("\t 6 - To quit the application.");
        System. out.println("\t 7 - To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please ent enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter item name: ");
        String noItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String itemName = scanner.nextLine();
        groceryList.modifyGroceryItem(noItem,itemName);
    }
    public static void removeItem(){
        System.out.print("Enter the item name to be removed: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }
    public static void searchForItem(){
        System.out.print("Enter the name of the item you wan to find: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)==true){
            System.out.println("Found "+searchItem+" in our groceryList");
        }else {
            System.out.println("No item was found.");
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray=groceryList.getGroceryList().toArray(myArray);
    }
}