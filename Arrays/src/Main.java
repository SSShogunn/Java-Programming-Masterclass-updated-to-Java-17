import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i =0;i<myIntegers.length;i++){
            System.out.println("Element "+ i+", typed value was "+ myIntegers[i]);
        }
        System.out.println("***");
        System.out.println("Average of the number is: "+ averageCalculator(myIntegers));

    }
    public static void printArray(int[] array){
        for(int element : array){
            System.out.println("Element " + element + " value, is "+array[element]);
        }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer values:   ");
        int[] value = new int[number];
        for (int i =0;i< value.length;i++){
          value[i] = scanner.nextInt();
        }
        return value;
    }
    public static double averageCalculator(int[] array){
        double average = 0;
        for (int i = 0 ; i< array.length;i++){
            average+=array[i];
        }
        return average/ array.length;
    }
}