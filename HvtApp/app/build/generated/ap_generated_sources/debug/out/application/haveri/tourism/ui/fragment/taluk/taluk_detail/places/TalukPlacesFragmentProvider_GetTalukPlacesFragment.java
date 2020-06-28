package application.haveri.tourism.ui.fragment.taluk.taluk_detail.places;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukPlacesFragmentProvider_GetTalukPlacesFragment.TalukPlacesFragmentSubcomponent.class
)
public abstract class TalukPlacesFragmentProvider_GetTalukPlacesFragment {
  private TalukPlacesFragmentProvider_GetTalukPlacesFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukPlacesFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukPlacesFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = TalukPlacesFragmentModule.class)
  public interface TalukPlacesFragmentSubcomponent extends AndroidInjector<TalukPlacesFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukPlacesFragment> {}
  }
}
