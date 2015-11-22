package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Context;
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
public class ChangePinActivityFragment extends Fragment {

    public ChangePinActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_change_pin, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        //changing Pin of user
        ImageButton changePinButton = (ImageButton)getActivity().findViewById(R.id.change_pin_button);
        changePinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText currentPinEditText = (EditText) getActivity().findViewById(R.id.currentPin);
                String currentPin = currentPinEditText.getText().toString();

                EditText newPinEditText = (EditText) getActivity().findViewById(R.id.newPin);
                String newPin = newPinEditText.getText().toString();

                EditText confirmPinEditText = (EditText) getActivity().findViewById(R.id.confirmPin);
                String confirmPin = confirmPinEditText.getText().toString();

                changePin(currentPin, newPin, confirmPin);
            }
        });



    }

    private void changePin(String currentPin ,String newPin,String confirmPin){
        Context context = getActivity();
        SharedPreferences sharedPref = context.getSharedPreferences(
                getString(R.string.login_pin), Context.MODE_PRIVATE);
        String validPin =sharedPref.getString(getString(R.string.login_pin), Constants.DEFAULT_PIN);

        if(currentPin.equals(validPin)){
            if(newPin.length()==Constants.PIN_LENGTH) {
                if (newPin.equals(confirmPin)) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString(getString(R.string.login_pin), newPin);
                    editor.commit();
                    Toast.makeText(getActivity(), "Pin Changed Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getActivity(), "New Pin and confirm Pin didn't match. Try again", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(getActivity(), "Pin Should exactly be of "+Constants.PIN_LENGTH+" digits", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(getActivity(),"Invalid Current Pin. Try again",Toast.LENGTH_LONG).show();
        }
    }


}
