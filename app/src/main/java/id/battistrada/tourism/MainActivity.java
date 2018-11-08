package id.battistrada.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnnews = (ImageButton)findViewById(R.id.btn_news);
        btnnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(news);
            }
        });

        ImageButton btndestination = (ImageButton)findViewById(R.id.btn_destination);
        btndestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destination = new Intent(MainActivity.this, DestinationActivity.class);
                startActivity(destination);
            }
        });
    }
}
