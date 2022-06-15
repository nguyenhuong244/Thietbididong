package vn.ntu.sqlite_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo database Ghi chú
        database=new Database(this, "ghichu.sqlite",null,1);
        //tạo bảng CongViec
        database.QueryData("CREATE TABLE IF NOT EXISTS Congviec(Id INTERGER PRIMARY KEY AUTOINCREMENT, TenCV VARCHAR(200))");
        //insert data
        //database.QueryData("INSERT INTO Congviec VALUES(null, 'Làm bài tập')");

        //select data
        Cursor dataCongViec=database.GetData("SELECT * FROM Congviec");
        while(dataCongViec.moveToNext()){
            String ten = dataCongViec.getString(1);
            Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
        }
    }
}