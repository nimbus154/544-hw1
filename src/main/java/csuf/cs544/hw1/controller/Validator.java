package csuf.cs544.hw1.controller;

import java.util.HashSet;
import java.util.Set;

public class Validator {

	public Validator () {}
	
	public static String OUT_OF_RANGE_ERROR = "Please enter only numbers between 1 and 100",
						 UNIQUNESS_ERROR = "All numbers must be unique",
						 INPUT_SIZE_ERROR = "Please enter 10 to 12 numbers";
	
	
	public void validate (int[] arrayofNums) throws Exception {
		
		if (arrayofNums.length< 10 || arrayofNums.length >12  ) {
			throw new Exception(INPUT_SIZE_ERROR) ;
		}
		
		Set<Integer> uniqueNums = new HashSet<Integer>();
		
		for(int a:arrayofNums) {
		
			if (a<1 || a>100) {
				throw new Exception(OUT_OF_RANGE_ERROR);				
			}
			
			uniqueNums.add(a);
		}
	
		if (uniqueNums.size() != arrayofNums.length) {
			throw new Exception(UNIQUNESS_ERROR);
		}
	}
}
