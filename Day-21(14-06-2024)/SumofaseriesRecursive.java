// Sum a series of numbers with Java recursion

public class SumofaseriesRecursive {
    // Recursive method to calculate the sum of numbers from 1 to n
    public static int sum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        
        // Recursive call to sum with n-1 and add n to the result
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        // Define the value of n
        int n = 5;
        
        // Calculate the sum using the recursive method
        int result = sum(n);
        
        // Print the result
        System.out.println("Sum of numbers from 1 to " + n + ": " + result);
    }
}
