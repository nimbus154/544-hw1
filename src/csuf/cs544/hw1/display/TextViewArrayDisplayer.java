package csuf.cs544.hw1.display;

import java.util.Arrays;

import android.widget.TextView;

public class TextViewArrayDisplayer implements ArrayDisplayer {
	
	public TextViewArrayDisplayer() { }
	
	public TextViewArrayDisplayer(TextView textView) { 
		setTextView(textView);
	}
	
	private TextView textView;
	
	private String resultList = "";

	public void display(int[] nums, String message) {
		
		resultList += "\n" + Arrays.toString(nums) + " " + message;
		textView.setText(resultList);			
	}
	
	public void setTextView(TextView textView) {
		this.textView = textView;
	}
	
	public TextView getTextView() {
		return this.textView;
	}
}
