package NguyenMaiDiemHuong.BaiKT1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername;
    EditText edtpass;
    TextView KQ;
    Button btnlg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtusername=(EditText) findViewById(R.id.edtUserName);
        edtpass=(EditText) findViewById(R.id.edtPass);
        KQ=(TextView) findViewById(R.id.tv1);
        btnlg=(Button) findViewById(R.id.btnLG);
        btnlg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dem = 0;
                String username = "maicuongtho";
                String password = "Cntt60ntu!";
                if(edtusername.getText().toString().equals(username) && edtpass.getText().toString().equals(password)){
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
                    dem++;
                    KQ.setText(String.valueOf(dem));
                }
            }
        });
    }
}