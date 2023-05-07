import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        boolean flag = false;
        while (!flag){
            printInstructions();
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    MobilePhone.printListOfContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    //removeContact();
                    break;
                case 4:
                    //findContact();
                    break;
                case 5:
                    flag=true;
                    break;
            }

        }

    }
    public static void printInstructions () {
        System. out.println("\n Press ");
        System. out.println("\t 0 - To print Contact List");
        System. out.println("\t 1 - To Add A Contact");
        System. out.println("\t 2 - To Update Existing Contact");
        System. out.println("\t 3 - To Remove Contact");
        System. out.println("\t 4 - To Find A Contact");
        System. out.println("\t 5 - To quit the application.");
    }
    public static void  addContact(){
        System.out.print("Enter the name of the person: ");
        String name=scanner.nextLine();
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        MobilePhone.addingContacts(name,phoneNumber);
    }
    public static void updateContact(){
        System.out.print("Enter the name of the Person: ");

    }
}