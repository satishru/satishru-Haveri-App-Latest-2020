package application.haveri.tourism.ui.fragment.taluk.taluk_detail;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukDetailFragmentProvider_ProvideTalukDetailFragment.TalukDetailFragmentSubcomponent.class
)
public abstract class TalukDetailFragmentProvider_ProvideTalukDetailFragment {
  private TalukDetailFragmentProvider_ProvideTalukDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TalukDetailFragmentSubcomponent extends AndroidInjector<TalukDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukDetailFragment> {}
  }
}
