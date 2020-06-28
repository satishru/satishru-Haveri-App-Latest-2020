package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.home.HomeActivity;
import application.haveri.tourism.ui.fragment.home.HomeFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindHomeActivity.HomeActivitySubcomponent.class)
public abstract class ActivityBuilder_BindHomeActivity {
  private ActivityBuilder_BindHomeActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(HomeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Builder builder);

  @Subcomponent(modules = HomeFragmentProvider.class)
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
  }
}
