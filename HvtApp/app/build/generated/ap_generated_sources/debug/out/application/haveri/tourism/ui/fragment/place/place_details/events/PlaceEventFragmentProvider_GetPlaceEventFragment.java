package application.haveri.tourism.ui.fragment.place.place_details.events;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceEventFragmentProvider_GetPlaceEventFragment.PlaceEventFragmentSubcomponent.class
)
public abstract class PlaceEventFragmentProvider_GetPlaceEventFragment {
  private PlaceEventFragmentProvider_GetPlaceEventFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceEventFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceEventFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = PlaceEventFragmentModule.class)
  public interface PlaceEventFragmentSubcomponent extends AndroidInjector<PlaceEventFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceEventFragment> {}
  }
}
