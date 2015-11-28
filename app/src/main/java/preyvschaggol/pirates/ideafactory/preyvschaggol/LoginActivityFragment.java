package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class LoginActivityFragment extends Fragment {

    public LoginActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        //login Activity
        final EditText loginText = (EditText)getActivity().findViewById(R.id.pinText);
        ImageButton loginButton =(ImageButton)getActivity().findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getActivity();
                SharedPreferences sharedPref = context.getSharedPreferences(
                        getString(R.string.login_pin), Context.MODE_PRIVATE);
                String validString =sharedPref.getString(getString(R.string.login_pin), ConstantsAndUtility.DEFAULT_PIN);
               // Toast.makeText(getActivity(),validString,Toast.LENGTH_LONG).show();
                boolean isValidLogin =loginText.getText().toString().equals(validString);
                if(isValidLogin){
                    Intent demoActivity = new Intent(getActivity(),DemoFeaturesActivity.class);
                    getActivity().startActivity(demoActivity);
                    getActivity().finish();
                }
                else{
                    Toast.makeText(getActivity(),"Invalid Pin",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
