package css.evanmumbleau.exam1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tvInPut;
    static TextView tvResult;
    int Input;
    Button btnPushMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInPut = (EditText) findViewById(R.id.editText1);
        tvResult = (TextView) findViewById(R.id.tvResult);


        //Input = int.parseInt(tvInPut.getText().toString());



    }

    public void onClickButn (View view) {
        tvResult.setText(tvInPut + "is a great android programmer!");

    }
    }

