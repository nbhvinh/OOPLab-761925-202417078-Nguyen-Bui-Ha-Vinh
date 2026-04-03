import java.util.Arrays;
import java.util.Scanner;

public class Arrsort {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input numb of arr: ");
        int n = scanner.nextInt();
        double[] myArray = new double[n];
        
        System.out.println("input arr:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + (i + 1) + "]: ");
            myArray[i] = scanner.nextDouble();
        }
        
        Arrays.sort(myArray);
        
        double sum = 0;
        for (double num : myArray) {
            sum += num;
        }
        
        double average = sum / n;
        
        System.out.println("Sorted arr: " + Arrays.toString(myArray));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
