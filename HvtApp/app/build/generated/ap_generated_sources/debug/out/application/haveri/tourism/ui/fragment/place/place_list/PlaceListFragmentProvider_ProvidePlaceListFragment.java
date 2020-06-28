package application.haveri.tourism.ui.fragment.place.place_list;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceListFragmentProvider_ProvidePlaceListFragment.PlaceListFragmentSubcomponent.class
)
public abstract class PlaceListFragmentProvider_ProvidePlaceListFragment {
  private PlaceListFragmentProvider_ProvidePlaceListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = PlaceListFragmentModule.class)
  public interface PlaceListFragmentSubcomponent extends AndroidInjector<PlaceListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceListFragment> {}
  }
}
