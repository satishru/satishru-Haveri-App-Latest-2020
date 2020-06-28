// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_list;

import androidx.recyclerview.widget.LinearLayoutManager;
import application.haveri.tourism.ViewModelProviderFactory;
import application.haveri.tourism.ui.base.BaseFragment_MembersInjector;
import application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TalukListFragment_MembersInjector implements MembersInjector<TalukListFragment> {
  private final Provider<ViewModelProviderFactory> factoryProvider;

  private final Provider<TalukListAdapter> talukListAdapterProvider;

  private final Provider<LinearLayoutManager> mLayoutManagerProvider;

  public TalukListFragment_MembersInjector(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<TalukListAdapter> talukListAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    this.factoryProvider = factoryProvider;
    this.talukListAdapterProvider = talukListAdapterProvider;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
  }

  public static MembersInjector<TalukListFragment> create(
      Provider<ViewModelProviderFactory> factoryProvider,
      Provider<TalukListAdapter> talukListAdapterProvider,
      Provider<LinearLayoutManager> mLayoutManagerProvider) {
    return new TalukListFragment_MembersInjector(
        factoryProvider, talukListAdapterProvider, mLayoutManagerProvider);
  }

  @Override
  public void injectMembers(TalukListFragment instance) {
    BaseFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    injectTalukListAdapter(instance, talukListAdapterProvider.get());
    injectMLayoutManager(instance, mLayoutManagerProvider);
  }

  public static void injectTalukListAdapter(
      TalukListFragment instance, TalukListAdapter talukListAdapter) {
    instance.talukListAdapter = talukListAdapter;
  }

  public static void injectMLayoutManager(
      TalukListFragment instance, Provider<LinearLayoutManager> mLayoutManager) {
    instance.mLayoutManager = mLayoutManager;
  }
}
