package com.example.sai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sai.myapplication.Dijk.Main;
import com.example.sai.myapplication.Dijk.ShortestPath;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
/*
import static com.example.sai.myapplication.R.array;
*/
import static com.example.sai.myapplication.R.id;
import static com.example.sai.myapplication.R.layout;



public class MainActivity extends AppCompatActivity {
    public Main start;
    public ShortestPath sp;
    Button button;
    EditText mEdit;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=new Main();

        }
    public void chall(View view){

        button=(Button)findViewById(R.id.submit);
        mEdit   = (EditText)findViewById(R.id.editText1);
        String initial=mEdit.getText().toString();
        mEdit   = (EditText)findViewById(R.id.editText2);
        String destination=mEdit.getText().toString();

        save(initial,destination);
        //Log.d("shreyah",sp.ans);
        updatetextview();

        //startNewActivity(initial,destination);
        //Intent intent1 =new Intent(MainActivity.this,Main2Activity.class);

        //MainActivity.this.startActivity(intent1);

    }
    public void save(String initial,String destiniation)
    {
        int src=0,dest=0;
        if(initial.equals("Mumbai"))
        {

            src=1;
        }
        else if(initial.equals("Chennai"))
        {
            src=2;
        }
        else if(initial.equals("Surat"))
        {
            src=3;
        }

        else if(initial.equals("Bangalore"))
        {
            src=4;
        }
        else if(initial.equals("Nagpur"))
        {
            src=5;
        }
        else if(initial.equals("Goa"))
        {
            src=6;

        }
        else if(initial.equals("Nashik"))
        {
            src=0;
        }

        if(destiniation.equals("Mumbai"))
        {
            dest=1;
        }
        else if(destiniation.equals("Chennai"))
        {
            dest=2;
        }
        else if(destiniation.equals("Surat"))
        {
            dest=3;
        }

        else if(destiniation.equals("Bangalore"))
        {
            dest=4;
        }
        else if(destiniation.equals("Nagpur"))
        {
            dest=5;
        }
        else if(destiniation.equals("Goa"))
        {
            dest=6;
        }
        else if(destiniation.equals("Nashik"))
        {
            dest=0;
        }
        show(src,dest);

    }


    public void show(int src,int dest) {

        start.hello(src,dest);
    }
    public void updatetextview()
    {

        textView=(TextView)findViewById(R.id.textView2);
        //String s=getIntent().getStringExtra("ans");
        textView.setText(ShortestPath.finalans);
    }

}