package application.haveri.tourism.ui.fragment.place.place_details.video;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceVideosFragmentProvider_GetPlaceVideosFragment.PlaceVideosFragmentSubcomponent.class
)
public abstract class PlaceVideosFragmentProvider_GetPlaceVideosFragment {
  private PlaceVideosFragmentProvider_GetPlaceVideosFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceVideosFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceVideosFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = PlaceVideosFragmentModule.class)
  public interface PlaceVideosFragmentSubcomponent extends AndroidInjector<PlaceVideosFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceVideosFragment> {}
  }
}
