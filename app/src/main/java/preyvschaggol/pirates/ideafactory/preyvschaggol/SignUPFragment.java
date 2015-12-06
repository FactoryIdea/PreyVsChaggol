package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class SignUPFragment extends Fragment {

    public SignUPFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        ImageButton signupToFriend = (ImageButton)getActivity().findViewById(R.id.sign_up);
        signupToFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinChangeActivity = new Intent(getActivity(), FriendDetails.class);
                getActivity().startActivity(pinChangeActivity);

            }
        });
    }
}
