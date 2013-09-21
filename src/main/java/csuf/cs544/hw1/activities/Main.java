package csuf.cs544.hw1.activities;

import csuf.cs544.R;
import csuf.cs544.R.id;
import csuf.cs544.R.layout;
import csuf.cs544.R.menu;
import csuf.cs544.hw1.controller.Formatter;
import csuf.cs544.hw1.controller.Validator;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity {
	
	public static final String INT_ARRAY = "nums";
	
	private Button b;
	private Validator validator;
	private Formatter formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button1);
        
        validator = new Validator();
        formatter = new Formatter();
        
        b.setOnClickListener(new OnClickListener() {
        	
			public void onClick(View v) {
								
				try {
					// get the text from the field
					String input = "10 9 8 7 6 5 4 3 2 1";
					int[] nums = formatter.format(input);
					validator.validate(nums);
					Intent i = new Intent(Main.this,Result.class);
					
					i.putExtra(INT_ARRAY, nums);					
					startActivity(i);
				}
				catch(Exception e) {
					
				}				
			}
		});
    }
   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
