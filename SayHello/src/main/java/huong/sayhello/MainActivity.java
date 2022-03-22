package huong.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Ham_Xin_Chao(android.view.View v){
        Toast.makeText(MainActivity.this, "Xin chào, tôi là Hương", Toast.LENGTH_SHORT).show();
    }
}