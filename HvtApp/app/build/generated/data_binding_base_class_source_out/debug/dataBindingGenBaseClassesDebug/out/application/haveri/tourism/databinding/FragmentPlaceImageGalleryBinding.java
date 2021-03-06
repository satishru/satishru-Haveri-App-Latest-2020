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
import application.haveri.tourism.ui.fragment.place.place_details.gallery.PlaceGalleryFragmentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlaceImageGalleryBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvImageList;

  @Bindable
  protected PlaceGalleryFragmentViewModel mViewModel;

  protected FragmentPlaceImageGalleryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView rvImageList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvImageList = rvImageList;
  }

  public abstract void setViewModel(@Nullable PlaceGalleryFragmentViewModel viewModel);

  @Nullable
  public PlaceGalleryFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPlaceImageGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_image_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceImageGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceImageGalleryBinding>inflateInternal(inflater, R.layout.fragment_place_image_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlaceImageGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_image_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceImageGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceImageGalleryBinding>inflateInternal(inflater, R.layout.fragment_place_image_gallery, null, false, component);
  }

  public static FragmentPlaceImageGalleryBinding bind(@NonNull View view) {
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
  public static FragmentPlaceImageGalleryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentPlaceImageGalleryBinding)bind(component, view, R.layout.fragment_place_image_gallery);
  }
}
