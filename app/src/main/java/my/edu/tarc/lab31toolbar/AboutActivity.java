package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    private WebView webViewAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webViewAbout=(WebView)findViewById(R.id.webViewAbout);
        webViewAbout.loadUrl("https://bait2073.000webhostapp.com/welcome.html");
    }
}
