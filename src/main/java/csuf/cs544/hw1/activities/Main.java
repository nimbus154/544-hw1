package csuf.cs544.hw1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import csuf.cs544.R;
import csuf.cs544.hw1.controller.Formatter;
import csuf.cs544.hw1.controller.Validator;
import csuf.cs544.hw1.dialogs.CloseApplicationDialogFragment;
import csuf.cs544.hw1.dialogs.ErrorDialogFragment;

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
					EditText inputView = (EditText) findViewById(R.id.editText1);
					String input = inputView.getText().toString();
					
					if(input.equals("0")) {
						CloseApplicationDialogFragment dialog = new CloseApplicationDialogFragment();
						dialog.show(getFragmentManager(), "test");						
					}
					else {
						// check text for errors
						int[] nums = formatter.format(input);
						validator.validate(nums);
						
						// pass array to new activity
						Intent i = new Intent(Main.this,Result.class);					
						i.putExtra(INT_ARRAY, nums);					
						startActivity(i);

					}
				}
				catch(Exception e) {
					// display a dialog box					
					Bundle args = new Bundle();
					args.putString("error", e.getMessage());
					ErrorDialogFragment dialog = new ErrorDialogFragment();
					dialog.setArguments(args);
					dialog.show(getFragmentManager(), "validation_error");
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
