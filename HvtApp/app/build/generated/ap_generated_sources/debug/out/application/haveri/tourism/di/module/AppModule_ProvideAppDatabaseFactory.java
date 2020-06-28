// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.di.module;

import android.content.Context;
import application.haveri.tourism.data.local.db.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<String> dbNameProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideAppDatabaseFactory(
      AppModule module, Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    this.module = module;
    this.dbNameProvider = dbNameProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideInstance(module, dbNameProvider, contextProvider);
  }

  public static AppDatabase provideInstance(
      AppModule module, Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    return proxyProvideAppDatabase(module, dbNameProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(
      AppModule module, Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(module, dbNameProvider, contextProvider);
  }

  public static AppDatabase proxyProvideAppDatabase(
      AppModule instance, String dbName, Context context) {
    return Preconditions.checkNotNull(
        instance.provideAppDatabase(dbName, context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}