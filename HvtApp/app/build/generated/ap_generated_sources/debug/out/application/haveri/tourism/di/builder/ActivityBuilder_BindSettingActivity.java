package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.setting.SettingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindSettingActivity.SettingActivitySubcomponent.class)
public abstract class ActivityBuilder_BindSettingActivity {
  private ActivityBuilder_BindSettingActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SettingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SettingActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface SettingActivitySubcomponent extends AndroidInjector<SettingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingActivity> {}
  }
}
