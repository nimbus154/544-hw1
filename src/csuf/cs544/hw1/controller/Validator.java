package csuf.cs544.hw1.controller;

import java.util.HashSet;
import java.util.Set;

public class Validator {

	public Validator () {}
	
	public static int MAX_SIZE = 12, 
				 	  MIN_SIZE = 8,
				 	  MIN_RANGE = 1,
				 	  MAX_RANGE = 100;
	
	public static String OUT_OF_RANGE_ERROR = "Please enter only numbers between " 
												+ MIN_RANGE + " and " + MAX_RANGE,
						 UNIQUNESS_ERROR = "All numbers must be unique",
						 INPUT_SIZE_ERROR = "Please enter " + MIN_SIZE + " to " 
								 			+ MAX_SIZE + " numbers";	
	
	public void validate(int[] arrayOfNums) throws Exception {
		
		if (arrayOfNums.length < MIN_SIZE || arrayOfNums.length > MAX_SIZE) {
			throw new Exception(INPUT_SIZE_ERROR) ;
		}
		
		Set<Integer> uniqueNums = new HashSet<Integer>();
		
		for(int a:arrayOfNums) {
			if (a < MIN_RANGE || a > MAX_RANGE) {
				throw new Exception(OUT_OF_RANGE_ERROR);				
			}
			uniqueNums.add(a);
		}
	
		if (uniqueNums.size() != arrayOfNums.length) {
			throw new Exception(UNIQUNESS_ERROR);
		}
	}
}
