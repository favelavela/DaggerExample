package examples.damian.com.daggerexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivityFragment extends Fragment implements MainActivityContract.View {

    @Inject
    MainActivityContract.Presenter presenter;

    Button button;
    TextView textView;

    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((AppInitializer) getActivity().getApplication()).getDependencyComponent().inject(this);
        Log.e("The result is", presenter.getSum(5,3) + "" );
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        button = (Button) view.findViewById(R.id.button1);
        textView = (TextView) view.findViewById(R.id.text_view);
        button.setOnClickListener(presenter.getButtonOnClickListener(textView, "This works!!"));
        return view;
    }





}
