package ntu.bookman;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase databaseBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tao database
        databaseBook = SQLiteDatabase.openOrCreateDatabase("/data/data/ntu.bookman/MyBook.db", null);
        // Ta che hàm này lại, ở những lần chạy sau
        // Vì ta không muốn khơi tại lại CSDL từ đầu
        //TaoBangVaThemDULieu();
        NapVaoListView();
    }
    void NapVaoListView() {
        //1. lay tham chieu den danh listview trong layout
        ListView listView = (ListView) findViewById(R.id.lvSach);
        //2. nguồng dữ liệu
        // Mỗi phần tử là một string, gồm: tên giá
        ArrayList<String> dsSach = new ArrayList<String>();
       // Mở DB, select dữ liệu, đưa vào Arratlisst
        //----------------
        Cursor cs = databaseBook.rawQuery("SELECT * FROM BOOK",null);
        cs.moveToFirst();
        // Duyệt từng dòng(Bảng ghi), Tính toán
        while (true)
        {
            if (cs.isAfterLast() == false) break;
            // Lấy mã sách
            int ms = cs.getInt(0); // cột 0 , ở cột hiện tại
            // lấy tên sach
            String tensach = cs.getString(1);
            // lấy giá bán
            Float giasach = cs.getFloat(3);
            String dong = String.valueOf(ms)+ "----"+
                    tensach + "---"+ String.valueOf(giasach);
            // đưa vao arrayList
            dsSach.add(dong);
            // samh dòng bảng ghi tiếp
            cs.moveToNext();
        }

     /*   dsSach.add("Thử xem sao");
        dsSach.add("them thử xem sao");*/

        //---------------
        //3. Adapter
        ArrayAdapter adapter = new ArrayAdapter( this,
                android.R.layout.simple_list_item_1,dsSach);
        //Gắn vào ListView
        listView.setAdapter(adapter);

    }


    //======================================
       void TaoBangVaThemDULieu(){
            // SQL xoa bang
            String sqlXoaBang = "DROP TABLE IF EXISTS";

        //Lenh tao bang
        String sqlTaoBang="CREATE TABLE BOOKS(BookID integer PRIMARY KEY," +
                " BookName text,\n" +
                "Page integer," +
                " Price Float," +
                " Description text)";
        databaseBook.execSQL(sqlTaoBang);

        String sqlThem1 = "INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về\n" + "java')";
        databaseBook.execSQL(sqlThem1);

        String sqlThem2 = "INSERT INTO BOOKS VALUES(2, 'Android', 320, 19.00, 'Android cơ\n" +
                "bản')";
        databaseBook.execSQL(sqlThem2);

        String sqlthem3 ="INSERT INTO BOOKS VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc\n" +
                "cho vui')";
        databaseBook.execSQL(sqlthem3);

        String sqlThem4 ="INSERT INTO BOOKS VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ\n" +
                "điển 100.000 từ')";
        databaseBook.execSQL(sqlThem4);


    }



}