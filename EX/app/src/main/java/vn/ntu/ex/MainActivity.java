package vn.ntu.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //đọc và lưu vào TextView
    void ReadShareRef(){
        TextView view =(TextView) findViewById(R.id.textview);
        String myRef_file="myDict";
        //Lấy đối tượng để làm việc
        SharedPreferences mySH= getSharedPreferences(myRef_file,MODE_PRIVATE);
        //đọc
        String val1=mySH.getString("1","null");
        String val2=mySH.getString("2","null");
        //đưa vào TextView để xem
        String kk=val1+val2;
        view.setText(kk);
    }
    //tạo 1 file ref, lưu dữ liệu
    //key->value: 1-->one, 2-->two
    //file:myDict
    void SaveShareedRef(){
        String myRef_file="myDict";
        //Lấy đối tượng để làm việc
        SharedPreferences mySH= getSharedPreferences(myRef_file,MODE_PRIVATE);
        //muốn ghi,ta lấy đối tượng Editor
        SharedPreferences.Editor myEditor=mySH.edit();
        //tiến hành ghi
        myEditor.putString("1","one");
        myEditor.putString("2","two");
        myEditor.putString("3","three");
        //Lưu lại thay đổi
        myEditor.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SaveShareedRef();
    }
}