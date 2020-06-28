package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.place.PlaceActivity;
import application.haveri.tourism.ui.fragment.place.place_details.PlaceDetailFragmentProvider;
import application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentProvider;
import application.haveri.tourism.ui.fragment.place.place_details.events.PlaceEventFragmentProvider;
import application.haveri.tourism.ui.fragment.place.place_details.gallery.PlaceGalleryFragmentProvider;
import application.haveri.tourism.ui.fragment.place.place_details.video.PlaceVideosFragmentProvider;
import application.haveri.tourism.ui.fragment.place.place_list.PlaceListFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindPlaceActivity.PlaceActivitySubcomponent.class)
public abstract class ActivityBuilder_BindPlaceActivity {
  private ActivityBuilder_BindPlaceActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(PlaceActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PlaceActivitySubcomponent.Builder builder);

  @Subcomponent(
    modules = {
      PlaceListFragmentProvider.class,
      PlaceDetailFragmentProvider.class,
      PlaceAboutFragmentProvider.class,
      PlaceGalleryFragmentProvider.class,
      PlaceVideosFragmentProvider.class,
      PlaceEventFragmentProvider.class
    }
  )
  public interface PlaceActivitySubcomponent extends AndroidInjector<PlaceActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PlaceActivity> {}
  }
}
