package jStructure.sort;


public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr.length - 1; j > i; j--) {
				if(arr[j] < arr[j-1]) {
					
					// Swap
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr[] = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
		bubbleSort(arr);
	}
}
