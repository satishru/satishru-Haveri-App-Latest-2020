package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.about.AboutActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindAboutActivity.AboutActivitySubcomponent.class)
public abstract class ActivityBuilder_BindAboutActivity {
  private ActivityBuilder_BindAboutActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AboutActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AboutActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface AboutActivitySubcomponent extends AndroidInjector<AboutActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AboutActivity> {}
  }
}
