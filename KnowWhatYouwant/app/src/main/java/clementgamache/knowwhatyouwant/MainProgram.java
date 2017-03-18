package clementgamache.knowwhatyouwant;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 2016-04-04.
 */
public class MainProgram {
    public static int numberOfPeople;

    public static void messageBox(AppCompatActivity a, String s) {
        AlertDialog alertDialog = new AlertDialog.Builder(a).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(s);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
