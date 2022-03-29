package cntt61.h61133717;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String baihat[]={"Sugar","Memories","Payphone"};
    String casi[]={"Maroon5","Maroon5","Maroon5"};
    Integer img[]={R.drawable.dl1,R.drawable.dl2,R.drawable.dl3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data adapter=new Data(this, baihat, casi,img);
        listView=(ListView)findViewById(R.id.lv);
        listView.setAdapter(adapter);
        TextView textView=(TextView) findViewById(R.id.txt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                textView.setText("Vị trí: "+position+" ; Bài hát: "+baihat[position]);
            }
        });
    }
}