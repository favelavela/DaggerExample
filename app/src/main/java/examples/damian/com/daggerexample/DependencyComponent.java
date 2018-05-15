package examples.damian.com.daggerexample;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AppInjector.class})
public interface DependencyComponent {

    void inject(MainActivity mainActivity);
    void inject(MainActivityFragment mainActivityFragment);
}
