import java.util.ArrayList;

class IntClass{
    private int myValue;
    public IntClass(int myValue){
        this.myValue=myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Aman");

//        ArrayList<int> intArrayList = new ArrayList<int>()

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(100));

//        Integer integer = new Integer(100);

//        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i<=10;i++){
            System.out.println(i +" --> "+intArrayList.get(i).intValue());
        }
        System.out.printf("DoubleArrayList");

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for (double i =0 ; i <= 10; i+=0.5){
            myDoubleArrayList.add(Double.valueOf(i));
        }
        for(int i = 0; i < myDoubleArrayList.size();i++){
            System.out.println(i +" --> "+myDoubleArrayList.get(i).doubleValue());
        }
    }
}