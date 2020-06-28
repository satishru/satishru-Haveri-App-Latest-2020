package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.map.MapSingleActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMapSingleActivity.MapSingleActivitySubcomponent.class)
public abstract class ActivityBuilder_BindMapSingleActivity {
  private ActivityBuilder_BindMapSingleActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MapSingleActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MapSingleActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface MapSingleActivitySubcomponent extends AndroidInjector<MapSingleActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MapSingleActivity> {}
  }
}
