import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = getIntegers();
        System.out.println(Arrays.toString(array));
        int[] reversedArray = arrayReverser2(array);
        System.out.printf(Arrays.toString(reversedArray));

    }
    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by commas: ");
        String input = scanner.nextLine();

        String[] stringArray = input.split(",");
        int[] myArray = new int[stringArray.length];

        for (int i = 0 ; i< stringArray.length;i++){
            myArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        return myArray;
    }
    public static int[] arrayReverser(int[] array){
        int max_Value = array.length-1;
        int half_Value = array.length/2;

        for (int i =0;i<half_Value;i++){
            int temp = array[i];
            array[i]=array[max_Value-i];
            array[max_Value-i]=temp;
        }

        return array;
    }
    public static int[] arrayReverser2(int[] arrays){
        int[] reversedArray = new int[arrays.length];
        int max_Index = arrays.length-1;
        for (int i : arrays){
            reversedArray[max_Index--] = i;
        }
        return reversedArray;
    }
}