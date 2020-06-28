// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.place.place_details.gallery;

import application.haveri.tourism.ui.fragment.common.adapter.ImageGalleryAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class PlaceGalleryFragmentModule_ProvideImageGalleryAdapterFactory
    implements Factory<ImageGalleryAdapter> {
  private final PlaceGalleryFragmentModule module;

  public PlaceGalleryFragmentModule_ProvideImageGalleryAdapterFactory(
      PlaceGalleryFragmentModule module) {
    this.module = module;
  }

  @Override
  public ImageGalleryAdapter get() {
    return provideInstance(module);
  }

  public static ImageGalleryAdapter provideInstance(PlaceGalleryFragmentModule module) {
    return proxyProvideImageGalleryAdapter(module);
  }

  public static PlaceGalleryFragmentModule_ProvideImageGalleryAdapterFactory create(
      PlaceGalleryFragmentModule module) {
    return new PlaceGalleryFragmentModule_ProvideImageGalleryAdapterFactory(module);
  }

  public static ImageGalleryAdapter proxyProvideImageGalleryAdapter(
      PlaceGalleryFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideImageGalleryAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
