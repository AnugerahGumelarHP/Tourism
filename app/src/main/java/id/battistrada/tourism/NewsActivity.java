package id.battistrada.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("http:www.jogja-communitybased-tourism.com/");
        web.setWebViewClient(new WebViewClient());
    }
}
