// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.di.module;

import application.haveri.tourism.data.local.prefs.PreferencesHelper;
import application.haveri.tourism.data.remote.ApiHeader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideProtectedApiHeaderFactory
    implements Factory<ApiHeader.ProtectedApiHeader> {
  private final AppModule module;

  private final Provider<String> apiKeyProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  public AppModule_ProvideProtectedApiHeaderFactory(
      AppModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    this.module = module;
    this.apiKeyProvider = apiKeyProvider;
    this.preferencesHelperProvider = preferencesHelperProvider;
  }

  @Override
  public ApiHeader.ProtectedApiHeader get() {
    return provideInstance(module, apiKeyProvider, preferencesHelperProvider);
  }

  public static ApiHeader.ProtectedApiHeader provideInstance(
      AppModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    return proxyProvideProtectedApiHeader(
        module, apiKeyProvider.get(), preferencesHelperProvider.get());
  }

  public static AppModule_ProvideProtectedApiHeaderFactory create(
      AppModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    return new AppModule_ProvideProtectedApiHeaderFactory(
        module, apiKeyProvider, preferencesHelperProvider);
  }

  public static ApiHeader.ProtectedApiHeader proxyProvideProtectedApiHeader(
      AppModule instance, String apiKey, PreferencesHelper preferencesHelper) {
    return Preconditions.checkNotNull(
        instance.provideProtectedApiHeader(apiKey, preferencesHelper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
