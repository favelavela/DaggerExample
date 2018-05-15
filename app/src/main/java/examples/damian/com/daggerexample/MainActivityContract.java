package examples.damian.com.daggerexample;

import android.widget.TextView;

public interface MainActivityContract {

    interface Presenter {
        int getSum(int first, int second);
        android.view.View.OnClickListener getButtonOnClickListener(final TextView textView, final String text);
    }

    interface View {

    }
}
