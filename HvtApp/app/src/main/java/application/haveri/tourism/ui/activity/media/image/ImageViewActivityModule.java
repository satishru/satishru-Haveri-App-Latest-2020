package application.haveri.tourism.ui.activity.media.image;

import application.haveri.tourism.ui.activity.media.image.adapter.ImageViewAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageViewActivityModule {

    @Provides
    ImageViewAdapter provideImageViewAdapter() {
        return new ImageViewAdapter(new ArrayList<>());
    }
}
