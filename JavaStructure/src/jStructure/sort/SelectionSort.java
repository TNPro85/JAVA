package jStructure.sort;


public class SelectionSort {

	public static void selectionSort(int arr[], int size) {
		int min = arr[0];
		for(int i = 0; i < size; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int size = 5;
		for(int i = 0; i < size - 1; i++) {
			// Gia su phan tu 0 la phan tu nho nhat
			int min = i;
			for(int j = i+1; j < size; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			
			if(min != i) {
				arr[i] = arr[i] ^ arr[min];
				arr[min] = arr[i] ^ arr[min];
				arr[i] = arr[i] ^ arr[min];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
