// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.ui.fragment.taluk.taluk_list;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class TalukListFragmentModule_ProvideLinearLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final TalukListFragmentModule module;

  private final Provider<TalukListFragment> fragmentProvider;

  public TalukListFragmentModule_ProvideLinearLayoutManagerFactory(
      TalukListFragmentModule module, Provider<TalukListFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideInstance(module, fragmentProvider);
  }

  public static LinearLayoutManager provideInstance(
      TalukListFragmentModule module, Provider<TalukListFragment> fragmentProvider) {
    return proxyProvideLinearLayoutManager(module, fragmentProvider.get());
  }

  public static TalukListFragmentModule_ProvideLinearLayoutManagerFactory create(
      TalukListFragmentModule module, Provider<TalukListFragment> fragmentProvider) {
    return new TalukListFragmentModule_ProvideLinearLayoutManagerFactory(module, fragmentProvider);
  }

  public static LinearLayoutManager proxyProvideLinearLayoutManager(
      TalukListFragmentModule instance, TalukListFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideLinearLayoutManager(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
