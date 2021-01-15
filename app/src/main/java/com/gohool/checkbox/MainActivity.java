package com.gohool.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox grandpaCheckBox;

    private Button button;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = (CheckBox) findViewById(R.id.momId);
        dadCheckBox = (CheckBox) findViewById(R.id.dadId);
        grandpaCheckBox = (CheckBox) findViewById(R.id.grandpaId);
        button = (Button) findViewById(R.id.buttonId);
        resultText = (TextView) findViewById(R.id.resultShowId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + " status is : "
                                     + momCheckBox.isChecked() + "\n");
                stringBuilder.append(dadCheckBox.getText().toString() + " status is : "
                        + dadCheckBox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckBox.getText().toString() + " status is : "
                        + grandpaCheckBox.isChecked() + "\n");


                resultText.setText(stringBuilder);
            }
        });
    }
}