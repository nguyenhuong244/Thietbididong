package cntt61.h61133717;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    public void quayve(View v){
        Intent quaylai = new Intent(this, MainActivity.class);
        startActivity(quaylai);
    }
}