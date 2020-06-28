// Generated by Dagger (https://google.github.io/dagger).
package application.haveri.tourism.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvidePreferenceNameFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvidePreferenceNameFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(AppModule module) {
    return proxyProvidePreferenceName(module);
  }

  public static AppModule_ProvidePreferenceNameFactory create(AppModule module) {
    return new AppModule_ProvidePreferenceNameFactory(module);
  }

  public static String proxyProvidePreferenceName(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.providePreferenceName(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}