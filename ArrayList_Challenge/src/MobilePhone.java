import java.util.ArrayList;

public class MobilePhone {
    private static ArrayList<String> personName = new ArrayList<String>();
    private static ArrayList<String> personNumber = new ArrayList<String>();
    private void removeContact(int position){
        String theName = personName.get(position);
        personNumber.remove(theName);
        personName.remove(theName);
    }
    private int findContact(String name){
        return personName.indexOf(name);
    }
    private void modifyContact(int position,String name,String number){
        personName.set(position,name);
        personNumber.set(position,number);
    }
    public static void printListOfContacts(){
        System.out.println("Total Number of Contacts: "+ personName.size());
        for (int i = 0; i< personName.size(); i++){
            System.out.println(i+1 +" --> "+ personName.get(i) +" --> "+ personNumber.get(i));
        }
    }
    public static void addingContacts(String name, String phoneNumber){
        personName.add(name);
        personNumber.add(phoneNumber);
    }
    public void modifyingContacts(String name,String number){
        int position = findContact(name);
        if(position>=0){
            modifyContact(position,name,number);
        }else{
            System.out.println("No Contact Was Found.");
        }
    }
    public void removeContact(String name){
        int position =findContact(name);
        if (position>=0){
            removeContact(position);
        }
    }

}
