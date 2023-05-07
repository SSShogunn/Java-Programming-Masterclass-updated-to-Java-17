import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int integer = readInteger();
        int[] myArray = readIntegers(integer);
        System.out.println("Original Array is: "+Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed Array is: "+ Arrays.toString((myArray)));
    }
    public static int readInteger(){
        System.out.printf("Enter the number of Element for the array: ");
        return scanner.nextInt();
    }
    public static int[] readIntegers(int number){
        int[] value = new int[number];
        for(int i =0;i< number;i++){
            System.out.printf("Enter the "+ i+" element for the array: ");
            value[i]=scanner.nextInt();
        }
        return value;
    }
    public static void reverse(int[] array){

        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for(int i =0;i<halfLength;i++){
            int temp = array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}