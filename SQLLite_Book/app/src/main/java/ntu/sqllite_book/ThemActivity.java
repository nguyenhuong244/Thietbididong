package ntu.sqllite_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);
    }
//    public void Nhap_QuayVe(View v){
//        EditText edtNS = (EditText) findViewById(R.id.edtNhaSach);
//        EditText edtTS = (EditText) findViewById(R.id.edtTenSach);
//        EditText edtGS = (EditText) findViewById(R.id.edtGiaSach);
//        String nhasach = edtNS.getText().toString();
//        String tensach = edtNS.getText().toString();
//        String giasach = edtNS.getText().toString();
//        int namsinh = Integer.parseInt(edNS.getText().toString());
//        Intent iKQnhaplieu = new Intent();
//        iKQnhaplieu.putExtra("HT",nhasach);
//        iKQnhaplieu.putExtra("NS",tensach);
//        iKQnhaplieu.putExtra("NS",giasach);
//        setResult(RESULT_OK,iKQnhaplieu);
//        finish();
//    }
}