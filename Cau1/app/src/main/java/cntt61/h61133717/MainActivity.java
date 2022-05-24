package cntt61.h61133717;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a,b,h;
    TextView KQcv,KQdt;
    Button cv,dt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText) findViewById(R.id.edta);
        b=(EditText) findViewById(R.id.edtb);
        h=(EditText) findViewById(R.id.edth);
        cv=(Button) findViewById(R.id.btcv);
        dt=(Button) findViewById(R.id.btdt);
        KQcv=(TextView) findViewById(R.id.tvcv);
        KQdt=(TextView) findViewById(R.id.tvdt);
    }
    public void KetQua(View v){
        float Nhapa=Float.parseFloat(a.getText().toString());
        float Nhapb=Float.parseFloat(b.getText().toString());
        float Nhaph=Float.parseFloat(b.getText().toString());
        float Ketquacv,Ketquadt;
        Ketquacv=2*(Nhapa+Nhapb);
        KQcv.setText(String.valueOf(Ketquacv));
        Ketquadt=Nhapa*Nhaph;
        KQdt.setText(String.valueOf(Ketquadt));
    }
}