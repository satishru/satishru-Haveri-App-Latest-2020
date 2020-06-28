// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_list;

import application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class TalukListFragmentModule_ProvideTalukAdapterFactory
    implements Factory<TalukListAdapter> {
  private final TalukListFragmentModule module;

  public TalukListFragmentModule_ProvideTalukAdapterFactory(TalukListFragmentModule module) {
    this.module = module;
  }

  @Override
  public TalukListAdapter get() {
    return provideInstance(module);
  }

  public static TalukListAdapter provideInstance(TalukListFragmentModule module) {
    return proxyProvideTalukAdapter(module);
  }

  public static TalukListFragmentModule_ProvideTalukAdapterFactory create(
      TalukListFragmentModule module) {
    return new TalukListFragmentModule_ProvideTalukAdapterFactory(module);
  }

  public static TalukListAdapter proxyProvideTalukAdapter(TalukListFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideTalukAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
