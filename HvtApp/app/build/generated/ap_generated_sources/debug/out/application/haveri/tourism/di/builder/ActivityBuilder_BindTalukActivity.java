package application.haveri.tourism.di.builder;

import android.app.Activity;
import application.haveri.tourism.ui.activity.taluk.TalukActivity;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.TalukDetailFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.about.TalukAboutFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.events.TalukEventFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.gallery.TalukGalleryFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.places.TalukPlacesFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.video.TalukVideosFragmentProvider;
import application.haveri.tourism.ui.fragment.taluk.taluk_list.TalukListFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindTalukActivity.TalukActivitySubcomponent.class)
public abstract class ActivityBuilder_BindTalukActivity {
  private ActivityBuilder_BindTalukActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(TalukActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      TalukActivitySubcomponent.Builder builder);

  @Subcomponent(
    modules = {
      TalukListFragmentProvider.class,
      TalukDetailFragmentProvider.class,
      TalukAboutFragmentProvider.class,
      TalukPlacesFragmentProvider.class,
      TalukGalleryFragmentProvider.class,
      TalukVideosFragmentProvider.class,
      TalukEventFragmentProvider.class
    }
  )
  public interface TalukActivitySubcomponent extends AndroidInjector<TalukActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TalukActivity> {}
  }
}
