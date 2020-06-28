package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.media.image.ImageViewActivity;
import application.haveri.tourism.ui.activity.media.image.ImageViewActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindImageViewActivity.ImageViewActivitySubcomponent.class)
public abstract class ActivityBuilder_BindImageViewActivity {
  private ActivityBuilder_BindImageViewActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ImageViewActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ImageViewActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ImageViewActivityModule.class)
  public interface ImageViewActivitySubcomponent extends AndroidInjector<ImageViewActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ImageViewActivity> {}
  }
}
