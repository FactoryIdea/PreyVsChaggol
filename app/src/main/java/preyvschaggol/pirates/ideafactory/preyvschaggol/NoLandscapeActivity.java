package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public abstract class NoLandscapeActivity extends ActionBarActivity {
    //Activity which prevents app from going on landscape mode

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }



}
