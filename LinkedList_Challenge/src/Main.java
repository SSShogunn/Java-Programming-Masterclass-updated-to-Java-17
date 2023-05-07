import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

record Places(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Places> PlacesToVisit = new LinkedList<>();

        addPlaces(PlacesToVisit,new Places("Adelaide",1374));
        addPlaces(PlacesToVisit,new Places("adelaide",1374));
        addPlaces(PlacesToVisit,new Places("Alice Springs",2771));
        addPlaces(PlacesToVisit,new Places("Brisbane",917));
        addPlaces(PlacesToVisit,new Places("Darwin",3972));
        addPlaces(PlacesToVisit,new Places("Melbourne",877));
        addPlaces(PlacesToVisit,new Places("Perth",3923));

        PlacesToVisit.addFirst(new Places("Sydney",0));;
        System.out.println(PlacesToVisit);

        var iterator =PlacesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " +iterator.next());
                forward=true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : " +iterator.previous());
                forward=false;
            }
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    System.out.println("User Wants to Move Forward");
                    if(!forward){ //reversing Direction
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next(); //Adjust Position Forward
                        }
                    }
                    if( iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User Wants to Move Backward");
                    if(!forward){ //reversing Direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous(); //Adjust Position Forward
                        }
                    }
                    if( iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(PlacesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    private static void addPlaces(LinkedList<Places> list, Places place){
        if(list.contains(place)){
            System.out.println("Found duplicate: "+place);
            return;
        }
        for( Places p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate: "+ place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
    private static void removePlaces(LinkedList<Places> list, Places place){
        if(list.contains(place)){
            System.out.println("Found duplicate: "+place);
            return;
        }
        list.add(place);
    }
}