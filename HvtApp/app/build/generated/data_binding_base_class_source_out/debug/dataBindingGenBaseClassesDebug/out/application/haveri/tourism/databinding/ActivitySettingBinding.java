// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.activity.setting.SettingActivityViewModel;
import application.haveri.tourism.ui.custom.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySettingBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextView ivImageCache;

  @NonNull
  public final LayoutToolbarBinding layoutToolbar;

  @NonNull
  public final RecyclerView rvThemeList;

  @NonNull
  public final Switch switchNotificationDestination;

  @NonNull
  public final Switch switchNotificationEvents;

  @NonNull
  public final CustomTextView tvAbout;

  @NonNull
  public final CustomTextView tvLanguageEnglish;

  @NonNull
  public final CustomTextView tvLanguageKannada;

  @NonNull
  public final CustomTextView tvRate;

  @Bindable
  protected SettingActivityViewModel mViewModel;

  protected ActivitySettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextView ivImageCache, LayoutToolbarBinding layoutToolbar, RecyclerView rvThemeList,
      Switch switchNotificationDestination, Switch switchNotificationEvents, CustomTextView tvAbout,
      CustomTextView tvLanguageEnglish, CustomTextView tvLanguageKannada, CustomTextView tvRate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivImageCache = ivImageCache;
    this.layoutToolbar = layoutToolbar;
    setContainedBinding(this.layoutToolbar);
    this.rvThemeList = rvThemeList;
    this.switchNotificationDestination = switchNotificationDestination;
    this.switchNotificationEvents = switchNotificationEvents;
    this.tvAbout = tvAbout;
    this.tvLanguageEnglish = tvLanguageEnglish;
    this.tvLanguageKannada = tvLanguageKannada;
    this.tvRate = tvRate;
  }

  public abstract void setViewModel(@Nullable SettingActivityViewModel viewModel);

  @Nullable
  public SettingActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySettingBinding>inflateInternal(inflater, R.layout.activity_setting, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySettingBinding>inflateInternal(inflater, R.layout.activity_setting, null, false, component);
  }

  public static ActivitySettingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySettingBinding)bind(component, view, R.layout.activity_setting);
  }
}
