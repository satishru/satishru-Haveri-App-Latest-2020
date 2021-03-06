// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.place.place_details.gallery;

import androidx.recyclerview.widget.GridLayoutManager;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.ui.base.BaseFragment_MembersInjector;
import application.haveri.tourism.ui.fragment.common.adapter.ImageGalleryAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class PlaceGalleryFragment_MembersInjector
    implements MembersInjector<PlaceGalleryFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<ImageGalleryAdapter> imageGalleryAdapterProvider;

  private final Provider<GridLayoutManager> gridLayoutManagerProvider;

  public PlaceGalleryFragment_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<ImageGalleryAdapter> imageGalleryAdapterProvider,
      Provider<GridLayoutManager> gridLayoutManagerProvider) {
    this.factoryProvider = factoryProvider;
    this.imageGalleryAdapterProvider = imageGalleryAdapterProvider;
    this.gridLayoutManagerProvider = gridLayoutManagerProvider;
  }

  public static MembersInjector<PlaceGalleryFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<ImageGalleryAdapter> imageGalleryAdapterProvider,
      Provider<GridLayoutManager> gridLayoutManagerProvider) {
    return new PlaceGalleryFragment_MembersInjector(
        factoryProvider, imageGalleryAdapterProvider, gridLayoutManagerProvider);
  }

  @Override
  public void injectMembers(PlaceGalleryFragment instance) {
    BaseFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    injectImageGalleryAdapter(instance, imageGalleryAdapterProvider.get());
    injectGridLayoutManager(instance, gridLayoutManagerProvider);
  }

  public static void injectImageGalleryAdapter(
      PlaceGalleryFragment instance, ImageGalleryAdapter imageGalleryAdapter) {
    instance.imageGalleryAdapter = imageGalleryAdapter;
  }

  public static void injectGridLayoutManager(
      PlaceGalleryFragment instance, Provider<GridLayoutManager> gridLayoutManager) {
    instance.gridLayoutManager = gridLayoutManager;
  }
}
