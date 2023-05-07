import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("AnotherIntValue = "+ anotherIntValue);

        anotherIntValue++;

        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("AnotherIntValue = "+ anotherIntValue);

        int[] myIntArray = new  int[5];
        int[] anotherIntArray=myIntArray;

        System.out.println("MyIntArray ="+ Arrays.toString(myIntArray));
        System.out.println("AnotherMyIntArray ="+ Arrays.toString(anotherIntArray));

        anotherIntArray[0]=1;

        System.out.println("After Change MyIntArray ="+ Arrays.toString(myIntArray));
        System.out.println("After Change AnotherMyIntArray ="+ Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {4,6,8,10,12};
        modifyArray(myIntArray);

        System.out.println("After Modify MyIntArray ="+ Arrays.toString(myIntArray));
        System.out.println("After Modify AnotherMyIntArray ="+ Arrays.toString(anotherIntArray));
    }
    private static void modifyArray(int[] array){
        array[0] = 3;
        array = new int[] {1,2,3,4,5};
    }
}