package application.haveri.tourism.ui.fragment.videos.play_video;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlayVideoFragmentProvider_ProvidePlayVideoFragment.PlayVideoFragmentSubcomponent.class
)
public abstract class PlayVideoFragmentProvider_ProvidePlayVideoFragment {
  private PlayVideoFragmentProvider_ProvidePlayVideoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlayVideoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlayVideoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PlayVideoFragmentSubcomponent extends AndroidInjector<PlayVideoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlayVideoFragment> {}
  }
}
