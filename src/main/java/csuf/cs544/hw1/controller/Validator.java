package csuf.cs544.hw1.controller;

import java.util.HashSet;
import java.util.Set;

public class Validator {

	public Validator () {}
	
	public static String OUT_OF_RANGE_ERROR = "Please enter only numbers between 1 and 100",
						 UNIQUNESS_ERROR = "All numbers must be unique",
						 INPUT_SIZE_ERROR = "Please enter 10 to 12 numbers";	
	
	public void validate(int[] arrayOfNums) throws Exception {
		
		if (arrayOfNums.length < 10 || arrayOfNums.length > 12) {
			throw new Exception(INPUT_SIZE_ERROR) ;
		}
		
		Set<Integer> uniqueNums = new HashSet<Integer>();
		
		for(int a:arrayOfNums) {
			if (a<1 || a>100) {
				throw new Exception(OUT_OF_RANGE_ERROR);				
			}
			uniqueNums.add(a);
		}
	
		if (uniqueNums.size() != arrayOfNums.length) {
			throw new Exception(UNIQUNESS_ERROR);
		}
	}
}
