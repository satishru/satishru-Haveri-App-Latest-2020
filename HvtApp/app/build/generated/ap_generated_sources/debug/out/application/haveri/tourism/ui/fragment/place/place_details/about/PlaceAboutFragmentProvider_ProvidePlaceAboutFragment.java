package application.haveri.tourism.ui.fragment.place.place_details.about;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceAboutFragmentProvider_ProvidePlaceAboutFragment.PlaceAboutFragmentSubcomponent.class
)
public abstract class PlaceAboutFragmentProvider_ProvidePlaceAboutFragment {
  private PlaceAboutFragmentProvider_ProvidePlaceAboutFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceAboutFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceAboutFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PlaceAboutFragmentSubcomponent extends AndroidInjector<PlaceAboutFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceAboutFragment> {}
  }
}
