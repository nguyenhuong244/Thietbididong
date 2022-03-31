package cntt61.h61133717;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void quayve(View v){
        Intent quaylai = new Intent(this, MainActivity.class);
        startActivity(quaylai);
    }
}
