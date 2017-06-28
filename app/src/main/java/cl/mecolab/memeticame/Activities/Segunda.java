package cl.mecolab.memeticame.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import android.widget.Button;

import cl.mecolab.memeticame.R;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        WebView wb = (WebView) findViewById(R.id.hola);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www.google.cl");
        final AppCompatActivity a = this;
        Button btn3 =  findViewById(R.id.button);
        Button btn4 =  findViewById(R.id.button2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(a, MainActivity.class);
                startActivity(act);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Segunda.super.onBackPressed();
            }
        });
    }
}
