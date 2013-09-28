package csuf.cs544.hw1.dialogs;

import csuf.cs544.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;

public class CloseApplicationDialogFragment extends DialogFragment {
	
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    	
        return new AlertDialog.Builder(getActivity())
                //.setIcon(R.drawable.alert_dialog_icon)
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Okay",  new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    	getActivity().finish();
						System.exit(1);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    	EditText inputView = (EditText) getActivity().findViewById(R.id.editText1);
                    }
                })
                .create();
    }
}

