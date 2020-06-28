// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_detail.events;

import androidx.recyclerview.widget.LinearLayoutManager;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.ui.base.BaseFragment_MembersInjector;
import application.haveri.tourism.ui.fragment.common.adapter.EventsAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TalukEventFragment_MembersInjector
    implements MembersInjector<TalukEventFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<EventsAdapter> eventsAdapterProvider;

  private final Provider<LinearLayoutManager> layoutManagerProvider;

  public TalukEventFragment_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<EventsAdapter> eventsAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider) {
    this.factoryProvider = factoryProvider;
    this.eventsAdapterProvider = eventsAdapterProvider;
    this.layoutManagerProvider = layoutManagerProvider;
  }

  public static MembersInjector<TalukEventFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<EventsAdapter> eventsAdapterProvider,
      Provider<LinearLayoutManager> layoutManagerProvider) {
    return new TalukEventFragment_MembersInjector(
        factoryProvider, eventsAdapterProvider, layoutManagerProvider);
  }

  @Override
  public void injectMembers(TalukEventFragment instance) {
    BaseFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    injectEventsAdapter(instance, eventsAdapterProvider.get());
    injectLayoutManager(instance, layoutManagerProvider);
  }

  public static void injectEventsAdapter(TalukEventFragment instance, EventsAdapter eventsAdapter) {
    instance.eventsAdapter = eventsAdapter;
  }

  public static void injectLayoutManager(
      TalukEventFragment instance, Provider<LinearLayoutManager> layoutManager) {
    instance.layoutManager = layoutManager;
  }
}
