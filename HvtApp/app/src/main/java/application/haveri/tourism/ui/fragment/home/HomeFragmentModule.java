package application.haveri.tourism.ui.fragment.home;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import application.haveri.tourism.ui.fragment.home.adapter.event.HomeEventsAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.slider.SliderAdapter;
import application.haveri.tourism.ui.fragment.home.adapter.taluk.HomeTalukAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeFragmentModule {

    @Provides
    SliderAdapter provideSliderAdapter() {
          return new SliderAdapter(new ArrayList<>());
    }

    @Provides
    HomeTalukAdapter provideTalukAdapter() {
        return new HomeTalukAdapter(new ArrayList<>());
    }

    @Provides
    HomeImageGalleryAdapter provideImageGalleryAdapter() {
        return new HomeImageGalleryAdapter(new ArrayList<>());
    }

    @Provides
    HomeEventsAdapter provideEventsAdapter() {
        return new HomeEventsAdapter(new ArrayList<>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(HomeFragment fragment) {
        return new LinearLayoutManager(fragment.getActivity(), LinearLayoutManager.HORIZONTAL,
                false);
    }

    @Provides
    HomePlaceAdapter provideHomePlaceAdapter() {
        return new HomePlaceAdapter(new ArrayList<>());
    }

    @Provides
    GridLayoutManager provideGridLayoutManager(HomeFragment fragment) {
        return new GridLayoutManager(fragment.getActivity(), 1, GridLayoutManager.HORIZONTAL,
                false);
    }
}

