// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_detail.places;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class TalukPlacesFragmentModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final TalukPlacesFragmentModule module;

  private final Provider<TalukPlacesFragment> fragmentProvider;

  public TalukPlacesFragmentModule_ProvideLinearLayoutManagerFactory(
      TalukPlacesFragmentModule module, Provider<TalukPlacesFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideInstance(module, fragmentProvider);
  }

  public static LinearLayoutManager provideInstance(
      TalukPlacesFragmentModule module, Provider<TalukPlacesFragment> fragmentProvider) {
    return proxyProvideLinearLayoutManager(module, fragmentProvider.get());
  }

  public static TalukPlacesFragmentModule_ProvideLinearLayoutManagerFactory create(
      TalukPlacesFragmentModule module, Provider<TalukPlacesFragment> fragmentProvider) {
    return new TalukPlacesFragmentModule_ProvideLinearLayoutManagerFactory(
        module, fragmentProvider);
  }

  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      TalukPlacesFragmentModule instance, TalukPlacesFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideLinearLayoutManager(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
