/**
 * Splash screen activity
 *
 * @author Catalin Prata
 */

package nabi.nabi.apk;

import nabi.nabi.apk.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
 
public class Wassalaamualaikum extends Activity {
    // used to know if the back button was pressed in the splash screen activity and avoid opening the next activity
    private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 2000; // 2 seconds
 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_wassalaamualaikum);
        Handler handler = new Handler();
        // run a thread after 2 seconds to start the home screen
        handler.postDelayed(new Runnable() {
 
            @Override
            public void run() {
                // make sure we close the splash screen so the user won't come back when it presses back key 
                if (!mIsBackButtonPressed) {
        			finish();
               }          
            }
        }, SPLASH_DURATION); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called
    }
 
    @Override
    public void onBackPressed() {
        // set the flag to true so the next activity won't start up
        mIsBackButtonPressed = true;
        super.onBackPressed(); 
    }
}