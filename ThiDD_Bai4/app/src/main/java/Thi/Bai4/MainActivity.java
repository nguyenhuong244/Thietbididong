package Thi.Bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase databaseBook;
    boolean ktra = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseBook = SQLiteDatabase.openOrCreateDatabase("/data/data/Thi.Bai4/MyBook.db", null);
        TaoBangVaThemDuLieu();
        NapSACHvaoListview();
    }
    public void NapSACHvaoListview() {
        ListView listView = (ListView) findViewById(R.id.lvGhiChu);
        ArrayList<String> dsGhichu = new ArrayList<String>();

        Cursor cs = databaseBook.rawQuery("SELECT * FROM GHICHU", null);
        cs.moveToFirst();

        while (true) {
            if (cs.isAfterLast() == true) break;
            int ms = cs.getInt(0);
            String ghichu = cs.getString(1);
            Float mucdo = cs.getFloat(3);
            String dong = String.valueOf(ms) + "--- " +
                    ghichu + " ----" + String.valueOf(mucdo);

            dsSach.add(dong);

            cs.moveToNext();

        }

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                dsSach);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView edChon = (TextView) findViewById(R.id.edtMaCHON);
                edChon.setText(String.valueOf(i+1));
            }
        });
    }
    void TaoBangVaThemDuLieu() {
        if(ktra)
            ktra = false;
        else if (ktra == false)
            return;

        String sqlXoaBang = "DROP TABLE IF EXISTS GHICHU";
        databaseBook.execSQL(sqlXoaBang);
        String sqlTaoBang = "CREATE TABLE GHICHU(     GhichuID integer PRIMARY KEY AUTOINCREMENT, " +
                "   ND text, " +
                "   MucDo interger)";
        databaseBook.execSQL(sqlTaoBang);

        String sqlThem1 = "INSERT INTO GHICHU VALUES('Thi di động',1)";
        databaseBook.execSQL(sqlThem1);
        String sqlThem2 = "INSERT INTO GHICHU VALUES('Thi mạng không dây', 3)";
        databaseBook.execSQL(sqlThem2);
        String sqlThem3 = "INSERT INTO GHICHU VALUES('Thi thiết kế', 2) ";
        databaseBook.execSQL(sqlThem3);
        String sqlThem4 = "INSERT INTO GHICHU VALUES('Thi Linux', 1)";
        databaseBook.execSQL(sqlThem4);
    }
}