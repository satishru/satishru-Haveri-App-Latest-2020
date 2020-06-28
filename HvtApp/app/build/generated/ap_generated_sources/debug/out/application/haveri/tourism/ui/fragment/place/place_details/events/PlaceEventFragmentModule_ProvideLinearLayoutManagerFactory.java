// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.place.place_details.events;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PlaceEventFragmentModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final PlaceEventFragmentModule module;

  private final Provider<PlaceEventFragment> fragmentProvider;

  public PlaceEventFragmentModule_ProvideLinearLayoutManagerFactory(
      PlaceEventFragmentModule module, Provider<PlaceEventFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideInstance(module, fragmentProvider);
  }

  public static LinearLayoutManager provideInstance(
      PlaceEventFragmentModule module, Provider<PlaceEventFragment> fragmentProvider) {
    return proxyProvideLinearLayoutManager(module, fragmentProvider.get());
  }

  public static PlaceEventFragmentModule_ProvideLinearLayoutManagerFactory create(
      PlaceEventFragmentModule module, Provider<PlaceEventFragment> fragmentProvider) {
    return new PlaceEventFragmentModule_ProvideLinearLayoutManagerFactory(module, fragmentProvider);
  }

  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      PlaceEventFragmentModule instance, PlaceEventFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideLinearLayoutManager(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}