public class Sum_even {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 10, 13, 16};
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
