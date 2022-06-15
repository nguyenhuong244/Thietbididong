package Thi.Bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity    {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        textView = (TextView) findViewById(R.id.tvhello);
        Intent i = getIntent();
        Bundle b = i.getBundleExtra("data");
        String Name = b.getString("US");
        textView.setText("Hello "+Name);
    }
}