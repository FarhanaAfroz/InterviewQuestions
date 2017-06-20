package searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchDuplicateNumber {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		//get integer array size
		System.out.println("Enter array size:");
		int array_size = scr.nextInt();

		int [] numbers = new int [array_size];
		//read integers from console
				System.out.println("Enter array elements:");
				for(int i = 0; i < numbers.length; i++){
					numbers[i] = scr.nextInt();
				}
		scr.close();
		Arrays.sort(numbers);
		System.out.println("Sorted array is:" + Arrays.toString(numbers));
		
		int count = 0;
		int tempCount = 0;// to keep local count of matched numbers
		String  duplicates = "";
		for(int j = 1; j < numbers.length; j++){
			if(numbers[j] == numbers[j-1]){
				if(tempCount == 0){
					count = count + 1;
					tempCount = tempCount + 1;
					duplicates = duplicates.concat(Integer.toString(numbers[j]) + ",");
				}
				
			}else{
				tempCount = 0;
			}
			
			
		}
		System.out.println("No of duplicates:" + count);
		System.out.print("Duplicates Numbers are:" + duplicates);
	}

}
