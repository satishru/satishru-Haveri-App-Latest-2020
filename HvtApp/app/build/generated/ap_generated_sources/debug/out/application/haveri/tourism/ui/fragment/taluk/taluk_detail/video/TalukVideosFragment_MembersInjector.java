// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_detail.video;

import androidx.recyclerview.widget.LinearLayoutManager;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.ui.base.BaseFragment_MembersInjector;
import application.haveri.tourism.ui.fragment.common.adapter.VideoListAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TalukVideosFragment_MembersInjector
    implements MembersInjector<TalukVideosFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<VideoListAdapter> videoListAdapterProvider;

  private final Provider<LinearLayoutManager> layoutManagerProvider;

  public TalukVideosFragment_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<VideoListAdapter> videoListAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider) {
    this.factoryProvider = factoryProvider;
    this.videoListAdapterProvider = videoListAdapterProvider;
    this.layoutManagerProvider = layoutManagerProvider;
  }

  public static MembersInjector<TalukVideosFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<VideoListAdapter> videoListAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider) {
    return new TalukVideosFragment_MembersInjector(
        factoryProvider, videoListAdapterProvider, layoutManagerProvider);
  }

  @Override
  public void injectMembers(TalukVideosFragment instance) {
    BaseFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    injectVideoListAdapter(instance, videoListAdapterProvider.get());
    injectLayoutManager(instance, layoutManagerProvider);
  }

  public static void injectVideoListAdapter(
      TalukVideosFragment instance, VideoListAdapter videoListAdapter) {
    instance.videoListAdapter = videoListAdapter;
  }

  public static void injectLayoutManager(
      TalukVideosFragment instance, Provider<LinearLayoutManager> layoutManager) {
    instance.layoutManager = layoutManager;
  }
}