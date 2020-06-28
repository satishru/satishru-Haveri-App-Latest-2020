package application.haveri.tourism.ui.fragment.place.place_details;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceDetailFragmentProvider_ProvidePlaceDetailFragment.PlaceDetailFragmentSubcomponent.class
)
public abstract class PlaceDetailFragmentProvider_ProvidePlaceDetailFragment {
  private PlaceDetailFragmentProvider_ProvidePlaceDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PlaceDetailFragmentSubcomponent extends AndroidInjector<PlaceDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceDetailFragment> {}
  }
}
