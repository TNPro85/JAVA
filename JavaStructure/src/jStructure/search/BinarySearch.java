package jStructure.search;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int[] arr, int size, int num) {
		long cur = System.currentTimeMillis();
		int left = 0, right = size - 1;
		
		while(left <= right) {
			int mid = (arr[left] + arr[right]) / 2;
			if(arr[mid] == num) {
				System.out.println("Exec in: " + (System.currentTimeMillis() - cur) + "");
				return mid;
			}
			
			if (arr[mid] > num)
				right = mid - 1;
			else
				left = mid + 1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int size = 100000000;
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = i;
		}
		
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		while(input >= 0) {
			System.out.println("Insert value: ");
			input = scanner.nextInt();
			scanner.nextLine();
			
			if(input >= 0) {
				int searchResult = binarySearch(arr, size, input); 
				if(searchResult >= 0)
					System.out.println("Found " + input + " at " + searchResult);
				else
					System.out.println("Value not found");
			}
		}

		System.out.println("Finished!!!");
		scanner.close();
	}

}
