package preyvschaggol.pirates.ideafactory.preyvschaggol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class DemoFeaturesActivityFragment extends Fragment {

    public DemoFeaturesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_demo_features, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        //Sample code
        getActivity().findViewById(R.id.factory_reset__feature_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(),"Testing",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
