package csuf.cs544.hw1.activities;

import csuf.cs544.R;
import csuf.cs544.R.layout;
import csuf.cs544.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
