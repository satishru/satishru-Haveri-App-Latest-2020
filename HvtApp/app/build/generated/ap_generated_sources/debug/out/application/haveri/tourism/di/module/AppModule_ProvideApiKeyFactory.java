// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideApiKeyFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideApiKeyFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(AppModule module) {
    return proxyProvideApiKey(module);
  }

  public static AppModule_ProvideApiKeyFactory create(AppModule module) {
    return new AppModule_ProvideApiKeyFactory(module);
  }

  public static String proxyProvideApiKey(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideApiKey(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
