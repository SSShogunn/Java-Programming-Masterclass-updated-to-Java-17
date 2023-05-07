import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("Before Change --> "+Arrays.toString(myIntArray));
        System.out.println("After Change  --> "+ Arrays.toString(anotherArray));
        int[] array = randomArrayGen(10);
        System.out.println(Arrays.toString(array));
    }
    private static int[] randomArrayGen(int number){
        Random random = new Random();
        int[] myArray = new int[number];
        for (int i =0;i<number;i++){
            myArray[i]=random.nextInt(100);
        }
        return myArray;
    }
}