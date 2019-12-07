package com.animeshroy.notekeeper.testapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity implements MyCustomDialog.OnInputListener {

    private static final String TAG = "FirstActivity";

    // widgets
    private Button mOpenDialog;
    public TextView mInputDisplay;


    @Override
    public void sendInput(String input) {
        Log.e(TAG, "got the input: " + input);
        mInputDisplay.setText(input);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mOpenDialog = findViewById(R.id.open_dialog);
        mInputDisplay = findViewById(R.id.input_display);

        mOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomDialog dialog = new MyCustomDialog();
                dialog.show(getSupportFragmentManager(), "MyCustomDialog");
            }
        });

    }

}
