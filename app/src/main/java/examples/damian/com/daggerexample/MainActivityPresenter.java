package examples.damian.com.daggerexample;

import android.view.View;
import android.widget.TextView;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    public int getSum(int first, int second) {
        return first + second;
    }

    public View.OnClickListener getButtonOnClickListener(final TextView textView, final String text) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(text);
            }
        };
    }


}
