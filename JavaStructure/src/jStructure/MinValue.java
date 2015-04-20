package jStructure;

import jUtils.PrintUtils;

import java.util.Scanner;

public class MinValue {

	static final int MAX = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int index = 0;
		int input = 0;
		
		int[] arr = new int[MAX];
		
		while(index < MAX && input != -1) {
			try {
				input = keyboard.nextInt();
				keyboard.nextLine();
				
				if(index >= 0) {
					arr[index] = input;
					index++;
				}
			} catch (Exception e) {
				keyboard.nextLine();
				PrintUtils.print("\nInvalid input! Try again!\n");
			}
		}

		keyboard.close();
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		
		PrintUtils.print("Min: " + min);
	}
}
