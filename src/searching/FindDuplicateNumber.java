package searching;

import java.util.Scanner;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		//get integer array size
		System.out.println("Enter array size:");
		int array_size = scr.nextInt();
		
		int [] crr_array = new int[array_size];
		int [] new_array = new int[array_size];
		int [] times = new int[array_size];
		
		//read integers from console
		System.out.println("Enter array elements:");
		for(int i = 0; i < crr_array.length; i++){
			crr_array[i] = scr.nextInt();
			times[i] = 1;
		}
		
		scr.close();
		
		//search for duplicate elements 
		System.out.println("Duplicate value    how many times repeate" );
		for(int j = 0; j < crr_array.length; j++){
			for(int i = j; i < crr_array.length; i++){
				if(crr_array[j] == crr_array[i] && j != i){
					new_array[i] = crr_array[i];
					times[i]++;
					System.out.print("\t" + new_array[i] + "\t\t\t" + times[i] + "\n"); //display output
				}
			}
		}
		
		//sort the array
		/*
		for(int i = 0; i < crr_array.length; i++){
			Arrays.sort(crr_array);
			System.out.print(crr_array[i] + "\t" );
		}
		*/		
	}

}
