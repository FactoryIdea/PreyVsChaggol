package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class SettingsFragment extends Fragment {

    public SettingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button pinChangeOption = (Button)getActivity().findViewById(R.id.pinChangeOption);
        Toast.makeText(getActivity(), "yo", Toast.LENGTH_LONG).show();
        pinChangeOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //launch pin change activity
                Intent pinChangeActivity = new Intent(getActivity(), ChangePinActivity.class);
                getActivity().startActivity(pinChangeActivity);
                Toast.makeText(getActivity(), "yo", Toast.LENGTH_LONG).show();
            }
        });
    }
}
