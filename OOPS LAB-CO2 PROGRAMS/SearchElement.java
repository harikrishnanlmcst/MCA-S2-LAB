import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read the array values from the user
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the element to search for
        System.out.print("Enter the element to search for: ");
        int element = scanner.nextInt();

        // Search for the element in the array
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        // Print the result
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
