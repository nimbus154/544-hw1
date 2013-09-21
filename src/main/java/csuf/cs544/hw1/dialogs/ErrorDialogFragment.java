package csuf.cs544.hw1.dialogs;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

public class ErrorDialogFragment extends DialogFragment {
	
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    	String message = getArguments().getString("error");
        return new AlertDialog.Builder(getActivity())
                //.setIcon(R.drawable.alert_dialog_icon)
                .setTitle("e")
                .setMessage(message)
                .setPositiveButton("Okay", null).create();
    }
}

