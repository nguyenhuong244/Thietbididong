package cntt61.baith29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode==RESULT_OK){
            String usernameNhanDuoc = data.getStringExtra("UN");
            TextView tvUN = (TextView) findViewById(R.id.tvUserName);
            tvUN.setText(usernameNhanDuoc);
        }
        else
            Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
            super.onActivityResult(requestCode,resultCode,data);
    }
}