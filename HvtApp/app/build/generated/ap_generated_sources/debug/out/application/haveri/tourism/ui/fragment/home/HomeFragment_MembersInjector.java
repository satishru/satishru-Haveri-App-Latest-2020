// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.home;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.ui.base.BaseFragment_MembersInjector;
import application.haveri.tourism.ui.fragment.home.adapter.event.HomeEventsAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.slider.SliderAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.taluk.HomeTalukAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<SliderAdapter> sliderAdapterProvider;

  private final Provider<HomeTalukAdapter> homeTalukAdapterProvider;

  private final Provider<HomeImageGalleryAdapter> homeImageGalleryAdapterProvider;

  private final Provider<HomeEventsAdapter> homeEventsAdapterProvider;

  private final Provider<HomePlaceAdapter> homePlaceAdapterProvider;

  private final Provider<LinearLayoutManager> layoutManagerProvider;

  private final Provider<GridLayoutManager> gridLayoutManagerProvider;

  public HomeFragment_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<SliderAdapter> sliderAdapterProvider,
      Provider<HomeTalukAdapter> homeTalukAdapterProvider,
      Provider<HomeImageGalleryAdapter> homeImageGalleryAdapterProvider,
      Provider<HomeEventsAdapter> homeEventsAdapterProvider,
      Provider<HomePlaceAdapter> homePlaceAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider,
      Provider<GridLayoutManager> gridLayoutManagerProvider) {
    this.factoryProvider = factoryProvider;
    this.sliderAdapterProvider = sliderAdapterProvider;
    this.homeTalukAdapterProvider = homeTalukAdapterProvider;
    this.homeImageGalleryAdapterProvider = homeImageGalleryAdapterProvider;
    this.homeEventsAdapterProvider = homeEventsAdapterProvider;
    this.homePlaceAdapterProvider = homePlaceAdapterProvider;
    this.layoutManagerProvider = layoutManagerProvider;
    this.gridLayoutManagerProvider = gridLayoutManagerProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<SliderAdapter> sliderAdapterProvider,
      Provider<HomeTalukAdapter> homeTalukAdapterProvider,
      Provider<HomeImageGalleryAdapter> homeImageGalleryAdapterProvider,
      Provider<HomeEventsAdapter> homeEventsAdapterProvider,
      Provider<HomePlaceAdapter> homePlaceAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider,
      Provider<GridLayoutManager> gridLayoutManagerProvider) {
    return new HomeFragment_MembersInjector(
        factoryProvider,
        sliderAdapterProvider,
        homeTalukAdapterProvider,
        homeImageGalleryAdapterProvider,
        homeEventsAdapterProvider,
        homePlaceAdapterProvider,
        layoutManagerProvider,
        gridLayoutManagerProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    BaseFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    injectSliderAdapter(instance, sliderAdapterProvider.get());
    injectHomeTalukAdapter(instance, homeTalukAdapterProvider.get());
    injectHomeImageGalleryAdapter(instance, homeImageGalleryAdapterProvider.get());
    injectHomeEventsAdapter(instance, homeEventsAdapterProvider.get());
    injectHomePlaceAdapter(instance, homePlaceAdapterProvider.get());
    injectLayoutManager(instance, layoutManagerProvider);
    injectGridLayoutManager(instance, gridLayoutManagerProvider);
  }

  public static void injectSliderAdapter(HomeFragment instance, SliderAdapter sliderAdapter) {
    instance.sliderAdapter = sliderAdapter;
  }

  public static void injectHomeTalukAdapter(
      HomeFragment instance, HomeTalukAdapter homeTalukAdapter) {
    instance.homeTalukAdapter = homeTalukAdapter;
  }

  public static void injectHomeImageGalleryAdapter(
      HomeFragment instance, HomeImageGalleryAdapter homeImageGalleryAdapter) {
    instance.homeImageGalleryAdapter = homeImageGalleryAdapter;
  }

  public static void injectHomeEventsAdapter(
      HomeFragment instance, HomeEventsAdapter homeEventsAdapter) {
    instance.homeEventsAdapter = homeEventsAdapter;
  }

  public static void injectHomePlaceAdapter(
      HomeFragment instance, HomePlaceAdapter homePlaceAdapter) {
    instance.homePlaceAdapter = homePlaceAdapter;
  }

  public static void injectLayoutManager(
      HomeFragment instance, Provider<LinearLayoutManager> layoutManager) {
    instance.layoutManager = layoutManager;
  }

  public static void injectGridLayoutManager(
      HomeFragment instance, Provider<GridLayoutManager> gridLayoutManager) {
    instance.gridLayoutManager = gridLayoutManager;
  }
}