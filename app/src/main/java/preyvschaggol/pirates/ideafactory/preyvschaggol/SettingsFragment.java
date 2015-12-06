package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

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
        //Back Button Functionality
        ImageButton backButton = (ImageButton)getActivity().findViewById(R.id.settings_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });


        //launch pin change activity
        Button pinChangeOption = (Button)getActivity().findViewById(R.id.pinChangeOption);
        pinChangeOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinChangeActivity = new Intent(getActivity(), ChangePinActivity.class);
                getActivity().startActivity(pinChangeActivity);

            }
        });

        //launch Friend Activity Functionality
        Button editFriendOption = (Button)getActivity().findViewById(R.id.friendEditOption);
        editFriendOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinChangeActivity = new Intent(getActivity(),FriendDetails.class);
                getActivity().startActivity(pinChangeActivity);

            }
        });


    }
}
