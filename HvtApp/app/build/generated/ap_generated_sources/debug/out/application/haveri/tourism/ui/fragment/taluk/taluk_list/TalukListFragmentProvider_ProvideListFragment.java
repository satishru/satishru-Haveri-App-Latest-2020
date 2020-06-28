package application.haveri.tourism.ui.fragment.taluk.taluk_list;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = TalukListFragmentProvider_ProvideListFragment.TalukListFragmentSubcomponent.class
)
public abstract class TalukListFragmentProvider_ProvideListFragment {
  private TalukListFragmentProvider_ProvideListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = TalukListFragmentModule.class)
  public interface TalukListFragmentSubcomponent extends AndroidInjector<TalukListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukListFragment> {}
  }
}
