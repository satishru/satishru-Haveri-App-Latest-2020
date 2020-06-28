// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.data.local.db;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppDbHelper_Factory implements Factory<AppDbHelper> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public AppDbHelper_Factory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDbHelper get() {
    return provideInstance(appDatabaseProvider);
  }

  public static AppDbHelper provideInstance(Provider<AppDatabase> appDatabaseProvider) {
    return new AppDbHelper(appDatabaseProvider.get());
  }

  public static AppDbHelper_Factory create(Provider<AppDatabase> appDatabaseProvider) {
    return new AppDbHelper_Factory(appDatabaseProvider);
  }

  public static AppDbHelper newAppDbHelper(AppDatabase appDatabase) {
    return new AppDbHelper(appDatabase);
  }
}
