import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);

//        Integer deprecatedBoxing = new Integer(15);

        int unboxedInt = boxedInt.intValue();

        //Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed);

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        System.out.println(resultBoxed);
        System.out.println(resultUnboxed);

        Integer[] wrappedArray = new Integer[5];
        wrappedArray[0]=10;
        System.out.println(Arrays.toString(wrappedArray));
        System.out.println(wrappedArray[0].getClass().getSimpleName());

        Character[] characterArray = {'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(characterArray));
        System.out.println(characterArray[1].getClass().getSimpleName());

        var ourList = getList(2,4,6,8,10);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for( int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt (Integer i ){
        return i;
    }
    private  static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){

        return  Double.valueOf(100.00);

    }
    public static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}