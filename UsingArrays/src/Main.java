import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstRandomArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstRandomArray));
        Arrays.sort(firstRandomArray);
        System.out.println(Arrays.toString(firstRandomArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(fourthArray,  5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largeArray = Arrays.copyOf(fourthArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Mark","Ronin","Aman","Harsh","Rv"};
        Arrays.sort(sArray); // essential for binary search
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Aman")>=0){
            System.out.println("Match was found");
        }else {
            System.out.println("No Match Found");
        }
        int[] s1 ={1,2,3,4,5,6};
        int[] s2 ={1,2,3,4,5,6};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal.");
        }else {
            System.out.println("Not equal.");
        }

    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0;i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}