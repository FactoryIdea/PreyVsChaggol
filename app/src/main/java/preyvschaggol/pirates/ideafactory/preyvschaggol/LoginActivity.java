package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LoginActivity extends NoLandscapeNoActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //if the value is default value
        setContentView(R.layout.activity_login);
        Context context = getApplicationContext();
        SharedPreferences sharedPref = context.getSharedPreferences(
                getString(R.string.login_pin), Context.MODE_PRIVATE);
        String validPin =sharedPref.getString(getString(R.string.login_pin), ConstantsAndUtility.DEFAULT_PIN);
        if(validPin.equals(ConstantsAndUtility.DEFAULT_PIN)){
            Intent registerActivity = new Intent(this,SignUP.class);
            startActivity(registerActivity);
            finish();
        }

    }




}
