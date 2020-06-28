package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.event.EventDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindEventDetailActivity.EventDetailActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindEventDetailActivity {
  private ActivityBuilder_BindEventDetailActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(EventDetailActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      EventDetailActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface EventDetailActivitySubcomponent extends AndroidInjector<EventDetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EventDetailActivity> {}
  }
}
