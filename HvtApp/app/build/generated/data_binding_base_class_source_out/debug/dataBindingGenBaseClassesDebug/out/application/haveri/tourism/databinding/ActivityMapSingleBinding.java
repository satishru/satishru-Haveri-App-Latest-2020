// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import application.haveri.tourism.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMapSingleBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivMapDirection;

  @NonNull
  public final ImageView ivMapView;

  @NonNull
  public final LayoutToolbarBinding layoutToolbar;

  @NonNull
  public final FragmentContainerView map;

  protected ActivityMapSingleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivMapDirection, ImageView ivMapView, LayoutToolbarBinding layoutToolbar,
      FragmentContainerView map) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivMapDirection = ivMapDirection;
    this.ivMapView = ivMapView;
    this.layoutToolbar = layoutToolbar;
    setContainedBinding(this.layoutToolbar);
    this.map = map;
  }

  @NonNull
  public static ActivityMapSingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_map_single, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMapSingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMapSingleBinding>inflateInternal(inflater, R.layout.activity_map_single, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMapSingleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_map_single, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMapSingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMapSingleBinding>inflateInternal(inflater, R.layout.activity_map_single, null, false, component);
  }

  public static ActivityMapSingleBinding bind(@NonNull View view) {
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
  public static ActivityMapSingleBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMapSingleBinding)bind(component, view, R.layout.activity_map_single);
  }
}