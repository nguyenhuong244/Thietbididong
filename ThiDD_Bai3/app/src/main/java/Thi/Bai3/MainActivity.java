package Thi.Bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtitem;
    ListView listView;
    ArrayList<String> arrayList=null;
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtitem=(EditText) findViewById(R.id.edtItem);
        listView=(ListView) findViewById(R.id.lv);
        arrayList = new ArrayList<>();

        arrayList.add("Rolling In The Deep");
        arrayList.add("Cơn mưa ngang qua");
        arrayList.add("Sao anh vô tình");
        arrayList.add("Em của ngày hôm qua");
        arrayList.add("Friday");
        arrayList.add("Sugar");
        arrayList.add("A little");
        arrayList.add("I can fly");
        arrayList.add("The Lazy Song");
        arrayList.add("Rolling In The Deep");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtitem.setText(arrayList.get(i));
            }
        });
    }
}