package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class FriendDetailsFragment extends Fragment {

    public FriendDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_friend_details, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        //For prototyping purpose only
        //launch Friend Activity Functionality
        ImageButton editFriendOption = (ImageButton)getActivity().findViewById(R.id.done_friend_editting_button);
        editFriendOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinChangeActivity = new Intent(getActivity(), DemoFeaturesActivity.class);
                getActivity().startActivity(pinChangeActivity);

            }
        });

    }
}
