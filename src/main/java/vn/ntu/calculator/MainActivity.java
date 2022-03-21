package vn.ntu.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText dk_soA,dk_soB;
    TextView dk_KQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dk_soA=(EditText) findViewById(R.id.edtA);
        dk_soB=(EditText) findViewById(R.id.edtB);
        dk_KQ=(TextView) findViewById(R.id.edtResurt);
        nutCong=(Button) findViewById(R.id.btnAdd);
        nutTru=(Button) findViewById(R.id.btnSub);
        nutNhan=(Button) findViewById(R.id.btnMul);
        nutChia=(Button) findViewById(R.id.btnDiv);
    }
    public void Xuly_Cong(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua;
        if(dk_soA.getText().toString().equals("")==false && dk_soB.getText().toString().equals("")==false){
            KetQua = soA+soB;
        }
        else{
            if(dk_soA.getText().toString().equals("")==false){
                KetQua = 0+soA;
            }
            else{
                KetQua = 0+soB;
            }
        }
        if(dk_soA.getText().toString().equals("")==true && dk_soB.getText().toString().equals("")==true){
            dk_KQ.setText("0.0");
        }
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Tru(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua = soA-soB;
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Nhan(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua = soA*soB;
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Chia(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua = soA/soB;
        dk_KQ.setText(String.valueOf(KetQua));
    }
}