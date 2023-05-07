import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] myArray = getRandomArray(10);
        System.out.println(Arrays.toString(myArray));

        int[] sortedArray =  sortedArray(myArray);
        System.out.println(Arrays.toString(sortedArray));

    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0;i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    private static int[] sortedArray(int[] myArray){
        int[] sortedArray = Arrays.copyOf(myArray,myArray.length);
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < myArray.length-1; i++) {
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}