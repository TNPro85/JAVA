package jStructure.sort;


public class QuickSort {

	public static void quickSort(int a[], int l, int r) {
		int x = a[(l + r)/2];
		int i = l, j = r;
		
		// Partitioning
		do {
			while(a[i] < x) i++;
			while(a[j] > x) j--;
			
			if(i <= j) {
				// Swap
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				
				i++;
				j--;
			}
		} while(i < j);
		
		if(l < j)
			quickSort(a, l, j);
		if(i < r)
			quickSort(a, i, r);
	}
	
	public static void main(String[] args) {
		int arr[] = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
		quickSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
