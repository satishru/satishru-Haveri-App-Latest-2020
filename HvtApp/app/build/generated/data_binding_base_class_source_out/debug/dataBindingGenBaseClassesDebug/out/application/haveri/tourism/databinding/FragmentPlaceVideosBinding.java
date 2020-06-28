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
import application.haveri.tourism.ui.fragment.place.place_details.video.PlaceVideosFragmentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlaceVideosBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvVideosList;

  @Bindable
  protected PlaceVideosFragmentViewModel mViewModel;

  protected FragmentPlaceVideosBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvVideosList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvVideosList = rvVideosList;
  }

  public abstract void setViewModel(@Nullable PlaceVideosFragmentViewModel viewModel);

  @Nullable
  public PlaceVideosFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPlaceVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_videos, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceVideosBinding>inflateInternal(inflater, R.layout.fragment_place_videos, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlaceVideosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_videos, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceVideosBinding>inflateInternal(inflater, R.layout.fragment_place_videos, null, false, component);
  }

  public static FragmentPlaceVideosBinding bind(@NonNull View view) {
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
  public static FragmentPlaceVideosBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlaceVideosBinding)bind(component, view, R.layout.fragment_place_videos);
  }
}