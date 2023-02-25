package week3.Assignments;

import java.util.HashSet;
import java.util.Set;


public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> unique= new HashSet<>();
		Set<Integer> duplicates= new HashSet<>();
		
		for(int i=0;i< data.length;i++) {
			boolean add=unique.add(data[i]);
			if(!add) {
				duplicates.add(data[i]);
				
			}
			
		}
		System.out.println("Print the duplicate Numbers=" +duplicates);
		
		

	}

}
