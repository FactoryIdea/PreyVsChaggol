package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

/**
 * Created by SHAKTI SINGH on 22-11-2015.
 * Class to Store all the constants
 * and all the utility methods
 */
public class ConstantsAndUtility {
    public static String DEFAULT_PIN ="0000";
    public static int   PIN_LENGTH =4;
    public static boolean changePin(Context context,String currentPin ,String newPin,String confirmPin){
        boolean isValid =false;
        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.login_pin), Context.MODE_PRIVATE);
        String validPin =sharedPref.getString(context.getString(R.string.login_pin), ConstantsAndUtility.DEFAULT_PIN);

        if(currentPin.equals(validPin)){
            if(newPin.length()==ConstantsAndUtility.PIN_LENGTH) {
                if (newPin.equals(confirmPin)) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString(context.getString(R.string.login_pin), newPin);
                    editor.commit();
                    Toast.makeText(context, "Pin Changed Successfully", Toast.LENGTH_LONG).show();
                    isValid = true;
                } else {
                    Toast.makeText(context, "New Pin and confirm Pin didn't match. Try again", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(context, "Pin Should exactly be of "+ConstantsAndUtility.PIN_LENGTH+" digits", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(context,"Invalid Current Pin. Try again",Toast.LENGTH_LONG).show();
        }
        return isValid;
    }

}
