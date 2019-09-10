package com.example.mydemoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_TinhDientich(View v)
    {
        EditText editCdai = (EditText)findViewById(R.id.editText_chieudai);
        int cdai = Integer.parseInt(editCdai.getText()+"");
        EditText editCrong = (EditText)findViewById(R.id.editText_chieurong);
        int crong = Integer.parseInt(editCrong.getText()+"");
        TextView txtKQDientich = (TextView)findViewById(R.id.textView_KQDientich);
        txtKQDientich.setText((cdai*crong) + "");
        TextView txtKQChuvi = (TextView)findViewById(R.id.textView_KQChuvi);
        txtKQChuvi.setText(((cdai*crong)/2) + "");
    }
}
