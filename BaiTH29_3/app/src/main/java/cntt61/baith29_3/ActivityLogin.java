package cntt61.baith29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void iQuiz(View v){
        EditText edusername = (EditText) findViewById(R.id.edtUserName);

        String username = edusername.getText().toString();

        Intent iKQ = new Intent();

        iKQ.putExtra("UN",username);

        setResult(RESULT_OK, iKQ);
        finish();
    }
}