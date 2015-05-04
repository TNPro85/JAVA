package jStructure.sort;


public class InsertionSort {

	public static void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int pos = i - 1;
			while(pos >= 0 && arr[pos] > x) {
				arr[pos+1] = arr[pos];
				pos--;
			}
			arr[pos+1] = x;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr[] = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
		insertionSort(arr);
	}
}
