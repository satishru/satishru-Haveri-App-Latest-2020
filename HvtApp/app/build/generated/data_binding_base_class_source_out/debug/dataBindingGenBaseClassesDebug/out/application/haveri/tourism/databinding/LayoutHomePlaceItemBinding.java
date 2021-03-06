// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.custom.CustomTextView;
import application.haveri.tourism.ui.custom.SquareImageView;
import application.haveri.tourism.ui.fragment.home.adapter.place.HomePlaceAdapterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutHomePlaceItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardContent;

  @NonNull
  public final SquareImageView ivPlace;

  @NonNull
  public final CustomTextView tvPlaceDesc;

  @NonNull
  public final CustomTextView tvPlaceName;

  @NonNull
  public final CustomTextView tvTalukName;

  @Bindable
  protected HomePlaceAdapterViewModel mViewModel;

  protected LayoutHomePlaceItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardContent, SquareImageView ivPlace, CustomTextView tvPlaceDesc,
      CustomTextView tvPlaceName, CustomTextView tvTalukName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardContent = cardContent;
    this.ivPlace = ivPlace;
    this.tvPlaceDesc = tvPlaceDesc;
    this.tvPlaceName = tvPlaceName;
    this.tvTalukName = tvTalukName;
  }

  public abstract void setViewModel(@Nullable HomePlaceAdapterViewModel viewModel);

  @Nullable
  public HomePlaceAdapterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutHomePlaceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_home_place_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutHomePlaceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutHomePlaceItemBinding>inflateInternal(inflater, R.layout.layout_home_place_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutHomePlaceItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_home_place_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutHomePlaceItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutHomePlaceItemBinding>inflateInternal(inflater, R.layout.layout_home_place_item, null, false, component);
  }

  public static LayoutHomePlaceItemBinding bind(@NonNull View view) {
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
  public static LayoutHomePlaceItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutHomePlaceItemBinding)bind(component, view, R.layout.layout_home_place_item);
  }
}
