package searching;

import java.util.Scanner;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int n, temp;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array: ");
		n = scr.nextInt();
		if(n>1){
			int [] array = new int[n];
			System.out.println("Enter all the elements:");
			 for(int i = 0; i < n; i++){
				 array[i] = scr.nextInt();
			 }
			 
			 scr.close();
			 
			 for(int i = 0; i < n; i++){
				 for(int j = i+1; j < n; j++){
					 if(array[i] < array[j]){
						 temp = array[i];
						 array[i] = array[j];
						 array[j] = temp;
					 }
					 
				 }
				 
			 }
			 System.out.println("First Largest number is:" + array[0] + "\n   and");
			 System.out.println("Second Largest number is:" + array[1]);
		}
		else
			System.out.println("Enter number greater than 1");
		
	}

}
