// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.custom.CustomTextView;
import application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutTalukItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardContent;

  @NonNull
  public final ImageView ivTaluk;

  @NonNull
  public final CustomTextView tvDistance;

  @NonNull
  public final CustomTextView tvEventsCount;

  @NonNull
  public final CustomTextView tvPlaceCount;

  @NonNull
  public final CustomTextView tvTalukDesc;

  @NonNull
  public final CustomTextView tvTalukName;

  @Bindable
  protected TalukListAdapterViewModel mViewModel;

  protected LayoutTalukItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardContent, ImageView ivTaluk, CustomTextView tvDistance,
      CustomTextView tvEventsCount, CustomTextView tvPlaceCount, CustomTextView tvTalukDesc,
      CustomTextView tvTalukName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardContent = cardContent;
    this.ivTaluk = ivTaluk;
    this.tvDistance = tvDistance;
    this.tvEventsCount = tvEventsCount;
    this.tvPlaceCount = tvPlaceCount;
    this.tvTalukDesc = tvTalukDesc;
    this.tvTalukName = tvTalukName;
  }

  public abstract void setViewModel(@Nullable TalukListAdapterViewModel viewModel);

  @Nullable
  public TalukListAdapterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutTalukItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_taluk_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutTalukItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutTalukItemBinding>inflateInternal(inflater, R.layout.layout_taluk_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutTalukItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_taluk_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutTalukItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutTalukItemBinding>inflateInternal(inflater, R.layout.layout_taluk_item, null, false, component);
  }

  public static LayoutTalukItemBinding bind(@NonNull View view) {
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
  public static LayoutTalukItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutTalukItemBinding)bind(component, view, R.layout.layout_taluk_item);
  }
}
