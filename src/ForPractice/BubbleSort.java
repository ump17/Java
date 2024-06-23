package ForPractice;

import java.util.Scanner;

public class BubbleSort {

	static void bubbleSort(int arr[], int n) {
		int i, temp;
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			for (i = 0; i < n - 1; i++) { // since we are comparing to next ele, then there's no point to going to last
											// element
				if (arr[i] > arr[i + 1]) {
					swapped = true;
					// Swap if e1>e2
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

	// Function to print an array
	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of element you want to enter: ");
		int size = sc.nextInt();
		System.out.println("Please enter those numbers: ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}
