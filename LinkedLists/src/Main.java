import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//       LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Paris");
        placesToVisit.add("Denmark");
        placesToVisit.add("Malaysia");
        placesToVisit.add(0,"Portugal");
        System.out.println(placesToVisit);
        addMoreElement(placesToVisit);
        System.out.println(placesToVisit);
//        removeElement(placesToVisit);
//        System.out.println(placesToVisit);
//        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
    }
    public static void addMoreElement(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Arab");
        //Queue Method
        list.offer("India");
        list.offerFirst("Australia");
        list.offerLast("Japan");
        //Stack Method
        list.push("Nevada");
    }
    public static void removeElement(LinkedList<String> list){
        list.remove(4);
        list.remove("Arab");

        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1+" Was Removed");

        String s2 = list.removeFirst();
        System.out.println(s2+" Was First Element Removed");

        String s3 = list.removeLast();
        System.out.println(s3+" Was Last Element Removed");

        String p1 = list.poll();
        System.out.println(p1 +" Was Removed");

        String p2 = list.pollFirst();
        System.out.println(p2 +" Was Removed");

        String p3 = list.pollLast();
        System.out.println(p3 +" Was Removed");
    }
    public static void gettingElement(LinkedList<String > list){

        System.out.println("Retrieved Element = "+list.get(4));
        System.out.println("Retrieved First Element = "+list.getFirst());
        System.out.println("Retrieved Last Element = "+list.getLast());
        System.out.println("Darwin is at position : "+list.indexOf("Darwin"));
        System.out.println("Japan is at position : "+ list.lastIndexOf("Japan"));
        //Queue Retrieval Method
        System.out.println("Element form element() : "+list.element());
        //Stack Retrieval Method
        System.out.println("Element form element() : "+list.peek());
        System.out.println("Element form element() : "+list.peekFirst());
        System.out.println("Element form element() : "+list.peekLast());
    }
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip Starts at: "+ list.getFirst());
        for (int i = 1 ;i <list.size();i++){
            System.out.println("--> From: "+list.get(i-1)+ " to "+ list.get(i));
        }
        System.out.println("Trip Ends at: "+list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip Starts at: "+ list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> From: "+previousTown+" to "+ town);
            previousTown=town;
        }
        System.out.println("Trip Ends at: "+list.getLast());
    }
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip Starts at: "+ list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: "+previousTown+" to "+ town);
            previousTown=town;
        }
        System.out.println("Trip Ends at: "+list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {
        var iterator =list.listIterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Nevada")){
                iterator.add("China");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}