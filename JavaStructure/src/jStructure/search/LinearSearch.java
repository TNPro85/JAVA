package jStructure.search;

import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int[] arr, int size, int num) {
		long cur = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			if(arr[i] == num) {
				System.out.println("Exec in: " + (System.currentTimeMillis() - cur) + "");
				return i;
			}
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
				int searchResult = linearSearch(arr, size, input); 
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
