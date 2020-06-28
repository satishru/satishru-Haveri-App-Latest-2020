// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.place.place_list;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PlaceListFragmentModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final PlaceListFragmentModule module;

  private final Provider<PlaceListFragment> fragmentProvider;

  public PlaceListFragmentModule_ProvideLinearLayoutManagerFactory(
      PlaceListFragmentModule module, Provider<PlaceListFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideInstance(module, fragmentProvider);
  }

  public static LinearLayoutManager provideInstance(
      PlaceListFragmentModule module, Provider<PlaceListFragment> fragmentProvider) {
    return proxyProvideLinearLayoutManager(module, fragmentProvider.get());
  }

  public static PlaceListFragmentModule_ProvideLinearLayoutManagerFactory create(
      PlaceListFragmentModule module, Provider<PlaceListFragment> fragmentProvider) {
    return new PlaceListFragmentModule_ProvideLinearLayoutManagerFactory(module, fragmentProvider);
  }

  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      PlaceListFragmentModule instance, PlaceListFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideLinearLayoutManager(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
