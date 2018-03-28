package com.example.cjcu.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText eDitText;
    private EditText eDitText2;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();

    }

    private void findviews() {
        eDitText = findViewById(R.id.EDitText);
        eDitText2 = findViewById(R.id.EditText2);
        button2 = findViewById(R.id.button2);
    }

    public void calbmi(View view) {
        float w=Float.parseFloat(eDitText.getText().toString());
        float h=Float.parseFloat(eDitText2.getText().toString());
        float bmi=w/(h*h);
        Log.d( "BMI=",String.valueOf(bmi));
        Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();

    }
}
