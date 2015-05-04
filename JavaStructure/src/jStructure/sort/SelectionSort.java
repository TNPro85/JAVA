package jStructure.sort;


public class SelectionSort {

	public static void selectionSort(int arr[], int size) {
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
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr[] = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
		int size = 12;
		selectionSort(arr, size);
	}
}
