class RotateRight {    
    public static void main(String[] args) {    
        // Initialize array     
        int[] arr = new int[] {1, 2, 3, 4, 5};     
        // n determines the number of times an array should be rotated
        int n = 3;    
        
        // Displays the original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }      
        
        // Calculate the effective number of rotations
        n = n % arr.length;
        
        // Rotate the array to the right by n times
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + n) % arr.length] = arr[i];
        }
        
        System.out.println();    
        
        // Displays the resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for (int i = 0; i < result.length; i++) {    
            System.out.print(result[i] + " ");    
        }    
    }    
}
