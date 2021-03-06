// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.fragment.taluk.taluk_detail.places.TalukPlacesFragmentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTalukPlacesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvPlaceList;

  @Bindable
  protected TalukPlacesFragmentViewModel mViewModel;

  protected FragmentTalukPlacesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvPlaceList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvPlaceList = rvPlaceList;
  }

  public abstract void setViewModel(@Nullable TalukPlacesFragmentViewModel viewModel);

  @Nullable
  public TalukPlacesFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentTalukPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_taluk_places, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTalukPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTalukPlacesBinding>inflateInternal(inflater, R.layout.fragment_taluk_places, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTalukPlacesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_taluk_places, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTalukPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTalukPlacesBinding>inflateInternal(inflater, R.layout.fragment_taluk_places, null, false, component);
  }

  public static FragmentTalukPlacesBinding bind(@NonNull View view) {
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
  public static FragmentTalukPlacesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTalukPlacesBinding)bind(component, view, R.layout.fragment_taluk_places);
  }
}
