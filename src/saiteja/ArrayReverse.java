package saiteja;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int positions = 2;

		// Print the Actual array
		System.out.print("Given Array is: \n");
		for(int i=0; i<arr.length; i++){
			System.out.print( arr[i]+" ");
		}
		rotateArrayLeft(arr, positions);

		System.out.println("\nGiven number of positions to rotate: \n"+ positions);

		// Print the rotated array
		System.out.println("Rotated array is:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void rotateArrayLeft(int[] arr, int positions) {
		if (positions < 0) {
			throw new IllegalArgumentException("Number of positions to rotate must be non-negative.");
		}
		if (arr.length == 0 || positions == 0) {
			return;
		}
		int n = arr.length;

		// Adjust positions if it is greater than the array length
		positions = positions % n;

		// Find the greatest common divisor (gcd) of n and positions
		int gcd = findGCD(n, positions);

		// Perform cyclic rotations
		for (int i = 0; i < gcd; i++) {
			int temp = arr[i];
			int j = i;

			while (true) {
				int k = (j + positions) % n;
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}

		return findGCD(b, a % b);
	}
}