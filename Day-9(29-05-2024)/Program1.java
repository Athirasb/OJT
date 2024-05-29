// Program to add two binary numbers
class Program1 {
    public static void main(String[] args) {
        long b1 = 1010, b2 = 1100; 
        int i = 0, remainder = 0;
        long[] res = new long[25];
        
        while (b1 != 0 || b2 != 0) {
            res[i++] = (b1 % 10 + b2 % 10 + remainder) % 2;
            remainder = (int)(b1 % 10 + b2 % 10 + remainder) / 2;
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        
        if (remainder != 0) {
            res[i++] = remainder;
        }
        
        i--;
        System.out.print("Sum of the two binary numbers is: ");
        while (i >= 0) {
            System.out.print(res[i]);
            i--;
        }
    }
}
