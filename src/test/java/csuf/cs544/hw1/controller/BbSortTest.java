package csuf.cs544.hw1.controller;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.Mockito;

import csuf.cs544.hw1.controller.BbSort;
import csuf.cs544.hw1.display.ArrayDisplayer;

public class BbSortTest {

//	private ArrayDisplayer aDisplayer;
//	BbSort b;
//	@Before
//	public void setUp() throws Exception {
//		
//		b = new BbSort();
//		aDisplayer = Mockito.mock(ArrayDisplayer.class);
//	}
//	
//	@Test
//	/**
//	 * test the bubble sort algorithm
//	 */
//	public void sortTest() {
//		
//		int[] num = {9,8,7,6,5,4,3,2,1,11,33,44};
//		int[] actual = b.bubbleSort(num , aDisplayer);
//		int[] expected = {1,2,3,4,5,6,7,8,9,11,33,44};
//		Assert.assertEquals(Arrays.toString(expected),Arrays.toString (actual));		
//	}
//	
//	@Test
//	public void testDisplayInputArray(){
//		int[] num = {};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Input Array");
//	}
//	
//	@Test
//	public void testDisplaySortedArray(){
//		int[] num = {};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "All Done");
//	}
//	
//	@Test
//	public void testDisplayEachIteration(){
//		int[] num = {1,2,6};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Iteration 1 Done");
//		Mockito.verify(aDisplayer).display(num, "Iteration 2 Done");
//	}
//	
//	@Test
//	public void testDisplaySwapped(){
//		int[] num = {3,2};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "3>2 Swapped");
//	}
//	
//	@Test
//	public void testDisplayNotSwapped(){
//		int[] num = {2,3};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "2<3 OK");
//	}
//	
//	@Test
//	public void testDisplayEmpty(){
//		int[] num = {};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Input Array");
//		Mockito.verify(aDisplayer).display(num, "All Done");
//		Mockito.verify(aDisplayer, Mockito.never()).display(num, "Iteration 1 Done");
//	}
//	
//	@Test
//	public void testDisplayOneInput(){
//		int[] num = {1};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Input Array");
//		Mockito.verify(aDisplayer).display(num, "All Done");
//		Mockito.verify(aDisplayer, Mockito.never()).display(num, "Iteration 1 Done");
//	}
//	
//	
//	@Test
//	public void testDisplaySoretd(){
//		int[] num = {1,2};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Input Array");
//		Mockito.verify(aDisplayer).display(num, "All Done");
//		Mockito.verify(aDisplayer).display(num, "Iteration 1 Done");
//		Mockito.verify(aDisplayer).display(num, "1<2 OK");
//		Mockito.verify(aDisplayer, Mockito.never()).display(Mockito.eq(num), Mockito.endsWith("Swapped"));
//	}
//	
//	@Test
//	public void testDisplayUnSoretd(){
//		int[] num = {2,1};
//		b.bubbleSort(num, aDisplayer);	
//		Mockito.verify(aDisplayer).display(num, "Input Array");
//		Mockito.verify(aDisplayer).display(num, "All Done");
//		Mockito.verify(aDisplayer).display(num, "Iteration 1 Done");
//		Mockito.verify(aDisplayer).display(num, "2>1 Swapped");
//		Mockito.verify(aDisplayer, Mockito.never()).display(Mockito.eq(num) ,Mockito.endsWith("OK"));
//	}
}
