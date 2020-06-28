package application.haveri.tourism.ui.fragment.taluk.taluk_detail.events;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukEventFragmentProvider_GetTalukEventFragment.TalukEventFragmentSubcomponent.class
)
public abstract class TalukEventFragmentProvider_GetTalukEventFragment {
  private TalukEventFragmentProvider_GetTalukEventFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukEventFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukEventFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = TalukEventFragmentModule.class)
  public interface TalukEventFragmentSubcomponent extends AndroidInjector<TalukEventFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukEventFragment> {}
  }
}
