// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.activity.media.video;

import androidx.fragment.app.Fragment;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.data.local.prefs.AppPreferencesHelper;
import application.haveri.tourism.ui.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class VideosExploreActivity_MembersInjector
    implements MembersInjector<VideosExploreActivity> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>>
      fragmentDispatchingAndroidInjectorProvider;

  public VideosExploreActivity_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<AppPreferencesHelper> appPreferencesHelperProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentDispatchingAndroidInjectorProvider) {
    this.factoryProvider = factoryProvider;
    this.appPreferencesHelperProvider = appPreferencesHelperProvider;
    this.fragmentDispatchingAndroidInjectorProvider = fragmentDispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<VideosExploreActivity> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<AppPreferencesHelper> appPreferencesHelperProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentDispatchingAndroidInjectorProvider) {
    return new VideosExploreActivity_MembersInjector(
        factoryProvider, appPreferencesHelperProvider, fragmentDispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(VideosExploreActivity instance) {
    BaseActivity_MembersInjector.injectFactory(instance, factoryProvider.get());
    BaseActivity_MembersInjector.injectAppPreferencesHelper(
        instance, appPreferencesHelperProvider.get());
    injectFragmentDispatchingAndroidInjector(
        instance, fragmentDispatchingAndroidInjectorProvider.get());
  }

  public static void injectFragmentDispatchingAndroidInjector(
      VideosExploreActivity instance,
      DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector) {
    instance.fragmentDispatchingAndroidInjector = fragmentDispatchingAndroidInjector;
  }
}
