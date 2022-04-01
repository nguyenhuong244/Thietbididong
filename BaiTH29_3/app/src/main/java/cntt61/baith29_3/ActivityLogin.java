package cntt61.baith29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void iQuiz(View v){
        Intent quaylai = new Intent(this, ActivityHome.class);
        startActivity(quaylai);
    }
}