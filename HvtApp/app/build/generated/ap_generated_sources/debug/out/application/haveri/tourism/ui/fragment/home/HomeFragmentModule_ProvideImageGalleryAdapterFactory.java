// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.home;

import application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class HomeFragmentModule_ProvideImageGalleryAdapterFactory
    implements Factory<HomeImageGalleryAdapter> {
  private final HomeFragmentModule module;

  public HomeFragmentModule_ProvideImageGalleryAdapterFactory(HomeFragmentModule module) {
    this.module = module;
  }

  @Override
  public HomeImageGalleryAdapter get() {
    return provideInstance(module);
  }

  public static HomeImageGalleryAdapter provideInstance(HomeFragmentModule module) {
    return proxyProvideImageGalleryAdapter(module);
  }

  public static HomeFragmentModule_ProvideImageGalleryAdapterFactory create(
      HomeFragmentModule module) {
    return new HomeFragmentModule_ProvideImageGalleryAdapterFactory(module);
  }

  public static HomeImageGalleryAdapter proxyProvideImageGalleryAdapter(
      HomeFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideImageGalleryAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
