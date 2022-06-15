package ntu.sqllite_book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThemActivity extends AppCompatActivity {
    EditText mMasach,mTenSach,mSoTrang,mGiaSach,mMoTa;
    Button mThemSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);
        mThemSach=(Button) findViewById(R.id.btnThemSach);
        mMasach=(EditText) findViewById(R.id.edtMaSach);
        mTenSach=(EditText) findViewById(R.id.edtTenSach);
        mSoTrang=(EditText) findViewById(R.id.edtSoTrang);
        mGiaSach=(EditText) findViewById(R.id.edtGiaSach);
        mMoTa=(EditText) findViewById(R.id.edtMoTa);
        
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Thêm sách mới");
        }
    }
    public void ThemSach(View v){
        TextView MaSach=findViewById(R.id.edtMaSach);
        TextView TenSach=findViewById(R.id.edtTenSach);
        TextView SoTrang=findViewById(R.id.edtSoTrang);
        TextView GiaSach=findViewById(R.id.edtGiaSach);
        TextView MoTa=findViewById(R.id.edtMoTa);
        Intent myintent=new Intent(ThemActivity.this,MainActivity.class);
        
        if(MaSach.getText().toString().trim().equals("")||TenSach.getText().toString().trim().equals("")||SoTrang.getText().toString().trim().equals("")||GiaSach.getText().toString().trim().equals("")||MoTa.getText().toString().trim().equals("")){
            Toast.makeText(this, "Vui lòng không để trống", Toast.LENGTH_SHORT).show();
        }else{
            Bundle b =new Bundle();
            int ma=Integer.parseInt(mMasach.getText().toString());
            b.putInt("MS",ma);
            b.putString("TS",mTenSach.getText().toString());
            int sotrang=Integer.parseInt(mSoTrang.getText().toString());
            b.putInt("ST",sotrang);
            float gia = Float.parseFloat(mGiaSach.getText().toString());
            b.putFloat("GIA",gia);
            b.putString("MT",mMoTa.getText().toString());
            myintent.putExtra("data",b);
            startActivity(myintent);
        }
    }
}