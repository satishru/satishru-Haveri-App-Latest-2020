// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.home;

import application.haveri.tourism.ui.fragment.home.adapter.event.HomeEventsAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class HomeFragmentModule_ProvideEventsAdapterFactory
    implements Factory<HomeEventsAdapter> {
  private final HomeFragmentModule module;

  public HomeFragmentModule_ProvideEventsAdapterFactory(HomeFragmentModule module) {
    this.module = module;
  }

  @Override
  public HomeEventsAdapter get() {
    return provideInstance(module);
  }

  public static HomeEventsAdapter provideInstance(HomeFragmentModule module) {
    return proxyProvideEventsAdapter(module);
  }

  public static HomeFragmentModule_ProvideEventsAdapterFactory create(HomeFragmentModule module) {
    return new HomeFragmentModule_ProvideEventsAdapterFactory(module);
  }

  public static HomeEventsAdapter proxyProvideEventsAdapter(HomeFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideEventsAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}