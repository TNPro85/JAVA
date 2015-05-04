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

	private static int partition(int data[], int left, int right)
	{
		while (true)
		{
			// move right "pointer" toward left
			while (left < right && data[left] < data[right]) right--;
			if (left < right) {
				// swap(data,left++,right);
				int tmp = data[left];
				data[left] = data[right];
				data[right] = tmp;

				left++;
			}
			else return left;

			// move left pointer toward right
			while (left < right && data[left] < data[right]) left++;
			if (left < right) {
				// swap(data,left,right--);
				int tmp = data[left];
				data[left] = data[right];
				data[right] = tmp;

				right--;
			}
			else return right;
		}
	}

	public static void quickSort(int data[])
	{
		quickSortRecursive(data, 0, data.length - 1);
	}

	private static void quickSortRecursive(int data[], int left, int right)
	{
		int pivot; // the final location of the leftmost value
		if (left >= right) return;
		pivot = partition(data, left, right); /* 1 - place pivot */
		quickSortRecursive(data, left, pivot-1); /* 2 - sort small */
		quickSortRecursive(data, pivot+1, right);/* 3 - sort large */
		/* done! */
	}

	public static void main(String[] args) {
		int arr[] = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
//		quickSort(arr, 0, arr.length - 1);
		quickSort(arr);

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
