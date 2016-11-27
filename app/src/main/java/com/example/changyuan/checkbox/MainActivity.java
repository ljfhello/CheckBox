package com.example.changyuan.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
private CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb=(CheckBox) findViewById(R.id.checkBox1);
        cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
        {
            //获得CheckBox的文本内容
            String text=cb.getText().toString();
            Log.i("tog",text); 
        }
    }
}
