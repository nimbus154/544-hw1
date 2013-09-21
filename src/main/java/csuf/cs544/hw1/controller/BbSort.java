package csuf.cs544.hw1.controller;

public class BbSort {
	
	public BbSort() {}
		
	public int[] bubbleSort(int[] num , ArrayDisplayer arrayDisplayer) {
		
		arrayDisplayer.display(num, "Input Array");
		
		 for (int i = 1; i < num.length; i++) {			 
		    for (int j = 0; j < num.length - i; j++) {
		    	
		        if (num[j ] > num[j+1]) {
		        	arrayDisplayer.display (num, num[j] + ">" + num[j+1] + " Swapped");
		        	
		            int temp = num[j ];
		            num[j ] = num[j+1];
		            num[j+1] = temp;		            
		        }		        
		        else {		        
		        	arrayDisplayer.display (num, num[j] + "<" + num[j+1] + " OK");
		        }
		    }
		    arrayDisplayer.display(num, "Iteration " + i +" Done");
		 }
		 
		 arrayDisplayer.display(num, "All Done" );
		 return num;
	}
}
