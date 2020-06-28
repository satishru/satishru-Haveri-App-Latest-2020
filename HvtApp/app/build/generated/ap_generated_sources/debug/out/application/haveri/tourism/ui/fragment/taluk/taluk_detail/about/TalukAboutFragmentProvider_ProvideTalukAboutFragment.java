package application.haveri.tourism.ui.fragment.taluk.taluk_detail.about;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukAboutFragmentProvider_ProvideTalukAboutFragment.TalukAboutFragmentSubcomponent.class
)
public abstract class TalukAboutFragmentProvider_ProvideTalukAboutFragment {
  private TalukAboutFragmentProvider_ProvideTalukAboutFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukAboutFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukAboutFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TalukAboutFragmentSubcomponent extends AndroidInjector<TalukAboutFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukAboutFragment> {}
  }
}
