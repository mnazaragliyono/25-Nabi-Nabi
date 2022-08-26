package nabi.nabi.apk;

import nabi.nabi.apk.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class Muqodimah extends Activity {
   /** Called when the activity is first created. */
   @SuppressLint("SetJavaScriptEnabled")
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.act_muqodimah);
        
       WebView wBrowser = (WebView) findViewById(R.id.wBrowser);
       wBrowser.getSettings().setJavaScriptEnabled(true);
       wBrowser.loadUrl("file:///android_asset/www/page/contentMuqodimah.html");   
   };
}
