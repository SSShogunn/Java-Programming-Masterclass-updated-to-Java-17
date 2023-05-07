import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int integer = readInteger();
        int[] myArray = readIntegers(integer);
        System.out.println(Arrays.toString(myArray));
        System.out.println("The Minimum Element was: "+findInt(myArray));
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
    public static int findInt(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<array.length;i++){
            int value = array[i];
            if(value<min){
                min = value;
            }
        }
        return min;
    }
}