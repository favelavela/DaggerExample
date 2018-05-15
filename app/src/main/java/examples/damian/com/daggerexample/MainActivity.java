package examples.damian.com.daggerexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((AppInitializer) getApplication()).getDependencyComponent().inject(this);
        Log.e("The main activity is", presenter.getSum(5,5) + "" );
    }

    public static Intent getLaunchIntent(Context activityContext ) {
        final Intent intent = new Intent();
        intent.setClass(activityContext, MainActivity.class);
        return intent;
    }

}
