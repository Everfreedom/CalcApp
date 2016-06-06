package jp.techacademy.takashiwakamatsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("EditText1Value", 0);
        double value2 = intent.getDoubleExtra("EditText2Value", 0);
        int pushButton = intent.getIntExtra("PushButton",0);
        double result;

        switch (pushButton) {
            case 1:
                result = value1 + value2;
                break;
            case 2:
                result = value1 - value2;
                break;
            case 3:
                result = value1 * value2;
                break;
            case 4:
                result = value1 / value2;
                break;
            default:
                result = value1 + value2;
                break;
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(result));


    }
}

