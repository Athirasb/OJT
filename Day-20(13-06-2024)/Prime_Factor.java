public class Prime_Factor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrimeFactor = 2;

        while (number > 1) {
            if (number % largestPrimeFactor == 0) {
                number /= largestPrimeFactor;
            } else {
                largestPrimeFactor++;
            }
        }

        System.out.println("The largest prime factor is: " + largestPrimeFactor);
    }
}
