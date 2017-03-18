package clementgamache.knowwhatyouwant;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.NumberPicker;

public class EntryActivity extends AppCompatActivity {

    NumberPicker numberOfPeoplePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        Button buttonNext = (Button) findViewById(R.id.button);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAndNext();
            }
        });

        numberOfPeoplePicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberOfPeoplePicker.setMinValue(2);
        numberOfPeoplePicker.setMaxValue(6);

    }

    private void saveAndNext() {
        MainProgram.numberOfPeople = numberOfPeoplePicker.getValue();
        MainProgram.messageBox(this, Integer.valueOf(MainProgram.numberOfPeople).toString());
    }
}
