public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        int[] A = {1, 2, 3, 0, 0, 0}; // Array A with enough space to hold both A and B
        int m = 3; // Number of elements in A
        int[] B = {2, 5, 6}; // Array B
        int n = 3; // Number of elements in B

        merger.merge(A, m, B, n);

        // Print the merged array
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
