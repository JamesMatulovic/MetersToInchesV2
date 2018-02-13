package com.google.metrestoinches.meterstoinchesv2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

          /*
            1m = 39.3701 inches
       */
    private EditText textInput;
    private Button convertButton ;
    private TextView resultText;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.textInputId);
        convertButton = findViewById(R.id.buttonId);
        resultText = findViewById(R.id.resultId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0;

                if (textInput.getText().toString().equals("")) {
                    resultText.setText(R.string.error_message);
                    resultText.setTextColor(Color.RED);
                }

                else {
                    resultText.setTextColor(Color.BLUE);
                double meterValue = Double.parseDouble(textInput.getText().toString());
                result = meterValue * multiplier;
                resultText.setText(String.format("%.2f", result) + " inches");
            }}
        });



    }
}
