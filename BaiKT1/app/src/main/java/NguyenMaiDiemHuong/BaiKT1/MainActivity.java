package NguyenMaiDiemHuong.BaiKT1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername;
    EditText edtpass;
    TextView KQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtusername=(EditText) findViewById(R.id.edtUserName);
        edtpass=(EditText) findViewById(R.id.edtPass);
        KQ=(TextView) findViewById(R.id.tv1);
    }
    public void iLogin(View v){
        int dem = 0;
        if(edtusername.equals("maicuongtho") && edtpass.equals("Cntt60ntu!")){
            Toast.makeText(this, "User and Password is correct", Toast.LENGTH_SHORT).show();
            dem++;
            KQ.setText(String.valueOf(dem));
        }else{
            Toast.makeText(this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}