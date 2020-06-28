package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.media.video.VideosExploreActivity;
import application.haveri.tourism.ui.fragment.videos.play_video.PlayVideoFragmentProvider;
import application.haveri.tourism.ui.fragment.videos.video_list.ExploreVideoFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindVideosExploreActivity.VideosExploreActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindVideosExploreActivity {
  private ActivityBuilder_BindVideosExploreActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(VideosExploreActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      VideosExploreActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {ExploreVideoFragmentProvider.class, PlayVideoFragmentProvider.class})
  public interface VideosExploreActivitySubcomponent
      extends AndroidInjector<VideosExploreActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<VideosExploreActivity> {}
  }
}
