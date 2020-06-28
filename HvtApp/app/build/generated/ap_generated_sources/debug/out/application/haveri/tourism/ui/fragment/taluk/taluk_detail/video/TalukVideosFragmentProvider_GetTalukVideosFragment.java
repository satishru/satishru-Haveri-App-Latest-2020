package application.haveri.tourism.ui.fragment.taluk.taluk_detail.video;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukVideosFragmentProvider_GetTalukVideosFragment.TalukVideosFragmentSubcomponent.class
)
public abstract class TalukVideosFragmentProvider_GetTalukVideosFragment {
  private TalukVideosFragmentProvider_GetTalukVideosFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukVideosFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukVideosFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = TalukVideosFragmentModule.class)
  public interface TalukVideosFragmentSubcomponent extends AndroidInjector<TalukVideosFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukVideosFragment> {}
  }
}
