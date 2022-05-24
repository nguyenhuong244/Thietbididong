package cntt61.h61133717;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase databaseTho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseTho = SQLiteDatabase.openOrCreateDatabase("/data/data/cntt61.h61133717/MyBook.db", null);
        TaoBangVaThemDuLieu();
        NapSACHvaoListview();
    }
    void TaoBangVaThemDuLieu() {
        String sqlXoaBang = "DROP TABLE IF EXISTS THO";
        databaseTho.execSQL(sqlXoaBang);
        String sqlTaoBang = "CREATE TABLE THO(     ThoID integer PRIMARY KEY, " +
                "   Ten, " +
                "   TacGia)";
        databaseTho.execSQL(sqlTaoBang);
        String sqlThem1 = "INSERT INTO THO VALUES(1, 'Đường Về Quê Mẹ', 'Đoàn Văn Cừ')";
        databaseTho.execSQL(sqlThem1);
        String sqlThem2 = "INSERT INTO THO VALUES(2, 'Việt Nam Quê Hương Ta', 'Nguyễn Đình Thi')";
        databaseTho.execSQL(sqlThem2);
        String sqlThem3 = "INSERT INTO THO VALUES(3, 'Quê Hương', 'Nguyễn Đình Huân') ";
        databaseTho.execSQL(sqlThem3);
        String sqlThem4 = "INSERT INTO THO VALUES(4, 'Tràng Giang', 'Huy Cận')";
        databaseTho.execSQL(sqlThem4);
        String sqlThem5 = "INSERT INTO THO VALUES(5, 'Đất Nước', 'Nguyễn Đình Thi')";
        databaseTho.execSQL(sqlThem5);
    }
    void NapSACHvaoListview() {
        ListView listView = (ListView) findViewById(R.id.lvTho);
        ArrayList<String> dsTho = new ArrayList<String>();
        Cursor cs = databaseTho.rawQuery("SELECT * FROM THO", null);
        cs.moveToFirst();
        while (true) {
            if (cs.isAfterLast() == true) break;
            int ms = cs.getInt(0);
            String tenTho = cs.getString(1);
            String tacgia = cs.getString(2);
            String dong = String.valueOf(ms) + " --- " +
                    tenTho + "----" + String.valueOf(tacgia);
            dsTho.add(dong);
            cs.moveToNext();

        }

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                dsTho);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String dongChon = dsTho.get(i);
                int k = dongChon.indexOf(" ");
                String ma = dongChon.substring(0, k);
                EditText edChon = (EditText) findViewById(R.id.edtMaCHON);
                edChon.setText(ma);
            }
        });
    }
}