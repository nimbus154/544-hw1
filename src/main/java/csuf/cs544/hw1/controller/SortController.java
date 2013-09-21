package csuf.cs544.hw1.controller;

import csuf.cs544.hw1.display.ArrayDisplayer;

/**
 * Handles logic for the sorting feature of the application
 *
 */
public class SortController {
	
	public SortController() { 
		
		validator = new Validator();
		sorter = new BbSort();
		formatter = new Formatter();
	}
	
	private Validator validator;
	
	private BbSort sorter;
	
	private Formatter formatter;
	
	/**
	 * Controls the sorting process
	 * @param input raw string input from user
	 * @param displayer class used to print/log sorting process 
	 * @return sorted array
	 * @throws Exception if input cannot be parsed to an array of numbers
	 * or if it violates the preconditions defined by Validator 
	 * @see Validtor
	 */
	public int[] sort(String input, ArrayDisplayer displayer) 
		throws Exception {
		
		int[] nums = formatter.format(input);
		validator.validate(nums); // throws an exception if invalid
	
		return sorter.bubbleSort(nums, displayer);
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	public Validator getValidator() {
		return this.validator;
	}

	public void setBbSort(BbSort sorter) {
		this.sorter = sorter;
	}
	
	public BbSort getSorter() {
		return this.sorter;
	}

	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}
	
	public Formatter getFormatter() {
		return this.formatter;
	}
}
