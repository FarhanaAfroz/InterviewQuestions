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
		
		//search for duplicate elements
		for(int j = 0; j < crr_array.length; j++){
			for(int i = j; i < crr_array.length; i++){
				if(crr_array[j] == crr_array[i] && j != i){
					new_array[i] = crr_array[i];
					times[i]++;
				}
				System.out.println(crr_array[i] + "\t" + times[i]);
			}
		}
		
		//Display the output
		//for(int i = 0; i < new_array.length; i++){
			//System.out.println(new_array[i] + "\t" + times[i]);
			
		//}
		
	}

}
