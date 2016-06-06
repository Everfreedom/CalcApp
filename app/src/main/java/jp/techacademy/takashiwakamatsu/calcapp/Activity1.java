package jp.techacademy.takashiwakamatsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        editText1=(EditText) findViewById(R.id.editText1);
        editText2=(EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Activity2.class);

        double intInputValue1= Double.parseDouble(String.valueOf(editText1.getText()));
        double intInputValue2= Double.parseDouble(String.valueOf(editText2.getText()));
        int pushButton ;

        switch (v.getId()) {
            case R.id.button1:
                pushButton = 1;
                break;
            case R.id.button2:
                pushButton = 2;
                break;
            case R.id.button3:
                pushButton = 3;
                break;
            case R.id.button4:
                pushButton = 4;
                break;
            default:
                pushButton = 1;
                break;
        }

        intent.putExtra("PushButton", pushButton);
        intent.putExtra("EditText1Value", intInputValue1);
        intent.putExtra("EditText2Value", intInputValue2);

        startActivity(intent);

    }

}
