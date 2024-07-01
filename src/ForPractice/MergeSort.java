package ForPractice;

public class MergeSort {

	void merge(int arr[], int l, int m, int r) {
		int i = l;
		int j = m+1;
		int k =l;
		
		int[] array2 = new int[r+1];
		
		while(i<=m && j<=r) {       //Jo chota hai usko dusre array m daalo & increase pointer
			if(arr[i]< arr[j]) {
				array2[k] = arr[i];
				i++;
				k++;
			}else {
				array2[k] = arr[j];
				j++;
				k++;
			}
		}
		
		if(i>m) {                   //if first half is done toh second half k sab element array2 m daalo
			while(j<=r) {
				array2[k] = arr[j];
				j++;
				k++;
			}
		}else {
			while(i<=m) {
				array2[k] = arr[i];
				i++;
				k++;
			}
		}
		
		for(int index=l;index<= r;index++) {
			arr[index] = array2[index];
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r) {
		if (l < r) {

			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	// A utility function to print array of size n
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 1 };

		System.out.println("Given array is");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array is");
		printArray(arr);
	}
}
