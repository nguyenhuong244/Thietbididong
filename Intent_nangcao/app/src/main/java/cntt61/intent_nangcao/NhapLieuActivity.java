package cntt61.intent_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhapLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);
    }

    public void Nhap_QuayVe(View v){
        EditText edHT = (EditText) findViewById(R.id.edHoTen);
        EditText edNS = (EditText) findViewById(R.id.edNamSinh);
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());
        Intent iKQnhaplieu = new Intent();
        iKQnhaplieu.putExtra("HT",hoten);
        iKQnhaplieu.putExtra("NS",namsinh);
        setResult(RESULT_OK,iKQnhaplieu);
        finish();
    }

}