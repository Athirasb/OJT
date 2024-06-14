//Print a series of numbers with recursive Java methods


public class RecursiveNumbers {
    // Recursive method to print numbers from 1 to end
    public static void printNumbers(int end) {
        // Base case: if end is 1, print it and stop recursion
        if (end == 1) {
            System.out.print(end + " ");
            return;
        }
        
        // Recursive call to printNumbers with end-1
        printNumbers(end - 1);
        
        // Print the current number after recursion (in reverse order)
        System.out.print(end + " ");
    }

    public static void main(String[] args) {
        // Define the end value
        int end = 10;
        
        // Call the recursive method to print numbers
        System.out.println("Series of numbers from 1 to " + end + ":");
        printNumbers(end);
    }
}
