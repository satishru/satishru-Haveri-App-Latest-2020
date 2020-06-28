// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.data;

import android.content.Context;
import application.haveri.tourism.data.local.db.DbHelper;
import application.haveri.tourism.data.local.prefs.PreferencesHelper;
import application.haveri.tourism.data.remote.ApiHelper;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppDataManager_Factory implements Factory<AppDataManager> {
  private final Provider<Context> contextProvider;

  private final Provider<DbHelper> dbHelperProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<Gson> gsonProvider;

  public AppDataManager_Factory(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<Gson> gsonProvider) {
    this.contextProvider = contextProvider;
    this.dbHelperProvider = dbHelperProvider;
    this.preferencesHelperProvider = preferencesHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public AppDataManager get() {
    return provideInstance(
        contextProvider,
        dbHelperProvider,
        preferencesHelperProvider,
        apiHelperProvider,
        gsonProvider);
  }

  public static AppDataManager provideInstance(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<Gson> gsonProvider) {
    return new AppDataManager(
        contextProvider.get(),
        dbHelperProvider.get(),
        preferencesHelperProvider.get(),
        apiHelperProvider.get(),
        gsonProvider.get());
  }

  public static AppDataManager_Factory create(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<Gson> gsonProvider) {
    return new AppDataManager_Factory(
        contextProvider,
        dbHelperProvider,
        preferencesHelperProvider,
        apiHelperProvider,
        gsonProvider);
  }

  public static AppDataManager newAppDataManager(
      Context context,
      DbHelper dbHelper,
      PreferencesHelper preferencesHelper,
      ApiHelper apiHelper,
      Gson gson) {
    return new AppDataManager(context, dbHelper, preferencesHelper, apiHelper, gson);
  }
}
