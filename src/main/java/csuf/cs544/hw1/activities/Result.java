package csuf.cs544.hw1.activities;

import csuf.cs544.R;
import csuf.cs544.R.layout;
import csuf.cs544.R.menu;
import csuf.cs544.hw1.controller.BbSort;
import csuf.cs544.hw1.display.ArrayDisplayer;
import csuf.cs544.hw1.display.TextViewArrayDisplayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Result extends Activity {
	
	private TextViewArrayDisplayer displayer;
	private BbSort sorter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		TextView resultListTextView = (TextView) findViewById(R.id.result_list_text);
		displayer = new TextViewArrayDisplayer(resultListTextView);
		sorter = new BbSort();
		
		int[] nums = getIntent().getIntArrayExtra(Main.INT_ARRAY);
		
		sorter.bubbleSort(nums, displayer);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
