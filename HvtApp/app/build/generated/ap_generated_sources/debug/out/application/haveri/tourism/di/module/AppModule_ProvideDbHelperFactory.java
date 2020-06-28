// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.di.module;

import application.haveri.tourism.data.local.db.AppDbHelper;
import application.haveri.tourism.data.local.db.DbHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideDbHelperFactory implements Factory<DbHelper> {
  private final AppModule module;

  private final Provider<AppDbHelper> appDbHelperProvider;

  public AppModule_ProvideDbHelperFactory(
      AppModule module, Provider<AppDbHelper> appDbHelperProvider) {
    this.module = module;
    this.appDbHelperProvider = appDbHelperProvider;
  }

  @Override
  public DbHelper get() {
    return provideInstance(module, appDbHelperProvider);
  }

  public static DbHelper provideInstance(
      AppModule module, Provider<AppDbHelper> appDbHelperProvider) {
    return proxyProvideDbHelper(module, appDbHelperProvider.get());
  }

  public static AppModule_ProvideDbHelperFactory create(
      AppModule module, Provider<AppDbHelper> appDbHelperProvider) {
    return new AppModule_ProvideDbHelperFactory(module, appDbHelperProvider);
  }

  public static DbHelper proxyProvideDbHelper(AppModule instance, AppDbHelper appDbHelper) {
    return Preconditions.checkNotNull(
        instance.provideDbHelper(appDbHelper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
