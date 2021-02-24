package com.videoanalysis.BL;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ss, qk1, jx, qk2, txsp, aqy, yk, tj;
    private EditText ssk, jxk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ss=(Button) findViewById(R.id.ss);
        qk1=(Button) findViewById(R.id.qk1);
        jx=(Button) findViewById(R.id.jx);
        qk2=(Button) findViewById(R.id.qk2);
        txsp=(Button) findViewById(R.id.txsp);
        aqy=(Button) findViewById(R.id.aqy);
        yk=(Button) findViewById(R.id.yk);
        tj=(Button) findViewById(R.id.tj);

        ssk=(EditText)findViewById(R.id.ssk);
        jxk=(EditText)findViewById(R.id.jxk);

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText=ssk.getText().toString();
                final Uri uri=Uri.parse("https://m.baidu.com/s?word="+inputText);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        qk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ssk.setText("");
                //Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
            }
        });
        jx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputText=jxk.getText().toString();
                final Uri uri=Uri.parse("https://www.kiwi8.top/mov/s/?url="+inputText);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        qk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                jxk.setText("");
            }
        });
        txsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final Uri uri=Uri.parse("https://m.v.qq.com/index.html");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        aqy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final Uri uri=Uri.parse("https://m.iqiyi.com/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        yk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final Uri uri=Uri.parse("https://youku.com/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final Uri uri=Uri.parse("https://m.baidu.com/sf?from_sf=1&word=%E7%94%B5%E5%BD%B1%E6%8E%A8%E8%8D%90&ms=1&title=%E7%94%B5%E5%BD%B1%E6%8E%A8%E8%8D%90&resource_id=4469&top={%22sfhs%22:0}&dspName=iphone&openapi=1&tn=tangram&pd=movie_general&ext={%22sf_tab_name%22:%22%E7%94%B5%E5%BD%B1%22}&alr=1&new_aeks=1&aeks_type=aeks_1\n" +
                        " \n");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}