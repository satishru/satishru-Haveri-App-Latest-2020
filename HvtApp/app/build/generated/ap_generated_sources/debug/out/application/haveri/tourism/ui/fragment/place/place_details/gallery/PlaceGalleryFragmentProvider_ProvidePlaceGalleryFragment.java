package application.haveri.tourism.ui.fragment.place.place_details.gallery;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PlaceGalleryFragmentProvider_ProvidePlaceGalleryFragment.PlaceGalleryFragmentSubcomponent
          .class
)
public abstract class PlaceGalleryFragmentProvider_ProvidePlaceGalleryFragment {
  private PlaceGalleryFragmentProvider_ProvidePlaceGalleryFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PlaceGalleryFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PlaceGalleryFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = PlaceGalleryFragmentModule.class)
  public interface PlaceGalleryFragmentSubcomponent extends AndroidInjector<PlaceGalleryFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceGalleryFragment> {}
  }
}
