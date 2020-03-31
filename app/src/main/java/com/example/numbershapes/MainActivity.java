package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public boolean isItT(int j){
        int i=1,sum=0;
        while(sum<j)
        {
            sum+=i;
            if(sum==j)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public boolean isItS(int j){
        int i=1;
        int pro=0;
        while(pro<j)
        {   pro=i*i;
            if(pro==j)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public void clickF(View view)
    {
        EditText number=(EditText)findViewById(R.id.number);
        if(number.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter a no.", Toast.LENGTH_SHORT).show();
        }
        else
            {
            int a = Integer.parseInt(number.getText().toString());
            boolean s, t;
            s = isItS(a);
            t = isItT(a);
            if (s == true && t == true) {
                Toast.makeText(this, "It is a square as well as triangular number!", Toast.LENGTH_SHORT).show();
            } else if (s == true) {
                Toast.makeText(this, "It is a square number!", Toast.LENGTH_SHORT).show();
            } else if (t == true) {
                Toast.makeText(this, "It is a triangular number!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "It is neither a triangular number nor a square number!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
