import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Array = getIntegers(5);
        printArray(Array);
        int[] sortedArray =sortArray(Array);
        System.out.print("The Sorted Array is: ");
        for (int i= 0; i<Array.length;i++){
            System.out.print(+sortedArray[i]+" ");
        }
    }
    public static void printArray(int[] array){
        System.out.print("The Un-Sorted Array is: ");
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer values:   ");
        int[] value = new int[number];
        for (int i =0;i< value.length;i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }
    public static int[] sortArray(int[] array){

        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
            for(int i = 0;i< sortedArray.length-1;i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}