// Generated by data binding compiler. Do not edit!
package application.haveri.tourism.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.R;
import application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.smarteist.autoimageslider.SliderView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final AboutBottomSheetBinding aboutBottomSheet;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView expandedImage;

  @NonNull
  public final SliderView imageSlider;

  @NonNull
  public final FragmentHomeContentBinding layoutContent;

  @NonNull
  public final CollapsingToolbarLayout toolbarLayout;

  @Bindable
  protected HomeFragmentViewModel mViewModel;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AboutBottomSheetBinding aboutBottomSheet, AppBarLayout appBar,
      ConstraintLayout constraintLayout, ImageView expandedImage, SliderView imageSlider,
      FragmentHomeContentBinding layoutContent, CollapsingToolbarLayout toolbarLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.aboutBottomSheet = aboutBottomSheet;
    setContainedBinding(this.aboutBottomSheet);
    this.appBar = appBar;
    this.constraintLayout = constraintLayout;
    this.expandedImage = expandedImage;
    this.imageSlider = imageSlider;
    this.layoutContent = layoutContent;
    setContainedBinding(this.layoutContent);
    this.toolbarLayout = toolbarLayout;
  }

  public abstract void setViewModel(@Nullable HomeFragmentViewModel viewModel);

  @Nullable
  public HomeFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
