package huong.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText dk_nang, dk_cao;
    TextView KQ1,KQ2;
    Button bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dk_nang=(EditText) findViewById(R.id.edtnang);
        dk_cao=(EditText) findViewById(R.id.edtcao);
        bmi=(Button) findViewById(R.id.bt);
        KQ1=(TextView) findViewById(R.id.tvkq1);
        KQ2=(TextView) findViewById(R.id.tvkq2);
    }
    public void BMI(View v){
        float nang=Float.parseFloat(dk_nang.getText().toString());
        float cao=Float.parseFloat(dk_cao.getText().toString());
        float KetQua;
        KetQua=nang/(cao*cao);
        KQ1.setText(String.valueOf(KetQua));
        if(KetQua<18.5){
            KQ2.setText("Cân nặng thấp(gầy)");
        }else if(KetQua>=18.5 && KetQua<=24.9){
            KQ2.setText("Bình thường");
        }else if(KetQua==25){
            KQ2.setText("Thừa cân");
        }else if(KetQua>25 && KetQua<=29.9){
            KQ2.setText("Tiền béo phì");
        }else if(KetQua>=30 && KetQua<=34.9){
            KQ2.setText("Béo phì độ I");
        }else if(KetQua>=35 && KetQua<=39.9){
            KQ2.setText("Béo phì độ II");
        }else{
            KQ2.setText("Béo phì độ III");
        }
    }
}