package application.haveri.tourism.ui.fragment.taluk.taluk_detail.gallery;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      TalukGalleryFragmentProvider_ProvideTalukGalleryFragment.TalukGalleryFragmentSubcomponent
          .class
)
public abstract class TalukGalleryFragmentProvider_ProvideTalukGalleryFragment {
  private TalukGalleryFragmentProvider_ProvideTalukGalleryFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TalukGalleryFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TalukGalleryFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = TalukGalleryFragmentModule.class)
  public interface TalukGalleryFragmentSubcomponent extends AndroidInjector<TalukGalleryFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukGalleryFragment> {}
  }
}
