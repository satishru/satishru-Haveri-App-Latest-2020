// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.custom.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutToolbarBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CustomTextView tvTitle;

  protected LayoutToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Toolbar toolbar, CustomTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_toolbar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutToolbarBinding>inflateInternal(inflater, R.layout.layout_toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_toolbar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutToolbarBinding>inflateInternal(inflater, R.layout.layout_toolbar, null, false, component);
  }

  public static LayoutToolbarBinding bind(@NonNull View view) {
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
  public static LayoutToolbarBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutToolbarBinding)bind(component, view, R.layout.layout_toolbar);
  }
}
