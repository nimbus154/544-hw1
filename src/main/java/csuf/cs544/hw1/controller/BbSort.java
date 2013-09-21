package csuf.cs544.hw1.controller;

import csuf.cs544.hw1.display.ArrayDisplayer;

public class BbSort {
	
	public BbSort() {}
		
	public int[] bubbleSort(int[] nums, ArrayDisplayer arrayDisplayer) {
		
		arrayDisplayer.display(nums, "Input Array");
		
		 for (int i = 1; i < nums.length; i++) {			 
		    for (int j = 0; j < nums.length - i; j++) {
		    	
		        if (nums[j] > nums[j+1]) {
		        	arrayDisplayer.display (nums, nums[j] + ">" + nums[j+1] + " Swapped");
		        	
		            int temp = nums[j];
		            nums[j] = nums[j+1];
		            nums[j+1] = temp;		            
		        }		        
		        else {		        
		        	arrayDisplayer.display (nums, nums[j] + "<" + nums[j+1] + " OK");
		        }
		    }
		    arrayDisplayer.display(nums, "Iteration " + i + " Done");
		 }
		 
		 arrayDisplayer.display(nums, "All Done" );
		 return nums;
	}
}
