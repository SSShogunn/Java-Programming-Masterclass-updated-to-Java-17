import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readInteger();
        System.out.println(Arrays.toString(array));
        int number = minimumElement(array);
        System.out.println("Min Element: "+number);
    }

    public static int[] readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the Number Of Elements for the Array, With commas (',') : ");
        String input = scanner.nextLine();

        String[] split = input.split(",");
        int[] array = new int[split.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(split[i].trim());
        }
        return array;

        /*        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the Element --> " + (i + 1) + " --> ");
            array[i] = scanner.nextInt();
        }*/
    }

    public static int minimumElement(int[] array) {
        int minElement = Integer.MAX_VALUE;
        for (int el : array) {
            if (el<minElement) {
                minElement = el;
            }
        }
        return minElement;
    }
}