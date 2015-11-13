package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.content.Intent;
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
        final EditText loginText = (EditText)getActivity().findViewById(R.id.pinText);
        ImageButton loginButton =(ImageButton)getActivity().findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginText.getText().toString().equals("1123")){
                    Intent demoActivity = new Intent(getActivity(),DemoFeaturesActivity.class);
                    getActivity().startActivity(demoActivity);
                }
                else{
                    Toast.makeText(getActivity(),"Invalid Pin",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
