package Thi.Bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.edtname);
        start=(Button) findViewById(R.id.btnstart);
    }
    public void Start(View v){
        Intent chuyen=new Intent(this, HelloActivity.class);
        startActivity(chuyen);
    }
}