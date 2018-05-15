package examples.damian.com.daggerexample;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppInjector {

    @Provides
    @Singleton
    MainActivityContract.Presenter provideMainActivityContractPresenter() {
        return new MainActivityPresenter();
    }

    @Provides
    @Singleton
    MainActivityContract.View provideMainActivityContractView() {
        return new MainActivityFragment();
    }

}
