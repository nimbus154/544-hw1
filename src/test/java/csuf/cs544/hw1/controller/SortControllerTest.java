package csuf.cs544.hw1.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import csuf.cs544.hw1.display.ArrayDisplayer;

public class SortControllerTest {
	
	private SortController controller;
	
	private ArrayDisplayer displayer;

	@Before
	public void setUp() throws Exception {
		
		controller = new SortController();
		displayer = Mockito.mock(ArrayDisplayer.class);
	}

	/**
	 * User supplies improperly formatted input
	 */
	@Test(expected = Exception.class)
	public void testFormatFail() throws Exception {
		
		controller.sort("dog", null);
	}
	
	/**
	 * User supplies invalid input
	 */
	@Test(expected = Exception.class)
	public void testValidateFail() throws Exception {
		
		controller.sort("1 2", null);
	}
	

	/**
	 * User supplies improperly formatted input
	 */
	@Test
	public void testSuccess() throws Exception {
		
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
			  actual = controller.sort("2 1 3 4 5 6 7 8 9 10 11", displayer);
		
		Assert.assertArrayEquals(actual, expected);
	}
}
