package saiteja;

public class Array {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int positions = 2;
	        int[] rotatedArray = rotateArrayLeft(arr, positions);
	        
	        // Print the Actual array
	        System.out.print("Given Array is: \n");
	        for(int i=0; i<arr.length; i++){
	            System.out.print( arr[i]+" ");
	        }
	        System.out.println("\nGiven number of positions to rotate: \n"+ positions);
	        // Print the rotated array
	        System.out.println("Rotated Array is: ");
	        for (int num : rotatedArray) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static int[] rotateArrayLeft(int[] arr, int positions) {
	        if (positions < 0) {
	            throw new IllegalArgumentException("Number of positions to rotate must be non-negative.");
	        }
	        if (arr.length == 0) {
	            return arr;
	        }
	        
	        int n = arr.length;
	        
	        // Adjust positions if it is greater than the array length
	        positions = positions % n;
	        
	        int[] rotated = new int[n];
	        
	        // Rotate the array
	        for (int i = 0; i < n; i++) {
	            int newIndex = (i + n - positions) % n;
	            rotated[newIndex] = arr[i];
	        }
	        
	        return rotated;
	    }
	}


