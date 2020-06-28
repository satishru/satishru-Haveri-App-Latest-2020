package application.haveri.tourism.ui.fragment.videos.video_list;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ExploreVideoFragmentProvider_ProvideExploreVideoFragment.ExploreVideoFragmentSubcomponent
          .class
)
public abstract class ExploreVideoFragmentProvider_ProvideExploreVideoFragment {
  private ExploreVideoFragmentProvider_ProvideExploreVideoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ExploreVideoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ExploreVideoFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ExploreVideoFragmentModule.class)
  public interface ExploreVideoFragmentSubcomponent extends AndroidInjector<ExploreVideoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ExploreVideoFragment> {}
  }
}
