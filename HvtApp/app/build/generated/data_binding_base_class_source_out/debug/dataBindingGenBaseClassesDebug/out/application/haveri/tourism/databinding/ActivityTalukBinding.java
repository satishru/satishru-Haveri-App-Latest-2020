// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.activity.taluk.TalukActivityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTalukBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final LayoutToolbarBinding layoutToolbar;

  @Bindable
  protected TalukActivityViewModel mViewModel;

  protected ActivityTalukBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout fragmentContainer, LayoutToolbarBinding layoutToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
    this.layoutToolbar = layoutToolbar;
    setContainedBinding(this.layoutToolbar);
  }

  public abstract void setViewModel(@Nullable TalukActivityViewModel viewModel);

  @Nullable
  public TalukActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityTalukBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_taluk, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTalukBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTalukBinding>inflateInternal(inflater, R.layout.activity_taluk, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTalukBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_taluk, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTalukBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTalukBinding>inflateInternal(inflater, R.layout.activity_taluk, null, false, component);
  }

  public static ActivityTalukBinding bind(@NonNull View view) {
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
  public static ActivityTalukBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTalukBinding)bind(component, view, R.layout.activity_taluk);
  }
}