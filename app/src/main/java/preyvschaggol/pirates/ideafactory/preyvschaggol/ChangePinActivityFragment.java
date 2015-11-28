package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

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

                boolean isValid =ConstantsAndUtility.changePin(getActivity(),currentPin, newPin, confirmPin);
                if(isValid) {
                    getActivity().finish();
                }
            }
        });



    }


}
